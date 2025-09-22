package com.zuomaigai.jdbc.demo;

import com.zuomaigai.jdbc.AbstractDataSource;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;

public class ReadWriterSplitDataSource extends AbstractDataSource {

    private DataSource writeDataSource;
    private List<DataSource> readDataSources;

    public ReadWriterSplitDataSource(DataSource writeDataSource, List<DataSource> readDataSources) {
        this.writeDataSource = writeDataSource;
        this.readDataSources = readDataSources;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return new ReadWriteSplitConnection(this);
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return getConnection();
    }

    public DataSource getWriteDataSource() {
        return writeDataSource;
    }

    /**
     * just demo，
     * better use random、roundrobin、 weight
     * @return
     */
    public DataSource chooseReadDataSource() {
        int random = new Random().nextInt(readDataSources.size());
        return readDataSources.get(random);
    }

    @Override
    public void close() throws Exception {
        if (this.writeDataSource != null && this.writeDataSource instanceof AutoCloseable) {
            ((AutoCloseable) this.writeDataSource).close();
        }
        if (this.readDataSources != null) {
            for (DataSource readDataSource : this.readDataSources) {
                if (readDataSource instanceof AutoCloseable) {
                    ((AutoCloseable) readDataSource).close();
                }
            }
        }
    }
}
