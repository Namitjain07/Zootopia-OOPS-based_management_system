package org.Zootopia;

public class Special_Deals {
    private int noOfAttractionsToApplySpecialDeal;
    private int discountToBeOfferedOnSpecialDeal;

    public Special_Deals(int noOfAttractionsToApplySpecialDeal, int discountToBeOfferedOnSpecialDeal) {
        this.noOfAttractionsToApplySpecialDeal=noOfAttractionsToApplySpecialDeal;
        this.discountToBeOfferedOnSpecialDeal=discountToBeOfferedOnSpecialDeal;

    }

    public int getDiscountToBeOfferedOnSpecialDeal() {
        return discountToBeOfferedOnSpecialDeal;
    }

    public int getNoOfAttractionsToApplySpecialDeal() {
        return noOfAttractionsToApplySpecialDeal;
    }
}
