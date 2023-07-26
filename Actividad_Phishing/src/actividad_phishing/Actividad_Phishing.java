
package actividad_phishing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Actividad_Phishing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
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


        
        String filePath = "C:\\Users\\miguel veliz\\Documents\\Link_Actividad_6/Lista_archivos.txt"; 
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int total = 0;

            
            while ((line = br.readLine()) != null) {
                for (int i = 0; i < lista.length; i++) {
                    int occurrences = ocurrencias_conteo(line, lista[i]);
                    if (occurrences > 0) {
                        int score = occurrences * arreglo[i];
                        System.out.printf("PALABRAS CLAVES: %s, OCURRENCIAS: %d, PUNTUACION: %d%n",
                                lista[i], occurrences, score);
                        total += score;
                    }
                }
            }

            System.out.println("TOTAL DE PUNTUACION: " + total);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  
    private static int ocurrencias_conteo(String line, String lista) {
        int count = 0;
        int index = line.indexOf(lista);
        while (index != -1) {
            count++;
            index = line.indexOf(lista, index + lista.length());
        }
        return count;
    }
}
    

