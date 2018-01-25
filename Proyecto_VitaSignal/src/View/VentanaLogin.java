package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin();
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
	public VentanaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(415, 190, 530, 370);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(195, 211, 236));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel lblUsuario = new JLabel("Usuario");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblUsuario, 96, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblUsuario, -163, SpringLayout.SOUTH, contentPane);
		contentPane.add(lblUsuario);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 1, SpringLayout.NORTH, lblUsuario);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 64, SpringLayout.EAST, lblUsuario);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField, -153, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, -102, SpringLayout.EAST, contentPane);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblContrasea, 37, SpringLayout.SOUTH, lblUsuario);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblContrasea, 0, SpringLayout.WEST, lblUsuario);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblContrasea, -111, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblContrasea, -273, SpringLayout.EAST, contentPane);
		contentPane.add(lblContrasea);
		
		JButton btnAceptar = new JButton("Entrar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnAceptar, 35, SpringLayout.SOUTH, lblContrasea);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnAceptar, 0, SpringLayout.WEST, textField);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnAceptar, -30, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnAceptar, -218, SpringLayout.EAST, contentPane);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnAceptar);
		
		passwordField = new JPasswordField();
		sl_contentPane.putConstraint(SpringLayout.WEST, passwordField, 7, SpringLayout.EAST, lblContrasea);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, passwordField, -25, SpringLayout.NORTH, btnAceptar);
		sl_contentPane.putConstraint(SpringLayout.EAST, passwordField, 121, SpringLayout.EAST, lblContrasea);
		contentPane.add(passwordField);
	}
}
