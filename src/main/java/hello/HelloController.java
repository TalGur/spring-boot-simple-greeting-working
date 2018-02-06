package hello;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    Greeting greeting = new Greeting(1,"Greetings from Spring Boot!");

    @RequestMapping("/")
    public String index() {
        return greeting.toString();
    }

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return greeting;
    }
    
}
