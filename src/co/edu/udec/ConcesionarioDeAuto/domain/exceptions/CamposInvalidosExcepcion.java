package edu.udec.ConcesionarioDeAuto.domain.exceptions;

import com.jcaa.usersmanagement.domain.exception.DomainException;

public class CamposInvalidosExcepcion extends DomainException {

    private static final String MESSAGE_CAMPOS_INVALIDOS = "Los campos deben ser del mismo formato";
    private static final String MESSAGE_CAMPOS_OBLIGATORIOS = "Debe llenar este campo";

    private CamposInvalidosExcepcion(final String message) {
        super(message);
    }

    public static CamposInvalidosExcepcion camposInvalidos() {
        return new CamposInvalidosExcepcion(MESSAGE_CAMPOS_INVALIDOS);
    }

    public static CamposInvalidosExcepcion camposObligatoriosVacios() {
        return new CamposInvalidosExcepcion(MESSAGE_CAMPOS_OBLIGATORIOS);
    }
}