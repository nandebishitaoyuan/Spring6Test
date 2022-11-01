package com.javaone.utlis;

import java.sql.*;

public class DButli {
    public static Connection getConn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql:///mybatis_dome","root","123456");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static ResultSet getResultSet(String sql) throws SQLException{
        return DButli.getConn().prepareStatement(sql).executeQuery();
    }
}
