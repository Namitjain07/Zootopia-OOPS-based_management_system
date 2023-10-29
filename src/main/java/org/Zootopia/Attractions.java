package org.Zootopia;

import java.util.ArrayList;

public class Attractions {
    private String new_attraction_name;
    private String new_attraction_Description;
    private int new_attraction_price;
    private int Attraction_count=0;
    private ArrayList<Animal> current_attraction_animals = new ArrayList<>();
    public Attractions(String new_attraction_name,String new_attraction_Description,String new_attraction_id){
        this.new_attraction_name=new_attraction_name;
        this.new_attraction_Description=new_attraction_Description;
        this.unique_id=new_attraction_id;
    }
    boolean attraction_status=false;
    private String unique_id;
    String attraction_type;
    //premium basic
    void setNew_attraction_price(int new_price){
        this.new_attraction_price=new_price;
    }
    void setAttraction_count(int no_of_ticket){
        Attraction_count = Attraction_count+no_of_ticket;
    }
    void apply_discount(){}
    void buy(){}//input price and discount
    void provide_feedback(){}//must return feedback to be viewed by admin

    public String getnew_attraction_name() {
        return new_attraction_name;
    }

    public String getnew_attraction_Description() {
        return new_attraction_Description;
    }

    public String getunique_id() {
        return unique_id;
    }

    public int getnew_attraction_price() {
        return new_attraction_price;
    }

    public void setnew_attraction_name(String new_name) {
        this.new_attraction_name=new_name;
    }
    public void setnew_attraction_Description(String new_description){
        this.new_attraction_Description=new_description;
    }


    public void addAttractionAnimal(Animal animal) {
        current_attraction_animals.add(animal);
    }
    public void removeAttractionAnimal(Animal animal){
        current_attraction_animals.remove(animal);
    }

    public boolean isAttraction_status() {
        return attraction_status;
    }
    public void markAttraction_status(boolean new_status){
        this.attraction_status=new_status;
    }

    public int getAttraction_count() {
        return Attraction_count;
    }
}
