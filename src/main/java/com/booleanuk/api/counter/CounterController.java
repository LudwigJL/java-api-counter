package com.booleanuk.api.counter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {
    private int counter;

    CounterController(){
        counter = 0;
    }
    @GetMapping("counter")
    public String getCounter(){
        return "" + this.counter;
    }

    @GetMapping("counter/increment")
    public String incrementCounter(){
        counter++;

        return "" + counter;
    }

    @GetMapping("counter/decrement")
    public String decrementCounter(){
        counter--;

        return "" + counter;
    }

}
