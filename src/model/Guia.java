/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Vivi
 */

import excepciones.DatoInvalidoException;

public class Guia extends Persona {
    private String idiomas;      // Ej: Español, Inglés, Francés
    private String especialidad; // Ej: Historia, Flora y fauna lacustre

    public Guia(String nombre, String rut, String telefono, String idiomas, String especialidad) throws DatoInvalidoException {
        // super() ejecuta las validaciones de nombre, rut y teléfono en la clase base Persona
        super(nombre, rut, telefono);
        
        if (idiomas == null || idiomas.trim().isEmpty()) {
            throw new DatoInvalidoException("Los idiomas del guía son obligatorios.");
        }
        if (especialidad == null || especialidad.trim().isEmpty()) {
            throw new DatoInvalidoException("La especialidad del guía es obligatoria.");
        }

        this.idiomas = idiomas;
        this.especialidad = especialidad;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return String.format("[GUIA] Nombre: %s | RUT: %s | Tel: %s | Idiomas: %s | Especialidad: %s",
                getNombre(), getRut(), getTelefono(), idiomas, especialidad);
    }
}