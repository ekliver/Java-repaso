package unidad01;

public class Banco {

    private double capital;
    private double interes;
    private int periodos;

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getPeriodos() {
        return periodos;
    }

    public void setPeriodos(int periodos) {
        this.periodos = periodos;
    }

    public double getImporte() {
        double importe;
        importe = this.getCapital() * Math.pow(1 + this.getInteres(), this.getPeriodos());
        return importe;
    }

}
