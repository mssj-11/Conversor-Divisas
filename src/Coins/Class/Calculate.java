package Coins.Class;
import javax.swing.*;
/**
 *
 * @author HP - MSS
 */
public class Calculate {
    private  Convert convertidor = new Convert();
    
    
    public double monedaLocal(int opcion){
        double moneda;
        moneda = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a convertir"));
        boolean c = moneda <= 0;

        if (!c){
            switch (opcion){
                case 0: return convertidor.localDolares(moneda);
                case 1: return convertidor.localEuros(moneda);
                case 2: return convertidor.localLibras(moneda);
                case 3: return convertidor.localYen(moneda);
                case 4: return convertidor.localWon(moneda);
            }
            JOptionPane.showMessageDialog(null,"El valor no es valido","Error",JOptionPane.ERROR_MESSAGE);
            return 0;

        }else {
            JOptionPane.showMessageDialog(null,"El valor no puede ser menor","Error a convertir",JOptionPane.ERROR_MESSAGE);
            return 0;
        }

    }
    
    
    public double monedaExtranjera(int opcion) {
        double moneda;
        moneda = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a convertir"));
        boolean c = moneda <= 0;

        if (!c) {
            switch (opcion) {
                case 0:
                    return convertidor.dolaresMlocal(moneda);
                case 1:
                    return convertidor.eurosMlocal(moneda);
                case 2:
                    return convertidor.librasMlocal(moneda);
                case 3:
                    return convertidor.yenMlocal(moneda);
                case 4:
                    return convertidor.wonMlocal(moneda);
            }
            JOptionPane.showMessageDialog(null, "El valor no es valido", "Error", JOptionPane.ERROR_MESSAGE);
            return 0;

        } else {
            JOptionPane.showMessageDialog(null, "El valor a convertir no puede ser menor", "Error numerico", JOptionPane.ERROR_MESSAGE);
            return 0;
        }

    }
}