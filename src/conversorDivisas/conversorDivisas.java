package conversorDivisas;

import operacionesAritmeticas.operacionesAritmeticas;

public class conversorDivisas {

    public String convertirDivisas(double valor, String divisas) {
        operacionesAritmeticas operciones = new operacionesAritmeticas();
        String mensaje = null;
        double operacion;
        //De Pesos a Dolar, Euro, Libras, Yen, Won Coreano
        switch (divisas) {
            case "De Pesos a Dolar":
                operacion = operciones.multiplicar(valor, 4028);
                mensaje = "Equivale $" + operacion + "Dolar";
                break;
            case "De Pesos a Euro":
                operacion = operciones.multiplicar(valor, 4424);
                mensaje = "Equivale $" + operacion + "Euros";
                break;
            case "De Pesos a Libras":
                operacion = operciones.multiplicar(valor, 5138);
                mensaje = "Equivale $" + operacion + " Libras";
                break;
            case "De Pesos a Yen":
                operacion = operciones.multiplicar(valor, 28.10);
                mensaje = "Equivale $" + operacion + " Yen";
                break;
            case "De Pesos a Won Coreano":
                operacion = operciones.multiplicar(valor, 3.06);
                mensaje = "Equivale $" + operacion + " Won Coreano";
                break;
            case "De Dolar a Pesos":
                operacion = operciones.dividir(valor, 4028);
                mensaje = "Equivale $" + operacion + " Pesos";
                break;
            case "De Euro a Pesos":
                operacion = operciones.dividir(valor, 4424);
                mensaje = "Equivale $" + operacion + " Pesos";
                break;
            case "De Libras a Pesos":
                operacion = operciones.dividir(valor, 5138);
                mensaje = "Equivale $" + operacion + " Pesos";
                break;
            case "De Yen a Pesos":
                operacion = operciones.dividir(valor, 28.10);
                mensaje = "Equivale $" + operacion + " Pesos";
                break;
            case "De Won Coreano a Pesos":
                operacion = operciones.dividir(valor, 3.06);
                mensaje = "Equivale $" + operacion + " Pesos";
                break;
        }
        return mensaje;
    }


}
