/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241119_nahio_4infd;

import java.util.Scanner;


/**
 *
 * @author ospite
 */
public class Minuscolo {
    
    static final int TANTI = 30;
    public String parola;
    char[] minuscolo = new char[TANTI];
    
    public void leggiPar() {
    Scanner in = new Scanner(System.in);
     System.out.println("\nInserisci una parola : ");
      parola = in.next();
}
         public void Convertstring(){
             for (int x = 0; x < parola.length(); x++) {
            minuscolo[x] = parola.charAt(x);
        }
         }
    
}
