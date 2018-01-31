package View;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JMenuBar;

import javax.swing.JMenu;

import javax.swing.JMenuItem;
import javax.swing.SpringLayout;
import java.awt.Frame;

import Control.ControladorVentanaPrincipalMedico;


public class VentanaPrincipalMedico extends JFrame{
	
	ControladorVentanaPrincipalMedico cntrlVenMed;
	
	/**
	 * Permite acceder controlador de la ventana medico
	 * @return controladorVentanaPrincipalMedico
	 */
	
	public ControladorVentanaPrincipalMedico getCntrlVenMed() {
		return cntrlVenMed;
	}
	
	/**
	 * Se crea la ventana y los elementos de la ventana
	 */

	public VentanaPrincipalMedico() {
		this.setTitle("Ventana Principal Medico");

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		cntrlVenMed=new ControladorVentanaPrincipalMedico(this);
		
        this.setExtendedState(Frame.MAXIMIZED_BOTH);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Sesion");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCerrarSesion = new JMenuItem("Cerrar sesion");
		mntmCerrarSesion.addActionListener(cntrlVenMed);
		mnNewMenu.add(mntmCerrarSesion);
		
		JMenu mnAdmrPacientes = new JMenu("Admr. Pacientes");
		menuBar.add(mnAdmrPacientes);
		
		JMenuItem mntmVerPacientes = new JMenuItem("Ver pacientes");
		mnAdmrPacientes.add(mntmVerPacientes);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
	
		
		JButton btnNuevoPaciente = new JButton("Nuevo Paciente");
		btnNuevoPaciente.addActionListener(cntrlVenMed);
		springLayout.putConstraint(SpringLayout.NORTH, btnNuevoPaciente, 177, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNuevoPaciente, 41, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNuevoPaciente, 234, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNuevoPaciente, 203, SpringLayout.WEST, getContentPane());

		getContentPane().add(btnNuevoPaciente);
	
	}

	
}
