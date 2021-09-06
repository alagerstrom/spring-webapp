package se.andreaslagerstrom.springwebapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se.andreaslagerstrom.springwebapp.model.Person;
import se.andreaslagerstrom.springwebapp.service.PersonService;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public List<Person> index() {
        return personService.findAll();
    }
}
