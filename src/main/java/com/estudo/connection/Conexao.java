package com.estudo.connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import com.mysql.jdbc.Driver;
public class Conexao {
    private static final String url = "jdbc:mysql://localhost:3306/bd_tecnocamera";
    private static final String user = "root";
    private static final String password = "mel@2023";
    private static Connection conn;

    public static Connection getConexao() {
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            }else {
                return conn;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
