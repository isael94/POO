/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v11042016;

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
        String noms[];
        int calif[][], sum;
        float prom [];
        byte m,n;
        m = Byte.parseByte(JOptionPane.showInputDialog("Cuantos alumnos son? "));
        n = Byte.parseByte(JOptionPane.showInputDialog("Cuantos parciales son?"));
        
        noms = new String [m];
        prom = new float [m];
        calif = new int [m][n];
        
        for (int i = 0; i < noms.length; i++) {
            noms[i] = JOptionPane.showInputDialog("Alumno "+(i+1)+": ");
             sum = 0;
            for (int j = 0; j < calif[i].length; j++) {
                calif[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Dame parcial "+(j+1)+" de "+noms[i]));
                sum = sum + calif[i][j];
            }
            prom [i] = (float)sum/calif[i].length;
        }
      float may =  Metodos.mayorVector(prom);
        String cad = "Los alumnos con calif mayor es\n";
        for (int i = 0; i < prom.length; i++) {
            if (prom[i] == may) {
               cad = cad + noms[i] +"\n"; 
               JOptionPane.showMessageDialog(null, cad);
            }
        }
    }
    
}
