package com.sam.StudentSphere.repo;

import com.sam.StudentSphere.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
