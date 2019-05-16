package hatala.dariusz.sfgpetclinic.service.map;

import hatala.dariusz.sfgpetclinic.model.Owner;
import hatala.dariusz.sfgpetclinic.service.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Profile({"default", "map"})
public class OwnerServiceMap extends MapServiceAbstract<Owner> implements OwnerService {
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
