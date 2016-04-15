/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v28032016;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num[];
        int n = Integer.parseInt(JOptionPane.showInputDialog("N:"));
        num = new int[n];
        String cad = " ";
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Num: "+num[i]));
        }
        
        for (int i = 0; i < num.length; i++) {
            cad = cad + num[i] + " ";
        }
       JOptionPane.showMessageDialog(null, cad);
       
}
}