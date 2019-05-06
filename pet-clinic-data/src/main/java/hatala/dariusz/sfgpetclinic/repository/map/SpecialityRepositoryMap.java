package hatala.dariusz.sfgpetclinic.repository.map;

import hatala.dariusz.sfgpetclinic.model.Speciality;
import hatala.dariusz.sfgpetclinic.repository.SpecialityRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SpecialityRepositoryMap extends MapRepositoryAbstract<Speciality> implements SpecialityRepository {

}
