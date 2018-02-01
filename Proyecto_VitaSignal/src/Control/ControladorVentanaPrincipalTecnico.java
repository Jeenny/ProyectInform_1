package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import View.VentanaLogin;
import View.VentanaPrincipalTecnico;
/**
 * Este es el controlador de la ventana principal del Tecnico
 * @author Jennyfer Gonzalez
 * @author Adrian Garcia
 * @author Miguel Chacon Carrasco
 * @version 0.5
 *
 */
public class ControladorVentanaPrincipalTecnico implements ActionListener{

	private VentanaPrincipalTecnico view;
	private VentanaLogin vntLogin;
	private ControladorLogin cntrlLogin;
	
	/**
	 * Permite acceder controlador de la ventana de login
	 * @version 1.0
	 * @return controladorLogin
	 */
	
	public ControladorLogin getCntrlLogin() {
		return cntrlLogin;
	}

	public void setCntrlLogin(ControladorLogin cntrlLogin) {
		this.cntrlLogin = cntrlLogin;
	}


	/**
	 * Asigna la ventana al controlador
	 * @param view la ventana principal tecnico
	 */
	
	public ControladorVentanaPrincipalTecnico(VentanaPrincipalTecnico view) {
		super();
		this.view = view;
	}

	/**
	 * Controla lo que ocurre al pulsar "Cerrar sesion". En ese momento se hace visible la ventana de log in.
	 * @version 0.8
	 */

	public void actionPerformed(ActionEvent evento) {
		
		switch(evento.getActionCommand()){
		case "Cerrar sesion":{
			
			try {
				cntrlLogin=view.getCntrlVenTec().cntrlLogin;
				vntLogin = new VentanaLogin(cntrlLogin);
				cntrlLogin.setV1(vntLogin);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			vntLogin.setVisible(true);
			view.dispose();
			break;
		}
				
		}
		
		
	}
}
