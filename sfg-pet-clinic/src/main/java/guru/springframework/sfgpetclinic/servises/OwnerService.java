package guru.springframework.sfgpetclinic.servises;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

   Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner ovner);

    Set<Owner> findAll();
}
