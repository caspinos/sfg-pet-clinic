package hatala.dariusz.sfgpetclinic.repository.jpa;

import hatala.dariusz.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepositoryJpa extends CrudRepository<Pet, Long> {

}
