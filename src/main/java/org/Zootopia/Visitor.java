package org.Zootopia;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Visitor {
    private String experience_type;

    private String newVisitorName;
    private int newVisitorAge;
    private long newVisitorPhNo;
    private int newVisitorBalance;
    private String newVisitorEmail;
    private String newVisitorPassword;
    private String newVisitorFeedback;
    public ArrayList<Attractions> tickets_bought = new ArrayList<>();

    private  int visitor_spent=0;
    public Visitor(String newVisitorName, int newVisitorAge, long newVisitorPhNo, int newVisitorBalance, String newVisitorEmail, String newVisitorPassword) {
        this.newVisitorName=newVisitorName;
        this.newVisitorAge=newVisitorAge;
        this.newVisitorPhNo=newVisitorPhNo;
        this.newVisitorBalance=newVisitorBalance;
        this.newVisitorEmail=newVisitorEmail;
        this.newVisitorPassword=newVisitorPassword;
    }
    void set_experience_type(String exp){
        experience_type = exp;

    }
    void set_visitor_balance(int money_spent,int no_of_tickets_bought){
        newVisitorBalance=newVisitorBalance-(money_spent*no_of_tickets_bought);

    }
    void add_visitor_balance(int money_spent,int no_of_tickets_bought){
        newVisitorBalance=newVisitorBalance+(money_spent*no_of_tickets_bought);

    }
    void buy_ticket(Attractions attraction_ticket_bought,int no_of_tickets_bought){
        for(int k=0;k<no_of_tickets_bought;k++){
            tickets_bought.add(attraction_ticket_bought);
        }

    }//only for basic user
    // s
    void set_feedback(String feedback){
        this.newVisitorFeedback=feedback;
    }
    public String getNewVisitorFeedback(){
        return newVisitorFeedback;
    }

    public String getexperience_type() {
        return experience_type;
    }

    public int getnewVisitorBalance() {
        return newVisitorBalance;
    }

    public String getnewVisitorEmail() {
        return newVisitorEmail;
    }

    public String getnewVisitorPassword() {
        return newVisitorPassword;
    }

    public void setVisitor_spent(int visitor_spent) {
        this.visitor_spent = this.visitor_spent+visitor_spent;
    }

    public int getVisitor_spent() {
        return visitor_spent;
    }

    public int getNewVisitorAge() {
        return newVisitorAge;
    }
}
