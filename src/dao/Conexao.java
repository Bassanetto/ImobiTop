package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {

    // Atributos para montar url do banco 
    private String servidor = "localhost:3306";
    private String nomeDoBanco = "imobitop";
    private String usuario = "root";
    private String senha = "222597";
    private String url = "jdbc:mysql://" + servidor + "/" + nomeDoBanco + "?" + "user=" + usuario + "&password=" + senha;
    
            

    // Método de conexão
    public Connection getConnection() throws SQLException{
        
        Connection conexao = DriverManager.getConnection(url);
        return conexao;
    }
}