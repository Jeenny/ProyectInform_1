package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.Usuario;
import View.VentanaLogin;
import View.VentanaPrincipalMedico;

public class ControladorLogin implements ActionListener, KeyListener {

	VentanaLogin v1;
	VentanaPrincipalMedico venMed;
	public VentanaLogin getV1() {
		return v1;
	}
	public void setV1(VentanaLogin v1) {
		this.v1 = v1;
	}
	ArrayList<Usuario> users;
	
	public ControladorLogin(ArrayList<Usuario> users) {
		super();
		this.users = users;
	}
	
	public ControladorLogin(VentanaLogin v1) {
		super();
		this.v1 = v1;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		switch(arg0.getActionCommand()) {
		case "Entrar":{
			char[] charPass=v1.getPasswordField().getPassword();
			String pass=String.valueOf(charPass);
			boolean logueado = false;
			int cont= 0;
			

			while(!logueado&&cont<users.size()) {
				System.out.println(cont);
				System.out.println(users.get(cont).getUsuario());
				System.out.println(users.get(cont).getPassword());
			
				
				if(users.get(cont).getUsuario().equals(v1.getTextField().getText())&&users.get(cont).getPassword().equals(pass)){
					v1.setVisible(false);
					logueado=true;

					if ( users.get(cont).getTipo().equals("medico")) {
						venMed=new VentanaPrincipalMedico();
						ControladorVentanaPrincipalMedico cntrlMed = venMed.getCntrlVenMed();
						cntrlMed.setCntrlLogin(this);
					}
					
					
					venMed.setVisible(true);
					
					}
				cont++;		
				
				
			}
			
			break;
			
		}
					
				
				
			}
				
			
			}

	
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==10) {
			char[] charPass=v1.getPasswordField().getPassword();
			String pass=String.valueOf(charPass);
			boolean logueado = false;
			int cont= 0;
			

			while(!logueado&&cont<users.size()) {
				System.out.println(cont);
				System.out.println(users.get(cont).getUsuario());
				System.out.println(users.get(cont).getPassword());
			
				
				if(users.get(cont).getUsuario().equals(v1.getTextField().getText())&&users.get(cont).getPassword().equals(pass)){
					v1.setVisible(false);
					logueado=true;
					
				
					if ( users.get(cont).getTipo().equals("medico")) {
						venMed=new VentanaPrincipalMedico();
						ControladorVentanaPrincipalMedico cntrlMed = venMed.getCntrlVenMed();
						cntrlMed.setCntrlLogin(this);
						venMed.setVisible(true);
					}
					
				
					}
				cont++;
				
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
