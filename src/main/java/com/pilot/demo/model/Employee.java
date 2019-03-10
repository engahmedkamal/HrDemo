package com.pilot.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employee")
@Data
public class Employee extends BaseEntity {
    @Size(max = 100)
    @Column(name = "name")
    @JsonProperty
    private String name;

    @ManyToOne(targetEntity = Department.class)
    @JoinColumn(name = "dept_id")
    private Department department;
}
