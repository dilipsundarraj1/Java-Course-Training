package com.learncamel.config;


import org.apache.commons.dbcp2.BasicDataSource;

public class DataBaseConfig {

    private static BasicDataSource dataSource;

    public static BasicDataSource getDataSource()
    {

        if (dataSource == null)
        {
            BasicDataSource ds = new BasicDataSource();
            ds.setUrl("jdbc:postgresql://localhost:5432/localDB");
            ds.setUsername("postgres");
            ds.setPassword("postgres");
            ds.setDriverClassName("org.postgresql.Driver");


            ds.setMinIdle(5);
            ds.setMaxIdle(10);
            ds.setMaxOpenPreparedStatements(100);

            dataSource = ds;
        }
        return dataSource;
    }
}
