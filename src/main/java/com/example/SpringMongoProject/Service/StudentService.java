package com.example.SpringMongoProject.Service;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public String saveOrUpdate(Student student) {
        repo.save(student);  // sửa 'students' thành 'student'
        return null;
    }

    public Iterable<Student> findAll() {
        return repo.findAll();
    }

    public void deleteStudent(String id) {
        repo.deleteById(id);  // sửa kiểu trả về thành 'void'
    }

    public Optional<Student> getStudent(String id) {  // Optional giúp xử lý trường hợp không tìm thấy Student
        return repo.findById(id);  // sửa 'studentid' thành 'id'
    }

    public Student getStudentByID(String studentId) {
        return null;
    }
}