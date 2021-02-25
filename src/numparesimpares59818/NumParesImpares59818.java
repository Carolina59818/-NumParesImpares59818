/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares59818;

/**
 *
 * @author caroc
 */
public class NumParesImpares59818 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0; 
        int SumaImp = 0;
        int SumaPar = 0; 
        
        while (numero < 101) {
            if (numero % 2 == 0) {
                SumaPar = (SumaPar + numero);
            }
            
            else if (numero % 2 != 0) {
            SumaImp = numero + SumaImp;
        }
            ++numero; 
        }
        System.out.println("La suma de los numeros Pares es = " + SumaPar);
        System.out.println("La suma de los numeros Impares es = " + SumaImp);
        
    }
   
    
}
