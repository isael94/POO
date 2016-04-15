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
public class MultiplicarMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mata[][], matb[][], matc[][];
        byte m1,n1, m2,n2;
        
        m1 = Byte.parseByte(JOptionPane.showInputDialog("Dame los renglones de A: "));
        n1 = Byte.parseByte(JOptionPane.showInputDialog("Dame las columnas de A: "));
        m2 = Byte.parseByte(JOptionPane.showInputDialog("Dame los renglones de B: "));
        n2 = Byte.parseByte(JOptionPane.showInputDialog("Dame las columnas de B: "));
        
        mata = new int[m1][n1];
        matb = new int[m2][n2];
        matc = new int[m1][n2];
         for (int i = 0; i < mata.length; i++) {
            for (int j = 0; j < mata.length; j++) {
              mata[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Dame " + i + j));
                }
        }
          for (int i = 0; i < matb.length; i++) {
            for (int j = 0; j < matb.length; j++) {
              matb[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Dame " + i + j));
                }
        }
          for (int x = 0; x < matc.length; x++) {
              for (int y = 0; y < matc[x].length; y++) {
                  for (int z = 0; z < matb.length; z++) {
                      matc[x][y] += mata[x][z] * matb[z][y];
                  }
              }
        }
          String cad = "";
          for (int i = 0; i < matc.length; i++) {
              for (int j = 0; j < matc.length; j++) {
                
                  JOptionPane.showMessageDialog(null, matc[i][j]);
              }
        }
          
          
    }
    
}
