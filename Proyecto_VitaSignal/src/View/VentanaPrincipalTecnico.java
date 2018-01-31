package View;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SpringLayout;

import Control.ControladorVentanaPrincipalTecnico;

import java.awt.Frame;

import javax.swing.JButton;

public class VentanaPrincipalTecnico extends JFrame{
	
	ControladorVentanaPrincipalTecnico cntrlVenTec;
	
	/**
	 * Permite acceder controlador de la ventana tecnico
	 * @return controladorVentanaPrincipalTecnico
	 */
	
	public ControladorVentanaPrincipalTecnico getCntrlVenTec() {
		return cntrlVenTec;
	}
	
	
	/**
	 * Se crea la ventana y los elementos de la ventana
	 */
	
	public VentanaPrincipalTecnico() {
		
		this.setTitle("Ventana Principal Tecnico");
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setExtendedState(Frame.MAXIMIZED_BOTH);
        
		cntrlVenTec=new ControladorVentanaPrincipalTecnico(this);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Sesion");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCerrarSesion = new JMenuItem("Cerrar sesion");
		mntmCerrarSesion.addActionListener(cntrlVenTec);
		mnNewMenu.add(mntmCerrarSesion);
		
		//JMenu mnAdmrPacientes = new JMenu("Admr. Pacientes");
		//menuBar.add(mnAdmrPacientes);
		
		//JMenuItem mntmVerPacientes = new JMenuItem("Ver pacientes");
		//mnAdmrPacientes.add(mntmVerPacientes);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
	
		JButton btnAñadirEcg = new JButton("Añadir ECG");
		btnAñadirEcg.addActionListener(cntrlVenTec);
		springLayout.putConstraint(SpringLayout.NORTH, btnAñadirEcg, 177, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnAñadirEcg, 41, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnAñadirEcg, 234, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnAñadirEcg, 203, SpringLayout.WEST, getContentPane());

		getContentPane().add(btnAñadirEcg);
	
	}
}
