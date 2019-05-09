package hatala.dariusz.sfgpetclinic.repository.jpa;

import hatala.dariusz.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepositoryJpa extends CrudRepository<Owner, Long> {

}
