/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;
import screens.TelaUsuarioCadastro;

/**
 *
 * @author Votogames
 */
public class CadastroController {

    private TelaUsuarioCadastro view;

    public CadastroController(TelaUsuarioCadastro view) {
        this.view = view;
    }

    public void salvarUsuario() {

        String Inputusuario = view.getjTextFieldUsuario().getText();
        String Inputsenha = view.getjTextFieldSenha().getText();

        Usuario usuario = new Usuario(Inputusuario, Inputsenha);

        try {
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);
            usuarioDAO.insert(usuario);

            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!!");

        } catch (SQLException ex) {
            Logger.getLogger(TelaUsuarioCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
