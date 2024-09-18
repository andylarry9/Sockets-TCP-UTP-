
package tarea1_socketservidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Servidor {

    public static void main(String[] args) {
        int puerto = 12345; //puerto deseado
        try(ServerSocket servidorSocket = new ServerSocket(puerto)){
            System.out.println("Servidor escuchando en el puerto "+ puerto);
             Socket clienteSocket = servidorSocket.accept();
             //Aqui se puede manejar la conexion con el cliente
             InputStream inputStream = clienteSocket.getInputStream();
             BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
             String mensaje = in.readLine();
             System.out.println("Mensaje recibido del cliente: "+ mensaje);
        }catch (IOException e){
            e.printStackTrace();
            
        }
       
    }
    
}
