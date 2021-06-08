package digital.one.PesonalApi.service;

import digital.one.PesonalApi.dto.MessageResponseDTO;
import digital.one.PesonalApi.dto.request.PersonDTO;
import digital.one.PesonalApi.entity.Person;
import digital.one.PesonalApi.mapper.PersonMapper;
import digital.one.PesonalApi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    PersonRepository personRepository;
    private final PersonMapper  personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO){
        Person personToSave = personMapper.toModel(personDTO);

        Person personSave = this.personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Create person com id " + personSave.getId())
                .build();
    }
}
