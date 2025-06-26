package se.lexicon.todo_api.controlller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import se.lexicon.todo_api.dto.PersonDto;
import se.lexicon.todo_api.entity.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@RequestMapping("/api/v1/person")
@RestController
public class PersonController {
    @GetMapping
    public List<Person> findAll() {
        System.out.println("Find all method has been executed");
        List<Person> people = new ArrayList<>();
        people.add(new Person(1L, "Nazie", "nazie@gmail.com", LocalDate.now()));
        people.add(new Person(2L, "Agnes", "agnes@gmail.com", LocalDate.now()));
        System.out.println("people: " + people);
        return people;

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person createPerson(Person person) {
        return new Person(3L, "Che", "che@gmail.com", LocalDate.now());
    }
}
