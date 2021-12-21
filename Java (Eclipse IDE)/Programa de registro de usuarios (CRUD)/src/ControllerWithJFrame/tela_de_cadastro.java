package ControllerWithJFrame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Connection.Conexao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class tela_de_cadastro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1732579856357597897L;
	private JPanel contentPane;
	private JTextField tfEmail;
	private JTextField tfUsuario;
	private JTextField tfFone;
	private JPasswordField pfSenha;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_de_cadastro frame = new tela_de_cadastro();
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
	public tela_de_cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro de usuario");
		lblNewLabel.setBounds(87, 24, 126, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(10, 66, 100, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Usuario");
		lblNewLabel_2.setBounds(10, 91, 100, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(10, 116, 100, 14);
		contentPane.add(lblSenha);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(10, 141, 100, 14);
		contentPane.add(lblTelefone);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(68, 63, 165, 17);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		tfUsuario = new JTextField();
		tfUsuario.setColumns(10);
		tfUsuario.setBounds(68, 89, 165, 17);
		contentPane.add(tfUsuario);
		
		tfFone = new JTextField();
		tfFone.setColumns(10);
		tfFone.setBounds(68, 138, 165, 17);
		contentPane.add(tfFone);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(68, 114, 165, 17);
		contentPane.add(pfSenha);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Connection con = Conexao.faz_conexao();
					String sql = "Insert into dados_senhas(email,usuario,senha,telefone) value (?,?,?,?)";
					
					PreparedStatement stmt = con.prepareStatement(sql);
									
					stmt.setString(1, tfEmail.getText());
					stmt.setString(2, tfUsuario.getText()+" ");
					stmt.setString(3, new String(pfSenha.getPassword()));
					stmt.setString(4, tfFone.getText());

					if(tfUsuario.getText().equals("") || tfEmail.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Insira todas as informações devidamente.");
					}else {
						stmt.execute();
						stmt.close();
						con.close();
						tfUsuario.setText("");
						pfSenha.setText("");
						tfFone.setText("");
						tfEmail.setText("");
						JOptionPane.showMessageDialog(null,"Usuario cadastrado com sucesso.");
						tela_de_acesso acesso = new tela_de_acesso();
						acesso.setVisible(true);
					}
					} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					}
				
				
			}
		});
		btnNewButton.setBounds(97, 166, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela_de_acesso acesso = new tela_de_acesso();
				acesso.setVisible(true);
				
				
			}
		});
		btnLogin.setBounds(97, 227, 89, 23);
		contentPane.add(btnLogin);
	}

}
