package com.sam.StudentSphere.service;

import com.sam.StudentSphere.dto.StudentDto;
import com.sam.StudentSphere.entity.Student;
import com.sam.StudentSphere.mapper.StudentMapper;
import com.sam.StudentSphere.repo.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private StudentRepo studentRepo;

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> studentList = studentRepo.findAll();
        return studentList.stream()
                .map(student -> StudentMapper.mapToStudentDto(student))
                .collect(Collectors.toList());
    }

    @Override
    public void createStudent(StudentDto studentDto) {
        Student student = StudentMapper.mapToStudent(studentDto);
        studentRepo.save(student);
    }

    @Override
    public StudentDto getStudentById(Long studentId) {
        Student student = studentRepo.findById(studentId).get();
        return StudentMapper.mapToStudentDto(student);
    }

    @Override
    public void updateStudent(StudentDto studentDto) {
        studentRepo.save(StudentMapper.mapToStudent(studentDto));
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepo.deleteById(studentId);
    }
}
