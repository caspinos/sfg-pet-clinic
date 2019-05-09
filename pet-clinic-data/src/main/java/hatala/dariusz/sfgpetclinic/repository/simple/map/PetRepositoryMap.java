package hatala.dariusz.sfgpetclinic.repository.simple.map;

import hatala.dariusz.sfgpetclinic.model.Owner;
import hatala.dariusz.sfgpetclinic.model.Pet;
import hatala.dariusz.sfgpetclinic.repository.simple.OwnerRepository;
import hatala.dariusz.sfgpetclinic.repository.simple.PetRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PetRepositoryMap extends MapRepositoryAbstract<Pet> implements PetRepository {

    private OwnerRepository ownerRepository;

    public PetRepositoryMap(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Pet save(Pet obj) {
        Owner owner = obj.getOwner();

        if( owner != null ){
            owner.getPets().add( obj );
        }

        return super.save(obj);
    }
}
