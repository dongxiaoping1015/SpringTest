package dao;

import entity.Student;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class StudentDaoImpl extends JdbcDaoSupport implements IStudentDao {

    public void insertStudent(Student student) {
        String sql = "insert into student (name, age) values (?, ?)";
        this.getJdbcTemplate().update(sql, student.getName(), student.getAge());
    }

    public List<Student> selectAllStudent() {
        String sql = "select id, name, age from student";
        return this.getJdbcTemplate().query(sql, new StudentRowMapper());
    }
}
