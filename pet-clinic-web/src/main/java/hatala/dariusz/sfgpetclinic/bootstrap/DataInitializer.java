package hatala.dariusz.sfgpetclinic.bootstrap;

import hatala.dariusz.sfgpetclinic.model.*;
import hatala.dariusz.sfgpetclinic.repository.OwnerRepository;
import hatala.dariusz.sfgpetclinic.repository.PetRepository;
import hatala.dariusz.sfgpetclinic.repository.PetTypeRepository;
import hatala.dariusz.sfgpetclinic.repository.VetRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerRepository ownerRepository;
    private final VetRepository vetRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public DataInitializer(OwnerRepository ownerRepository, VetRepository vetRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.vetRepository = vetRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading initial data");

        // PetType init
        PetType dog = new PetType("dog");
        PetType cat = new PetType("cat");
        petTypeRepository.save( dog );
        petTypeRepository.save( cat );

        // Owner init
        Owner john = new Owner("John", "Smith", new HashSet<>());
        Owner julie = new Owner("Julie", "Smith", new HashSet<>());
        ownerRepository.save( john );
        ownerRepository.save( julie );

        // Pet init
        Pet roxy = new Pet(dog, john, LocalDate.of(1999, 2, 2));
        Pet maisy = new Pet(cat, julie, LocalDate.of(2015, 1, 21));
        petRepository.save( roxy );
        petRepository.save( maisy );

        // Vet init
        Vet adam = new Vet("Adam", "Burner", new Speciality("Surgeon"));
        Vet mike = new Vet("Mike", "Robinson", new Speciality("Cat Veterinary"));

        vetRepository.save( adam );
        vetRepository.save( mike );
    }
}
