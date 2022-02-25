package suptech.ma.tp5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Tp5Application {

    public static void main(String[] args) {
        SpringApplication.run(Tp5Application.class, args);
    }


    @GetMapping
    public List<String> hello(){
        return List.of("Hello","World");
    }

}
