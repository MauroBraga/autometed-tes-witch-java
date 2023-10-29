package br.com.mrb.service;

import br.com.mrb.model.Person;

import java.util.concurrent.atomic.AtomicLong;

public class PersonService implements IPersonService {


    @Override
    public Person createPerson(Person p) {

        if (p.getEmail() == null || p.getEmail().isBlank())
            throw new IllegalArgumentException("The Person e-Mail is null or empty!");

        var id = new AtomicLong().incrementAndGet();
        p.setId(id);
        return p;
    }
}
