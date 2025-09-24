package zoo.logico.app.controllers;

import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import zoo.logico.app.domain.dto.AnimalDto;
import zoo.logico.app.domain.model.Animal;
import zoo.logico.app.services.AnimalService;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {
    private final AnimalService service;

    public AnimalController(AnimalService service) {
        this.service = service;
    }

    @GetMapping
    public List<Animal> listarTodos(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Animal obterPorId(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Animal cadastrar(@Valid @RequestBody AnimalDto animal){
        return service.create(animal);
    }

    @PutMapping("/{id}")
    public Animal atualizar(@PathVariable Long id, @Valid @RequestBody AnimalDto animal) throws EntityNotFoundException {
        return service.update(id, animal);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) throws EntityNotFoundException {
        service.delete(id);
    }

    @GetMapping("/nascidoEmCativeiro")
    public List<Animal> listarNascidoEmCativeiro() {
        return service.findByNascidoEmCativeiro();
    }



}
