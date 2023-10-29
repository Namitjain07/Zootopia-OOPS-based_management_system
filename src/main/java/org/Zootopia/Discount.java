package org.Zootopia;

public class Discount {
    private String discount_code;
    private int discount_percentage;
    private int start_eligible_age;
    private int end_eligible_age;
    public Discount(String discount_code,int discount_percentage,int start_eligible_age,int end_eligible_age){
        this.discount_code=discount_code;
        this.discount_percentage=discount_percentage;
        this.start_eligible_age=start_eligible_age;
        this.end_eligible_age=end_eligible_age;

    }

    public int getDiscount_percentage() {
        return discount_percentage;
    }

    public int getEnd_eligible_age() {
        return end_eligible_age;
    }

    public int getStart_eligible_age() {
        return start_eligible_age;
    }

    public String getDiscount_code() {
        return discount_code;
    }
}
