package ua.kh.kryvko.simplerestapp.controllers;


import org.springframework.web.bind.annotation.*;
import ua.kh.kryvko.simplerestapp.entities.Salutation;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "/hello")
public class HelloWorldController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = {"/{name}", ""}, method = RequestMethod.GET)
    @ResponseBody
    public Salutation getSalutation(@PathVariable(value = "name", required = false) String name) {
        Salutation salutation = new Salutation();
        salutation.setId(counter.incrementAndGet());
        if (name == null) {
            name = "anonymous";
        }
        salutation.setName(name);
        return salutation;
    }

}
