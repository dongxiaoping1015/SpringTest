package service;

import dao.IStudentDao;
import entity.Student;

import java.util.List;

public class StudentServiceImpl implements IStudentService {

    private IStudentDao dao;

    public void setDao(IStudentDao dao) {
        this.dao = dao;
    }

    public void addStudent(Student student) {
        dao.insertStudent(student);
    }

    public List<entity.Student> queryAllStudent() {
        return dao.selectAllStudent();
    }
}
