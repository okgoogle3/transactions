package com.example.transactions.service;

import com.example.transactions.model.Table1;
import com.example.transactions.model.Table2;
import com.example.transactions.model.Table3;
import com.example.transactions.repo.Table1Repo;
import com.example.transactions.repo.Table2Repo;
import com.example.transactions.repo.Table3Repo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.logging.Logger;

@RequiredArgsConstructor
@Service
public class ServiceTest {
    public final Table1Repo repo1;
    public final Table2Repo repo2;
    public final Table3Repo repo3;

    private final static Logger logger =
            Logger.getLogger(ServiceTest.class.getName());
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void createWrongTestData(String name) {
        repo1.save(new Table1("2"));
        repo2.save(new Table2("2"));
        repo3.save(new Table3(null));
        logger.info("Ебать, не работает");
        throw new RuntimeException();
    }

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void createTestData(String name) {
        repo1.save(new Table1("2"));
        repo2.save(new Table2("2"));
        repo3.save(new Table3(null));
        logger.info("Ебать, работает");
    }
}
