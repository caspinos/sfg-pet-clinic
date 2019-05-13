package hatala.dariusz.sfgpetclinic.service;

import hatala.dariusz.sfgpetclinic.model.BaseEntity;

import java.util.Optional;
import java.util.Set;

public interface BaseEntityCrudService<T extends BaseEntity> {

    Set<T> findAll();

    Optional<T> findById(Long id);

    T save(T obj);

    void delete(T obj);

    void deleteById(Long id);
}
