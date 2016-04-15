/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v13042016;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class Ciclo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona pers[],p;
        String opc;
        String nom;
        short edad, np=0;
        pers = new Persona[50];
       do{
          nom = JOptionPane.showInputDialog("Nombre: ");
          edad = Byte.parseByte(JOptionPane.showInputDialog("Edad: "));
          pers[np] = new Persona(nom,edad);
          np++;
          opc = (JOptionPane.showInputDialog("Desea agregar otro?:"));
         
       }while(opc.equals("si"));
       String cad = " ";
        for (int i = 0; i < np; i++) {
               cad = cad + "Nombre: "+pers[i].getNombre()+ "\nEdad: "+pers[i].getEdad()+"\n\n";
            
        }
        JOptionPane.showMessageDialog(null, cad);
        
    }
    
}
