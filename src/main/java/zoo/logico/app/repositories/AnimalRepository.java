package zoo.logico.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import zoo.logico.app.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
