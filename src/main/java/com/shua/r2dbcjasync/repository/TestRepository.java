package com.shua.r2dbcjasync.repository;

import com.shua.r2dbcjasync.domain.Test;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TestRepository extends ReactiveCrudRepository<Test, Long> {
}
