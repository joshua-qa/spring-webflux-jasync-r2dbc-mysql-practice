package com.shua.r2dbcjasync.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table("test")
public class Test {

    @Id
    private Long id;

    private String content;
}
