package hatala.dariusz.sfgpetclinic.service.map;

import hatala.dariusz.sfgpetclinic.model.Vet;
import hatala.dariusz.sfgpetclinic.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Profile({"default", "map"})
public class VetServiceMap extends MapServiceAbstract<Vet> implements VetService {

    @Override
    public Optional<Vet> findByLastName(String lastName) {
        Vet result = null;

        for( Vet vet : map.values() ){
            if(vet.getLastName().equals(lastName)){
                result = vet;
                break;
            }
        }

        return Optional.ofNullable(result);
    }

}
