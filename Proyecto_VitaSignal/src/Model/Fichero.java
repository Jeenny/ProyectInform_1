package Model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import Model.Encriptado;
/**
 * Clase para el tratamiento de los ficheros
 * @author Jennyfer Gonzalez
 * @author Adrian Garcia
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
	 * Funcion que compara los usuarios y password de un txt con los que se le mandan.
	 * He supuesto que se nos dan usuarios seguidos de su password en diferentes lineas y ambos separadas por punto y coma (;)
	 * Si no es asi, se puede cambiar
	 * @author Miguel Chacon
	 * @return comparacion es falso si no encuentra una coincidencia simultanea en usuario y contrase�a
	 */
public boolean comprobarUsuario(String Usuario, String Password) throws FileNotFoundException, IOException{
	 boolean comparacion=false;
	 File ficheroUsuario = new File(nombreFichero+".txt");
	 String linea;
	 try{
	 BufferedReader lector=new BufferedReader(new FileReader(ficheroUsuario));;
	 while((linea=lector.readLine())!=null &&(!comparacion)){	//inicia b�squeda del usuario linea a linea
			String[] lineatxt=linea.split(";");	//establece como salto de par�metro el ; esto se puede cambiar
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
	 while((linea=lector.readLine())!=null && busqueda){	//inicia busqueda del usuario linea a linea
			String[] lineatxt=linea.split(";");	//establece como salto de parametro el ; esto se puede cambiar
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
/**
 * Funcion de busqueda de un usuario y comparacion de su password, ambos encriptados en MD5
 * @param Usuario
 * @param contrasena
 * @return comparacion
 * @version 0.5
 */
public boolean comprobarUsuarioEncriptado(String Usuario, String contrasena) {
	boolean comprobacion=false;
	Encriptado e= new Encriptado();
	String Username=e.cigradoMD5(Usuario);
	String Password=e.cigradoMD5(contrasena);
	try {
		comprobacion=comprobarUsuario(Username,Password);
	} catch (FileNotFoundException e1) {
		e1.printStackTrace();
	} catch (IOException e1) {
		e1.printStackTrace();
	}
	return comprobacion;
}
/**
 * Busca el tipo de usuario en un fichero encriptado en MD5
 * @param Usuario
 * @return
 * @throws FileNotFoundException
 * @throws IOException
 * @version 0.5
 */
public String tipoUsuarioEncriptado (String Usuario) throws FileNotFoundException, IOException{
	String tipoUsuario;
	Encriptado e= new Encriptado();
	String Username=e.cigradoMD5(Usuario);
	tipoUsuario=tipoUsuario(Username);
	return tipoUsuario;
}
}
