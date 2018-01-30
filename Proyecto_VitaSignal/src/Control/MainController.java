package Control;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

import Model.Usuario;
import View.VentanaLogin;
import View.VentanaPrincipalMedico;

public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f =new File("src/Usuarios/users.txt");
		FileReader fr;
		BufferedReader br;
		
		
		ArrayList<Usuario> users = new ArrayList<Usuario>();
		
		
		try {
			fr = new FileReader(f);
			Scanner scanner;
			scanner = new Scanner(fr).useDelimiter(";|\r\n|\n");
			
			
			while (scanner.hasNext()) {
				Usuario u1 = new Usuario();
				
			    u1.setUsuario(scanner.next());
			    System.out.println("U"+u1.getUsuario());
			    
			    u1.setPassword(scanner.next());
			    System.out.println("P"+u1.getPassword());
			    u1.setTipo(scanner.next());
			    System.out.println("T"+u1.getTipo());
			    users.add(u1);
			    

			}
			
			
			
			
		
			
	
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		ControladorLogin clLog= new ControladorLogin(users);
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin(clLog);
					clLog.setV1(frame);
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	}


