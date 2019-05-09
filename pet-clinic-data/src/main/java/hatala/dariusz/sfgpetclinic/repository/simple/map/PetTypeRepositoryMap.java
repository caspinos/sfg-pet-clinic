package hatala.dariusz.sfgpetclinic.repository.simple.map;

import hatala.dariusz.sfgpetclinic.model.PetType;
import hatala.dariusz.sfgpetclinic.repository.simple.PetTypeRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PetTypeRepositoryMap extends MapRepositoryAbstract<PetType> implements PetTypeRepository {
}
