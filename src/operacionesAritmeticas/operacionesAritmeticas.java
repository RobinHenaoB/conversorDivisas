package operacionesAritmeticas;

public class operacionesAritmeticas {
    public double multiplicarRedondiado(double valor, double equivalencia){
        return redondiado(valor * equivalencia);
    }

    public double dividirRedondiado(double valor, double equivalencia){
        return redondiado(valor / equivalencia);
    }

    public static double redondiado(double numero){
        return  (double) Math.round(numero *10000d)/10000;
    }
}
