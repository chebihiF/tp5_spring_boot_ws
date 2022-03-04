package suptech.ma.tp5.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import suptech.ma.tp5.util.IError;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Person implements IError {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name;
    private String email;
    private LocalDate dob;
    private int age ;
}
