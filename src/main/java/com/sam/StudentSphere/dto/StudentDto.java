package com.sam.StudentSphere.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Long id;
    @NotEmpty(message = "This field should not be empty")
    private String firstName;
    @NotEmpty(message = "This field should not be empty")
    private String lastName;
    @NotEmpty(message = "This field should not be empty")
    @Email
    private String email;
}
