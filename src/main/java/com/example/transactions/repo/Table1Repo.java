package com.example.transactions.repo;

import com.example.transactions.model.Table1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Table1Repo extends JpaRepository<Table1, Long> {
}