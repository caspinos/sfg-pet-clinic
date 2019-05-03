package hatala.dariusz.sfgpetclinic.bootstrap;

import hatala.dariusz.sfgpetclinic.model.Owner;
import hatala.dariusz.sfgpetclinic.model.Vet;
import hatala.dariusz.sfgpetclinic.repository.OwnerRepository;
import hatala.dariusz.sfgpetclinic.repository.VetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerRepository ownerRepository;
    private final VetRepository vetRepository;

    @Autowired
    public DataInitializer(OwnerRepository ownerRepository, VetRepository vetRepository) {
        this.ownerRepository = ownerRepository;
        this.vetRepository = vetRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loaded initial data");

        ownerRepository.save( new Owner("John", "Smith") );
        ownerRepository.save( new Owner("Julie", "Smith") );

        vetRepository.save( new Vet("Adam", "Burner") );
        vetRepository.save( new Vet("Mike", "Robinson") );

    }
}
