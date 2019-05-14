package hatala.dariusz.sfgpetclinic.service.springdatajpa;

import hatala.dariusz.sfgpetclinic.model.Owner;
import hatala.dariusz.sfgpetclinic.repository.OwnerRepository;
import hatala.dariusz.sfgpetclinic.repository.PetRepository;
import hatala.dariusz.sfgpetclinic.repository.PetTypeRepository;
import hatala.dariusz.sfgpetclinic.service.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(
            OwnerRepository ownerRepository,
            PetRepository petRepository,
            PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Optional<Owner> findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> result = new HashSet<>();

        ownerRepository.findAll().forEach(result::add);

        return result;
    }

    @Override
    public Optional<Owner> findById(Long id) {
        return ownerRepository.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        ownerRepository.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        ownerRepository.deleteById(id);
    }
}
