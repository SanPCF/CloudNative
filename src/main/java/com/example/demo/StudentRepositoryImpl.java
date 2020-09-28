package com.example.demo;

	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;

	public class StudentRepositoryImpl implements StudentRepository {
	    private HashMap<Long, Student> studentEntries = new HashMap<>();

	    private long currentId = 1L;

	    @Override
	    public Student create(Student Student) {
	        Long id = currentId++;

	        Student newStudent = new Student(
	            id,
	            Student.getDeptId(),
	            Student.getClassId(),
	            Student.getName()
	        );

	        studentEntries.put(id, newStudent);
	        return newStudent;
	    }

	    @Override
	    public Student find(Long id) {
	        return studentEntries.get(id);
	    }

	    @Override
	    public List<Student> list() {
	        return new ArrayList<>(studentEntries.values());
	    }

	    @Override
	    public Student update(Long id, Student Student) {
	        if (find(id) == null) return null;

	        Student updatedEntry = new Student(
	            id,
	            Student.getDeptId(),
	            Student.getClassId(),
	            Student.getName()
	        );

	        studentEntries.replace(id, updatedEntry);
	        return updatedEntry;
	    }

	    @Override
	    public void delete(Long id) {
	        studentEntries.remove(id);
	    }
	}

