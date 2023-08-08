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
                operacion = operciones.dividirRedondiado(valor, 4028);
                mensaje = "Equivale $" + operacion + "Dolar";
                break;
            case "De Pesos a Euro":
                operacion = operciones.dividirRedondiado(valor, 4424);
                mensaje = "Equivale $" + operacion + "Euros";
                break;
            case "De Pesos a Libras":
                operacion = operciones.dividirRedondiado(valor, 5138);
                mensaje = "Equivale $" + operacion + " Libras";
                break;
            case "De Pesos a Yen":
                operacion = operciones.dividirRedondiado(valor, 28.10);
                mensaje = "Equivale $" + operacion + " Yen";
                break;
            case "De Pesos a Won Coreano":
                operacion = operciones.dividirRedondiado(valor, 3.06);
                mensaje = "Equivale $" + operacion + " Won Coreano";
                break;
            case "De Pesos a Rublos":
                operacion = operciones.multiplicarRedondiado(valor, 0.024);
                mensaje = "Equivale $" + operacion + " Rublos";
                break;
            case "De Dolar a Pesos":
                operacion = operciones.multiplicarRedondiado(valor, 4028);
                mensaje = "Equivale $" + operacion + " Pesos";
                break;
            case "De Euro a Pesos":
                operacion = operciones.multiplicarRedondiado(valor, 4424);
                mensaje = "Equivale $" + operacion + " Pesos";
                break;
            case "De Libras a Pesos":
                operacion = operciones.multiplicarRedondiado(valor, 5138);
                mensaje = "Equivale $" + operacion + " Pesos";
                break;
            case "De Yen a Pesos":
                operacion = operciones.multiplicarRedondiado(valor, 28.10);
                mensaje = "Equivale $" + operacion + " Pesos";
                break;
            case "De Won Coreano a Pesos":
                operacion = operciones.multiplicarRedondiado(valor, 3.06);
                mensaje = "Equivale $" + operacion + " Pesos";
                break;
            case "De Rublos a Pesos":
                operacion = operciones.dividirRedondiado(valor, 0.024);
                mensaje = "Equivale $" + operacion + " Pesos";
                break;
        }
        return mensaje;
    }


}
