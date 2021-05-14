package digital.one.PesonalApi.service;

import digital.one.PesonalApi.dto.MessageResponseDTO;
import digital.one.PesonalApi.dto.request.PersonDTO;
import digital.one.PesonalApi.entity.Person;
import digital.one.PesonalApi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {
    PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO){
        Person personSave = this.personRepository.save(personDTO);
        return MessageResponseDTO
                .builder()
                .message("Create person com id " + personSave.getId())
                .build();
    }
}
