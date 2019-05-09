package hatala.dariusz.sfgpetclinic.repository.simple.map;

import hatala.dariusz.sfgpetclinic.model.Vet;
import hatala.dariusz.sfgpetclinic.repository.simple.VetRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class VetRepositoryMap extends MapRepositoryAbstract<Vet> implements VetRepository {

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
