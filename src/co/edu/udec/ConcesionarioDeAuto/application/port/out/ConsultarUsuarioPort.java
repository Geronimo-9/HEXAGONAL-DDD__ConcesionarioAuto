package edu.udec.ConcesionarioDeAuto.application.port.out;

import com.jcaa.usersmanagement.domain.model.UserModel;
import com.jcaa.usersmanagement.domain.valueobject.UserId;
import edu.udec.ConcesionarioDeAuto.domain.model.Cliente;
import edu.udec.ConcesionarioDeAuto.domain.valueobject.Cliente.ClienteId;

import java.util.Optional;

public interface ConsultarUsuarioPort {
  Optional<Cliente> getById(ClienteId clienteId);
}
