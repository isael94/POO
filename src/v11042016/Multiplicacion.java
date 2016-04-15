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
public class Multiplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int mat[][], v[] ,s[];
        
        byte m,n;
        
       m = Byte.parseByte(JOptionPane.showInputDialog("Renglones: "));
       n = Byte.parseByte(JOptionPane.showInputDialog("Columnas"));
       
       v = new int [n];
       s = new int [n];
       mat = new int [n][m];
       
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
              mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Dame " + i + j));
                }
        }
        
        for (int i = 0; i < v.length; i++) {
            v [i] = Integer.parseInt(JOptionPane.showInputDialog("Dame " + i));
        }
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < v.length; j++) {
                s[i] += mat[i][j] * v[j];
            }
        }
        
        for (int i = 0; i < s.length; i++) {
            JOptionPane.showMessageDialog(null, s[i]);
        }
    }
    
}
