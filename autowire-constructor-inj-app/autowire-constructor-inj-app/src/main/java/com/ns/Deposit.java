/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 *
 * @author KR
 */
@Component
public class Deposit {

    private double principle = 20000;
    private double periodInYears = 4;
    private double intPercent = 20;
    private double intAmt;
    private IInterestCalculator calculatorBean;

    @Autowired
    public Deposit(IInterestCalculator calculatorBean) {
        this.calculatorBean = calculatorBean;
    }

    public double getPrinciple() {
        return principle;
    }

    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public double getPeriodInYears() {
        return periodInYears;
    }

    public void setPeriodInYears(double periodInYears) {
        this.periodInYears = periodInYears;
    }

    public double getIntPercent() {
        return intPercent;
    }

    public void setIntPercent(double intPercent) {
        this.intPercent = intPercent;
    }

    public double getIntAmt() {
        return intAmt;
    }

    public void setIntAmt(double intAmt) {
        this.intAmt = intAmt;
    }

    public void calculateInterest() {

        /*  ApplicationContext context = new ClassPathXmlApplicationContext("deposit/deposit.xml");
         Calculate calculate =(Calculate) context.getBean("calculateBean");
         */
        intAmt = calculatorBean.calculate(principle, periodInYears, intPercent);

    }

}
