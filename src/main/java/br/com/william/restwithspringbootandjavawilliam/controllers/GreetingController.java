package br.com.william.restwithspringbootandjavawilliam.controllers;

import br.com.william.restwithspringbootandjavawilliam.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //http://localhost:8080/greeting?name=William
    @RequestMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value = "name", defaultValue = "World")
            String name) {
        return new Greeting(String.format(template, name), counter.incrementAndGet());

    }
}
