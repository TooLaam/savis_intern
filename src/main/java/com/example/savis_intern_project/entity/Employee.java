package com.example.savis_intern_project.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "Username")
    private String username;

    @Column(name = "Password")
    private String password;

    @Column(name = "Image")
    private String image;

    @Column(name = "DateOfBirth")
    private String dateOfBirth;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Datecreated")
    private String datecreated;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @Column(name = "Email")
    private String email;

    @Column(name = "Address")
    private String address;

    @Column(name = "Status")
    private String status;

    @ManyToOne()
    @JoinColumn(
            name = "RoleId",
            referencedColumnName = "Id",
            nullable = true
    )
    private Role role;
}
