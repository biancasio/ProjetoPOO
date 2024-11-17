/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.Conexao;
import DAO.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.DepositarUsuarioFrame;
import view.MenuUsuarioFrame;

/**
 *
 * @author unifboliveira
 */
public class UsuarioController {
    private MenuUsuarioFrame view;
    private Usuario usuario;
    private DepositarUsuarioFrame depView;

    public UsuarioController(MenuUsuarioFrame view, Usuario usuario) {
        this.view = view;
        this.usuario = usuario;
    }

    public UsuarioController() {
        
    }

    public MenuUsuarioFrame getView() {
        return view;
    }

    public void setView(MenuUsuarioFrame view) {
        this.view = view;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public DepositarUsuarioFrame getDepView() {
        return depView;
    }

    public void setDepView(DepositarUsuarioFrame depView) {
        this.depView = depView;
    }
    
    
    
}
