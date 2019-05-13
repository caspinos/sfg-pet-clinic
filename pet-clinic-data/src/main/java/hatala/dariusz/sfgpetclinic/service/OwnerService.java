package hatala.dariusz.sfgpetclinic.service;

import hatala.dariusz.sfgpetclinic.model.Owner;

import java.util.Optional;

public interface OwnerService extends BaseEntityCrudService<Owner> {

    Optional<Owner> findByLastName(String lastName);

}
