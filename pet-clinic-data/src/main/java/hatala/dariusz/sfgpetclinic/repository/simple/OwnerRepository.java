package hatala.dariusz.sfgpetclinic.repository.simple;

import hatala.dariusz.sfgpetclinic.model.Owner;

import java.util.Optional;

public interface OwnerRepository extends BaseEntityCrudRepository<Owner> {

    Optional<Owner> findByLastName(String lastName);

}
