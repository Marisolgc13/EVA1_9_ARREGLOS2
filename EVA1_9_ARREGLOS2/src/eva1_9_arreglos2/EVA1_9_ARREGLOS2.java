/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_arreglos2;

/**
 *
 * @author Marisol G
 */
public class EVA1_9_ARREGLOS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //ARREGLO DE ENTEROS
        int arreglosDatos[] = new int [1000000];
        // metodo para llenar el valor aleatorios 
        // para calcular tiempo nanotime
        long ini= System.nanoTime();
        llenarArreglo(arreglosDatos);
          long fin = System.nanoTime();
          System.out.println("Tiempo: " + (fin - ini));
        //metodo para imprimirlo 
        //imprimirArreglo(arreglosDatos);
    }
    public static void llenarArreglo(int [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
        
    }
    public static void imprimirArreglo(int [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+ arreglo[i]+"]");
        }
        System.out.println("");
        
    }
}
