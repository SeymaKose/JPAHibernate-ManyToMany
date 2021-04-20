package com.project.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Class {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int classId;
	private String className;
	
	@ManyToMany(mappedBy = "classes")
	private List<Student> students;
	
	
	public Class() {
		
	}

	public Class(String className) {
		this.className = className;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Class [classId=" + classId + ", className=" + className + ", students=" + students + "]";
	}
	
}
