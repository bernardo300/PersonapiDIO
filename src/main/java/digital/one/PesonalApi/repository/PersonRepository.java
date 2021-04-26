package digital.one.PesonalApi.repository;

import digital.one.PesonalApi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
