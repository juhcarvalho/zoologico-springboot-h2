package zoo.logico.app.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import zoo.logico.app.domain.dto.AnimalDto;
import zoo.logico.app.domain.model.Animal;
import zoo.logico.app.repositories.AnimalRepository;

import java.util.List;

@Service
public class AnimalService {
    private final AnimalRepository repository;

    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }

    public Animal create(AnimalDto animalDto){
        Boolean nasceuEmCativeiro = animalDto.nascidoEmCativeiro() != null ? animalDto.nascidoEmCativeiro() : false;

        Animal animal = Animal.builder()
                .nome(animalDto.nome())
                .idade(animalDto.idade())
                .nascidoEmCativeiro(nasceuEmCativeiro)
                .build();
        return repository.save(animal);
    }

    public Animal getById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Animal> getAll(){
        return repository.findAll();
    }

    public Animal update(Long id, AnimalDto animalDto){
        repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Animal com id " + id + " não encontrado!"));

        Boolean nasceuEmCativeiro = animalDto.nascidoEmCativeiro() != null ? animalDto.nascidoEmCativeiro() : false;

        Animal animal = Animal.builder()
                .nome(animalDto.nome())
                .idade(animalDto.idade())
                .nascidoEmCativeiro(nasceuEmCativeiro)
                .id(id)
                .build();
        return repository.save(animal);
    }

    public void delete(Long id){
        repository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Animal com id " + id + " não encontrado!"));

        repository.deleteById(id);
    }

}
