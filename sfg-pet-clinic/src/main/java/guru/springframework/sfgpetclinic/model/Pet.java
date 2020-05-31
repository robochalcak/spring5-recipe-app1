package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {

    private PetType petType;
    private Ovner ovner;
    private LocalDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Ovner getOvner() {
        return ovner;
    }

    public void setOvner(Ovner ovner) {
        this.ovner = ovner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
