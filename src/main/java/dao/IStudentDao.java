package dao;

import entity.Student;

import java.util.List;

public interface IStudentDao {
    public void insertStudent(Student student);
    public List<Student> selectAllStudent();
}
