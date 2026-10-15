package br.com.william.restwithspringbootandjavawilliam.services;

import br.com.william.restwithspringbootandjavawilliam.expection.ResourceNotFoundException;
import br.com.william.restwithspringbootandjavawilliam.model.Person;
import br.com.william.restwithspringbootandjavawilliam.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    private Logger logger = Logger.getLogger(PersonService.class.getName());


    public List<Person> findAll() {
        logger.info("Finding all people!");
        return repository.findAll();
    }

    public Person findById(Long id) {
        logger.info("Finding one person!");
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Person not found with id: " + id));
    }

    public Person create(Person person) {
        logger.info("Creating a new person!");
        return repository.save(person);
    }

    public Person update(Person person) {
        logger.info("Updating a person!");
        Person entidade =  repository.findById(person.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Person not found with id: " + person.getId()));
        entidade.setFirstName(person.getFirstName());
        entidade.setLastName(person.getLastName());
        entidade.setAddress(person.getAddress());
        entidade.setGender(person.getGender());
        return repository.save(entidade);
    }


    public void delete(Long id) {
        logger.info("Deleting a person!");
        Person entidade = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Person not found with id: " + id));
        repository.delete(entidade);
    }

}
