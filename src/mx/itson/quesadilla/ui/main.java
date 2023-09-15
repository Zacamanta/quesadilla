/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.quesadilla.ui;

import java.util.Scanner;

/**
 *
 * @author omar_
 */
public class main {

    public static void main(String[] args) {
        System.out.println("ingrese el texto a evaluar");
        Scanner entrada = new Scanner(System.in);
        String oracion = entrada.nextLine();

        String nuevaOracion = oracion.replace("-", " ")
                .replace(" ", "")
                .replace("(", "")
                .replace(")", "");

        // System.out.println(nuevaOracion);
        String[] telefonos = nuevaOracion.split(",");

        int guaymas = 0;
        int hermosillo = 0;
        int tijuana = 0;
        int desconocido = 0;

        for (String t : telefonos) {

            if (t.startsWith("622")) {
                //guaymas = guaymas +1;
                guaymas++;
            } else if (t.startsWith("662")) {
                hermosillo++;
            } else if (t.startsWith("664")) {
                tijuana++;
            } else {
                desconocido++;
            }
        }
        System.out.println("hay " + guaymas + " numero de Guaymas");
        System.out.println("hay " + hermosillo + " numero de Hermosillo");
        System.out.println("hay " + tijuana + " numero de Tijuana");
        System.out.println("hay " + desconocido + " numero Desconocido");
 
        // String nuevaOracion = oracion.replace("n", "s").replace("M", "s");
        //System.out.println(nuevaOracion);

        /* boolean estaUsada = oracion.startsWith("a");
    if (estaUsada){
        System.out.println("si inicia con a");
    }else{
        System.out.println("no inicia con a");
    
    }
    /////////////////
    
    if(oracion.startsWith("a")){
        System.out.println("si inicia con a");
    }else{
        System.out.println("no inicia con a");
    
    }
    ///////////////////
    
    System.out.println(oracion.startsWith("a") ? "si inicia con a" : "no inicia con a");
         */
    }

}
