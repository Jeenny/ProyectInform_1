package Model;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * Clase dedicada a la encriptacion de datos
 * @author Jennyfer Gonzalez
 * @author Adrian Garcia
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
	 * Esta funcion encripta un String a MD5
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
	 * Esta funcion encripta la entrada (un string) con una codificacion SHA-256
	 * @version 1.0
	 * @author Miguel Chacon Carrasco
	 * @param entrada es el String que deseamos encriptar
	 * @return sb.toString() si todo sale bien, debuelve la entrada encriptada
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
	/**
	 * Este cifrado es una encriptacion por desplazamiento. Solo encripta lentras en las que no se incluye la Ñ
	 * @param texto
	 * @param codigo
	 * @return
	 */
	public String cifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) + codigo) > 'z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) + codigo) > 'Z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            }
        }
        return cifrado.toString();
    }
/**
 * Descifrado tipo cesar. Descifra una encriptacion por desplazamiento
 * @param texto
 * @param codigo
 * @return
 */
    public String descifradoCesar(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) - codigo) < 'a') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) - codigo) < 'A') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            }
        }
        return cifrado.toString();
    }
}
