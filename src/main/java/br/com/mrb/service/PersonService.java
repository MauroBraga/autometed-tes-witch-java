package br.com.mrb.service;

import br.com.mrb.model.Person;

import java.util.concurrent.atomic.AtomicLong;

public class PersonService implements IPersonService {


    @Override
    public Person createPerson(Person p) {
        var id = new AtomicLong().incrementAndGet();
        p.setId(id);
        return p;
    }
}
