package hatala.dariusz.sfgpetclinic.service.map;

import hatala.dariusz.sfgpetclinic.model.Owner;
import hatala.dariusz.sfgpetclinic.model.Pet;
import hatala.dariusz.sfgpetclinic.service.OwnerService;
import hatala.dariusz.sfgpetclinic.service.PetService;
import org.springframework.stereotype.Repository;

@Repository
public class PetServiceMap extends MapServiceAbstract<Pet> implements PetService {

    private OwnerService ownerRepository;

    public PetServiceMap(OwnerService ownerRepository) {
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
