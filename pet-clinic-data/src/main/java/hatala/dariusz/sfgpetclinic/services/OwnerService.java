package hatala.dariusz.sfgpetclinic.services;

import hatala.dariusz.sfgpetclinic.model.Owner;

import java.util.Optional;
import java.util.Set;

public interface OwnerService {

    Optional<Owner> findById(Long id);
    Optional<Owner> findByLastName(String lastName);
    Set<Owner> findAll();

    Owner save(Owner owner);
}
