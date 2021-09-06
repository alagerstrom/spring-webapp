package se.andreaslagerstrom.springwebapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.andreaslagerstrom.springwebapp.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
