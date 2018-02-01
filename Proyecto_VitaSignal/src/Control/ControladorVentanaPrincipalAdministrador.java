package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import View.VentanaLogin;
import View.VentanaPrincipalAdministrador;
import View.VentanaPrincipalTecnico;
/**
 * 
 * @author Jennyfer Gonzalez
 * @author Adrian Garcia
 * @author Miguel Chacon Carrasco
 *
 */
public class ControladorVentanaPrincipalAdministrador implements ActionListener{
	
	private VentanaPrincipalAdministrador view;
	private VentanaLogin vntLogin;
	private ControladorLogin cntrlLogin;
	
	/**
	 * Permite acceder controlador login
	 * @return controladorLogin
	 */
	
	public ControladorLogin getCntrlLogin() {
		return cntrlLogin;
	}
	/**
	 * Asigna el controlador de login
	 * @param cntrlLogin
	 */
	public void setCntrlLogin(ControladorLogin cntrlLogin) {
		this.cntrlLogin = cntrlLogin;
	}

	/**
	 * Asigna la ventana
	 * @param view la ventana principal administrador
	 */

	public ControladorVentanaPrincipalAdministrador(VentanaPrincipalAdministrador view) {
		super();
		this.view = view;
	}

	/**
	 * Controla lo que ocurre al pulsar "Cerrar sesion". Hace visible la ventana de log in
	 */

	public void actionPerformed(ActionEvent evento) {
		
		switch(evento.getActionCommand()){
		case "Cerrar sesion":{
			try {
				
				cntrlLogin=view.getCntrlVenAdmin().cntrlLogin;
				vntLogin = new VentanaLogin(cntrlLogin);
				cntrlLogin.setV1(vntLogin);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			vntLogin.setVisible(true);
			view.dispose();
			break;
		}
		
		}
		
	}
}
