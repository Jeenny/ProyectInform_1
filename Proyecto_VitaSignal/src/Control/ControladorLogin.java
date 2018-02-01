package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.Usuario;
import View.VentanaLogin;
import View.VentanaPrincipalAdministrador;
import View.VentanaPrincipalMedico;
import View.VentanaPrincipalTecnico;
/**
 * Controlador de la ventana de log in
 * @author Jennyfer Gonzalez
 * @author Adrian Garcia
 * @author Miguel Chacon Carrasco
 *
 */
public class ControladorLogin implements ActionListener, KeyListener {

	private VentanaLogin venLogin;
	private VentanaPrincipalMedico venMed;
	private VentanaPrincipalTecnico venTec;
	private VentanaPrincipalAdministrador venAdmin;

	/**
	 * Permite acceder a la ventana login
	 * @return ventanaLogin
	 */
	
	public VentanaLogin getV1() {
		return venLogin;
	}
	/**
	 * 
	 * @param v1
	 */
	public void setV1(VentanaLogin v1) {
		this.venLogin = v1;
	}
	
	
	ArrayList<Usuario> users;
	/**
	 * 
	 * @param users
	 */
	public ControladorLogin(ArrayList<Usuario> users) {
		super();
		this.users = users;
	}
	
	/**
	 * Asigna la ventana
	 * @param venLogin ventana Login
	 */
	
	public ControladorLogin(VentanaLogin venLogin) {
		super();
		this.venLogin = venLogin;
	}
	
	/**
	 * Controla lo que ocurre al pulsar el boton "Entrar"
	 */
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		switch(evento.getActionCommand()) {
		
		case "Entrar":{
			char[] charPass = venLogin.getPasswordField().getPassword();
			String pass = String.valueOf(charPass);
			boolean logueado = false;
			int cont= 0;

			while(!logueado && cont<users.size()) {
				
				if(users.get(cont).getUsuario().equals(venLogin.getTextField().getText())&&users.get(cont).getPassword().equals(pass)){
					venLogin.setVisible(false);
					logueado=true;

					if ( users.get(cont).getTipo().equals("medico")) {
						venMed=new VentanaPrincipalMedico();
						ControladorVentanaPrincipalMedico cntrlMed = venMed.getCntrlVenMed();
						cntrlMed.setCntrlLogin(this);
						venMed.setVisible(true);
					}
					
					if ( users.get(cont).getTipo().equals("tecnico")) {
						venTec =new VentanaPrincipalTecnico();
						ControladorVentanaPrincipalTecnico cntrlTec = venTec.getCntrlVenTec();
						cntrlTec.setCntrlLogin(this);
						venTec.setVisible(true);
					}
					
					if ( users.get(cont).getTipo().equals("admin")) {
						venAdmin =new VentanaPrincipalAdministrador();
						ControladorVentanaPrincipalAdministrador cntrlAdmin = venAdmin.getCntrlVenAdmin();
						cntrlAdmin.setCntrlLogin(this);
						venAdmin.setVisible(true);
					}
							
				}
				cont++;		
				
			}
			
			if ( logueado != true) {
				 JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
			break;
			
			}
						
		}
			
	}

	
	/**
	 * Controla lo que ocurre al pulsar la tecla "Enter"
	 */
	
	@Override
	public void keyPressed(KeyEvent e) {

		if(e.getKeyCode()==10) {
			
			char[] charPass = venLogin.getPasswordField().getPassword();
			String pass = String.valueOf(charPass);
			boolean logueado = false;
			int cont = 0;
			
			while(!logueado && cont<users.size()) {			
				
				if(users.get(cont).getUsuario().equals(venLogin.getTextField().getText())&&users.get(cont).getPassword().equals(pass)){
					venLogin.setVisible(false);
					logueado=true;
					
				
					if ( users.get(cont).getTipo().equals("medico")) {
						venMed=new VentanaPrincipalMedico();
						ControladorVentanaPrincipalMedico cntrlMed = venMed.getCntrlVenMed();
						cntrlMed.setCntrlLogin(this);
						venMed.setVisible(true);
					}
					
					if ( users.get(cont).getTipo().equals("tecnico")) {
						venTec =new VentanaPrincipalTecnico();
						ControladorVentanaPrincipalTecnico cntrlTec = venTec.getCntrlVenTec();
						cntrlTec.setCntrlLogin(this);
						venTec.setVisible(true);
					}
					
					if ( users.get(cont).getTipo().equals("admin")) {
						venAdmin =new VentanaPrincipalAdministrador();
						ControladorVentanaPrincipalAdministrador cntrlAdmin = venAdmin.getCntrlVenAdmin();
						cntrlAdmin.setCntrlLogin(this);
						venAdmin.setVisible(true);
					}
				
				}
				cont++;
				
			}
			
			if ( logueado != true) {
				 JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
