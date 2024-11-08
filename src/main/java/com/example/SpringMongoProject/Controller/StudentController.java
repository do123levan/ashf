package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Student;
import com.example.SpringMongoProject.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/save")
    private String saveStudent(@RequestBody Student students) {
        return studentService.saveOrUpdate(students); // Gọi đúng phương thức
    }

    @GetMapping(value = "/getAll")
    private Iterable<Student> getAllStudents() {
        return studentService.findAll(); // Gọi đúng phương thức
    }

    @PutMapping(value = "/edit/{id}")
    private Student updateStudent(@RequestBody Student students, @PathVariable(name = "id") String _id) {
        studentService.saveOrUpdate(students);
        return students;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteStudent(@PathVariable(name = "id") String _id) {
        studentService.deleteStudent(_id);
    }

    @GetMapping("/student/{id}")
    private Optional<Student> getStudent(@PathVariable(name = "id") String student_id) {
        return studentService.getStudent(student_id); // Gọi đúng phương thức getStudent
    }
}
