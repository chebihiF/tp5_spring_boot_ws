package suptech.ma.tp5.person;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerosnService implements IPersonService{

    private final PersonRepository personRepository;

    public PerosnService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person addPerson(Person person) throws RuntimeException {
        if(person.getAge()<18) throw new RuntimeException("cannot accept your request");
        return personRepository.save(person);
    }

    @Override
    public Person updatePerson(Person person) throws RuntimeException {
        if(person.getAge()<18) throw new RuntimeException("cannot accept your request");
        return personRepository.save(person);
    }

    @Override
    public Person deletePerson(Person person) throws RuntimeException {
        //Person p = getPersonById(person.getId());
        personRepository.delete(person);
        return person ;
    }

    @Override
    public Person getPersonById(Long id) throws RuntimeException {
        return personRepository.findById(id).get();
    }

    @Override
    public List<Person> getPersons() throws RuntimeException {
        return personRepository.findAll();
    }
}
