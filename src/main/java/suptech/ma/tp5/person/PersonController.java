package suptech.ma.tp5.person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1")
public class PersonController {

    @GetMapping(path = "/people")
    public List<Person> people(){
        return List.of(
                new Person(
                        1L,
                        "chebihi",
                        "f.chebihi@gmail.com",
                        LocalDate.of(1987,3,14),
                        34
                )
        );
    }
}
