package edu.udec.ConcesionarioDeAuto.application.port.out;

import com.jcaa.usersmanagement.domain.model.UserModel;
import edu.udec.ConcesionarioDeAuto.domain.model.Cliente;

public interface GuardarUsuarioPort {
  Cliente save(Cliente cliente);
}
