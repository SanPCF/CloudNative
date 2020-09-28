package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentRepository studentsRepo;

    public StudentController(StudentRepository studentsRepo) {
        this.studentsRepo = studentsRepo;
    }

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student) {
        Student createdStudent = studentsRepo.create(student);

        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Student> read(@PathVariable Long id) {
        Student student = studentsRepo.find(id);
        if (student != null) {
            return new ResponseEntity<>(student, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<Student>> list() {
        return new ResponseEntity<>(studentsRepo.list(), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Student> update(@PathVariable Long id, @RequestBody Student student) {
        Student updatedStudent = studentsRepo.update(id, student);
        if (updatedStudent != null) {
            return new ResponseEntity<>(updatedStudent, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Student> delete(@PathVariable Long id) {
        studentsRepo.delete(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

