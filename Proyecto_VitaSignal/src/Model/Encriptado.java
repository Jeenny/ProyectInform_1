package Model;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Clase dedicada a la encriptacion de datos
 * @author Miguel Chacon Carrasco
 * @version 1.0
 */
public class Encriptado {
	/**
	 * Constructor de la clase Encriptado
	 */
	public Encriptado(){
		
	}
	/**
	 * Esta funcion encripta un Strin a MD5
	 * @author 
	 * @version 1.0
	 * @param entrada String que quieres encriptar
	 * @return text String encriptado encriptado
	 * @return error String vacio que da en caso de que halla habido un error
	 */
	public String cigradoMD5(String entrada) {
		 try {
		 MessageDigest md = MessageDigest.getInstance("MD5");
		 byte[] messageDigest = md.digest(entrada.getBytes());
		 BigInteger number = new BigInteger(1, messageDigest);
		 String text = number.toString(16);

		 while (text.length() < 32) {
		 text = "0" + text;
		 }
		 return text;
		 }
		 catch (NoSuchAlgorithmException e) {
			 String error="";
			 System.out.println("Se ha producido el siguiente error: "+e);
			 return error;
		 }
		 }
	/**
	 * Esta funcion encripta la entrada con una codificacion SHA-256
	 * @version 1.0
	 * @author Miguel Chacon Carrasco
	 * @param entrada es el String que deseamos encriptar
	 * @return
	 */
	public  String cifradoSHA256(String entrada) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] hash = md.digest(entrada.getBytes());
		StringBuffer sb = new StringBuffer();
		for(byte b : hash) {        
			sb.append(String.format("%02x", b));
		}    
		return sb.toString();
		} 
		catch (NoSuchAlgorithmException e) {		
			String error="";
			 System.out.println("Se ha producido el siguiente error: "+e);
			 return error;
		}
	}

}
