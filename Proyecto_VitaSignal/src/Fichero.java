import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Fichero {
	private String nombreFichero;
	public Fichero(String fichero){
		nombreFichero=fichero;
	}
public boolean compararUsuario(String Usuario, String Password) throws FileNotFoundException{
	 boolean comparacion=false;
	 File ficheroUsuario = new File(nombreFichero+".txt");
	 try{
	 BufferedReader lector=new BufferedReader(new FileReader(ficheroUsuario));;
	
	 
	 }catch(Exception e){
		 System.out.println("Se ha producido el siguiente error "+e);
	 }
	return comparacion;
}
}
