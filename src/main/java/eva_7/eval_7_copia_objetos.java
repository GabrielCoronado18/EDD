/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_7;

/**
 *
 * @author ganda
 */
public class eval_7_copia_objetos {
    public static void main(String[] args) {
      Persona perso1 = new Persona ();
        perso1.nombre = "Gabriel coronado";
        System.out.println(perso1.nombre);
        Persona copia = new Persona();
        copia.nombre = perso1.nombre;
        copia.nombre = "Juan perez jolote";
        System.out.println(copia.nombre);
        System.out.println(perso1.nombre);
    }
}
class Persona {
String nombre;

}
