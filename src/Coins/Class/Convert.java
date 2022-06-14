package Coins.Class;
import Coins.Interface.MonedaLocal;
import Coins.Interface.MonedaExtranjera;
//  (Usando los valores actualizados el dia 14 jun 2022)
/**
 *
 * @author HP - MSS
 */
public class Convert implements MonedaLocal, MonedaExtranjera {
    // Definiedno el valor de las variables
    private double dolar = 20.64;   // Valor de 1 dolar a pesos Mexicanos
    private double euro = 21.51;   // Valor de 1 euro a pesos Mexicanos
    private double libras = 24.70;   // Valor de 1 libras esterlina a pesos Mexicanos
    private double yen = 0.15;   // Valor de 1 yen a pesos Mexicanos
    private double won = 0.016;   // Valor de 1 won a pesos Mexicanos

    
    //  Moneda Local a Monedas Extranjeras
    @Override
    public double localDolares(double moneda) { return moneda / this.dolar; }
    
    @Override
    public double localEuros(double moneda) {   return moneda / this.euro;  }

    @Override
    public double localLibras(double moneda) {  return moneda / this.libras; }

    @Override
    public double localYen(double moneda) { return moneda / this.yen;   }

    @Override
    public double localWon(double moneda) { return moneda / this.won;   }


    
    //  Monedas Extranjeras a Moneda Local
    @Override
    public double dolaresMlocal(double moneda) {    return moneda * this.dolar; }

    @Override
    public double eurosMlocal(double moneda) {  return moneda * this.euro;  }

    @Override
    public double librasMlocal(double moneda) { return moneda * this.libras; }

    @Override
    public double yenMlocal(double moneda) {    return moneda * this.yen;   }

    @Override
    public double wonMlocal(double moneda) {    return moneda * this.won;   }
    
    
}