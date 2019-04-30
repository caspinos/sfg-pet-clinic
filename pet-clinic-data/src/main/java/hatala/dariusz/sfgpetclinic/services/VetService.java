package hatala.dariusz.sfgpetclinic.services;

import hatala.dariusz.sfgpetclinic.model.Vet;

import java.util.Optional;
import java.util.Set;

public interface VetService {

    Optional<Vet> findById(Long id);
    Optional<Vet> findByLastName(String lastName);
    Set<Vet> findAll();

    Vet save(Vet vet);
}
