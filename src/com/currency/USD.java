package com.currency;

public class USD implements Currency {
    private Double value;

    public USD(Double dollar) {
        this.value = dollar;
    }

    public Double getUsDollar() {
        return value;
    }

    public void setUsDollar(Double usDollar) {
        this.value = usDollar;
    }

    @Override
    public USD toUSD() {
        return this;
    }

    @Override
    public AustralianDollar toAUD() {
        return new AustralianDollar(this.value * 1.47);
    }

    public IndianRupee toINR() {
        return new IndianRupee(this.value * 82.86);
    }

    public KuwaitiDinar toKWD() {
        return new KuwaitiDinar(this.value * 3.26);
    }

}

