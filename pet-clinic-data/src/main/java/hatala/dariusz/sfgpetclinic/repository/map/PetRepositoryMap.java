package hatala.dariusz.sfgpetclinic.repository.map;

import hatala.dariusz.sfgpetclinic.model.Pet;
import hatala.dariusz.sfgpetclinic.repository.PetRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PetRepositoryMap extends MapRepositoryAbstract<Pet> implements PetRepository {

}
