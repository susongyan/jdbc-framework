package com.zuomaigai.jdbc;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.sql.*;
import java.util.Map;

public abstract class AbstractResultSet implements ResultSet {

    @Override
    public boolean previous() throws SQLException {
        throw new SQLFeatureNotSupportedException("previous");
    }

    @Override
    public boolean isBeforeFirst() throws SQLException {
        throw new SQLFeatureNotSupportedException("isBeforeFirst");
    }

    @Override
    public boolean isAfterLast() throws SQLException {
        throw new SQLFeatureNotSupportedException("isAfterLast");
    }

    @Override
    public boolean isFirst() throws SQLException {
        throw new SQLFeatureNotSupportedException("isFirst");
    }

    @Override
    public boolean isLast() throws SQLException {
        throw new SQLFeatureNotSupportedException("isLast");
    }

    @Override
    public void beforeFirst() throws SQLException {
        throw new SQLFeatureNotSupportedException("beforeFirst");
    }

    @Override
    public void afterLast() throws SQLException {
        throw new SQLFeatureNotSupportedException("afterLast");
    }

    @Override
    public boolean first() throws SQLException {
        throw new SQLFeatureNotSupportedException("first");
    }

    @Override
    public boolean last() throws SQLException {
        throw new SQLFeatureNotSupportedException("last");
    }

    @Override
    public boolean absolute(final int row) throws SQLException {
        throw new SQLFeatureNotSupportedException("absolute");
    }

    @Override
    public boolean relative(final int rows) throws SQLException {
        throw new SQLFeatureNotSupportedException("relative");
    }

    @Override
    public int getRow() throws SQLException {
        throw new SQLFeatureNotSupportedException("getRow");
    }

    @Override
    public final void insertRow() throws SQLException {
        throw new SQLFeatureNotSupportedException("insertRow");
    }

    @Override
    public final void updateRow() throws SQLException {
        throw new SQLFeatureNotSupportedException("updateRow");
    }

    @Override
    public final void deleteRow() throws SQLException {
        throw new SQLFeatureNotSupportedException("deleteRow");
    }

    @Override
    public final void refreshRow() throws SQLException {
        throw new SQLFeatureNotSupportedException("refreshRow");
    }

    @Override
    public final void cancelRowUpdates() throws SQLException {
        throw new SQLFeatureNotSupportedException("cancelRowUpdates");
    }

    @Override
    public final void moveToInsertRow() throws SQLException {
        throw new SQLFeatureNotSupportedException("moveToInsertRow");
    }

    @Override
    public final void moveToCurrentRow() throws SQLException {
        throw new SQLFeatureNotSupportedException("moveToCurrentRow");
    }

    @Override
    public final boolean rowInserted() throws SQLException {
        throw new SQLFeatureNotSupportedException("rowInserted");
    }

    @Override
    public final boolean rowUpdated() throws SQLException {
        throw new SQLFeatureNotSupportedException("rowUpdated");
    }

    @Override
    public final boolean rowDeleted() throws SQLException {
        throw new SQLFeatureNotSupportedException("rowDeleted");
    }

    @Override
    public final String getCursorName() throws SQLException {
        throw new SQLFeatureNotSupportedException("getCursorName");
    }

    @Override
    public final int getHoldability() throws SQLException {
        throw new SQLFeatureNotSupportedException("getHoldability");
    }

    @Override
    public final NClob getNClob(final int columnIndex) throws SQLException {
        throw new SQLFeatureNotSupportedException("getNClob");
    }

    @Override
    public final NClob getNClob(final String columnLabel) throws SQLException {
        throw new SQLFeatureNotSupportedException("getNClob");
    }

    @Override
    public final Reader getNCharacterStream(final int columnIndex) throws SQLException {
        throw new SQLFeatureNotSupportedException("getNCharacterStream");
    }

    @Override
    public final Reader getNCharacterStream(final String columnLabel) throws SQLException {
        throw new SQLFeatureNotSupportedException("getNCharacterStream");
    }

    @Override
    public final Ref getRef(final int columnIndex) throws SQLException {
        throw new SQLFeatureNotSupportedException("getRef");
    }

    @Override
    public final Ref getRef(final String columnLabel) throws SQLException {
        throw new SQLFeatureNotSupportedException("getRef");
    }

    @Override
    public final RowId getRowId(final int columnIndex) throws SQLException {
        throw new SQLFeatureNotSupportedException("getRowId");
    }

    @Override
    public final RowId getRowId(final String columnLabel) throws SQLException {
        throw new SQLFeatureNotSupportedException("getRowId");
    }

    @Override
    public <T> T getObject(final int columnIndex, final Class<T> type) throws SQLException {
        throw new SQLFeatureNotSupportedException("getObject with type");
    }

