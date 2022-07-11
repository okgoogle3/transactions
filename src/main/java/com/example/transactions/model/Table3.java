package com.example.transactions.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "Table3")
public class Table3 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Table3() {
    }

    public Table3(String name) {
        this.name = name;
    }
}
