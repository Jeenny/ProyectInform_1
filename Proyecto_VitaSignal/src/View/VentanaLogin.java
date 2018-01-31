package View;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.ControladorLogin;

import javax.swing.SpringLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class VentanaLogin extends JFrame {

	private JPanel panel1;
	private JPanel panel2;
	private ControladorLogin cntrlLogin;
	private JTextField textfUsuario;
	private JPasswordField passwordField;


	/**
	 * Permite acceder controlador de la ventana login
	 * @return controladorVentanaLogin
	 */

	public ControladorLogin getCntrl() {
		return cntrlLogin;
	}

	public void setCntrl(ControladorLogin cntrl) {
		this.cntrlLogin = cntrl;
	}
	
	/**
	 * Permite acceder al textfield 
	 * @return TextField
	 */

	public JTextField getTextField() {
		return textfUsuario;
	}

	public void setTextField(JTextField textField) {
		this.textfUsuario = textField;
	}

	/**
	 * Permite acceder al PasswordField 
	 * @return passwordField
	 */

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}


	Color degradado = new Color(133,155,196);


	/**
	 * Crear la ventana
	 * @param clLog 
	 * @throws IOException 
	 */
	
	public VentanaLogin(ControladorLogin clLog) throws IOException {
		this.setTitle("VitaSignal Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		setResizable(false);
		panel1 = new JPanel();
		panel1.setBackground(new Color(195, 211, 236));
		cntrlLogin= clLog;
		
		BufferedImage logo =ImageIO.read(new File("src/Images/VitaSignalAzul2.png"));
	
		setBounds(360, 200, 500, 350);
		
		panel2 = new JPanel() {
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
		
		panel2.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel2);
		SpringLayout sl_contentPane = new SpringLayout();
		panel2.setLayout(sl_contentPane);

		
		JLabel lblUsuario = new JLabel("Usuario");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblUsuario, 96, SpringLayout.WEST, panel2);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblUsuario, -163, SpringLayout.SOUTH, panel2);
		panel2.add(lblUsuario);
		
		textfUsuario = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, textfUsuario, -5, SpringLayout.NORTH, lblUsuario);
		sl_contentPane.putConstraint(SpringLayout.WEST, textfUsuario, 55, SpringLayout.EAST, lblUsuario);
		sl_contentPane.putConstraint(SpringLayout.EAST, textfUsuario, -99, SpringLayout.EAST, panel2);
		panel2.add(textfUsuario);
		textfUsuario.setColumns(10);
		
		JLabel lblContrasena = new JLabel("Contraseña");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblContrasena, 37, SpringLayout.SOUTH, lblUsuario);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblContrasena, 0, SpringLayout.WEST, lblUsuario);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblContrasena, -111, SpringLayout.SOUTH, panel2);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblContrasena, -273, SpringLayout.EAST, panel2);
		panel2.add(lblContrasena);
		
		JButton btnEntrar = new JButton("Entrar");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnEntrar, 174, SpringLayout.WEST, panel2);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnEntrar, -10, SpringLayout.SOUTH, panel2);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnEntrar, -172, SpringLayout.EAST, panel2);
		btnEntrar.addActionListener(cntrlLogin);
		
		panel2.add(btnEntrar);
		
		passwordField = new JPasswordField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnEntrar, 25, SpringLayout.SOUTH, passwordField);
		sl_contentPane.putConstraint(SpringLayout.WEST, passwordField, 103, SpringLayout.WEST, lblContrasena);
		sl_contentPane.putConstraint(SpringLayout.EAST, passwordField, -99, SpringLayout.EAST, panel2);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, passwordField, -106, SpringLayout.SOUTH, panel2);
		passwordField.addKeyListener(cntrlLogin);
		panel2.add(passwordField);
		
		
		JLabel imgLogo = new JLabel(new ImageIcon(logo));
		
	
		sl_contentPane.putConstraint(SpringLayout.NORTH, imgLogo, -124, SpringLayout.NORTH, textfUsuario);
		sl_contentPane.putConstraint(SpringLayout.WEST, imgLogo, -39, SpringLayout.WEST, btnEntrar);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, imgLogo, -6, SpringLayout.NORTH, textfUsuario);
		sl_contentPane.putConstraint(SpringLayout.EAST, imgLogo, -127, SpringLayout.EAST, panel2);
		
		
		panel2.add(imgLogo);
		
		

	}
}
