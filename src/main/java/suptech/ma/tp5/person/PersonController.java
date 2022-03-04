package suptech.ma.tp5.person;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import suptech.ma.tp5.util.Error;
import suptech.ma.tp5.util.IError;

import java.util.List;

@RestController
@RequestMapping(path = "/api/persons")
public class PersonController {

    private final IPersonService service;

    public PersonController(IPersonService service) {
        this.service = service;
    }

    @PostMapping
    public IError addPerson(@RequestBody Person person) {
        try {
            return service.addPerson(person);
        }catch (Exception e) {
            return new Error("Data Error",e.getMessage());
        }
    }

    @GetMapping
    public List<Person> getPersons() throws RuntimeException{
        return service.getPersons();
    }

    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable("id") Long id) throws RuntimeException{
        return service.getPersonById(id);
    }
}
