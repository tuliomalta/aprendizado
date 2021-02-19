package estudorestapi.aprendizado.rest.api.repository;

import estudorestapi.aprendizado.rest.api.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
