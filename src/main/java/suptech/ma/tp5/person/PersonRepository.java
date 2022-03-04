package suptech.ma.tp5.person;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface PersonRepository extends JpaRepository<Person,Long> {
    Page<Person> findPersonByAgeBetween(int min, int max, Pageable pageable);
}
