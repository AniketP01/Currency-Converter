package com.currency;

public class AustralianDollar implements Currency {
    Double value;

    public AustralianDollar(double dollar) {
        this.value = dollar;
    }

    @Override
    public USD toUSD() {
        return new USD(this.value * 0.68);
    }

    @Override
    public IndianRupee toINR() {
        return new IndianRupee(this.value * 56.31);
    }

    @Override
    public KuwaitiDinar toKWD() {
        return new KuwaitiDinar(this.value*0.21);
    }

    @Override
    public AustralianDollar toAUD() {
        return new AustralianDollar(this.value);
    }

    @Override
    public String toString() {
        return "$ " + this;
    }
}
