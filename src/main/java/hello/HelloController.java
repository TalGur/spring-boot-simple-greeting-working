package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    private Map<Long, Greeting> greetings ;

    public HelloController() {
        greetings  = new HashMap<>();
        greetings.put((long) 1, new Greeting(1,"Greetings from Spring Boot 111!"));
        greetings.put((long) 2, new Greeting(2,"Greetings from Spring Boot 222!"));
    }

    @RequestMapping("/")
    public String index() {
        return greetings.get((long) 1).toString();
    }

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return greetings.get((long) 2);
    }

    @RequestMapping(value="/greeting/{id}")
    public Greeting greeting(@PathVariable("id") long id) {
        return greetings.get(id);
    }
    
}
