package com.example.controllers;

import com.example.entities.Person;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/person")
public class PersonController {
    List<Person> personList = new ArrayList<>();

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    Person getPerson(@RequestParam("id") Long id) throws Exception {
        return personList.stream().filter(item -> id.equals(item.getId()))
                .findFirst().orElseThrow(() -> new Exception("no element"));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Person createPerson(@RequestBody Person person) {
        personList.add(person);
        return person;
    }
}
