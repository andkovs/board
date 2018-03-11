package com.board.core;

import com.board.model.Test;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class TestService {

    public Test getTest(){
        return new Test(1L, "test");
    }

    public List<Test> getAllTests() {
        List<Test> tests = new ArrayList<Test>();
        tests.add(new Test(1L, "test1"));
        tests.add(new Test(2L, "test2"));
        tests.add(new Test(3L, "test3"));
        return tests;
    }
}
