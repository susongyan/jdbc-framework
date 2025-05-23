package com.zuomaigai.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractStatement implements Statement {

    protected AbstractConnection connection;
    protected Statement innerStatement;
    protected int resultSetType = ResultSet.TYPE_FORWARD_ONLY;
    protected int resultSetConcurrency = ResultSet.CONCUR_READ_ONLY;
    protected int resultSetHoldability = -1;

    protected int queryTimeout = 0;
    protected int fetchSize = 0;
    protected int maxRows = 0;
    protected int fetchDirection = ResultSet.FETCH_FORWARD;
    protected int maxFieldSize = 0;

    protected List<String> batchSqls;

    protected ResultSet resultSet;
    protected boolean closed;

    public Statement getInnerStatement() {
        return this.innerStatement;
    }

    public Statement createInternalStatement(Connection connection) throws SQLException {
        Statement statement = null;
        if (this.resultSetHoldability == -1) {
            statement = connection.createStatement(resultSetType, resultSetConcurrency);
        } else {
            statement = connection.createStatement(resultSetType, resultSetConcurrency, resultSetHoldability);
        }
        statement.setQueryTimeout(queryTimeout);
        statement.setFetchSize(fetchSize); 
        statement.setFetchDirection(fetchDirection);
        statement.setMaxRows(maxRows);
        return statement;
    }

    @Override
    public void addBatch(String sql) throws SQLException {
        if (batchSqls == null) {
            batchSqls = new ArrayList<>();
        }

        if (sql != null) {
            batchSqls.add(sql);
        }
    }

    @Override
    public void clearBatch() throws SQLException {
        if (batchSqls != null) {
            batchSqls.clear();
        }
    }


    @Override
    public int getMaxFieldSize() throws SQLException {
        return this.maxFieldSize;
    }

    @Override
    public void setMaxFieldSize(int max) throws SQLException {
        this.maxFieldSize = max;
    }

    @Override
    public int getMaxRows() throws SQLException {
        return this.maxRows;
    }

    @Override
    public void setMaxRows(int max) throws SQLException {
        this.maxRows = max;
    }

    @Override
    public int getQueryTimeout() throws SQLException {
        return this.queryTimeout;
    }

    @Override
    public void setQueryTimeout(int seconds) throws SQLException {
        this.queryTimeout = seconds;
    }

    @Override
    public void setFetchDirection(int direction) throws SQLException {
        this.fetchDirection = direction;
    }

    @Override
    public int getFetchDirection() throws SQLException {
        return this.fetchDirection;
    }

    @Override
    public void setFetchSize(int rows) throws SQLException {
        this.fetchSize = rows;
    }

    @Override
    public int getFetchSize() throws SQLException {
        return this.fetchSize;
    }

    @Override
    public int getResultSetConcurrency() throws SQLException {
        return this.resultSetConcurrency;
    }

    @Override
    public int getResultSetType() throws SQLException {
        return this.resultSetType;
    }

    /**
     * for convenient 
     * @param resultSetHoldability
     */
    public void setResultSetHoldability(int resultSetHoldability) {
        this.resultSetHoldability = resultSetHoldability;
    }

    @Override
    public int getResultSetHoldability() throws SQLException {
        return this.resultSetHoldability;
    }


    @Override
    public void cancel() throws SQLException {
        getInnerStatement().cancel();
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        return getInnerStatement().getWarnings();
    }

    @Override
    public void clearWarnings() throws SQLException {
        this.innerStatement.clearWarnings();
    }

    @Override
    public ResultSet getResultSet() throws SQLException {
        return this.resultSet;
    }

    @Override
    public int getUpdateCount() throws SQLException {
        return getInnerStatement().getUpdateCount();
    }

    @Override
    public boolean getMoreResults() throws SQLException {
        return getInnerStatement().getMoreResults();
    }

    @Override
    public Connection getConnection() throws SQLException {
        return this.connection;
    }

    @Override
    public boolean getMoreResults(int current) throws SQLException {
        return getInnerStatement().getMoreResults(current);
    }

    @Override
    public ResultSet getGeneratedKeys() throws SQLException {
        return getInnerStatement().getGeneratedKeys();
    }

    @Override
    public void setPoolable(boolean poolable) throws SQLException {
        throw new UnsupportedOperationException("setPoolable not support");
    }

    @Override
    public boolean isPoolable() throws SQLException {
        return false;
    }

    @Override
    public void closeOnCompletion() throws SQLException {
        throw new UnsupportedOperationException("closeOnCompletion not support");
    }

    @Override
    public boolean isCloseOnCompletion() throws SQLException {
        throw new UnsupportedOperationException("isCloseOnCompletion not support");
    }

    @Override
    public void setEscapeProcessing(boolean enable) throws SQLException {
        throw new UnsupportedOperationException("setEscapeProcessing not support");
    }

    @Override
    public void setCursorName(String name) throws SQLException {
        throw new UnsupportedOperationException("setCursorName");
    }

    @Override
    public final <T> T unwrap(final Class<T> iface) throws SQLException {
        if (isWrapperFor(iface)) {
            return (T) this;
        }
        throw new SQLException(getClass().getName() + " Can not unwrap to" + iface.getName());
    }

    @Override
    public final boolean isWrapperFor(final Class<?> iface) {
        return iface.isInstance(this);
    }

    @Override
    public void close() throws SQLException {
        closed = true;

        try {
            if (this.resultSet != null) {
                this.resultSet.close();
            }
        } finally {
            this.resultSet = null;
        }

        try {
            if (this.innerStatement != null) {
                this.innerStatement.close();
            }
        } finally {
            this.innerStatement = null;
        }
    }

    @Override
    public boolean isClosed() throws SQLException {
        return this.closed;
    }

    public void checkClosed() {
        if (closed) {
            throw new JdbcFrameworkException("no operation allowed after closed");
        }
    }
}
