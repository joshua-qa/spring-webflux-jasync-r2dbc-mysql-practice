package com.shua.r2dbcjasync.service;

import com.shua.r2dbcjasync.domain.Test;
import com.shua.r2dbcjasync.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class MainService {

    private final TestRepository testRepository;

    public Flux<String> getResult() {
        return testRepository.findAll().map(Test::toString);
    }

    public Mono<String> createRecord(String content) {
        Test test = new Test();
        test.setContent(content);
        return testRepository.save(test).map(Test::toString);
    }
}
