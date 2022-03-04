package suptech.ma.tp5.person;

import java.util.List;

public interface IPersonService {
    public Person addPerson(Person person) throws RuntimeException;
    public Person updatePerson(Person person) throws RuntimeException;
    public Person deletePerson(Person person) throws RuntimeException;
    public Person getPersonById(Long id) throws RuntimeException;
    public List<Person> getPersons() throws RuntimeException;
}
