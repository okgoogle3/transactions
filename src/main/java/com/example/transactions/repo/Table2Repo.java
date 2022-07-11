package com.example.transactions.repo;

import com.example.transactions.model.Table2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Table2Repo extends JpaRepository<Table2, Long> {
}