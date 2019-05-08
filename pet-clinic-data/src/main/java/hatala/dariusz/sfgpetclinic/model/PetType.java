package hatala.dariusz.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pet_types")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class PetType extends BaseEntity{

    @Column
    private String name;

}
