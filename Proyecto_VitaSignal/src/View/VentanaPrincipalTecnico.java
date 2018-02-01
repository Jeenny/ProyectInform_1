package View;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SpringLayout;
import Control.ControladorVentanaPrincipalTecnico;
import java.awt.Frame;
import javax.swing.JButton;
/**
 * Genera la ventana de tecnico
 * @author Jennyfer Gonzalez
 * @author Adrian Garcia
 * @author Miguel Chacon Carrasco
 * @version 0.5
 *
 */
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
	 * Se crea todos los elementos de la ventana junto a la misma
	 * @version 0.5
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
		
	
		JButton btnAnadirEcg = new JButton("Añadir ECG");
		btnAnadirEcg.addActionListener(cntrlVenTec);
		springLayout.putConstraint(SpringLayout.NORTH, btnAnadirEcg, 177, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnAnadirEcg, 41, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnAnadirEcg, 234, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnAnadirEcg, 203, SpringLayout.WEST, getContentPane());

		getContentPane().add(btnAnadirEcg);
	
	}
}
