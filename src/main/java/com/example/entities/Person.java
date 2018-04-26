package com.example.entities;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Person {
    private Long id;

    private String name;

    @ApiModelProperty(hidden = true)
    private Date createdBy;

    public Person(Long id, String name, Date createdBy) {
        this.id = id;
        this.name = name;
        this.createdBy = createdBy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Date createdBy) {
        this.createdBy = createdBy;
    }
}
