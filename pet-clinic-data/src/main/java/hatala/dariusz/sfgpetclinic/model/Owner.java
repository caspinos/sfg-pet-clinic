package hatala.dariusz.sfgpetclinic.model;

import java.util.Set;

public class Owner extends Person {
    private String address;
    private String city;
    private String telephone;

    private Set<Pet> pets;


    public Owner() {
        super();
    }

    public Owner(String firstName, String lastName, Set<Pet> pets) {
        super(firstName, lastName);
        this.pets = pets;
    }

    public Owner(String firstName, String lastName, Set<Pet> pets, String address, String city, String telephone) {
        super(firstName, lastName);
        this.pets = pets;
        this.address = address;
        this.city = city;
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
