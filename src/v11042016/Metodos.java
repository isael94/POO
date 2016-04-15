/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v11042016;

/**
 *
 * @author Javier
 */
public class Metodos {
    
    public static float mayorVector(float num[]){
        float may = num[0];
        int pos = 0;
        
        for (int i = 0; i < num.length; i++) {
            if(num[i] > may){
                may = num[i];
                pos = i;
            }
        }
        return may;
    }
    
}
