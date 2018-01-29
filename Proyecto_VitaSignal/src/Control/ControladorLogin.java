package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.Usuario;
import View.VentanaLogin;

public class ControladorLogin implements ActionListener {

	VentanaLogin v1;
	public VentanaLogin getV1() {
		return v1;
	}
	public void setV1(VentanaLogin v1) {
		this.v1 = v1;
	}
	Usuario u1;
	
	public ControladorLogin(VentanaLogin v1) {
		super();
		this.v1 = v1;
	}
	public ControladorLogin(Usuario u12) {
		// TODO Auto-generated constructor stub
		this.u1=u12;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		switch(arg0.getActionCommand()) {
		case "Entrar":{
			char[] charPass=v1.getPasswordField().getPassword();
			String pass=String.valueOf(charPass);
				
			if(u1.getUsuario().equals(v1.getTextField().getText())&&u1.getPassword().equals(pass)){
			
			JOptionPane.showMessageDialog(v1, "Bienvenido usuario");
			
			}
		}
		}
		
	}

}
