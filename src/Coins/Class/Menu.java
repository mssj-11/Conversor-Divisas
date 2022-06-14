package Coins.Class;
import javax.swing.*;
import java.text.DecimalFormat;
/**
 *
 * @author HP - MSS
 */
public class Menu {
    private int posicion;
    private Calculate calculos = new Calculate();

    public void inicio() {
        int numero;
        String[] tiposDeConversion = {"Conversor de Pesos MX a Moneda Extranjera", "Conversor de Moneda Extranjera a Pesos MX"};
        do {
            String opcion = (String) JOptionPane.showInputDialog(null, "Elige una opcion", "Conversor de Divisas", JOptionPane.QUESTION_MESSAGE, null, tiposDeConversion, tiposDeConversion[0]);
            posicion = obtenerPosicion(tiposDeConversion, opcion);
            switch (posicion) {
                case 0:
                    monedaLocalAMonedaExtranjera();
                    break;
                case 1:
                    monedaExtranjeraALocal();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opcion no es correcta", "Erorr", JOptionPane.ERROR_MESSAGE);

            }
            numero = JOptionPane.showConfirmDialog(null, "¿Quieres salir?");

        }
        while (numero == 1);
        JOptionPane.showMessageDialog(null, "\t\tHa salido del programa", "Saliendo", JOptionPane.CLOSED_OPTION);


    }

    private void monedaLocalAMonedaExtranjera() {
        DecimalFormat decimalFormat = new DecimalFormat("#.000");
        String[] opciones = {"Local a dolar", "Local a euro", "Local a Libra", "Local a yen", "Local a won"};
        try {
            String opcion = (String) JOptionPane.showInputDialog(null, "Elige una opcion", "Conversor de Divisas", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            posicion = obtenerPosicion(opciones, opcion);
            JOptionPane.showMessageDialog(null, "El valor es: " + decimalFormat.format(calculos.monedaLocal(posicion)) + " " + tipoDeMoneda(opciones, opcion));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor incorrecto", "Error, Vuela a intentar", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void monedaExtranjeraALocal() {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String[] opciones = {"Dolar a Local", "Euro a Local", "Libras  a Local", "Yen a Local", "Won a Local"};
        try {
            String opcion = (String) JOptionPane.showInputDialog(null, "Elige una opcion", "Conversor de Divisas", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            posicion = obtenerPosicion(opciones, opcion);
            JOptionPane.showMessageDialog(null, "El valor es: " + decimalFormat.format(calculos.monedaExtranjera(posicion)) + " " + " Pesos Mexicanos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor incorrecto", "Error, vuelva a intentar", JOptionPane.ERROR_MESSAGE);

        }
    }

    private int obtenerPosicion(String[] array, String opcion) {
        for (int i = 0; i <= array.length; i++) {
            if (array[i] == opcion) {
                return i;
            }
        }
        return 0;
    }

    private String tipoDeMoneda(String[] arreglo, String posicion) {
        String[] nombre = {"Dolar", "Euro", "Libra", "Yen", "Won"};

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == posicion) {
                return nombre[i];
            }
        }
        return null;
    }
}