package zoo.logico.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import zoo.logico.app.domain.model.Animal;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

    List<Animal> findByNascidoEmCativeiro(Boolean nascidoEmCativeiro);

}
