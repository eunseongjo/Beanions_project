package com.ohgiraffers.Beanions.board.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class BoardDTO {

    private int  boardCode;
    private int userId;
    private String boardTitle;
    private String boardContext;
    private Date boardDate;

}
