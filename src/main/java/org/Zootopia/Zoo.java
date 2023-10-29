package org.Zootopia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Zoo {
    private ArrayList<Animal> mammals_table= new ArrayList<>();
    private ArrayList<Animal> reptiles_table= new ArrayList<>();
    private ArrayList<Animal> amphibians_table= new ArrayList<>();
    private HashMap<Animal,String > Animal_map =new HashMap<>();
    private int amphibian_count=0;
    private int mammal_count=0;
    private int reptiles_count=0;
    //at least 2 animal for each
    String new_animal_name;
    String new_animal_type;
    String new_animal_ID;
    String new_animal_description;
    String new_animal_sound;


    void add_animal(String new_animal_ID , String new_animal_name, String new_animal_type ,String new_animal_description,String new_animal_sound){
        this.new_animal_name=new_animal_name;
        this.new_animal_ID=new_animal_ID;
        this.new_animal_type=new_animal_type;
        this.new_animal_description=new_animal_description;
        this.new_animal_sound=new_animal_sound;
        if (Objects.equals(new_animal_type, "Mammal")){
            Animal new_animal_mammals = new Mammals(new_animal_ID,new_animal_name,new_animal_type,new_animal_description,new_animal_sound);
            mammals_table.add(new_animal_mammals);
//            System.out.println(new_animal_mammals.read_id());
            Animal_map.put(new_animal_mammals,new_animal_type);
            mammal_count++;
            System.out.println("Mammal Added Successfully");
        } else if (Objects.equals(new_animal_type, "Reptile")) {
            Animal new_animal_reptiles = new Reptiles(new_animal_ID,new_animal_name,new_animal_type,new_animal_description,new_animal_sound);
            reptiles_table.add(new_animal_reptiles);
            Animal_map.put(new_animal_reptiles,new_animal_type);
            System.out.println("Reptile Added Successfully");
            reptiles_count++;
        } else {
            Animal new_animal_amphibians = new Amphibians(new_animal_ID,new_animal_name,new_animal_type,new_animal_description,new_animal_sound);
            amphibians_table.add(new_animal_amphibians);
            Animal_map.put(new_animal_amphibians,new_animal_type);
            System.out.println("Amphibians Added Successfully");
            amphibian_count++;
        }


    }
    void remove_animal(String animal_remmove_string){
        int flag=0;

if(mammal_count>1){
    for(int i=0;i<mammals_table.size();i++){
        if(Objects.equals(mammals_table.get(i).read_id(), animal_remmove_string)){
            mammals_table.remove(mammals_table.get(i));
            mammal_count--;
            flag=1;
            break;
        }
        if(Objects.equals(mammals_table.get(i).read_name(), animal_remmove_string)){
            mammals_table.remove(mammals_table.get(i));
            mammal_count--;
            flag=1;
            break;
        }
    }





        }
        if(reptiles_count>1){
            for(int i=0;i<reptiles_table.size();i++){

                if(Objects.equals(reptiles_table.get(i).read_id(), animal_remmove_string)){
                    reptiles_table.remove(reptiles_table.get(i));
                    flag=1;
                    reptiles_count--;
                    break;
                }
                if(Objects.equals(reptiles_table.get(i).read_name(), animal_remmove_string)){
                    reptiles_table.remove(reptiles_table.get(i));
                    flag=1;
                    reptiles_count--;
                    break;
                }


            }
        }

        if(amphibian_count>1){
            for(int i=0;i<amphibians_table.size();i++){

                if(Objects.equals(amphibians_table.get(i).read_id(), animal_remmove_string)){
                    amphibians_table.remove(amphibians_table.get(i));
                    amphibian_count--;
                    flag=1;
                    break;
                }
                if(Objects.equals(amphibians_table.get(i).read_name(), animal_remmove_string)){
                    amphibians_table.remove(amphibians_table.get(i));
                    amphibian_count--;
                    flag=1;
                    break;
                }


            }
        }

        if(flag==1){
            System.out.println("Animal Removed Successfully");
        }
        else{
            System.out.println("Animal not found");
        }
//        for(int i=0;i<reptiles_table.size();i++){
//
//        }
//        for(int i=0;i<amphibians_table.size();i++){
//
//        }
    }

    void view_names(){
        for(int i=0;i<mammals_table.size();i++){
            System.out.println("Mammal index: "+(i+1));
            System.out.println(mammals_table.get(i).read_name());
        }
        for(int i=0;i<reptiles_table.size();i++){
            System.out.println("Reptile index: "+(i+mammals_table.size()+1));
            System.out.println(reptiles_table.get(i).read_name());
        }
        for(int i=0;i<amphibians_table.size();i++){
            System.out.println("Amphibian index: "+(i+mammals_table.size()+reptiles_table.size()+1));
            System.out.println(amphibians_table.get(i).read_name());
        }
    }

    public ArrayList<Animal> getmammals_table() {
        return mammals_table;
    }

    public ArrayList<Animal> getreptiles_table() {
        return reptiles_table;
    }

    public ArrayList<Animal> getamphibians_table() {
        return amphibians_table;
    }

    public int getmammal_count() {
        return mammal_count;
    }

    public int getreptiles_count() {
        return reptiles_count;
    }

    public int getamphibian_count() {
    return amphibian_count;
    }

    public void modify_animal() {


        System.out.println("Enter the current name of the animal you want to modify");
        Scanner fs = new Scanner(System.in);
        String name = fs.nextLine();
        for(int i=0;i<mammals_table.size();i++){
            if(Objects.equals(name, mammals_table.get(i).read_name())){
                Scanner df = new Scanner(System.in);
                System.out.println("select what you want to edit :\n1. name\n2. description\n3. sound");
                int sel = df.nextInt();
                if (sel ==1){
                    Scanner scnm1 = new Scanner(System.in);
                    System.out.println("enter new name");
                    String n= scnm1.nextLine();
                    mammals_table.get(i).setNew_animal_name(n);

                }
                else if(sel ==2){
                    Scanner scnm2 = new Scanner(System.in);
                    System.out.println("Enter new description");
                    String d = scnm2.nextLine();
                    mammals_table.get(i).setNew_animal_description(d);
                }
                else if(sel ==3){
                    Scanner scnm3 = new Scanner(System.in);
                    System.out.println("enter new sound");
                    String s=scnm3.nextLine();
                    mammals_table.get(i).setNew_animal_sound(s);
                }
                else{
                    System.out.println("wrong selection");
                }
            }
        }
        for(int i=0;i<reptiles_table.size();i++){
            if(Objects.equals(name, reptiles_table.get(i).read_name())){
                Scanner df = new Scanner(System.in);
                System.out.println("select what you want to edit :\n1. name\n2. description\n3. sound");
                int sel = df.nextInt();
                if (sel ==1){

                    System.out.println("enter new name");
                    String n= df.nextLine();
                    reptiles_table.get(i).setNew_animal_name(n);

                }
                else if(sel ==2){
                    System.out.println("Enter new description");
                    String d = df.nextLine();
                    reptiles_table.get(i).setNew_animal_description(d);
                }
                else if(sel ==3){
                    System.out.println("enter new sound");
                    String s=df.nextLine();
                    reptiles_table.get(i).setNew_animal_sound(s);
                }
                else{
                    System.out.println("wrong selection");
                }
            }
        }
        for(int i=0;i<amphibians_table.size();i++){
            if(Objects.equals(name, amphibians_table.get(i).read_name())){
                Scanner df = new Scanner(System.in);
                System.out.println("select what you want to edit :\n1. name\n2. description\n3. sound");
                int sel = df.nextInt();
                if (sel ==1){

                    System.out.println("enter new name");
                    String n= df.nextLine();
                    amphibians_table.get(i).setNew_animal_name(n);

                }
                else if(sel ==2){
                    System.out.println("Enter new description");
                    String d = df.nextLine();
                    amphibians_table.get(i).setNew_animal_description(d);
                }
                else if(sel ==3){
                    System.out.println("enter new sound");
                    String s=df.nextLine();
                    amphibians_table.get(i).setNew_animal_sound(s);
                }
                else{
                    System.out.println("wrong selection");
                }
            }
        }

    }

}
