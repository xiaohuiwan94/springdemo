package j.w.springdemo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
  private final PersonService personService;

  public PersonController(PersonService personService) {
    this.personService = personService;
  }

  @GetMapping("/api/v1/person/{id}")
  public ResponseEntity<Person> getPerson(@PathVariable("id") long personId) {
    Person person = personService.getPerson(personId);

    return ResponseEntity.ok().body(person);
  }
}
