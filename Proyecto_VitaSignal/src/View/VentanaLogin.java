package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPasswordField;


public class VentanaLogin extends JFrame {

	private JPanel contentPane;
	private JPanel contentPane_1;

	private JTextField textField;
	private JPasswordField passwordField;

	
	Color degradado = new Color(133,155,196);
	



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

		setBounds(360, 200, 500, 350);
		
		contentPane_1 = new JPanel() {
			 @Override
		        protected void paintComponent(Graphics grphcs) {
		            super.paintComponent(grphcs);
		            Graphics2D g2d = (Graphics2D) grphcs;
		            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		                    RenderingHints.VALUE_ANTIALIAS_ON);
		            GradientPaint gp = new GradientPaint(0, 0,
		                    Color.WHITE, 0, getHeight(),degradado);
		            g2d.setPaint(gp);
		            g2d.fillRect(0, 0, getWidth(), getHeight()); 
		        }
			 
		};
		

		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_1);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane_1.setLayout(sl_contentPane);

		
		JLabel lblUsuario = new JLabel("Usuario");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblUsuario, 96, SpringLayout.WEST, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblUsuario, -163, SpringLayout.SOUTH, contentPane_1);
		contentPane_1.add(lblUsuario);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, -5, SpringLayout.NORTH, lblUsuario);
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 55, SpringLayout.EAST, lblUsuario);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, -99, SpringLayout.EAST, contentPane_1);
		contentPane_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblContrasea, 37, SpringLayout.SOUTH, lblUsuario);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblContrasea, 0, SpringLayout.WEST, lblUsuario);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblContrasea, -111, SpringLayout.SOUTH, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblContrasea, -273, SpringLayout.EAST, contentPane_1);
		contentPane_1.add(lblContrasea);
		
		JButton btnAceptar = new JButton("Entrar");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnAceptar, 174, SpringLayout.WEST, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnAceptar, -10, SpringLayout.SOUTH, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnAceptar, -172, SpringLayout.EAST, contentPane_1);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane_1.add(btnAceptar);
		
		passwordField = new JPasswordField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnAceptar, 25, SpringLayout.SOUTH, passwordField);
		sl_contentPane.putConstraint(SpringLayout.WEST, passwordField, 103, SpringLayout.WEST, lblContrasea);
		sl_contentPane.putConstraint(SpringLayout.EAST, passwordField, -99, SpringLayout.EAST, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, passwordField, -106, SpringLayout.SOUTH, contentPane_1);
		contentPane_1.add(passwordField);
		
		JPanel panelLogo = new JPanel();
		
		sl_contentPane.putConstraint(SpringLayout.NORTH, panelLogo, 21, SpringLayout.NORTH, contentPane_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, panelLogo, 0, SpringLayout.WEST, btnAceptar);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panelLogo, -18, SpringLayout.NORTH, textField);
		sl_contentPane.putConstraint(SpringLayout.EAST, panelLogo, -158, SpringLayout.EAST, contentPane_1);
		contentPane_1.add(panelLogo);

	}
}
