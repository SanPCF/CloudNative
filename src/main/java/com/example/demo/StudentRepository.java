package com.example.demo;


import java.util.List;

public interface StudentRepository {
    Student create(Student Student);
    Student find(Long id);
    List<Student> list();
    Student update(Long id, Student student);
    void delete(Long id);
}
