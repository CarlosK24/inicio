/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversores;

/**
 *
 * @author Emili
 */
public class Peso {

    public double valor; //En gramos

    public Peso(double d, String s) {
        s = s.toUpperCase();
        switch (s) {
            case "TON":
                this.valor = d * 1000000;
                break;
            case "KG":
                this.valor = d * 1000;
                break;
            case "G":
                this.valor = d;
                break;
            case "MG":
                this.valor = d / 1000;
                break;
            case "SLUG":
                this.valor = d / 0.000068522;
                break;
            case "ONZA":
                this.valor = d * 28.3495;
            case "LIBRA":
                this.valor = d * 453.592;
        }
    }

    public double Cambiar(String unidad) {
        unidad = unidad.toUpperCase();
        switch (unidad) {
            case "TON":
                return this.valor / 1000000;
            case "KG":
                return this.valor / 1000;
            case "G":
                return this.valor;
            case "MG":
                return this.valor * 1000;
            case "SLUG":
                return this.valor * 0.000068522;
            case "ONZA":
                return this.valor * 0.035274;
            case "LIBRA":
                return this.valor * 0.00220462;
            default:
                System.out.printf("Tipo de unidad de peso %s desconocida\n", unidad);
                return 0;
        }
    }
}
