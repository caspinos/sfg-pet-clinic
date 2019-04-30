package hatala.dariusz.sfgpetclinic.repository;

import hatala.dariusz.sfgpetclinic.model.Vet;

import java.util.Optional;

public interface VetRepository extends BaseEntityCrudRepository<Vet> {

    Optional<Vet> findByLastName(String lastName);

}
