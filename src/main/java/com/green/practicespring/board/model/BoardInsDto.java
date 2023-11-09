package com.green.practicespring.board.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardInsDto {
    private String title;
    private String ctnts;
    private String writer;

}
