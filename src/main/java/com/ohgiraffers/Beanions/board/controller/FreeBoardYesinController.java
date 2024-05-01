package com.ohgiraffers.Beanions.board.controller;

import com.ohgiraffers.Beanions.board.service.FreeBoardYesinService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class FreeBoardYesinController {

    private final FreeBoardYesinService yesinService;

    public FreeBoardYesinController(FreeBoardYesinService yesinService){
        this.yesinService = yesinService;
    }
    @GetMapping("/freeBoardYesin")
    public void


}
