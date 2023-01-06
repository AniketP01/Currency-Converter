package com.currency;

public class IndianRupee implements Currency {
    private Double value;

    public IndianRupee(Double INR) {
        this.value = INR;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double inr) {
        this.value = inr;
    }

    public USD toUSD() {
        return new USD(this.value * 1.49);
    }

    @Override
    public AustralianDollar toAUD() {
        return new AustralianDollar(this.value*0.018) ;
    }

    @Override
    public IndianRupee toINR() {
        return this;
    }

    public KuwaitiDinar toKWD() {
        return new KuwaitiDinar(this.value*0.21);
    }

    public String toString(){
        return "INR " + this.value;
    }
}
