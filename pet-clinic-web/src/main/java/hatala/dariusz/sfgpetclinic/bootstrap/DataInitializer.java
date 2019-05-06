package hatala.dariusz.sfgpetclinic.bootstrap;

import hatala.dariusz.sfgpetclinic.model.*;
import hatala.dariusz.sfgpetclinic.repository.*;
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
    private final SpecialityRepository specialityRepository;

    public DataInitializer(OwnerRepository ownerRepository, VetRepository vetRepository, PetRepository petRepository, PetTypeRepository petTypeRepository, SpecialityRepository specialityRepository) {
        this.ownerRepository = ownerRepository;
        this.vetRepository = vetRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
        this.specialityRepository = specialityRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if( petRepository.findAll().size() == 0) {
            System.out.println("Creating initial data");
            loadData();
        } else {
            System.out.println("Skipping initial data load");
        }

    }

    private void loadData() {
        // PetType init
        PetType dog = new PetType("dog");
        PetType cat = new PetType("cat");
        petTypeRepository.save( dog );
        petTypeRepository.save( cat );

        // Owner init
        Owner john = new Owner("John", "Smith", new HashSet<>());
            john.setAddress("Long St 12");
            john.setCity("London");
            john.setTelephone("111-222-333");
        Owner julie = new Owner("Julie", "Smith", new HashSet<>());
            julie.setAddress("Long St 12");
            julie.setCity("London");
            julie.setTelephone("111-222-333");
        ownerRepository.save( john );
        ownerRepository.save( julie );

        // Pet init
        Pet roxy = new Pet("Roxy", dog, john, LocalDate.of(1999, 2, 2));
        Pet maisey = new Pet("Maisey", cat, julie, LocalDate.of(2015, 1, 21));
        petRepository.save( roxy );
        petRepository.save( maisey );

        // Speciality init
        Speciality surgery = new Speciality("Surgery");
        Speciality radiology = new Speciality("Radiology");
        Speciality dentistry= new Speciality("Dentistry");
        specialityRepository.save( surgery );
        specialityRepository.save( radiology );
        specialityRepository.save( dentistry );

        // Vet init
        Vet adam = new Vet("Adam", "Burner", surgery);
        Vet mike = new Vet("Mike", "Robinson", dentistry);

        vetRepository.save( adam );
        vetRepository.save( mike );
    }
}
