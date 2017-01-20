package controladores;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandra
 */
public class Singleton {
    
    private Connection conexao;
    private String url = "jdbc:mysql://localhost:3306/ribanceira_bd";
    private String usuario = "root";
    private String senha = "harumi1995";
    private static Singleton instancia;

    private Singleton() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            JOptionPane.showMessageDialog(null, "Driver OK!");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado.");
        }
        
        try {
            this.conexao = DriverManager.getConnection(url, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conexão OK!");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static Singleton getInstancia() {
        if (instancia == null)
            instancia = new Singleton();
        return instancia;
    }
    
    public Connection getConexao() {
        return this.conexao;
    }

}
