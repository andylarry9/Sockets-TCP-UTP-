
package socketcliente;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;


public class Cliente {

   
    public static void main(String[] args) {
        String servidorIP = "127.0.0.1"; // Cambia esto a la IP del servidor si está en otra máquina
        int puerto = 12345; // Mismo puerto que el servidor
        
        try(Socket clienteSocket = new Socket(servidorIP, puerto)){
           // Aquí se puede enviar un mensaje al servidor 
           OutputStream outputStream = clienteSocket.getOutputStream();
           PrintWriter out = new PrintWriter (outputStream,true);
           out.println("¡Hola, servidor!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
}
