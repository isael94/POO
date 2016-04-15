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
public class ArregloObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona pers[],p;
       byte n;
       String nom;
       short edad;
       n = Byte.parseByte(JOptionPane.showInputDialog("Personas? "));
       pers = new Persona[n];
       
        for (int i = 0; i < pers.length; i++) {
            nom = JOptionPane.showInputDialog("Nombre: ");
            edad = Short.parseShort(JOptionPane.showInputDialog("Edad: "));
            p = new Persona(nom,edad);
            pers[i] = p;
            
        }
       String cad = " ";
        for (int i = 0; i < pers.length; i++) {
            cad = cad + "Nombre: "+pers[i].getNombre()+ "\nEdad: "+pers[i].getEdad()+"\n\n";
            
        }
        
        JOptionPane.showMessageDialog(null, cad);
    }
    
}
