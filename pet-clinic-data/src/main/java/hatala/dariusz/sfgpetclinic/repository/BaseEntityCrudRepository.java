package hatala.dariusz.sfgpetclinic.repository;

import hatala.dariusz.sfgpetclinic.model.BaseEntity;

import java.util.Optional;
import java.util.Set;

public interface BaseEntityCrudRepository<T extends BaseEntity> {

    Set<T> findAll();

    Optional<T> findById(Long id);

    T save(T obj);

    void delete(T obj);

    void deleteById(Long id);
}
