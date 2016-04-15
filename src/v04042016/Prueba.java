 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v04042016;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n[] = new int[10];
        int opc, opc1=0;
       do{
        opc = Integer.parseInt(JOptionPane.showInputDialog("En que lugar quieres?\n1.-Primera clase\n2.-Turismo:\n"));
        
            switch(opc){
                case 1:
                    for (int i = 0; i < n.length; i++) {
                        if(n[i] == 0){
                            JOptionPane.showMessageDialog(null, "Tu asiento es: "+n[i]);
                        }
                    }
                        
                    
                    break;
                
                case 2:
                    break;
                    
                default:
                    
            }
       }while (opc != 2);
       
}
}