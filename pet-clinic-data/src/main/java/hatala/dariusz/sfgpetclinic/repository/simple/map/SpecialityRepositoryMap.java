package hatala.dariusz.sfgpetclinic.repository.simple.map;

import hatala.dariusz.sfgpetclinic.model.Speciality;
import hatala.dariusz.sfgpetclinic.repository.simple.SpecialityRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SpecialityRepositoryMap extends MapRepositoryAbstract<Speciality> implements SpecialityRepository {

}
