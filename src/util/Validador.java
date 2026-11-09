/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.regex.Pattern;

/**
 *
 * @author Vivi
 */
public class Validador {

    private static final String TELEFONO_REGEX = "^(\\+?56)?(\\s?)(9)(\\s?\\d){8}$";

    public static boolean validarRut(String rut) {
        if (rut == null || rut.trim().isEmpty()) return false;
        rut = rut.replace(".", "").replace("-", "").toUpperCase();
        if (rut.length() < 2) return false;

        try {
            String cuerpo = rut.substring(0, rut.length() - 1);
            char dvIngresado = rut.charAt(rut.length() - 1);

            int suma = 0;
            int multiplo = 2;
            for (int i = cuerpo.length() - 1; i >= 0; i--) {
                suma += Character.getNumericValue(cuerpo.charAt(i)) * multiplo;
                multiplo = (multiplo < 7) ? multiplo + 1 : 2;
            }

            int dvCalculado = 11 - (suma % 11);
            char dvEsperado = (dvCalculado == 11) ? '0' : (dvCalculado == 10) ? 'K' : Character.forDigit(dvCalculado, 10);

            return dvEsperado == dvIngresado;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean validarTelefono(String telefono) {
        if (telefono == null || telefono.trim().isEmpty()) return false;
        return Pattern.matches(TELEFONO_REGEX, telefono.trim());
    }
}