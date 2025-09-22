package zoo.logico.app.services;

import org.springframework.stereotype.Service;
import zoo.logico.app.model.Animal;
import zoo.logico.app.repositories.AnimalRepository;

import java.util.List;

@Service
public class AnimalService {
    private final AnimalRepository repository;

    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }

    public Animal create(Animal animal) {
        return repository.save(animal);
    }

    public Animal getById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Animal> getAll(){
        return repository.findAll();
    }
}
