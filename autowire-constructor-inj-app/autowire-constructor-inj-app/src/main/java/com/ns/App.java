/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ns;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author bramu
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Deposit deposit = (Deposit)context.getBean(Deposit.class);
        deposit.setPrinciple(1000.0);
        deposit.setPeriodInYears(2);
        deposit.setIntPercent(10);
        deposit.calculateInterest();
        System.out.println("Interest Amount is " + deposit.getIntAmt());
    }
}
