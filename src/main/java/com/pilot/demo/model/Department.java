package com.pilot.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "department")
@Data
public class Department extends BaseEntity {
    @Size(max = 100)
    @Column(name = "name")
    @JsonProperty
    private String name;
}
