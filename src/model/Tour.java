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
public class Tour {
    private String tipoTour; // Ej: Gastronómico, Cultural, Privado, Lacustre
    private int cupos;

    public Tour(String tipoTour, int cupos) throws DatoInvalidoException {
        if (tipoTour == null || tipoTour.trim().isEmpty()) {
            throw new DatoInvalidoException("El tipo de tour es requerido.");
        }
        if (cupos <= 0) {
            throw new DatoInvalidoException("Los cupos deben ser mayores a 0.");
        }
        this.tipoTour = tipoTour;
        this.cupos = cupos;
    }

    public String getTipoTour() {
        return tipoTour;
    }
    public int getCupos() {
        return cupos;
    }
    public void setCupos(int cupos) { 
        this.cupos = cupos;
    }

    @Override
    public String toString() {
        return "Tour: " + tipoTour + " | Cupos disponibles: " + cupos;
    }
}