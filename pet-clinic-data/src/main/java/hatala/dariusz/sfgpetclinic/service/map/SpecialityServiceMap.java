package hatala.dariusz.sfgpetclinic.service.map;

import hatala.dariusz.sfgpetclinic.model.Speciality;
import hatala.dariusz.sfgpetclinic.service.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class SpecialityServiceMap extends MapServiceAbstract<Speciality> implements SpecialityService {

}
