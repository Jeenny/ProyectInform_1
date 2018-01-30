package View;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JTable;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JMenuItem;
import javax.swing.SpringLayout;


public class VentanaPrincipalMedico extends JFrame{
	
	public VentanaPrincipalMedico() {
		
		
        //this.setExtendedState(MAXIMIZED_BOTH);
        this.setBounds(200, 200, 500, 500);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Sesion");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCerrarSesion = new JMenuItem("Cerrar sesion");
		mnNewMenu.add(mntmCerrarSesion);
		
		JMenu mnAdmrPacientes = new JMenu("Admr. Pacientes");
		menuBar.add(mnAdmrPacientes);
		
		JMenuItem mntmVerPacientes = new JMenuItem("Ver pacientes");
		mnAdmrPacientes.add(mntmVerPacientes);
		
		JMenu mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JButton btnNuevoPaciente = new JButton("Nuevo paciente");
		springLayout.putConstraint(SpringLayout.NORTH, btnNuevoPaciente, 121, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNuevoPaciente, 49, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNuevoPaciente, 171, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNuevoPaciente, 200, SpringLayout.WEST, getContentPane());
		getContentPane().add(btnNuevoPaciente);
	
	}
}
