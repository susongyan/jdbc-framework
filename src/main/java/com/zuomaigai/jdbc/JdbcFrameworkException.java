package com.zuomaigai.jdbc;

public class JdbcFrameworkException extends RuntimeException {

    public JdbcFrameworkException(String msg) {
        super(msg);
    }

    public JdbcFrameworkException(Throwable ex) {
        super(ex);
    }

    public JdbcFrameworkException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
