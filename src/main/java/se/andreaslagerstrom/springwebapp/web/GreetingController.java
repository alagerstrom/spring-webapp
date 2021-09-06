package se.andreaslagerstrom.springwebapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import se.andreaslagerstrom.springwebapp.model.Person;
import se.andreaslagerstrom.springwebapp.service.PersonService;

@Controller
public class GreetingController {

    @Autowired
    private PersonService personService;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        var person = new Person();
        person.setAge(13);
        person.setCovidInfo("Stuff");
        person.setSurname("Suure");
        person.setName("General");
        personService.addPerson(person);
        return "greeting";
    }
}
