package dao;
//Conector do Mysql utilizado: mysql-connector-java-8.0.24.jar

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConexao() { // Conexão BD MySQL
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/mercado", "root", "okabe1337");
        } catch (SQLException erro) {
            throw new RuntimeException("Erro 1: " + erro);
        }
    }
}
