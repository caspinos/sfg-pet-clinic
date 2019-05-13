package hatala.dariusz.sfgpetclinic.controllers;

import hatala.dariusz.sfgpetclinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {

    private final VetService vetRepository;

    public VetController(VetService vetRepository) {
        this.vetRepository = vetRepository;
    }

    @RequestMapping({"/", "", "index", "index.html"})
    public String listOfVets(Model model){

        model.addAttribute("vets", vetRepository.findAll());

        return "vets/index";
    }
}
