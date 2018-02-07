package hello;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    Map<Long, Greeting> greetings ;

    public HelloController() {
        this.greetings  = new HashMap<Long, Greeting>();
        greetings.put((long) 1, new Greeting(1,"Greetings from Spring Boot 111!"));
        greetings.put((long) 2, new Greeting(2,"Greetings from Spring Boot 222!"));
    }

    @RequestMapping("/")
    public String index() {
        Greeting greeting = greetings.get((long) 1);
        return greeting.toString();
    }

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        Greeting greeting = greetings.get((long) 2);
        return greeting;
    }
    
}
