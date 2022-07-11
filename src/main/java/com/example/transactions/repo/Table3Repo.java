package com.example.transactions.repo;

import com.example.transactions.model.Table3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Table3Repo extends JpaRepository<Table3, Long> {
}
