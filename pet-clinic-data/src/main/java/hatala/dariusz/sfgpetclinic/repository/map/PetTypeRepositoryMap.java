package hatala.dariusz.sfgpetclinic.repository.map;

import hatala.dariusz.sfgpetclinic.model.PetType;
import hatala.dariusz.sfgpetclinic.repository.PetTypeRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PetTypeRepositoryMap extends MapRepositoryAbstract<PetType> implements PetTypeRepository {
}
