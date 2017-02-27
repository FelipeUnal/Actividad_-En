/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg7;

/**
 *
 * @author Estudiante
 */
public class Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner ElTecla = new java.util.Scanner(System.in);
        Pizza[] x = new Pizza[10];
        for(int i = 0; i<10; i++){
            System.out.println("Igrese los datos de la pizza numero " + (i+1)+":");
            x[i] = new Pizza();
            x[i].setToppie();
            System.out.println("");
        }
                  
        
        
    }
    
}
