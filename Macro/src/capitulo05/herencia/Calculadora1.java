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
public class Calculadora1 extends CalculadoraBase {

    public int factorial(int n) {
        int f = 1;
        while (n > 1) {
            f = f * n--;
        }
        return f;
    }

    public long factorial(long n) {
        long f = 1;
        while (n > 1) {
            f = f * n--;
        }
        return f;
    }

    public boolean esPrimo(int n) {
        boolean primo = true;
        int k = 1;
        while (++k < n) {
            if (n % k == 0) {
                primo = false;
                break;
            }
            
        }
        return primo;
    }

    public boolean esPrimo(long n) {
        boolean primo = true;
        int k = 1;
        while (++k < n) {
            if (n % k == 0) {
                primo = false;
                break;
            }
            
        }
        return primo;
    }

}
