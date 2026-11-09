/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import excepciones.DatoInvalidoException;
import model.Agencia;
import model.Cliente;
import model.Proveedor;
import model.Empleado;
import model.Tour;
import model.Guia;
/**
 *
 * @author Vivi
 */

public class Main {
    public static void main(String[] args) {
        Agencia agencia = new Agencia("AG-SUR-01");
        
        
        try {
            /**
             * AGREGAR UN NUEVO TOUR
             * Instanciamos el tour (ej: Tipo "Gastronómico", con 20 cupos)
             * luego lo agregamos a la agencia por metodo creado
             */ 
            Tour tour = new Tour("Gastronómico", 20);
            // lo agregamos a la agencia utilizando el método creado
            agencia.agregarTour(tour);
            // se puede agregar más tours del tipo que se necesite:
            agencia.agregarTour(new Tour("Lacustre", 15));
            agencia.agregarTour(new Tour("Privado", 8));

        } catch (DatoInvalidoException e) {
            System.err.println("Error al crear el tour: " + e.getMessage());
        }

        try {
            /**
             *  Registramos un nuevo Cliente
             */
            Cliente cliente = new Cliente("Maria Soto", "8.267.458-6", "+56982218137", "Chile");
            /**
             * Registramos un Proveedor
             */
            
            Proveedor proveedor = new Proveedor("Transportes Sur SpA", "8.267.458-6", "+56982218137", "Transporte de pasajeros");
            
            // Registramos un Empleado
            Empleado empleado = new Empleado("Esteban Vera", "8.267.458-6", "+56982218137", "Guia Turistico Lacustre");
            /**
             * Registramos en Agencia cliente, proveedor, empleado, 
             * se muestran en consola
             */                    
            agencia.registrarPersona(cliente);
            agencia.registrarPersona(proveedor);
            agencia.registrarPersona(empleado);
            agencia.mostrarPersonalGeneral();

        } catch (DatoInvalidoException e) {
            System.err.println("Error: " + e.getMessage());
        }
        
       try {
            /**
             *  Creamos un nuevo guía 
             */
            Guia guiaPrincipal = new Guia(
                "Carlos Mendoza", 
                "8267458-6", 
                "982218137", 
                "Espanol, Ingles", 
                "Tours Lacustres y Gastronomicos");
               /**
                * Lo registramos en la agencia
                */
            //System.out.println("Guia registrado exitosamente!");
            agencia.registrarPersona(guiaPrincipal);
        
            
            // Mostrar directorio general
            agencia.mostrarPersonalGeneral();

        } catch (DatoInvalidoException e) {
            System.err.println("Error al registrar el guia: " + e.getMessage());
        }
    } 
        
        
       
    
}


