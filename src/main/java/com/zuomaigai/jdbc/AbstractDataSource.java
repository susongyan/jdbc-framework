package com.zuomaigai.jdbc;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

public abstract class AbstractDataSource implements DataSource, AutoCloseable {

    private int loginTimeout = 0;
    private PrintWriter out = null;

    protected boolean closed;

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return out;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {
        this.out = out;
    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return this.loginTimeout;
    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {
        this.loginTimeout = seconds;
    }

    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        throw new SQLFeatureNotSupportedException("getParentLogger");
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return iface.isInstance(this);
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        if (isWrapperFor(iface)) {
            return (T) this;
        }
        throw new SQLException(getClass().getName() + " Can not unwrap to" + iface.getName());
    }

    public void checkClosed() {
        if (this.closed) {
            throw new JdbcFrameworkException("no operation allowed after datasource closed!");
        }
    }
}
