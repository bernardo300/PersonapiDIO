package digital.one.PesonalApi.controller;

import digital.one.PesonalApi.dto.MessageResponseDTO;
import digital.one.PesonalApi.entity.Person;
import digital.one.PesonalApi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }


    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Person person){
        Person personSave = this.personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Create person com id " + personSave.getId())
                .build();
    }
}
