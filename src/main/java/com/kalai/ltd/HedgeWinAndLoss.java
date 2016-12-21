package com.kalai.ltd;

/**
 * Created by shan on 21/12/2016.
 */
public class HedgeWinAndLoss {

    private int price1;
    private int price2;
    private double hedgeWin;
    private double hedgeLoss;
    private boolean eligible;


    public int getPrice1() {
        return price1;
    }

    public void setPrice1(int price1) {
        this.price1 = price1;
    }

    public int getPrice2() {
        return price2;
    }

    public void setPrice2(int price2) {
        this.price2 = price2;
    }

    public double getHedgeWin() {
        return hedgeWin;
    }

    public void setHedgeWin(double hedgeWin) {
        this.hedgeWin = hedgeWin;
    }

    public double getHedgeLoss() {
        return hedgeLoss;
    }

    public void setHedgeLoss(double hedgeLoss) {
        this.hedgeLoss = hedgeLoss;
    }

    public boolean isEligible() {
        return eligible;
    }

    public void setEligible(boolean eligible) {
        this.eligible = eligible;
    }

    @Override
    public String toString() {
        return "HedgeWinAndLoss{" +
                "price1=" + price1 +
                ", price2=" + price2 +
                ", hedgeWin=" + hedgeWin +
                ", hedgeLoss=" + hedgeLoss +
                '}';
    }
}
