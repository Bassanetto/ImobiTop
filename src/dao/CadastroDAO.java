/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CadastroCliente;
import screens.TelaClienteCadastro;

/**
 *
 * @author Votogames
 */
public class CadastroDAO {

    private final Connection connection;

    public CadastroDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(CadastroCliente cadastroCliente) throws SQLException {

        String sql = "insert into cadastroCliente(nome, cpf, sexo, email, telefone, cidade, estado) values('"+cadastroCliente.getNome()+"', '"+cadastroCliente.getCpf()+"', '"+cadastroCliente.getSexo()+"', '"+cadastroCliente.getEmail()+"', '"+cadastroCliente.getTelefone()+"', '"+cadastroCliente.getCidade()+"', '"+cadastroCliente.getEstado()+"');";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.execute();
    }

}
