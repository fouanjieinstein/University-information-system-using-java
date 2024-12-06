package com.mycompany.main;
import java.util.ArrayList;
import java.util.List;

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return name;
    }
}

class Department {
    private String name;
    private List<Professor> professors;
    private List<Student> students;

    public Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addProfessor(Professor professor) {

        professors.add(professor);
    }

    public void removeProfessor(Professor professor) {
        professors.remove(professor);
    }

    public void assignStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return String.format("Department: %s, Professors: %s, Students: %s",
                name, professors, students);
    }
}

class University {
    private List<Department> departments;

    public University() {
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        if (departments.contains(department)) {
            departments.remove(department);
        }

    }

    @Override
    public String toString() {
        return String.format("University Departments: %s", departments);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creates a university
        University uni = new University();

        // Creates a list departments
        Department csDepartment = new Department("Computer Science");
        Department mathDepartment = new Department("Mathematics");

        // Create list of professors

        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Create list of students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Adds professors to the Computer Science department
        csDepartment.addProfessor(professor1);
        csDepartment.addProfessor(professor2);

        // Assigns studs to science department
        

csDepartment.assignStudent(student1);
        csDepartment.assignStudent(student2);

        // adds a dptment in the univ
        uni.addDepartment(csDepartment);
        uni.addDepartment(mathDepartment);

        // It displays univ info
        System.out.println(uni);

        // Here i Remove a department
        uni.removeDepartment(csDepartment);

        // shows university info after removal
        System.out.println("\nAfter removing Computer Science department:");

        System.out.println(uni);
    }
}
