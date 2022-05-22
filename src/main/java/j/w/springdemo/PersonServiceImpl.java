package j.w.springdemo;

import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

  @Override
  public Person getPerson(long id) {
    return new Person(id, "Jane", "Wan", 18);
  }
}
