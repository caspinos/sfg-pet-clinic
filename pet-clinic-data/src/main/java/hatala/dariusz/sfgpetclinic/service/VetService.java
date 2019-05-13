package hatala.dariusz.sfgpetclinic.service;

import hatala.dariusz.sfgpetclinic.model.Vet;

import java.util.Optional;

public interface VetService extends BaseEntityCrudService<Vet> {

    Optional<Vet> findByLastName(String lastName);

}
