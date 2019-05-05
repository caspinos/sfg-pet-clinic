package hatala.dariusz.sfgpetclinic.model;

public class Vet extends Person {

    private Speciality speciality;

    public Vet() {
    }

    public Vet(String firstName, String lastName, Speciality speciality) {
        super(firstName, lastName);
        this.speciality = speciality;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
}
