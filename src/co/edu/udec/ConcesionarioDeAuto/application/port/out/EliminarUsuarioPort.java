package edu.udec.ConcesionarioDeAuto.application.port.out;


import edu.udec.ConcesionarioDeAuto.domain.valueobject.Cliente.ClienteId;

public interface EliminarUsuarioPort{
    void delete(ClienteId clienteId);
}
