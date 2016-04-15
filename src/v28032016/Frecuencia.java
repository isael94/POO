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
public class Frecuencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cal[];
        int n, f1=0,f2=0,f3=0,f4=0,f5=0,f6=0,f7=0,f8=0,f9=0,f10=0, sw;
        String cad = " ";
        
        n = Integer.parseInt(JOptionPane.showInputDialog("N: "));
        cal = new int[n];
        
        for (int i = 0; i < cal.length; i++) {
          cal[i] = Integer.parseInt(JOptionPane.showInputDialog("Calificacion: "));
            if (cal[i] == 1) {
                f1++;
            }
            else if(cal[i] == 2){
                f2++;
            }
            else if(cal[i] == 3){
                f3++;
            }
            else if(cal[i] == 4){
                f4++;
            }
            else if(cal[i] == 5){
                f5++;
            }
            else if(cal[i] == 6){
                f6++;
            }
            else if(cal[i] == 7){
                f7++;
            }
            else if(cal[i] == 8){
                f8++;
            }
            else if(cal[i] == 9){
                f9++;
            }
            else if(cal[i] == 10){
                f10++;
            }
        }
        
        for (int i = 0; i < cal.length; i++) {
            cad = cad + cal[i]+ " ";
        }
      //  JOptionPane.showMessageDialog(null, cad);
        
        JOptionPane.showMessageDialog(null, "Frecuencia:\n1-\t " + f1 + "\n2- \t"+ f2+ "\n3-\t"+f3+"\n4-\t"+f4+
                   "\n5- \t"+ f5+ "\n6- \t"+ f6 + "\n7- \t"+ f7+ "\n8- \t"+ f8+ "\n9- \t"+ f9+ "\n10- \t"+ f10 +"\nVector:\n"+cad);
        
    }
    
}
