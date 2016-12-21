package com.kalai.ltd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shan on 21/12/2016.
 */
public class CalculateHedgeWinLoss {

    public static List<HedgeWinAndLoss> getHedgeWinAndLossList(Values values) {

        List<HedgeWinAndLoss> hedgeWinAndLosses = new ArrayList<HedgeWinAndLoss>();

        for (int price1 = values.getPrice1RangeStart(); price1 <= values.getPrice1RangeEnd(); price1++) {

            for (int price2 = values.getPrice2RangeStart(); price2 <= values.getPrice2RangeEnd(); price2++) {

                HedgeWinAndLoss hedgeWinAndLoss = new HedgeWinAndLoss();

                hedgeWinAndLoss.setPrice1(price1);
                hedgeWinAndLoss.setPrice2(price2);
                double win1 = price1 * values.getLimit1();
                double win2 = price2 * values.getLimit2();
                double loss1 = price1 * values.getStop1();
                double loss2 = price2 * values.getStop2();
                hedgeWinAndLoss.setHedgeWin(win2-loss1);
                hedgeWinAndLoss.setHedgeLoss(loss2-win1);

                if (hedgeWinAndLoss.getHedgeWin() >= 0 && hedgeWinAndLoss.getHedgeLoss() < 0) {
                    hedgeWinAndLoss.setEligible(true);
                } else {
                    hedgeWinAndLoss.setEligible(false);
                }
                hedgeWinAndLosses.add(hedgeWinAndLoss);
            }

        }


        return hedgeWinAndLosses;
    }

    public static void main(String... args) {

        ReadValues readValues = new ReadValues();

        List<HedgeWinAndLoss> hedgeWinAndLosses = getHedgeWinAndLossList(readValues.getValues());

        for (HedgeWinAndLoss hedgeWinAndLoss : hedgeWinAndLosses) {

            if(hedgeWinAndLoss.isEligible()) {
                System.out.println(hedgeWinAndLoss);
            }

        }

    }

}
