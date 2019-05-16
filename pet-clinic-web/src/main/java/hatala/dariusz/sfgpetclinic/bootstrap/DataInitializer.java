package hatala.dariusz.sfgpetclinic.bootstrap;

import hatala.dariusz.sfgpetclinic.model.*;
import hatala.dariusz.sfgpetclinic.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataInitializer(OwnerService ownerService, VetService vetService, PetService petService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petService = petService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {

        if( petService.findAll().size() == 0) {
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
        petTypeService.save( dog );
        petTypeService.save( cat );

        // Owner init
        Owner john = new Owner("John", "Smith", new HashSet<>());
            john.setAddress("Long St 12");
            john.setCity("London");
            john.setTelephone("111-222-333");
        Owner julie = new Owner("Julie", "Smith", new HashSet<>());
            julie.setAddress("Long St 12");
            julie.setCity("London");
            julie.setTelephone("111-222-333");
        ownerService.save( john );
        ownerService.save( julie );

        // Pet init
        Pet roxy = new Pet("Roxy", dog, john, LocalDate.of(1999, 2, 2), new HashSet<>());
        Pet maisey = new Pet("Maisey", cat, julie, LocalDate.of(2015, 1, 21), new HashSet<>());
        petService.save( roxy );
        petService.save( maisey );

        // Speciality init
        Speciality surgery = new Speciality("Surgery");
        Speciality radiology = new Speciality("Radiology");
        Speciality dentistry= new Speciality("Dentistry");
        specialityService.save( surgery );
        specialityService.save( radiology );
        specialityService.save( dentistry );

        // Vet init
        Vet adam = new Vet("Adam", "Burner",  new HashSet<>(Arrays.asList(surgery, radiology)));
        Vet mike = new Vet("Mike", "Robinson",  new HashSet<>(Collections.singletonList(dentistry)));
        vetService.save( adam );
        vetService.save( mike );

        // Visit init
        Visit roxyVisit1 = new Visit(LocalDate.of(2019,01,01), "Routine vaccination", roxy);
        Visit roxyVisit2 = new Visit(LocalDate.of(2019,02,11), "Health check", roxy);
        Visit maiseyVisit = new Visit(LocalDate.of(2019,03,03), "Lung surgury", maisey);
        visitService.save(roxyVisit1);
        visitService.save(roxyVisit2);
        visitService.save(maiseyVisit);
    }
}
