package com.daneel.myapplication;

/**
 * Created by daneel on 2013/11/12.
 */
public class InterestCalculator {

    private double r;
    private double rate;
    private double n;
    private double p;
    private double c;

    public InterestCalculator(double rate, double payments, double loanAmount) {
        super();
        this.rate = rate;
        this.r = rate/12/100;
        this.n = payments;
        this.p = loanAmount;

        CalculateLoan();
    }

    private void CalculateLoan(){
        this.c = (p*r*Math.pow(1+r, n))/(Math.pow(1+r, n) -1);
    }

    public double getMonthlyPayment(){
        return c;
    }

    public double getInterestComponent(){
        return c*n - p;
    }

    public double getTotalInstalments(){
        return c*n;
    }

}