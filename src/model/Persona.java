/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import excepciones.DatoInvalidoException;
import util.Validador;

/**
 *
 * @author Vivi
 */


public class Persona {
    private String nombre;
    private String rut;
    private String telefono;

    public Persona(String nombre, String rut, String telefono) throws DatoInvalidoException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new DatoInvalidoException("El nombre no puede estar vacío.");
        }
        if (!Validador.validarRut(rut)) {
            throw new DatoInvalidoException("RUT inválido: " + rut);
        }
        if (!Validador.validarTelefono(telefono)) {
            throw new DatoInvalidoException("Número de teléfono inválido: " + telefono);
        }

        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public String getRut() { return rut; }
    public String getTelefono() { return telefono; }
}

