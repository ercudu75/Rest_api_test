package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Setter
@Getter
@ToString
@Entity
@Table(name="tbl_employee")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;


    @Column(name="name")
    private String name;
    @Column(name="age")
    private Long age;
    @Column(name="location")
    private String location;
    @Column(name="email")
    private String email;
    @Column(name="department")
    private String departement;

}
