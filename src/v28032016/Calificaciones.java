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
public class Calificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String alum [] ;
        int cal[];
        int n;
        String cad = " ";
      //  n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos alumnos? "));
        alum = new String[5];
        cal = new int[5];
        
        for (int i = 0; i < alum.length; i++) {
         cal[i] = Integer.parseInt(JOptionPane.showInputDialog("Calificacion " + (i+1)));
        }
        
        for (int i = 0; i < cal.length; i++) {
            cad = cad + cal[i]+ " ";
        }
        
        JOptionPane.showMessageDialog(null, cad);
        
        int may = cal[0];
        int pos = 0;
        
        for (int i = 0; i < cal.length; i++) {
            if (cal[i] > may) {
                may = cal[i];
                pos = i;
            }
        }
        JOptionPane.showMessageDialog(null,"El mayor es "+ may + " y esta en la posicion "+ (pos+1));
    }
    
}
