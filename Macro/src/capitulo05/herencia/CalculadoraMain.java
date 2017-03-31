/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo05.herencia;

/**
 *
 * @author Pc
 */
public class CalculadoraMain {

    public static void main(String[] args) {
        //Datos
        int n1 = 5;
        int n2 = 8;

        //Proceso
        Calculadora1 obj = new Calculadora1();
        int suma = obj.suma(n1, n2);
        int f1 = obj.factorial(n1);
        int f2 = obj.factorial(n2);
        
        //Reporte
        System.out.println("La suma es: "+suma);
        System.out.println("Factorial de "+n1+" es: "+f1);
        System.out.println("Factorial de "+n2+" es: "+f2);
        

    }
}
