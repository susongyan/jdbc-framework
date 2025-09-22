package com.zuomaigai.jdbc;

import java.sql.SQLException;

public interface ParameterReplayFunc<T> {

    void replay(T t) throws SQLException;
}
