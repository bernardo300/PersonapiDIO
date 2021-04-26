package digital.one.PesonalApi.controller;

import digital.one.PesonalApi.entity.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    @GetMapping
    public String getPerson(){
        return "Api Testando roo";
    }

    @PostMapping
    public String createPerson(){
        return "Create person";
    }

    @DeleteMapping
    public String delete(){
        return "Delete person";
    }

    @PutMapping
    public String edita(){
        return "Editar person";
    }
}
