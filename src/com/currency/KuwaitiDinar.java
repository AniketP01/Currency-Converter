package com.currency;

import javax.swing.plaf.ColorUIResource;

public class KuwaitiDinar implements Currency {
    private Double value;


    public Double getValue() {
        return value;
    }

    public void setValue(Double kDinar) {
        this.value = kDinar;
    }

    public KuwaitiDinar(Double kDinar) {
        this.value = kDinar;
    }


    @Override
    public USD toUSD() {
        return new USD(this.value * 3.26);
    }

    @Override
    public IndianRupee toINR() {
        return new IndianRupee(this.value * 270.4);
    }

    @Override
    public KuwaitiDinar toKWD() {
        return this;
    }

    @Override
    public AustralianDollar toAUD() {
        return new AustralianDollar(this.value * 4.85);
    }

}
