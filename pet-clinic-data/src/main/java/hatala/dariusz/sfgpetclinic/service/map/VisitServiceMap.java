package hatala.dariusz.sfgpetclinic.service.map;

import hatala.dariusz.sfgpetclinic.model.Visit;
import hatala.dariusz.sfgpetclinic.service.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class VisitServiceMap extends MapServiceAbstract<Visit> implements VisitService {
}
