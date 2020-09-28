package com.example.demo;

public class Student {
	private long id;
	private long deptId;
	private long classId;
	private String name;
	
	public Student() {
		
	}

	public Student(long id, long deptId, long classId, String name) {
		this.id = id;
		this.deptId = deptId;
		this.classId = classId;
		this.name = name;
	}
	
	public Student(long deptId, long classId, String name) {
		this.deptId = deptId;
		this.classId = classId;
		this.name = name;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getDeptId() {
		return deptId;
	}
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	public long getClassId() {
		return classId;
	}
	public void setClassId(long grade) {
		this.classId = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (deptId ^ (deptId >>> 32));
		result = prime * result + (int) (classId ^ (classId >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (deptId != other.deptId)
			return false;
		if (classId != other.classId)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
}
