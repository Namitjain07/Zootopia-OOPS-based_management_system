package org.Zootopia;
import java.util.ArrayList;
import java.util.HashMap;

public class Admin {

    private HashMap<String,String> attractions_state=new HashMap<>();//name and state(open/close)
    private HashMap<String,Integer> attraction_cost=new HashMap<>();//name and cost
    private HashMap<String,Integer> ticket_count=new HashMap<>();//name and no of tickets
    private HashMap<String,Animal> animal_attraction = new HashMap<>();

    void add_attraction(){}
    void modify_attraction(){}
    void remove_attraction(){}

    void add_visitor(){}
    void discount_minor(){}
    void senior_citizen(){}

    public void setAnimal_attraction(HashMap<String, Animal> animal_attraction) {
        this.animal_attraction = animal_attraction;
    }

    public void setAttraction_cost(HashMap<String, Integer> attraction_cost) {
        this.attraction_cost = attraction_cost;
    }

    public void setAttractions_state(HashMap<String, String> attractions_state) {
        this.attractions_state = attractions_state;
    }

    public void setTicket_count(HashMap<String, Integer> ticket_count) {
        this.ticket_count = ticket_count;
    }

    public HashMap<String, Animal> getAnimal_attraction() {
        return animal_attraction;
    }

    public HashMap<String, Integer> getAttraction_cost() {
        return attraction_cost;
    }

    public HashMap<String, Integer> getTicket_count() {
        return ticket_count;
    }

    public HashMap<String, String> getAttractions_state() {
        return attractions_state;
    }
}
