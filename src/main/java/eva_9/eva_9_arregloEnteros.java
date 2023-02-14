/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_9;

/**
 *
 * @author ganda
 */
public class eva_9_arregloEnteros {
    public static void main(String[] args) {
        //arreglo de enteros
        int ArregloDatos [] = new int [1000];
        //metodo para imprimirlo
        long ini = System.nanoTime();
        llenarArreglo (ArregloDatos);
        long fin = System.nanoTime();
       // imprimirArreglo (ArregloDatos);
        System.out.println("Tiempo: "+(fin - ini));
    }
    public static void llenarArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random()*100);
        }
    }
    public static void imprimirArreglo(int [] arreglo){
    for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}

