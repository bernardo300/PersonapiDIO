package digital.one.PesonalApi.controller;

import digital.one.PesonalApi.dto.MessageResponseDTO;
import digital.one.PesonalApi.dto.request.PersonDTO;
import digital.one.PesonalApi.entity.Person;
import digital.one.PesonalApi.repository.PersonRepository;
import digital.one.PesonalApi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody PersonDTO personDTO) {
        return this.personService.createPerson(personDTO);
    }
}
