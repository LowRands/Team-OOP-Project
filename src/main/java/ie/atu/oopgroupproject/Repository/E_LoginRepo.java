package ie.atu.oopgroupproject.Repository;

import ie.atu.oopgroupproject.model.E_Create;
import org.springframework.data.jpa.repository.JpaRepository;

public interface E_LoginRepo extends JpaRepository<E_Create, Long> {

}
