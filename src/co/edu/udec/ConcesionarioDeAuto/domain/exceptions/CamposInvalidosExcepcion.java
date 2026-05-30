package edu.udec.ConcesionarioDeAuto.domain.exceptions;

import com.jcaa.usersmanagement.domain.exception.DomainException;

public class CamposInvalidos extends DomainException {

    public static final String DATOS_INVALIDO = "La placa del Vehiculo no corresponde al formato";
    public static final String CAMPO_VACIO = "La placa del Vehiculo no corresponde al formato";



    public CamposInvalidos(String message) {
        super(message);
    }
}
