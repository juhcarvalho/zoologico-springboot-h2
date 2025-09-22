package zoo.logico.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zoo.logico.app.model.Animal;
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
    public List<Animal> ASDas(){
        return service.getAll();
    }
}
