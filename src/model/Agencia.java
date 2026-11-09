/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vivi
 */

/**
 * Clase Agencia cuenta con atributos
 * -idAgenciaIdentificador: único de la agencia de viajes (ej: "AG-CHILE-01")
 * -personas: Almacena Clientes,Guias, Proveedores y Empleados por polimorfismo
 * -tours: Colección que almacena y gestiona los distintos tipos de tours que ofrece la agencia 
 * (gastronómicos, culturales, privados y lacustres).
  */
public class Agencia {
    private String idAgencia;
    private List<Persona> personas; 
    private List<Tour> tours;

    public Agencia(String idAgencia) {
        this.idAgencia = idAgencia;
        this.personas = new ArrayList<>();
        this.tours = new ArrayList<>();
    }

    /**
     * Método para agregar un nuevo Tour a la agencia
     */
    public void agregarTour(Tour tour) {
        tours.add(tour);
        System.out.println("Tour '" + tour.getTipoTour() + " - Cupos = "+ tour.getCupos()+"' agregado exitosamente a la agencia");
    }

    public List<Tour> getTours() {
        return tours;
    }
    public void registrarPersona(Persona persona) {
        personas.add(persona);
    }

  
    public void mostrarPersonalGeneral() {
        System.out.println(" --- DIRECTORIO AGENCIA: " + idAgencia + " ---");
        for (Persona p : personas) {
            System.out.println(p); // Llama automáticamente al toString() correspondiente de cada subclase
        }
        
            
    }
    
}

