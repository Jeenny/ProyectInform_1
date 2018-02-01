package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import View.VentanaLogin;
import View.VentanaPrincipalMedico;
/**
 * El controlador de la ventana principal de medico
 * @author Jennyfer Gonzalez
 * @author Adrian Garcia
 * @author Miguel Chacon Carrasco
 * @version 1.0
 *
 */
public class ControladorVentanaPrincipalMedico implements ActionListener {

	private VentanaPrincipalMedico view;
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
	 * Asigna la ventana de medico
	 * @param view la ventana principal medico
	 */

	public ControladorVentanaPrincipalMedico(VentanaPrincipalMedico view) {
		super();
		this.view = view;
	}

	/**
	 * Controla lo que ocurre al pulsar "Cerrar sesion". Hace visible la ventana log in.
	 * @version 1.0
	 */

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		switch(evento.getActionCommand()){
		
		case "Cerrar sesion":{
			try {
				cntrlLogin=view.getCntrlVenMed().cntrlLogin;
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
