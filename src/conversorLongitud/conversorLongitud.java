package conversorLongitud;

import operacionesAritmeticas.operacionesAritmeticas;

public class conversorLongitud {
    public String convertirLongitud(double medida, String unidad) {
        operacionesAritmeticas operciones = new operacionesAritmeticas();
        String mensaje = null;
        double operacion;

        switch (unidad) {
            case "De Metros a Centimetros":
                operacion = operciones.multiplicar(medida, 100);
                mensaje = "Equivale " + operacion + " Centimetros";
                break;
            case "De Metros a Milimetros":
                operacion = operciones.multiplicar(medida, 1000);
                mensaje = "Equivale " + operacion + " Milimetros";
                break;
            case "De Metros a Kilometros":
                operacion = operciones.dividir(medida, 1000);
                mensaje = "Equivale " + operacion + " Kilometros";
                break;
            case "De Metros a Pulgadas":
                operacion = operciones.multiplicar(medida, 39.3701);
                mensaje = "Equivale " + operacion + " Pulgadas";
                break;
            case "De Metros a Pies":
                operacion = operciones.multiplicar(medida, 3.28084);
                mensaje = "Equivale " + operacion + " Pies";
                break;
            case "Metros a Yardas":
                operacion = operciones.multiplicar(medida, 1.09361);
                mensaje = "Equivale " + operacion + " Yardas";
                break;
            case "De Centimetros a Metros":
                operacion = operciones.dividir(medida, 100);
                mensaje = "Equivale " + operacion + " Metros";
                break;
            case "De Milimetros a Metros":
                operacion = operciones.dividir(medida, 1000);
                mensaje = "Equivale " + operacion + " Metros";
                break;
            case "De Kilometros a Metros":
                operacion = operciones.multiplicar(medida, 1000);
                mensaje = "Equivale " + operacion + " Metros";
                break;
            case "De Pulgadas a Metros":
                operacion = operciones.dividir(medida, 39.3701);
                mensaje = "Equivale " + operacion + " Metros";
                break;

            case "De Pies a Metros":
                operacion = operciones.dividir(medida, 3.28084);
                mensaje = "Equivale " + operacion + " Metros";
                break;
            case "De Yardas a Metros":
                operacion = operciones.dividir(medida, 1.09361);
                mensaje = "Equivale " + operacion + " Metros";
                break;
        }
        return mensaje;
    }
}
