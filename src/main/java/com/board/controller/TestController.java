package com.board.controller;

import com.board.core.TestService;
import com.board.model.Test;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "testController")
@RequestScoped
public class TestController {

    private Test test = new Test();
    private List<Test> tests = new ArrayList<Test>();

    @EJB
    private TestService testService;

    @PostConstruct
    public void getAllUsersList(){
        tests = testService.getAllTests();
    }

    public Test findTest(){
        return this.testService.getTest();
    }

    public List<Test> findAll(){
        return this.testService.getAllTests();
    }

    public List<Test> getTests() {
        return tests;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
