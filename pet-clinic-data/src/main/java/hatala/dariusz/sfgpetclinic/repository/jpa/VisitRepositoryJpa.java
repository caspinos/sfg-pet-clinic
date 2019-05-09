package hatala.dariusz.sfgpetclinic.repository.jpa;

import hatala.dariusz.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepositoryJpa extends CrudRepository<Visit, Long> {

}
