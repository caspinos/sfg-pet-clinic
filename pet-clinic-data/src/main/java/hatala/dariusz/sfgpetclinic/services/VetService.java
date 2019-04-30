package hatala.dariusz.sfgpetclinic.services;

import hatala.dariusz.sfgpetclinic.model.Vet;

import java.util.Optional;

public interface VetService extends CrudService<Vet, Long> {

    Optional<Vet> findByLastName(String lastName);

}
