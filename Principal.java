/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import herpers.Deportista;
import herpers.Doctor;
import herpers.Persona;

/**
 *
 * @author crist
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona = new Persona("Cristian Zamora", 25, "Masculino"){};
        Doctor doctor = new Doctor("Danlis Baide", 45, "Masculino", "Cardiología");
        Deportista deportista = new Deportista("Jeyson Gomez", 25, "Masculino", "Fútbol");

        persona.mostrarInformacion();
        System.out.println();
        doctor.mostrarInformacion();
        System.out.println();
        deportista.mostrarInformacion();

    }
    
}
