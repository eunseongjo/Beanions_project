package com.ohgiraffers.Beanions.board.service;

import com.ohgiraffers.Beanions.board.model.dao.FreeBoardYesinMapper;
import com.ohgiraffers.Beanions.board.model.dao.FreeBoardYesinMapper;
import org.springframework.stereotype.Service;

@Service
public class FreeBoardYesinService {

    private final FreeBoardYesinMapper yesinMapper;

    public FreeBoardYesinService(FreeBoardYesinMapper yesinMapper){
        this.yesinMapper = yesinMapper;
    }
}
