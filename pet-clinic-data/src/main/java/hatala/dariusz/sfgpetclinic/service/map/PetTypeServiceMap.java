package hatala.dariusz.sfgpetclinic.service.map;

import hatala.dariusz.sfgpetclinic.model.PetType;
import hatala.dariusz.sfgpetclinic.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetTypeServiceMap extends MapServiceAbstract<PetType> implements PetTypeService {
}
