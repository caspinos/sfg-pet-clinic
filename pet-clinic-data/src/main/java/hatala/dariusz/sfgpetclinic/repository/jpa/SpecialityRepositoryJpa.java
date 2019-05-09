package hatala.dariusz.sfgpetclinic.repository.jpa;

import hatala.dariusz.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepositoryJpa extends CrudRepository<Speciality, Long> {

}
