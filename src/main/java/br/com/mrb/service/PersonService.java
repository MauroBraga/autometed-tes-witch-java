package br.com.mrb.service;

import br.com.mrb.model.Person;

public class PersonService implements IPersonService {


    @Override
    public Person createPerson(Person p) {
        return p;
    }
}