    @Override
    public <T> T getObject(final String columnLabel, final Class<T> type) throws SQLException {
        throw new SQLFeatureNotSupportedException("getObject with type");
    }

    @Override
    public final Object getObject(final String columnLabel, final Map<String, Class<?>> map) throws SQLException {
        throw new SQLFeatureNotSupportedException("getObject with map");
    }

    @Override
    public final Object getObject(final int columnIndex, final Map<String, Class<?>> map) throws SQLException {
        throw new SQLFeatureNotSupportedException("getObject with map");
    }


    /** not allow result update **/

    @Override
    public final void updateNull(final int columnIndex) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateNull");
    }

    @Override
    public final void updateNull(final String columnLabel) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateNull");
    }

    @Override
    public final void updateBoolean(final int columnIndex, final boolean x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateBoolean");
    }

    @Override
    public final void updateBoolean(final String columnLabel, final boolean x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateBoolean");
    }

    @Override
    public final void updateByte(final int columnIndex, final byte x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateByte");
    }

    @Override
    public final void updateByte(final String columnLabel, final byte x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateByte");
    }

    @Override
    public final void updateShort(final int columnIndex, final short x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateShort");
    }

    @Override
    public final void updateShort(final String columnLabel, final short x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateShort");
    }

    @Override
    public final void updateInt(final int columnIndex, final int x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateInt");
    }

    @Override
    public final void updateInt(final String columnLabel, final int x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateInt");
    }

    @Override
    public final void updateLong(final int columnIndex, final long x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateLong");
    }

    @Override
    public final void updateLong(final String columnLabel, final long x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateLong");
    }

    @Override
    public final void updateFloat(final int columnIndex, final float x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateFloat");
    }

    @Override
    public final void updateFloat(final String columnLabel, final float x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateFloat");
    }

    @Override
    public final void updateDouble(final int columnIndex, final double x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateDouble");
    }

    @Override
    public final void updateDouble(final String columnLabel, final double x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateDouble");
    }

    @Override
    public final void updateBigDecimal(final int columnIndex, final BigDecimal x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateBigDecimal");
    }

    @Override
    public final void updateBigDecimal(final String columnLabel, final BigDecimal x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateBigDecimal");
    }

    @Override
    public final void updateString(final int columnIndex, final String x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateString");
    }

    @Override
    public final void updateString(final String columnLabel, final String x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateString");
    }

    @Override
    public final void updateNString(final int columnIndex, final String nString) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateNString");
    }

    @Override
    public final void updateNString(final String columnLabel, final String nString) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateNString");
    }

    @Override
    public final void updateBytes(final int columnIndex, final byte[] x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateBytes");
    }

    @Override
    public final void updateBytes(final String columnLabel, final byte[] x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateBytes");
    }

    @Override
    public final void updateDate(final int columnIndex, final Date x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateDate");
    }

    @Override
    public final void updateDate(final String columnLabel, final Date x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateDate");
    }

    @Override
    public final void updateTime(final int columnIndex, final Time x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateTime");
    }

    @Override
    public final void updateTime(final String columnLabel, final Time x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateTime");
    }

    @Override
    public final void updateTimestamp(final int columnIndex, final Timestamp x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateTimestamp");
    }

    @Override
    public final void updateTimestamp(final String columnLabel, final Timestamp x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateTimestamp");
    }

    @Override
    public final void updateAsciiStream(final int columnIndex, final InputStream inputStream) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateAsciiStream");
    }

    @Override
    public final void updateAsciiStream(final String columnLabel, final InputStream inputStream) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateAsciiStream");
    }

    @Override
    public final void updateAsciiStream(final int columnIndex, final InputStream x, final int length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateAsciiStream");
    }

    @Override
    public final void updateAsciiStream(final String columnLabel, final InputStream x, final int length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateAsciiStream");
    }

    @Override
    public final void updateAsciiStream(final int columnIndex, final InputStream inputStream, final long length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateAsciiStream");
    }

    @Override
    public final void updateAsciiStream(final String columnLabel, final InputStream inputStream, final long length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateAsciiStream");
    }

    @Override
    public final void updateBinaryStream(final int columnIndex, final InputStream x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateBinaryStream");
    }

    @Override
    public final void updateBinaryStream(final String columnLabel, final InputStream x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateBinaryStream");
    }

    @Override
    public final void updateBinaryStream(final int columnIndex, final InputStream x, final int length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateBinaryStream");
    }

    @Override
    public final void updateBinaryStream(final String columnLabel, final InputStream x, final int length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateBinaryStream");
    }

    @Override
    public final void updateBinaryStream(final int columnIndex, final InputStream x, final long length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateBinaryStream");
    }

    @Override
    public final void updateBinaryStream(final String columnLabel, final InputStream x, final long length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateBinaryStream");
    }

    @Override
    public final void updateCharacterStream(final int columnIndex, final Reader x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateCharacterStream");
    }

    @Override
    public final void updateCharacterStream(final String columnLabel, final Reader x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateCharacterStream");
    }

    @Override
    public final void updateCharacterStream(final int columnIndex, final Reader x, final int length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateCharacterStream");
    }

    @Override
    public final void updateCharacterStream(final String columnLabel, final Reader reader, final int length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateCharacterStream");
    }

    @Override
    public final void updateCharacterStream(final int columnIndex, final Reader x, final long length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateCharacterStream");
    }

    @Override
    public final void updateCharacterStream(final String columnLabel, final Reader reader, final long length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateCharacterStream");
    }

    @Override
    public final void updateNCharacterStream(final int columnIndex, final Reader x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateNCharacterStream");
    }

    @Override
    public final void updateNCharacterStream(final String columnLabel, final Reader x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateNCharacterStream");
    }

    @Override
    public final void updateNCharacterStream(final int columnIndex, final Reader x, final long length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateNCharacterStream");
    }

    @Override
    public final void updateNCharacterStream(final String columnLabel, final Reader x, final long length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateNCharacterStream");
    }

    @Override
    public final void updateObject(final int columnIndex, final Object x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateObject");
    }

    @Override
    public final void updateObject(final String columnLabel, final Object x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateObject");
    }

    @Override
    public final void updateObject(final int columnIndex, final Object x, final int scaleOrLength) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateObject");
    }

    @Override
    public final void updateObject(final String columnLabel, final Object x, final int scaleOrLength) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateObject");
    }

    @Override
    public final void updateRef(final int columnIndex, final Ref x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateRef");
    }

    @Override
    public final void updateRef(final String columnLabel, final Ref x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateRef");
    }

    @Override
    public final void updateBlob(final int columnIndex, final Blob x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateBlob");
    }

    @Override
    public final void updateBlob(final String columnLabel, final Blob x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateBlob");
    }

    @Override
    public final void updateBlob(final int columnIndex, final InputStream inputStream) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateBlob");
    }

    @Override
    public final void updateBlob(final String columnLabel, final InputStream inputStream) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateBlob");
    }

    @Override
    public final void updateBlob(final int columnIndex, final InputStream inputStream, final long length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateBlob");
    }

    @Override
    public final void updateBlob(final String columnLabel, final InputStream inputStream, final long length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateBlob");
    }

    @Override
    public final void updateClob(final int columnIndex, final Clob x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateClob");
    }

    @Override
    public final void updateClob(final String columnLabel, final Clob x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateClob");
    }

    @Override
    public final void updateClob(final int columnIndex, final Reader reader) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateClob");
    }

    @Override
    public final void updateClob(final String columnLabel, final Reader reader) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateClob");
    }

    @Override
    public final void updateClob(final int columnIndex, final Reader reader, final long length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateClob");
    }

    @Override
    public final void updateClob(final String columnLabel, final Reader reader, final long length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateClob");
    }

    @Override
    public final void updateNClob(final int columnIndex, final NClob nClob) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateNClob");
    }

    @Override
    public final void updateNClob(final String columnLabel, final NClob nClob) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateNClob");
    }

    @Override
    public final void updateNClob(final int columnIndex, final Reader reader) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateNClob");
    }

    @Override
    public final void updateNClob(final String columnLabel, final Reader reader) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateNClob");
    }

    @Override
    public final void updateNClob(final int columnIndex, final Reader reader, final long length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateNClob");
    }

    @Override
    public final void updateNClob(final String columnLabel, final Reader reader, final long length) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateNClob");
    }

    @Override
    public final void updateArray(final int columnIndex, final Array x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateArray");
    }

    @Override
    public final void updateArray(final String columnLabel, final Array x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateArray");
    }

    @Override
    public final void updateRowId(final int columnIndex, final RowId x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateRowId");
    }

    @Override
    public final void updateRowId(final String columnLabel, final RowId x) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateRowId");
    }

    @Override
    public final void updateSQLXML(final int columnIndex, final SQLXML xmlObject) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateSQLXML");
    }

    @Override
    public final void updateSQLXML(final String columnLabel, final SQLXML xmlObject) throws SQLException {
        throw new SQLFeatureNotSupportedException("updateSQLXML");
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
}
