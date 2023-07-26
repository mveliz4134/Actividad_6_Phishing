/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte2_phi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Parte2_phi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
         //Se hace la primera Parte 
        
          String[] lista = {
                "Urgente", "Iniciar sesion", "Premio", "Gana dinero rapido", "Ganador",
                "Gratis", "Cuenta bloqueada", "Caducidad de cuenta", "Confirmacion requerida", "Actualizar informacion",
                "Confirmar datos", "Contraseña", "Verificacion de cuenta", "Actualizacion urgente", "Oferta exclusiva", 
                "Problema de seguridad", "Suspension de cuenta", "Promocion especial", "Actualice informacion", 
                "Problema de seguridad", "Permio", "Restablecer cuenta", "Problem de inicio de sesion", "Oferta limitada",
                "Recuperar acceso", "Advertencia de seguridad", "Confirma identidad", "Promocion increible", 
                "Actualizar ahora", "Cierra de cuenta"        
               
        };
        int[] arreglo = {1, 3, 2, 2, 3, 1, 1, 3, 3, 3, 2, 1, 1, 2, 2, 3, 2, 1, 2, 2, 1, 3, 3, 3, 2, 1, 1, 2, 1, 2};

        
        //Se hace la segunda Parte
          String filePath = "C:\\Users\\Clarens\\Desktop\\Clarenss\\Tareas 2023\\Java_Actividad_6_Phishing/Lista_archivos.txt"; 
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int total = 0;

            
            while ((line = br.readLine()) != null) {
                for (int i = 0; i < lista.length; i++) {
                    
                }
            }
               System.out.println("TOTAL DE PUNTUACION: " + total);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
