/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v13042016;

/**
 *
 * @author Javier
 */
public class Persona {
        String nombre;
        short edad;

    public Persona(String nombre, short edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

   

    public String getNombre() {
        return nombre;
    }

    public short getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }
    
}
