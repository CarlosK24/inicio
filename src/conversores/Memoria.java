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
 
public class Memoria {
    
    public long valor; // En bits
    
    public Memoria(long b, String s)
    {
        switch(s)
        {
	case "GB":
                this.valor = b * 8589934592l;
                break;
	case "MB":
                this.valor = b * 8388608;
                break;
	case "KB":
                this.valor = b * 8192;
                break;
	case "B":
                this.valor = b * 8;
                break;
            case "b":
                this.valor = b;
                break;
        }
    }
    
    public long Cambiar(String unidad)
    {
        switch(unidad)
        {
            case "GB":
		return this.valor / 8589934592l;
            case "MB":
		return this.valor / 8388608;  
            case "KB":
                return this.valor / 8192;
            case "B":
                return this.valor / 8;
            case "b":
                return this.valor;
            default :
                System.out.printf("Unidad de memoria %s desconocida\n",unidad);
                return 0;
        }
    }
}
