package org.Zootopia;

public class Amphibians extends Animal implements Animal_interface{
    private String new_animal_ID;
    private String new_animal_name;
    private String new_animal_type;
    private String new_animal_description;
    private String new_animal_sound;
    public Amphibians(String new_animal_ID,String new_animal_name,String new_animal_type,String new_animal_description,String new_animal_sound){
        this.new_animal_name=new_animal_name;
        this.new_animal_type=new_animal_type;
        this.new_animal_ID=new_animal_ID;
        this.new_animal_description=new_animal_description;
        this.new_animal_sound=new_animal_sound;
    }
    @Override
    public String feed_animal(){
        return new_animal_sound;
    }
    @Override
    public String reading(){
        return new_animal_description;
    }
    @Override
    public String feed(){
        return this.new_animal_sound;
    }
    @Override
    public String read(){
        return this.new_animal_description;
    }
    @Override
    public String read_id(){
        return new_animal_ID;
    }

    @Override
    public String read_name() {
        return new_animal_name;
    }
    @Override
    public String read_animal_type(){
        return new_animal_type;
    }
    @Override
    public void setNew_animal_description(String new_animal_description) {
        this.new_animal_description = new_animal_description;
    }
    @Override
    public void setNew_animal_name(String new_animal_name) {
        this.new_animal_name = new_animal_name;
    }
    @Override
    public void setNew_animal_sound(String new_animal_sound) {
        this.new_animal_sound = new_animal_sound;
    }
}
