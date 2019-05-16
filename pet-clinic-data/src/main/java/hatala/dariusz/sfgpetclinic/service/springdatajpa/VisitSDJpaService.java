package hatala.dariusz.sfgpetclinic.service.springdatajpa;

import hatala.dariusz.sfgpetclinic.model.Visit;
import hatala.dariusz.sfgpetclinic.repository.VisitRepository;
import hatala.dariusz.sfgpetclinic.service.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {

        Set<Visit> visitSet = new HashSet<>();

        visitRepository.findAll().forEach(visitSet::add);

        return visitSet;
    }

    @Override
    public Optional<Visit> findById(Long id) {
        return visitRepository.findById(id);
    }

    @Override
    public Visit save(Visit obj) {
        return visitRepository.save(obj);
    }

    @Override
    public void delete(Visit obj) {
        visitRepository.delete(obj);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }
}
