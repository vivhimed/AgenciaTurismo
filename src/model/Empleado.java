/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import excepciones.DatoInvalidoException;
/**
 *
 * @author Vivi
 */

public class Empleado extends Persona {
    private String cargo; // Ej: Guía Turístico, Operador Logístico, Chofer

    public Empleado(String nombre, String rut, String telefono, String cargo) throws DatoInvalidoException {
        super(nombre, rut, telefono);
        if (cargo == null || cargo.trim().isEmpty()) {
            throw new DatoInvalidoException("El cargo del empleado no puede estar vacío.");
        }
        this.cargo = cargo;
    }

    public String getCargo() { return cargo; }

    @Override
    public String toString() {
        return String.format("[EMPLEADO] Nombre: %s | RUT: %s | Tel: %s | Cargo: %s",
                getNombre(), getRut(), getTelefono(), cargo);
    }
}