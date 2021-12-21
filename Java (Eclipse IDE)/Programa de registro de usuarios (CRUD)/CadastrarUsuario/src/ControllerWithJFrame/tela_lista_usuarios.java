package ControllerWithJFrame;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Connection.Conexao;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import javax.swing.JPasswordField;

public class tela_lista_usuarios extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6932399784714934049L;
	private JPanel contentPane;
	private JTextField tfBusca;
	private JTable Tab_Users;
	private JTextField tfID;
	private JTextField tfEmail;
	private JTextField tfUsuario;
	private JTextField tfTelefone;
	private JPasswordField pfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela_lista_usuarios frame = new tela_lista_usuarios();
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
	public tela_lista_usuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnNewButton = new JButton("Listar todos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					try {
						Connection con = Conexao.faz_conexao();
						String sql = "select * from dados_senhas";
						
						PreparedStatement stmt = con.prepareStatement(sql);
						
						ResultSet rs = stmt.executeQuery();
						
						DefaultTableModel modelo = (DefaultTableModel) Tab_Users.getModel();
						modelo.setNumRows(0);
						
						while(rs.next())
						{
							modelo.addRow(new Object[]{rs.getString("id"),rs.getString("email"),rs.getString("usuario"),rs.getString("senha"),rs.getString("telefone")});
						}
						rs.close();
						con.close();
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
			}
		});
		btnNewButton.setBounds(129, 272, 109, 23);
		contentPane.add(btnNewButton);
		
		
		
		
		
		tfBusca = new JTextField();
		tfBusca.setColumns(10);
		tfBusca.setBounds(10, 242, 94, 20);
		contentPane.add(tfBusca);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfBusca.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Insira um ID");
					
				} else {
					try {
						DefaultTableModel modelo = (DefaultTableModel) Tab_Users.getModel();
						Connection con = Conexao.faz_conexao();
						String sql = "select * from dados_senhas where id like ?";
						
						PreparedStatement stmt = con.prepareStatement(sql);
						
						stmt.setString(1, "%"+tfBusca.getText()+"%");
						
						ResultSet rs = stmt.executeQuery();
						
						modelo.setNumRows(0);
						
						while(rs.next())
						{
							modelo.addRow(new Object[]{rs.getString("id"),rs.getString("email"),rs.getString("usuario"),rs.getString("senha"),rs.getString("telefone")});
						}
						rs.close();
						con.close();
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}		
		});
		btnPesquisar.setBounds(10, 272, 109, 23);
		contentPane.add(btnPesquisar);
		
		JScrollPane tbDados = new JScrollPane();
		tbDados.addMouseListener(new MouseAdapter() {
		});
		tbDados.setBounds(10, 11, 604, 210);
		contentPane.add(tbDados);
		
		Tab_Users = new JTable();
		Tab_Users.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Email", "Usuario", "Senha", "Telefone"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
				false, false, true, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tbDados.setViewportView(Tab_Users);
		
		JButton btnNewButton_1 = new JButton("Atualizar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(tfID.getText().equals("")) {
					JOptionPane.showMessageDialog(null,"Informe o ID");
				}else {
					
				try {
					Connection con = Conexao.faz_conexao();
					
					String sql = "update dados_senhas set id=?, email=?, usuario=?, senha=?, telefone=?  WHERE id=?";
							
					PreparedStatement stmt = con.prepareStatement(sql);
					
					stmt.setString(1, tfID.getText());
					stmt.setString(2, tfEmail.getText());
					stmt.setString(3, tfUsuario.getText());
					stmt.setString(4, new String(pfSenha.getPassword()));
					stmt.setString(5, tfTelefone.getText());
					stmt.setString(6, tfID.getText());
					
					JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
					
					stmt.executeUpdate();
					
					
					stmt.close();
					con.close();
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
				
			}
		});
		btnNewButton_1.setBounds(636, 198, 94, 23);
		contentPane.add(btnNewButton_1);
		
		tfID = new JTextField();
		tfID.setColumns(10);
		tfID.setBounds(680, 27, 128, 20);
		contentPane.add(tfID);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(680, 58, 128, 20);
		contentPane.add(tfEmail);
		
		tfUsuario = new JTextField();
		tfUsuario.setColumns(10);
		tfUsuario.setBounds(680, 89, 128, 20);
		contentPane.add(tfUsuario);
		
		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(680, 151, 128, 20);
		contentPane.add(tfTelefone);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(624, 30, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(624, 61, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(624, 92, 46, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(624, 123, 46, 14);
		contentPane.add(lblSenha);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(624, 154, 57, 14);
		contentPane.add(lblTelefone);
		
		pfSenha = new JPasswordField();
		pfSenha.setBounds(680, 120, 128, 20);
		contentPane.add(pfSenha);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					Connection con = Conexao.faz_conexao();
					String sql = "delete FROM dados_senhas WHERE id=?";
					PreparedStatement stmt = con.prepareStatement(sql);
					
					stmt.setString(1, tfBusca.getText());
					JOptionPane.showMessageDialog(null, "Apagado com sucesso.");
					stmt.execute();
					
					stmt.close();
					con.close();
					
					tfUsuario.setText("");
					tfEmail.setText("");
					tfID.setText("");
					tfBusca.setText("");
					tfTelefone.setText("");
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnDelete.setBounds(248, 272, 109, 23);
		contentPane.add(btnDelete);
		
		JButton btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					try {
					Connection con = Conexao.faz_conexao();
					String sql = "Insert into dados_senhas(email,usuario,senha,telefone) value (?,?,?,?)";
					
					PreparedStatement stmt = con.prepareStatement(sql);
									
					stmt.setString(1, tfEmail.getText());
					stmt.setString(2, tfUsuario.getText()+" ");
					stmt.setString(3, new String(pfSenha.getPassword()));
					stmt.setString(4, tfTelefone.getText());

					if(tfUsuario.getText().equals("") || pfSenha.getPassword().equals("") ||tfTelefone.getText().equals("")|| tfEmail.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Insira todas as informações devidamente.");
					}else {
						stmt.execute();
						stmt.close();
						con.close();
						tfUsuario.setText("");
						pfSenha.setText("");
						tfTelefone.setText("");
						tfEmail.setText("");
						JOptionPane.showMessageDialog(null,"Usuario cadastrado com sucesso.");
					}
					}
				catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						}

			}
		});
		btnNovo.setBounds(740, 198, 84, 23);
		contentPane.add(btnNovo);
	}
}
