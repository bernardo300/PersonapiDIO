package digital.one.PesonalApi.controller;

import digital.one.PesonalApi.dto.MessageResponseDTO;
import digital.one.PesonalApi.dto.request.PersonDTO;
import digital.one.PesonalApi.exception.PersonNotFoundException;
import digital.one.PesonalApi.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO) {
        return this.personService.createPerson(personDTO);
    }

    @GetMapping
    public List<PersonDTO> listAll(){
        return personService.listAll();
    }

    @GetMapping("/{id}")
    public PersonDTO findByIDyId(@PathVariable Long id) throws PersonNotFoundException {
        return personService.findById(id);
    }
}
