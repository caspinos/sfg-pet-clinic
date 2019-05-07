package hatala.dariusz.sfgpetclinic.controllers;

import hatala.dariusz.sfgpetclinic.repository.OwnerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerRepository ownerRepository;

    public OwnerController(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @RequestMapping({"/", "", "index", "index.html"})
    public String listOfVets(Model model){

        model.addAttribute("owners", ownerRepository.findAll() );

        return "owners/index";
    }

    @RequestMapping("/find")
    public String displayFind(){
        return "notimplemented";
    }
}
