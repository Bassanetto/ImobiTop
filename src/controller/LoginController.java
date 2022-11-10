/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import screens.Menu;
import screens.TelaLogin;

public class LoginController {

    private TelaLogin view;

    public LoginController(TelaLogin view) {
        this.view = view;
    }

    public void autenticar() throws SQLException {

        String usuario = view.getjTextFieldUsuario().getText();
        String senha = view.getjTextFieldSenha().getText();

        Usuario autenticarUsuario = new Usuario(usuario, senha);

        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);

        boolean existe = usuarioDAO.existePorUsuarioESenha(autenticarUsuario);

        if (existe) {
            Menu telaDeMenu = new Menu();
            telaDeMenu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(view, "Usuario ou senha inválidos.");
        }

    }

}
