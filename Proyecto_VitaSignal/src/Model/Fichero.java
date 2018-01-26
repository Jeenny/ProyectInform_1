package Model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * Clase para el tratamiento de los ficheros
 * @author Miguel Chacon Carrasco
 * @version 0.5
 */
public class Fichero {

	private String nombreFichero;
	/**
	 * Constructor de la clase fichero
	 * @param fichero el nombre del fichero donde tenemos los datos guardados
	 */
	public Fichero(String fichero){
		nombreFichero=fichero;
	}
	/**
	 * Funcion que compara los usuarios y contraseñas de un txt con los que se le mandan.
	 * He supuesto que se nos dan usuarios seguidos de su contraseña en diferentes lineas y ambos separadas por punto y coma (;)
	 * Si no es asi, se puede cambiar
	 * @author Miguel Chacon
	 * @return comparacion es falso si no encuentra una coincidencia simultanea en usuario y contraseña
	 */
public boolean comprobarUsuario(String Usuario, String Password) throws FileNotFoundException, IOException{
	 boolean comparacion=false;
	 File ficheroUsuario = new File(nombreFichero+".txt");
	 String linea;
	 try{
	 BufferedReader lector=new BufferedReader(new FileReader(ficheroUsuario));;
	 while((linea=lector.readLine())!=null &&(!comparacion)){	//inicia búsqueda del usuario linea a linea
			String[] lineatxt=linea.split(";");	//establece como salto de parámetro el ; esto se puede cambiar
			if(lineatxt[0].equals(Usuario)){
				if(lineatxt[1].equals(Password)){
					comparacion=true;
				}
			}
			 lector.close();
	 }
	 
	 }catch(FileNotFoundException r){
		 System.out.println("Se ha producido el siguiente error de lectura: "+r);//Si hay un error de lectura salta este mensaje
	 
	 
	 }catch(IOException e){
		 System.out.println("Se ha producido el siguiente error desconocido: "+e);//Si hay un error de origen desconocido salta este mensaje
	 }
	
	return comparacion;
}
/**
 * Funcion que introduciendo su usuario te da como resultado que tipo de usuario es (medico, tecnico o administrador)
 * @param usuario es el nombre del usuario
 * @return tipousuario es el tipo de usuario es para el nombre introducido. Si no existe debuelve ""
 */
public String tipoUsuario (String usuario) throws FileNotFoundException, IOException{
	String tipousuario="";
	boolean busqueda=true;
	 File ficheroUsuario = new File(nombreFichero+".txt");
	 String linea;
	 try{
	 BufferedReader lector=new BufferedReader(new FileReader(ficheroUsuario));
	 while((linea=lector.readLine())!=null && busqueda){	//inicia búsqueda del usuario linea a linea
			String[] lineatxt=linea.split(";");	//establece como salto de parámetro el ; esto se puede cambiar
			if(lineatxt[0].equals(usuario)){
				tipousuario=lineatxt[2];
			}
			lector.close();
	 }
	 }catch(FileNotFoundException r){
		 System.out.println("Se ha producido el siguiente error de lectura: "+r);
	 
	 
	 }catch(IOException e){
		 System.out.println("Se ha producido el siguiente error desconocido: "+e);
	 } 
	
	return tipousuario;
}
}
