package hatala.dariusz.sfgpetclinic.services;

import hatala.dariusz.sfgpetclinic.model.Owner;

import java.util.Optional;

public interface OwnerService extends CrudService<Owner, Long> {

    Optional<Owner> findByLastName(String lastName);

}
