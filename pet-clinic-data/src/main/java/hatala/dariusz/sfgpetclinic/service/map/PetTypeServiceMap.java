package hatala.dariusz.sfgpetclinic.service.map;

import hatala.dariusz.sfgpetclinic.model.PetType;
import hatala.dariusz.sfgpetclinic.service.PetTypeService;
import org.springframework.stereotype.Service;

@Service
public class PetTypeServiceMap extends MapServiceAbstract<PetType> implements PetTypeService {
}
