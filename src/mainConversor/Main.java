package mainConversor;

import javax.swing.*;

import conversorDivisas.conversorDivisas;
import conversorLongitud.conversorLongitud;

public class Main {
    public static void main(String[] args) {
        conversorDivisas operacionDivisas = new conversorDivisas();
        conversorLongitud operacionLongitud = new conversorLongitud();

        while (true) {
            Object conversion = (JOptionPane.showInputDialog(null, "seleccione una opcion de conversion", "Conversion",
                    JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moneda", "Conversor de Longitud"}, "conversor de moneda"));
            if (conversion == null) {
                JOptionPane.showMessageDialog(null, "Programa terminado");
                break;
            } else if (conversion.toString().equals("Conversor de Moneda")) {
                String entrada = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir");
                if (entrada == null) {
                    JOptionPane.showMessageDialog(null, "Programa terminado");
                    break;
                } else if (isNumeric(entrada)) {
                    double valor = Integer.parseInt(entrada);
                    //De Pesos a Dolar,Euro,Libras,Yen,Won Coreano
                    Object divisas = (JOptionPane.showInputDialog(null, "seleccione una opcion de conversion", "Divisas",
                            JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen",
                                    "De Pesos a Won Coreano", "De Pesos a Rublos", "De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos",
                                    "De Won Coreano a Pesos", "De Rublos a Pesos"}, "De Pesos a Dolar"));

                    if (divisas == null) {
                        JOptionPane.showMessageDialog(null, "Programa terminado");
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, operacionDivisas.convertirDivisas(valor, divisas.toString()));
                        int opc = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                        if (opc != 0) {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            break;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
            } else {
                String entrada = JOptionPane.showInputDialog(null, "Ingrese la medida de longitud que desea convertir");
                if (entrada == null) {
                    JOptionPane.showMessageDialog(null, "Programa terminado");
                    break;
                } else if (isNumeric(entrada)) {
                    double medidad = Integer.parseInt(entrada);
                    //De Metros a centimetros, milimetros, kilometros, pulgadas, pies, yardas
                    Object unidad = (JOptionPane.showInputDialog(null, "seleccione una opcion de conversion", "Longitudes",
                            JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Metros a Centimetros", "De Metros a Milimetros", "De Metros a Kilometros",
                                    "De Metros a Pulgadas", "De Metros a Pies", "De Metros a Yardas", "De Centimetros a Metros", "De Milimetros a Metros",
                                    "De Kilometros a Metros", "De Pulgadas a Metros", "De Pies a Metros", "De Yardas a Metros"}, "De Metros a Centimetros"));
                    if (unidad == null) {
                        JOptionPane.showMessageDialog(null, "Programa terminado");
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, operacionLongitud.convertirLongitud(medidad, unidad.toString()));
                        int opc = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                        if (opc != 0) {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            break;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }

            }
        }

    }

    private static boolean isNumeric(String entrada) {
        try {
            Integer.parseInt(entrada);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}