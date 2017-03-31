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
public class Ecuacion {

    private double c;
    private double b;
    private double a;

    public Ecuacion(double c, double b, double a) {
        this.setA(a);
        this.setB(b);
        this.setC(c);

    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double[] resolver() {
        double raiz[] = new double[2];
        double temp = Math.sqrt(Math.pow(this.getB(), 2) - 4 * this.getA() + this.getC());
        raiz[0] = (-this.getB() + temp) / (2 * this.getA());
        raiz[1] = (-this.getB() - temp) / (2 * this.getA());
        return raiz;
    }
    
    
}
