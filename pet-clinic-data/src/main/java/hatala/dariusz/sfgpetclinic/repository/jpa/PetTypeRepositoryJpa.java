package hatala.dariusz.sfgpetclinic.repository.jpa;

import hatala.dariusz.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetTypeRepositoryJpa extends CrudRepository<PetType, Long> {

}
