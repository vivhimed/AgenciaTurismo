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


public class Cliente extends Persona {
    private String procedencia;

    public Cliente(String nombre, String rut, String telefono, String procedencia) throws DatoInvalidoException {
        super(nombre, rut, telefono);
        if (procedencia == null || procedencia.trim().isEmpty()) {
            throw new DatoInvalidoException("La procedencia no puede estar vacía.");
        }
        this.procedencia = procedencia;
    }

    public String getProcedencia() { return procedencia; }

    @Override
    public String toString() {
        return String.format("[CLIENTE] Nombre: %s | RUT: %s | Tel: %s | Procedencia: %s",
                getNombre(), getRut(), getTelefono(), procedencia);
    }
}
