package hatala.dariusz.sfgpetclinic.services;

import java.util.Optional;
import java.util.Set;

public interface CrudService <T, ID> {

    Set<T> findAll();

    Optional<T> findById(ID id);

    T save(T obj);

    void delete(T obj);

    void deleteById(ID id);
}
