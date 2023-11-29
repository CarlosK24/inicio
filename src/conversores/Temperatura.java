/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversores;

/**
 *
 * @author Matias
 */
public class Temperatura {

    public double valor; //En Kelvin

    public Temperatura(double t, String s) {
        s = s.toUpperCase();

        switch (s) {
            case "C":
                this.valor = t + 273.15;
                break;
            case "K":
                this.valor = t;
                break;
            case "F":
                this.valor = (t - 32) * 5 / 9 + 273.15;
                break;
        }

    }

    public double Cambiar(String unidad) {
        unidad = unidad.toUpperCase();

        switch (unidad) {
            case "C":
                return this.valor - 273.15;
            case "K":
                return this.valor;
            case "F":
                return (this.valor - 273.15) * 9 / 5 + 32;
            default:
                System.out.printf("Unidad de temperatura %s desconocida\n", unidad);
                return 0;
        }
    }
}
