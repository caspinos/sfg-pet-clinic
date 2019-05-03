package hatala.dariusz.sfgpetclinic.repository.map;

import hatala.dariusz.sfgpetclinic.model.Owner;
import hatala.dariusz.sfgpetclinic.repository.OwnerRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class OwnerRepositoryMap extends MapRepositoryAbstract<Owner> implements OwnerRepository {
    @Override
    public Optional<Owner> findByLastName(String lastName) {
        Owner result = null;

        for( Owner owner : map.values() ){
            if(owner.getLastName().equals(lastName)){
                result = owner;
                break;
            }
        }

        return Optional.ofNullable(result);
    }
}
