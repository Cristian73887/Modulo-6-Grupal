/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herpers;

/**
 *
 * @author crist
 */
public class Deportista extends Persona {
     private String deporte;

   
    public Deportista(String nombre, int edad, String genero, String deporte) {
        super(nombre, edad, genero);
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Deportista:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Género: " + getGenero());
        System.out.println("Deporte: " + deporte);
    }

}
