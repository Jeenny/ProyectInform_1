package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.Usuario;
import View.VentanaLogin;

public class ControladorLogin implements ActionListener {

	VentanaLogin v1;
	Usuario u1;
	
	public ControladorLogin(VentanaLogin v1) {
		super();
		this.v1 = v1;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		switch(arg0.getActionCommand()) {
		case "Entrar":{
			
			
			
			JOptionPane.showMessageDialog(v1, "Bienvenido usuario");
			
		}
		}
		
	}

}
