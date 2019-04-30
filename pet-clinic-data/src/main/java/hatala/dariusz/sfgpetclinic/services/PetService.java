package hatala.dariusz.sfgpetclinic.services;

import hatala.dariusz.sfgpetclinic.model.Pet;

import java.util.Optional;
import java.util.Set;

public interface PetService {

    Optional<Pet> findById(Long id);
    Set<Pet> findAll();

    Pet save(Pet pet);

}
