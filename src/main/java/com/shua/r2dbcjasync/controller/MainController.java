package com.shua.r2dbcjasync.controller;

import com.shua.r2dbcjasync.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @GetMapping
    public Flux<String> getList() {
        return mainService.getResult();
    }

    @PostMapping
    public Mono<String> createRecord(String content) {
        return mainService.createRecord(content);
    }
}
