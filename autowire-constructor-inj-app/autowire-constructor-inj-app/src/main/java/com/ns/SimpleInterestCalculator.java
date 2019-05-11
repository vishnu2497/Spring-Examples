/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ns;

import org.springframework.stereotype.Service;

@Service
public class SimpleInterestCalculator implements IInterestCalculator {

    public SimpleInterestCalculator() {
    }

    public double calculate(double principle, double periodInYears, double intPercent) {
        return (principle * periodInYears * intPercent) / 100;
    }
}

