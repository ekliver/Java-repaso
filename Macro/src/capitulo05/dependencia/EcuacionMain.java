/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo05.dependencia;

/**
 *
 * @author Pc
 */
public class EcuacionMain {
    
    public static void main(String[] args) {
    Ecuacion obj=new Ecuacion(1,-4,3);
    double rpta[]=obj.resolver();
    
        System.out.println("X1: "+rpta[0]);    
        System.out.println("X2: "+rpta[1]);    
    }
}
