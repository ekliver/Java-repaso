package unidad01;

public class BancoMain {

    public static void main(String[] args) {
        double capital = 10;
        double interes = 1;
        int periodos = 1;

        Banco objBanco = new Banco();
        //Proceso
        objBanco.setCapital(capital);
        objBanco.setInteres(interes);
        objBanco.setPeriodos(periodos);
        double importe=objBanco.getImporte();
        
        //Redondear
        importe=importe*100;
        importe=Math.round(importe);
        importe=importe/100;
        
        System.out.println("Resp: "+String.valueOf(importe));
        
    }
}
