package service;

import entity.Student;

import java.util.List;

public interface IStudentService {
    public void addStudent(Student student);
    public List<Student> queryAllStudent();
}
