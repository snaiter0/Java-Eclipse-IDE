package ControllerWithJFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Connection.Conexao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class tela_de_acesso extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField FieldUser;
	private JPasswordField FieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_de_acesso frame = new tela_de_acesso();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public tela_de_acesso() {
		setResizable(false);
		setTitle("Tela de Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tfUsuario = new JLabel("Usuario");
		tfUsuario.setFont(new Font("Arial", Font.PLAIN, 11));
		tfUsuario.setBounds(10, 82, 59, 25);
		contentPane.add(tfUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 11));
		lblSenha.setBounds(10, 115, 52, 25);
		contentPane.add(lblSenha);
		
		FieldUser = new JTextField();
		FieldUser.setBounds(67, 84, 170, 20);
		contentPane.add(FieldUser);
		FieldUser.setColumns(10);
		JButton btnNewButton = new JButton("Entrar");
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@SuppressWarnings("unlikely-arg-type")
			public void actionPerformed(ActionEvent e) {
	
					
				try {
					if(FieldUser.getText().equals("") || FieldPassword.getPassword().equals("")) 
					{
					JOptionPane.showMessageDialog(null, "Insira suas credenciais");
					}
					else {
					Connection con = Conexao.faz_conexao();
					String sql = "select * from dados_senhas where usuario like ? and senha like ?"; 
					
					PreparedStatement stmt = con.prepareStatement(sql);
					
				
					stmt.setString(1,FieldUser.getText()+"%");
					stmt.setString(2,new String (FieldPassword.getPassword())+"%");
						
					ResultSet rs = stmt.executeQuery();
					JOptionPane.showMessageDialog(null, stmt);
					
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "Logado com sucesso!");
						tela_lista_usuarios listaUsuarios = new tela_lista_usuarios();
						listaUsuarios.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Usuario/Senha incorretos");
					}
					
					stmt.close();
					con.close();
					
					
				} 
				}
				catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		
		btnNewButton.setBounds(100, 168, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(120, 48, 46, 25);
		contentPane.add(lblNewLabel);
		
		FieldPassword = new JPasswordField();
		FieldPassword.setBounds(67, 118, 170, 20);
		contentPane.add(FieldPassword);
		
		JButton btnRegistrese = new JButton("Registre-se");
		btnRegistrese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela_de_cadastro exibir = new tela_de_cadastro();
				exibir.setVisible(true);
				setVisible(false);
			}
		});
		btnRegistrese.setVerticalAlignment(SwingConstants.BOTTOM);
		btnRegistrese.setBounds(94, 213, 101, 23);
		contentPane.add(btnRegistrese);
	}
}
