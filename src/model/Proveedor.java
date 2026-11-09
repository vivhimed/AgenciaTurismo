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


public class Proveedor extends Persona {
    private String tipoServicio; // Ej: Transporte, Hotel, Catering

    public Proveedor(String nombre, String rut, String telefono, String tipoServicio) throws DatoInvalidoException {
        super(nombre, rut, telefono);
        if (tipoServicio == null || tipoServicio.trim().isEmpty()) {
            throw new DatoInvalidoException("El tipo de servicio es obligatorio para el proveedor.");
        }
        this.tipoServicio = tipoServicio;
    }

    public String getTipoServicio() { return tipoServicio; }

    @Override
    public String toString() {
        return String.format("[PROVEEDOR] Nombre: %s | RUT: %s | Tel: %s | Servicio: %s",
                getNombre(), getRut(), getTelefono(), tipoServicio);
    }
}