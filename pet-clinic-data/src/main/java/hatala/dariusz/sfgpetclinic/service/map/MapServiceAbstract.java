package hatala.dariusz.sfgpetclinic.service.map;

import hatala.dariusz.sfgpetclinic.model.BaseEntity;
import hatala.dariusz.sfgpetclinic.service.BaseEntityCrudService;

import java.util.*;

public abstract class MapServiceAbstract<T extends BaseEntity> implements BaseEntityCrudService<T> {

    private long nextId = 1;

    protected Map<Long, T> map = new HashMap<>();


    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public Optional<T> findById(Long id) {
        return Optional.ofNullable(map.get(id));
    }

    public T save(T obj) {
        if( obj.getId() == null ) {

            obj.setId(nextId++);

        } else if( !map.containsKey(obj.getId()) ){

            throw new RuntimeException("Attempting to update non-existing entity");
        }


        map.put(obj.getId(), obj);

        return obj;
    }

    public void delete(T obj) {
        if(map.containsKey(obj.getId())){

            map.remove(obj.getId());

        } else {
            throw new RuntimeException("Attempting to delete non-existing entity");
        }


    }

    public void deleteById(Long id) {
        if(map.containsKey(id)) {

            map.remove(id);

        } else {
            throw new RuntimeException("Attempting to delete non-existing entity");
        }
    }
}
