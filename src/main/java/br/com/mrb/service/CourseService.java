package br.com.mrb.service;

import java.util.List;

public interface CourseService {

    List<String> retrieveCourses(String student);
    public List<String> doSomething(String student);
}
