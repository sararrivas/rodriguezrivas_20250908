/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodriguezrivas_20250908;

/**
 *
 * @author UFG
 */

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Tamaño del arreglo//
        int cantidad_elementos = 5;
        
        //creacion e  instancia arreglo de numeros desordenados//
        int[] numeros_desordenados = new int[cantidad_elementos];
        
        //creacion e  instancia arreglo de numeros ordenados//
        int[] numeros_ordenados = new int[cantidad_elementos];
        
        //Creacion e instancia del objeto scanner//
        Scanner scanner= new Scanner(System.in);
        
        //Notificación al usuario para indicarle que debe ingresar valores enteros//
        System.out.println("Por favor ingrese "+cantidad_elementos+" numeros enteros de manera desordenada");
        
        //Se recorre el arreglo de numeros enteros desordenados que por defecto tienen el valor de cero//
        for(int i = 0; i < numeros_desordenados.length; i++){
            //Se solicita al usuario el ingreso de un valor
            System.out.print("Digite el elemento "+(i+1)+": ");
            //Se digita un valor desde el teclado de tipo entero
            numeros_desordenados[i] = scanner.nextInt();
            
        }
        
        //Se imprimer una salida al usuario para mostrar lo que ha digitado
        System.out.println("Usted digitó los siguientes números: ");
        
        //Se recorre el arreglo de valores digitados//
        for(int j = 0; j<numeros_desordenados.length; j++){
            //Se imprimen los números digitados por el usuario//
            //Almacenamos en el arreglo de números desordenados
            System.out.print(numeros_desordenados[j]+" ");
            
        }
        //Hacemos salto de linea//
        System.out.println();
        
        //Invocamos la porcion para ordenar el arreglo//
        numeros_ordenados = ordenar(numeros_desordenados);
        
        //Imprimimos la salida al usuario//
        System.out.println("Los numeros ordenados son: ");
        
        //Se recorre el arreglo para obtener cada valor del arreglo ordenado//
        for(int k=0; k<numeros_ordenados.length; k++){
            
            //Se imprime el valor de cada elemento//
            System.out.print(numeros_ordenados[k]+" ");
            
        }
        
        System.out.println();
    }
    
    //Funcion para ordenar un arreglo unidimensional//
    public static int[] ordenar( int[] arreglo ){
        //se recorre el arreglo para evaluar cada posicion//
        for(int i = 0;i < arreglo.length-1 ; i++){
            //Se hace un segundo recorrido para poder comparar la porcion actual con la posicion siguiente//
            for(int j = 0; j < arreglo.length-1 ; j++){
                
          
                //Se evalua el valor de cada elemento en el arreglo//
                if (arreglo[j] > arreglo[j+1]){
                    
                    //Si es mayor, se crea una variable para almacenar  el valor del elemento mayor//
                    int mayor = arreglo[j];
                    
                    //Se cambia la posicion del elemento actual//
                    arreglo[j] = arreglo[j+1];
                    
                    //Se encrementa la pocicion del siguiente elemento asignando el valor mayor//
                    arreglo[j+1] = mayor;
                    
                }
            }
            
            System.out.println();
        }
        
        return arreglo;
    }
    
    
    
}
