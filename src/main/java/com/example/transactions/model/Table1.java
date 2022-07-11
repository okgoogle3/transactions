package com.example.transactions.model;

import javax.persistence.*;

@Entity
@Table(name = "Table1")
public class Table1 {


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

    public Table1() {
    }

    public Table1(String name) {
        this.name = name;
    }
}
