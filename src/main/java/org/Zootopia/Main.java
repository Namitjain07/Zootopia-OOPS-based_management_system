package org.Zootopia;
import java.util.*;

public class Main {
    private static List<String> attractionIdTable = new ArrayList<>();

    private static String default_admin_username="admin";
    private static String default_admin_password="admin123";
    private static ArrayList<Attractions> attractions_table= new ArrayList<>();
    private static ArrayList<Discount> discount_table = new ArrayList<>();
    private static Zoo new_zoo = new Zoo();
    private static ArrayList<Visitor> Visitor_table = new ArrayList<>();
    private static ArrayList<Special_Deals> Special_Deal_table = new ArrayList<>();
    static int total_revenue;
//    Visitor Current_visitor_1;
    static int visitor_registration_count=0;
    static int visitor_logins_count=0;


    public static String generateUniqueId(String prefix) {
        Random random = new Random();
        StringBuilder idBuilder = new StringBuilder(prefix);

        for (int i = 0; i < 8; i++) {
            int randomDigit = random.nextInt(10);
            idBuilder.append(randomDigit);
        }

        String attractionId = idBuilder.toString();

        // Check if the generated ID already exists
        if (attractionIdTable.contains(attractionId)) {
            // If it exists, generate a new ID (you can choose to retry or handle it differently)
            return generateUniqueId(prefix);
        } else {
            // If it doesn't exist, add it to the table and return
            attractionIdTable.add(attractionId);
            return attractionId;
        }
    }

    public static void main(String[] args) {




        String new_animal_id3 = generateUniqueId("ANIMAL_");
        String new_animal_id4 = generateUniqueId("ANIMAL_");
        String new_animal_id5 = generateUniqueId("ANIMAL_");
        String new_animal_id6 = generateUniqueId("ANIMAL_");
        String new_animal_id7 = generateUniqueId("ANIMAL_");
        String new_animal_id8 = generateUniqueId("ANIMAL_");
        new_zoo.add_animal(new_animal_id3,"Elephant","Mammal","Elephants are large mammals known for their long trunks, big ears, and impressive size. They live in social groups led by a matriarch and are herbivores, feeding on vegetation. They face threats from habitat loss and poaching for their ivory tusks, making conservation efforts crucial. African elephants are vulnerable, and Asian elephants are endangered.","Trumpeting");
        new_zoo.add_animal(new_animal_id4,"Dolphin","Mammal","Dolphins are intelligent marine mammals known for their sleek bodies, playful behavior, and advanced communication through clicks, whistles, and other sounds. They are social animals, often seen in groups, and are known for their acrobatic displays.","Whistles");
        new_zoo.add_animal(new_animal_id5,"Crocodile","Reptile","Crocodiles are large, semi-aquatic reptiles known for their powerful jaws, armored bodies, and stealthy hunting behavior. They have a long, V-shaped snout, strong tails, and are well-adapted to aquatic life. Crocodiles are carnivorous and can be found in a variety of wetland habitats, lurking in the water to ambush their prey. They are ancient creatures that have remained relatively unchanged for millions of years.","grunts");
        new_zoo.add_animal(new_animal_id6,"Snake","Reptile","Snakes are legless reptiles with scales. They vary in size, habitat, and some are venomous. They are important predators in ecosystems and are found worldwide.","Hiss");
        new_zoo.add_animal(new_animal_id7,"Frog","Amphibian","Frogs are small, amphibious creatures with smooth, moist skin, bulging eyes, and long hind legs built for jumping. They come in various colors and are known for their croaking calls, which they use for communication. Frogs are found in a wide range of habitats, from rainforests to ponds, and are an essential part of ecosystems as both predators and prey.","Croak");
        new_zoo.add_animal(new_animal_id8,"Spring Peeper","Amphibian","Spring Peepers are small, tan frogs with an X-shaped pattern on their back. They make high-pitched \"peep\" sounds, often signaling the arrival of spring. They are found near water in eastern North America and play a role in the local ecosystem.","Peep");
        String generated_discount_coupon1=generateUniqueId("DISCOUNT_");
        Discount new_discount1 = new Discount(generated_discount_coupon1,10,0,18);
        discount_table.add(new_discount1);

        String generated_discount_coupon2=generateUniqueId("DISCOUNT_");
        Discount new_discount2 = new Discount(generated_discount_coupon2,20,60,1000);
        discount_table.add(new_discount2);

        Special_Deals spc1 = new Special_Deals(2,15);
        Special_Deal_table.add(spc1);

        Special_Deals spc2 = new Special_Deals(3,30);
        Special_Deal_table.add(spc2);
        //add default animal


        Scanner input = new Scanner(System.in);
        int p;
        int c = 1;
        int b;

        while (c == 1) {
            System.out.println("Welcome to ZOOtopia!\n" +
                    "\n" +
                    "1. Enter as Admin\n" +
                    "2. Enter as a Visitor\n" +
                    "3. View Special Deals\n"+
                    "4. Exit");
            System.out.print("Enter your choice: ");
            p = input.nextInt();

            switch (p) {
                case 1:
                    // Admin login
                    Admin adm = new Admin();
                    adm.add_attraction();
                    adm.modify_attraction();
                    adm.remove_attraction();
                    adm.add_visitor();
                    adm.discount_minor();
                    adm.senior_citizen();
                    System.out.print("Enter Admin Username: ");
                    String adminUsername = input.next();
                    System.out.print("Enter Admin Password: ");
                    String adminPassword = input.next();
                    // Perform admin login logic here
                    if(Objects.equals(adminUsername, default_admin_username) && Objects.equals(adminPassword,default_admin_password)){
                        System.out.println("Logged in as Admin.");
                        adminMenu();
                    }
                    else{
                        System.out.println("wrong credentials");
                        break;
                    }
                    break;
                case 2:
                    Scanner scn4=new Scanner(System.in);
                    System.out.println("1. Register\n" +
                            "2. Login\n");
                    int choice3 = scn4.nextInt();
                    switch(choice3){
                        case 1:
                            Scanner scn5=new Scanner(System.in);
                            System.out.println("Enter Visitor Name: ");
                            String new_visitor_name = scn5.nextLine();
                            System.out.println("Enter Visitor Age: ");
                            int new_visitor_age = scn5.nextInt();
                            System.out.println("Enter Visitor Phone Number: ");
                            long new_visitor_ph_no=scn5.nextLong();
                            System.out.println("Enter Visitor Balance: ");
                            int new_visitor_balance = scn5.nextInt();
                            Scanner scn7=new Scanner(System.in);
                            System.out.println("Enter Visitor Email: ");
                            String new_visitor_email = scn7.nextLine();
                            System.out.println("Enter Visitor Password: ");
                            String new_visitor_password=scn7.nextLine();
                            Visitor new_visitor=new Visitor(new_visitor_name,new_visitor_age,new_visitor_ph_no,new_visitor_balance,new_visitor_email,new_visitor_password);
                            Visitor_table.add(new_visitor);
                            visitor_registration_count++;
                            System.out.println("Visitor Added Successfully");
                            break;

                        case 2:
                            Scanner scn6 = new Scanner(System.in);
                            System.out.println("Enter Visitor Email: ");
                            String past_visitor_email=scn6.nextLine();
                            System.out.println("Enter Visitor Password: ");
                            String past_visitor_password=scn6.nextLine();
                            int flag1=0;
                            Visitor current_visitor = null;
                            for(int i=0;i<Visitor_table.size();i++){
                                if(Objects.equals(Visitor_table.get(i).getnewVisitorEmail(), past_visitor_email) && Objects.equals(Visitor_table.get(i).getnewVisitorPassword(), past_visitor_password)){
                                    flag1=1;
                                    current_visitor=Visitor_table.get(i);
                                    break;
                                }

                            }
                            if(flag1==1){
                                visitor_logins_count++;
                                System.out.println("Login Successful\n");
                                visitorMenu(current_visitor);
                            }
                            else{
                                System.out.println("Visitor not found");
                            }
                            break;

                    }
                    // Visitor login or registration

                    break;
                case 3:
                    // View Special Deals
                    // Implement special deals logic here
                    for(int i=0;i<Special_Deal_table.size();i++){
                        System.out.println((i+1)+"Discount of "+Special_Deal_table.get(i).getDiscountToBeOfferedOnSpecialDeal()+"% on purchase of "+Special_Deal_table.get(i).getNoOfAttractionsToApplySpecialDeal()+" Attractions.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting ZOOtopia.");
                    c = 2;
                    break;
                default:
                    System.out.println("Invalid input. Try again");
                    break;
            }
        }


    }

    public static void adminMenu() {

        int choice;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Admin Menu:");
            System.out.println("1. Manage Attractions");
            System.out.println("2. Manage Animals");
            System.out.println("3. Schedule Events");
            System.out.println("4. Set Discounts");
            System.out.println("5. Set Special Deal");
            System.out.println("6. View Visitor Stats");
            System.out.println("7. View Feedback");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    manageAttractions();
                    break;
                case 2:
                    manageAnimals();
                    break;
                case 3:
                    scheduleEvents();
                    break;
                case 4:
                    setDiscounts();
                    break;
                case 5:
                    setSpecialDeal();
                    break;
                case 6:
                    viewVisitorStats();
                    break;
                case 7:
                    viewFeedback();
                    break;
                case 8:
                    System.out.println("Logged out.");
                    return;
                default:
                    System.out.println("Invalid input. Try again");
            }
        } while (true);
    }

    public static void manageAttractions() {
        int choice2;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Manage Attractions:\n" +
                    "1. Add Attraction\n" +
                    "2. View Attractions\n" +
                    "3. Modify Attraction\n" +
                    "4. Remove Attraction\n" +
                    "5. Exit\n");
            choice2 = input.nextInt();

            switch (choice2) {
                case 1:
                    Scanner scn = new Scanner(System.in);
                    System.out.print("Enter Attraction Name: ");
                    String new_attraction_name=scn.nextLine();

                    System.out.print("\nEnter Attraction Description: ");
                    String new_attraction_Description=scn.nextLine();

                    String new_attraction_id = generateUniqueId("ATTRACTION_");
                    Attractions atr=new Attractions(new_attraction_name,new_attraction_Description,new_attraction_id);
                    attractions_table.add(atr);
                    System.out.println("Attraction added successfully.\n");
                    break;
                case 2:
                    if (attractions_table.isEmpty()){
                        System.out.println("no attractions added");
                        break;
                    }
                    for(int i=0;i<attractions_table.size();i++) {
                        System.out.println("Attraction ID:"+attractions_table.get(i).getunique_id());
                        System.out.println("Attraction Name: "+attractions_table.get(i).getnew_attraction_name());
                        System.out.println("Attraction Description: "+attractions_table.get(i).getnew_attraction_Description()+"\n\n");
                    }
                    break;
                case 3:
                    Scanner scnv= new Scanner(System.in);
                    if (attractions_table.isEmpty()){
                        System.out.println("no attractions added");
                        break;
                    }
                    System.out.println("Select Attraction to modify");
                    for(int i=0;i<attractions_table.size();i++){
                        System.out.println((i+1)+". "+attractions_table.get(i).getnew_attraction_name());
                    }
                    int selected_index=scnv.nextInt();

                    System.out.println("enter what you want to modify");
                    System.out.println("1. attraction name\n"+"2. attraction description\n");
                    int selected_modification_index=scnv.nextInt();
                    if(selected_modification_index==1){
                        Scanner scnm = new Scanner(System.in);
                        System.out.println("Current name: "+attractions_table.get(selected_index-1).getnew_attraction_name());
                        System.out.println("enter new Name");
                        String new_name= scnm.nextLine();
                        attractions_table.get(selected_index-1).setnew_attraction_name(new_name);
                        System.out.println("name changed successfully");
                    }
                    else if(selected_modification_index==2){
                        Scanner scnm1 = new Scanner(System.in);
                        System.out.println("Current Description: "+attractions_table.get(selected_index-1).getnew_attraction_Description());
                        System.out.println("Enter new Description");
                        String new_description = scnm1.nextLine();
                        attractions_table.get(selected_index-1).setnew_attraction_Description(new_description);
                        System.out.println("Description changed successfully");
                    }
                    else{
                        System.out.println("Invalid input");
                    }
                    break;
                case 4:
                    if (attractions_table.isEmpty()){
                        System.out.println("no attractions added");
                        break;
                    }
                    System.out.println("Enter Attraction ID or Name to remove");
                    String input12=input.next();
                    int flag =0;
                    for(int i=0;i<attractions_table.size();i++) {
                        if (Objects.equals(input12, attractions_table.get(i).getnew_attraction_name()) || Objects.equals(input12, attractions_table.get(i).getunique_id())) {
                                attractions_table.remove(attractions_table.get(i));
                                System.out.println("removed successfully");
                                flag=1;
                                break;
                        }
                    }
                    if (flag==0){
                        System.out.println("Attraction not found");
                    }
                    break;
                case 5:
//                    System.out.println("Logged out.");
                    return;
                default:
                    System.out.println("Invalid input. Try again");
            }
        } while (true);


        // Implement manage attractions logic
    }

    public static void manageAnimals() {
        int choice3;
        Scanner input4 = new Scanner(System.in);

        do {
            System.out.println("Manage Animals:\n" +
                    "1. Add Animal\n" +
                    "2. Update Animal Details\n" +
                    "3. Remove Animal\n" +
                    "4. Exit\n");
            choice3 = input4.nextInt();

            switch (choice3) {
                case 1:
                    Scanner scn1 = new Scanner(System.in);
                    System.out.println("Enter Animal Name:");
                    String new_animal_name=scn1.nextLine();
                    System.out.println("Enter Animal Type");
                    String new_animal_type=scn1.nextLine();
                    System.out.println("Enter Animal Description");
                    String new_animal_description=scn1.nextLine();
                    System.out.println("Enter Animal Sound");
                    String new_animal_sound=scn1.nextLine();
                    String new_animal_id = generateUniqueId("ANIMAL_");
                    if (Objects.equals(new_animal_type, "Mammal") || Objects.equals(new_animal_type, "Reptile") || Objects.equals(new_animal_type, "Amphibian")){
//                        Animal new_animal = new Mammals();
//                    } else if (Objects.equals(new_animal_type, "Reptiles")) {
////                        Animal new_animal = new Reptiles();
//                    } else if (Objects.equals(new_animal_type, "Amphibians")) {
////                        Animal new_animal = new Amphibians();
                        new_zoo.add_animal(new_animal_id,new_animal_name,new_animal_type,new_animal_description,new_animal_sound);
                    }
                    else{
                        System.out.println("invalid animal type");
                        break;
                    }



                    break;
                case 2:
                    new_zoo.modify_animal();
                    break;
                case 3:
                    System.out.print("Enter Animal Name or ID To Remove: ");
                    String input112=input4.next();
                    new_zoo.remove_animal(input112);
                    break;

                case 4:
//                    System.out.println("Logged out.");
                    return;
                default:
                    System.out.println("Invalid input. Try again");
            }
        } while (true);
        // Implement manage animals logic
    }

    public static void scheduleEvents() {
        int choice3;
        Scanner input5 = new Scanner(System.in);

        do {
            System.out.println("Schedule Events:\n" +
                    "1. Mark Attractions\n" +
                    "2. set attraction prices\n"+
                    "3. Exit\n");
            choice3 = input5.nextInt();

            switch (choice3) {
                case 1:
                    if (attractions_table.isEmpty()){
                        System.out.println("no attractions added");
                        break;
                    }
                    System.out.println("Select the attraction to change the mark of: ");
                    for(int i =0 ;i<attractions_table.size();i++){
                        System.out.println((i+1)+". "+ attractions_table.get(i).getnew_attraction_name());
                    }
                    System.out.println("Enter Selection: ");
                    Scanner scnxv = new Scanner(System.in);
                    int choice_of_mark = scnxv.nextInt();
                    if(attractions_table.get(choice_of_mark-1).isAttraction_status()){
                        System.out.println("current mark: "+"OPEN");
                    }
                    else{
                        System.out.println("current mark: "+"CLOSE");
                    }
                    System.out.println("current mark = "+attractions_table.get(choice_of_mark-1).isAttraction_status());
                    System.out.println("Enter the new mark:\n"+"1.OPEN\n"+"2.CLOSE");
                    int new_status_selection = scnxv.nextInt();
                    if (new_status_selection==1){
                        attractions_table.get(choice_of_mark-1).markAttraction_status(true);
                    }
                    else if(new_status_selection==2){
                        attractions_table.get(choice_of_mark-1).markAttraction_status(false);
                    }
                    else{
                        System.out.println("Invalid Input");
                    }
                    ;
                    break;
//                case 2:
//                    System.out.println("Select attraction to add animals to");
//                    for(int i =0 ;i<attractions_table.size();i++){
//                        System.out.println((i+1)+". "+ attractions_table.get(i).getnew_attraction_name());
//                    }
//                    Scanner scnx = new Scanner(System.in);
//                    int choice_1= scnx.nextInt();
//                    new_zoo.view_names();
//                    System.out.println("select animal to add");
//                    int choice1234= scnx.nextInt();
//                    if(choice1234<new_zoo.getmammal_count()+1){
//                        attractions_table.get(choice_1-1).addAttractionAnimal(new_zoo.getmammals_table().get(choice1234-1));
//                        System.out.println("new mammal added successfully");
//                    }
//                    else if(choice1234< (new_zoo.getreptiles_count()+ new_zoo.getmammal_count()+1)){
//                        attractions_table.get(choice_1-1).addAttractionAnimal(new_zoo.getreptiles_table().get(choice1234-1- new_zoo.getmammal_count()));
//                        System.out.println("new reptile added successfully");
//
//                    } else if (choice1234< new_zoo.getmammal_count()+ new_zoo.getreptiles_count()+ new_zoo.getamphibian_count()+1) {
//                        attractions_table.get(choice_1-1).addAttractionAnimal(new_zoo.getamphibians_table().get(choice1234-1- new_zoo.getmammal_count()- new_zoo.getreptiles_count()));
//                        System.out.println("new amphibian added successfully");
//
//                    }
//                    break;
//                case 3:
//                    System.out.println("Select attraction to remove animals from");
//                    for(int i =0 ;i<attractions_table.size();i++){
//                        System.out.println((i+1)+". "+ attractions_table.get(i).getnew_attraction_name());
//                    }
//                    Scanner scnx1 = new Scanner(System.in);
//                    int choice_11= scnx1.nextInt();
//                    new_zoo.view_names();
//                    System.out.println("Select animal to remove");
//                    int choice12341= scnx1.nextInt();
//                    if(choice12341<new_zoo.getmammal_count()+1){
//                        attractions_table.get(choice_11-1).removeAttractionAnimal(new_zoo.getmammals_table().get(choice12341-1));
//                        System.out.println("new mammal removed successfully");
//                    }
//                    else if(choice12341< (new_zoo.getreptiles_count()+ new_zoo.getmammal_count()+1)){
//                        attractions_table.get(choice_11-1).removeAttractionAnimal(new_zoo.getreptiles_table().get(choice12341-1- new_zoo.getmammal_count()));
//                        System.out.println("new reptile added successfully");
//
//                    } else if (choice12341< new_zoo.getmammal_count()+ new_zoo.getreptiles_count()+ new_zoo.getamphibian_count()+1) {
//                        attractions_table.get(choice_11-1).removeAttractionAnimal(new_zoo.getamphibians_table().get(choice12341-1- new_zoo.getmammal_count()- new_zoo.getreptiles_count()));
//                        System.out.println("new amphibian added successfully");
//
//                    }
//                    break;

                case 2:
                    if (attractions_table.isEmpty()){
                        System.out.println("no attractions added");
                        break;
                    }
                    System.out.println("Select attraction to set prices for");
                    for(int i =0 ;i<attractions_table.size();i++){
                        System.out.println((i+1)+". "+ attractions_table.get(i).getnew_attraction_name());
                    }
                    Scanner scnx11 = new Scanner(System.in);
                    int choice_111= scnx11.nextInt();
                    System.out.println("Enter price to set");
                    int price_new_attraction = scnx11.nextInt();
                    attractions_table.get(choice_111-1).setNew_attraction_price(price_new_attraction);
                    return;
                case 3:
                    return;
                default:
                    System.out.println("Invalid input. Try again");
            }
        } while (true);
        // Implement schedule events logic
    }

    public static void setDiscounts() {

        int choice4;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Set Discounts:\n" +
                    "1. Add Discount\n" +
                    "2. See Discount\n" +
                    "3. Remove Discount\n" +
                    "4. Exit\n");
            choice4 = input.nextInt();

            switch (choice4) {
                case 1:
                    Scanner scanner123 = new Scanner(System.in);
                    System.out.println("Enter discount percentage");
                    int new_discount_percentage=scanner123.nextInt();
                    System.out.println("Enter start age for the discount ");
                    int new_discount_start_age=scanner123.nextInt();
                    System.out.println("Enter end age for discount");
                    int new_discount_end_age = scanner123.nextInt();
                    String generated_discount_coupon=generateUniqueId("DISCOUNT_");
                    Discount new_discount = new Discount(generated_discount_coupon,new_discount_percentage,new_discount_start_age,new_discount_end_age);
                    discount_table.add(new_discount);
                    System.out.println("Discount added successfully with discount code: "+generated_discount_coupon);
                    break;
                case 2:
                    if (discount_table.isEmpty()){
                        System.out.println("no discounts available");
                        break;
                    }
                    System.out.println("on going discounts are: ");
                    for(int i=0;i<discount_table.size();i++){
                        System.out.println((i+1)+". "+ "Discount of "+ discount_table.get(i).getDiscount_percentage()+"%"+ " for the age criteria of "+discount_table.get(i).getStart_eligible_age()+" to "+ discount_table.get(i).getEnd_eligible_age()+ "."+"     Discount Code: "+ discount_table.get(i).getDiscount_code()+" .");
                    }

                    break;
                case 3:
                    if (discount_table.isEmpty()){
                        System.out.println("no discounts available");
                        break;
                    }
                    int flag99=0;
                    System.out.println("Enter Discount code to remove");
                    Scanner scnb= new Scanner(System.in);
                    String remove_code=scnb.nextLine();
                    for (int i=0;i<discount_table.size();i++){
                        if(Objects.equals(discount_table.get(i).getDiscount_code(), remove_code)){
                            discount_table.remove(discount_table.get(i));
                            flag99=1;
                            break;
                        }
                    }
                    if(flag99==1){
                        System.out.println("discount code removed Successfully");
                    }
                    else{
                        System.out.println("no discount code found");
                    }
                    break;

                case 4:
//                    System.out.println("Logged out.");
                    return;
                default:
                    System.out.println("Invalid input. Try again");
            }
        } while (true);
        // Implement set discounts logic
    }

    public static void setSpecialDeal() {
        int choice41;
        Scanner input1111 = new Scanner(System.in);

        do {
            System.out.println(
                    "1. Set Deal\n" +
                    "2. View Deal\n" +
                    "3. Remove Deal\n" +
                    "4. Exit\n");
            choice41 = input1111.nextInt();

            switch (choice41) {
                case 1:
                    Scanner scn1234567 = new Scanner(System.in);
                    System.out.println("Enter no of Attractions to but to set this special deal");
                    int no_of_attractions_to_apply_special_deal =scn1234567.nextInt();
                    System.out.println("Enter the discount to be offered on attractions purchase");

                    int discount_to_be_offered_on_special_deal = scn1234567.nextInt();
                    Special_Deals spc = new Special_Deals(no_of_attractions_to_apply_special_deal,discount_to_be_offered_on_special_deal);
                    Special_Deal_table.add(spc);
                    System.out.println("Special Deal Added Successfully");
                    break;
                case 2:
                    if (Special_Deal_table.isEmpty()){
                        System.out.println("no special deals available");
                        break;
                    }
                    for(int i=0;i<Special_Deal_table.size();i++){
                        System.out.println((i+1)+"Discount of "+Special_Deal_table.get(i).getDiscountToBeOfferedOnSpecialDeal()+"% on purchase of "+Special_Deal_table.get(i).getNoOfAttractionsToApplySpecialDeal()+" Attractions.");
                    }
                    break;
                case 3:
                    if (Special_Deal_table.isEmpty()){
                        System.out.println("no special deals available");
                        break;
                    }
                    for(int i=0;i<Special_Deal_table.size();i++){
                        System.out.println((i+1)+"Discount of "+Special_Deal_table.get(i).getDiscountToBeOfferedOnSpecialDeal()+"% on purchase of "+Special_Deal_table.get(i).getNoOfAttractionsToApplySpecialDeal()+" Attractions.");
                    }
                    Scanner scn765 = new Scanner(System.in);
                    System.out.println("Enter your choice for the coupon to remove");
                    int choice987 = scn765.nextInt() ;
                    Special_Deal_table.remove(Special_Deal_table.get(choice987-1));
                    System.out.println("Special Deal removed Successfully");
                    break;
                case 4:
                    return;
                default:

                    System.out.println("Invalid Input");

            }
        }while(true);
//        Scanner scn1234567 = new Scanner(System.in);
//        System.out.println("Enter no of Attractions to but to set this special deal");
//        int no_of_attractions_to_apply_special_deal =scn1234567.nextInt();
//        System.out.println("Enter the discount to be offered on attractions purchase");
//
//        int discount_to_be_offered_on_special_deal = scn1234567.nextInt();
//        Special_Deals spc = new Special_Deals(no_of_attractions_to_apply_special_deal,discount_to_be_offered_on_special_deal);
//        Special_Deal_table.add(spc);
        // Implement set special deal logic
    }

    public static void viewVisitorStats() {
        System.out.println("Total Revenue: "+total_revenue);
        System.out.println("No of new registrations"+visitor_registration_count);
        System.out.println("no of visitors today: "+ visitor_logins_count);
        if (!attractions_table.isEmpty()){
            Attractions most_popular_attraction = attractions_table.get(0);
            int most_popular_count = attractions_table.get(0).getAttraction_count();
            for (int i=0;i<attractions_table.size();i++){
                if(attractions_table.get(i).getAttraction_count()>most_popular_attraction.getAttraction_count()){
                    most_popular_attraction = attractions_table.get(i);
                    most_popular_count = attractions_table.get(i).getAttraction_count();
                }
            }
            for(int i=0;i<attractions_table.size();i++){
                if(attractions_table.get(i).getAttraction_count() == most_popular_count){
                    System.out.println("Most popular Attraction"+attractions_table.get(i).getnew_attraction_name());
                }
            }
            System.out.println("Most popular Attraction"+most_popular_attraction.getnew_attraction_name());
        }
        else{
            System.out.println("no attractions");
        }



        // Implement view visitor stats logic
    }

    public static void viewFeedback() {
            for(int i=0;i<Visitor_table.size();i++){
                System.out.println((i+1)+". "+Visitor_table.get(i).getNewVisitorFeedback());
            }
        // Implement view feedback logic
    }

    public static void visitorMenu(Visitor current_visitor) {
        int choice;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Visitor Menu:");
            System.out.println("1. Explore the Zoo");
            System.out.println("2. Buy Membership");
            System.out.println("3. Buy Tickets");
            System.out.println("4. View Discounts");
            System.out.println("5. View Special Deals");
            System.out.println("6. Visit Animals");
            System.out.println("7. Visit Attractions");
            System.out.println("8. Leave Feedback");
            System.out.println("9. Log Out");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    exploreZoo();
                    break;
                case 2:
                    buyMembership(current_visitor);
                    break;
                case 3:
                    buyTickets(current_visitor);
                    break;
                case 4:
                    viewDiscounts();
                    break;
                case 5:
                    viewSpecialDeals();
                    break;
                case 6:
                    visitAnimals();
                    break;
                case 7:
                    visitAttractions(current_visitor);
                    break;
                case 8:
                    leaveFeedback(current_visitor);
                    break;
                case 9:
                    System.out.println("Logged out.");
                    return;
                default:
                    System.out.println("Invalid input. Try again");
            }
        } while (true);
    }

    public static void exploreZoo() {
        Scanner scn123 = new Scanner(System.in);
        do {
            System.out.println("Explore the Zoo:\n" +
                    "1. View Attractions\n" +
                    "2. View Animals\n" +
                    "3. Exit\n");
            int choice76 = scn123.nextInt();

            switch (choice76) {
                case 1:
                    if (attractions_table.isEmpty()){
                        System.out.println("no attractions available");
                        break;
                    }
                    Scanner scn74  = new Scanner(System.in);
                    System.out.println("Attractions in the Zoo:\n");
                    for(int i=0;i<attractions_table.size();i++){
                        System.out.println((i+1)+". "+ attractions_table.get(i).getnew_attraction_name());
                    }
                    int description_no = scn74.nextInt();
                    System.out.println(attractions_table.get(description_no-1).getnew_attraction_Description());
                    break;
                case 2:
                    if (attractions_table.isEmpty()){
                        System.out.println("no attractions available");
                        break;
                    }
                    Scanner scn73 = new Scanner(System.in);
                    System.out.println("Animals Available in the zoo: ");
                    System.out.println("Mammals in the zoo are: ");
                    for (int i=0;i<new_zoo.getmammal_count();i++){
                        System.out.println((i+1)+". "+ new_zoo.getmammals_table().get(i).read_name());
                    }
                    System.out.println("Reptiles in the zoo are: ");
                    for (int i=0;i<new_zoo.getreptiles_count();i++){
                        System.out.println((i+1)+". "+ new_zoo.getreptiles_table().get(i).read_name());
                    }
                    System.out.println("Amphibians in the zoo are: ");
                    for (int i=0;i<new_zoo.getamphibian_count();i++){
                        System.out.println((i+1)+". "+ new_zoo.getamphibians_table().get(i).read_name());
                    }
                    break;
                case 3:

                    return;
                default:
                    System.out.println("Invalid input. Try again");
            }
        } while (true);

        // Implement explore zoo logic
    }

    public static void buyMembership(Visitor currentVisitor) {
        Scanner scn8 = new Scanner(System.in);
        System.out.println("Buy Membership:\n" +
                "1. Basic Membership (₹20)\n" +
                "2. Premium Membership (₹50)\nEnter your choice: ");
        int choice = scn8.nextInt();
        String input_discount_code_by_visitor;
//        do{
//            System.out.println("Do you want to apply discount code\n"+"1. Yes\n"+"2 .No");
//            int ch = scn8.nextInt();
//            switch (ch){
//                case 1:
//                    String input_discount_code_by_visitor = scn8.next();
//            }
//        }
//        System.out.println("Do you want to apply discount code\n"+"1. Yes\n"+"2 .No");
//        int ch = scn8.nextInt();

        System.out.println("enter discount code if any other wise type 0");
        input_discount_code_by_visitor = scn8.next();
        int Discount_percent_current=0;
        int flag=0;
        for(int i=0;i<discount_table.size();i++){
            if (Objects.equals(input_discount_code_by_visitor, discount_table.get(i).getDiscount_code())){
                if(discount_table.get(i).getStart_eligible_age()<=currentVisitor.getNewVisitorAge() && currentVisitor.getNewVisitorAge()<=discount_table.get(i).getEnd_eligible_age() ){
                    Discount_percent_current = discount_table.get(i).getDiscount_percentage();
                    System.out.println("Discount applied Successfully");
                    flag=1;
                    break;
                }
//                else{
//                    System.out.println("Discount not applicable for you");
//                }

            }

        }
        if(flag == 0){
            System.out.println("discount code invalid");
        }

        switch (choice){
            case 1:
                if(currentVisitor.getnewVisitorBalance()>=(20-(20*Discount_percent_current/100))){
                    if (Objects.equals(currentVisitor.getexperience_type(), "Basic")){
                        System.out.println("you are already a Basic member");
                    }
                    else if(Objects.equals(currentVisitor.getexperience_type(), "Premium")){
                        System.out.println("you are already a Premium member");
                    }
                    else{
                        currentVisitor.set_experience_type("Basic");

                        currentVisitor.set_visitor_balance(20-(20*Discount_percent_current/100),1);
                        total_revenue=total_revenue+20-(20*Discount_percent_current/100);
                        System.out.println("Basic membership bought successfully.Current balance: ₹"+ currentVisitor.getnewVisitorBalance());
                    }

                }
                else{
                    System.out.println("no enough balance to but this membership.Current balance: "+ currentVisitor.getnewVisitorBalance());
                }

                break;
            case 2:
                if(currentVisitor.getnewVisitorBalance()>=50-(50*Discount_percent_current/100)) {
                    if (Objects.equals(currentVisitor.getexperience_type(), "Premium")) {
                        System.out.println("you are already a Premium User");
                    } else {
                        currentVisitor.set_experience_type("Premium");
                        currentVisitor.set_visitor_balance(50-(50*Discount_percent_current/100), 1);
                        total_revenue=total_revenue+50-(50*Discount_percent_current/100);
                        System.out.println("Premium membership bought successfully.Current balance: ₹" + currentVisitor.getnewVisitorBalance());
                    }
                }
                else{
                    System.out.println("no enough balance to buy this membership. current balance: "+currentVisitor.getnewVisitorBalance());
                }
                break;
            default:
                System.out.println("invalid input");
        }

        // Implement buy membership logic
    }

    public static void buyTickets(Visitor currentVisitor) {
        if(Objects.equals(currentVisitor.getexperience_type(), "Premium")){
            System.out.println("you are a Premium user so need to purchase any ticket");

        }
        else if(Objects.equals(currentVisitor.getexperience_type(), "Basic")){
            if (attractions_table.isEmpty()){
                System.out.println("no attractions available");
                return;
            }
            System.out.println("Buy Tickets:\n" +
                    "Enter the number of tickets: ");
            Scanner scn12=new Scanner(System.in);
            int no_of_tickets_current_user = scn12.nextInt();
            int cfd=0;
            int visitor_total=0;
            for(int k =0;k<no_of_tickets_current_user;k++){

                System.out.println("Buy Tickets:\n" +
                        "Select an Attraction to Buy a Ticket:\n");
                ArrayList <Integer> attraction_table_list2 = new ArrayList<>();
                int count1=0;
                for(int i=0;i<attractions_table.size();i++){
                    if(attractions_table.get(i).isAttraction_status()){
                        System.out.println((count1+1)+". "+ attractions_table.get(i).getnew_attraction_name() + " (₹"+ attractions_table.get(i).getnew_attraction_price()+")\n");
                        attraction_table_list2.add(i+1);
                        count1++;
                    }
                }
                Scanner scnn12985 = new Scanner(System.in);
                System.out.print("Enter Your Choice: ");
                int ticket_choice1= scnn12985.nextInt();
                int ticket_choice = attraction_table_list2.get(ticket_choice1-1);
                System.out.println("Enter Discount if any else 0");
                Scanner scn187 = new Scanner(System.in);
                String discount_coupon = scn187.nextLine();
                int discount_percentage=0;
                if(!Objects.equals(discount_coupon, "0")){

                    int flag = 0;
                    for(int f=0;f<discount_table.size();f++){
                        if (Objects.equals(discount_coupon, discount_table.get(f).getDiscount_code())){
                            if(discount_table.get(f).getStart_eligible_age()<=currentVisitor.getNewVisitorAge() && currentVisitor.getNewVisitorAge()<=discount_table.get(f).getEnd_eligible_age() ){
                                discount_percentage=discount_table.get(f).getDiscount_percentage();
                                flag=1;
                                System.out.println("DISCOUNT APPLIED SUCCESSFULLY");
                                break;

                            }


                        }

                    }
                    if (flag == 0){
                        System.out.println("DISCOUNT COUPON INVALID");
                    }
                }




                if((attractions_table.get(ticket_choice-1).getnew_attraction_price()-(attractions_table.get(ticket_choice-1).getnew_attraction_price()*discount_percentage/100))<currentVisitor.getnewVisitorBalance()){
                    attractions_table.get(ticket_choice-1).setAttraction_count(1);
                    currentVisitor.buy_ticket(attractions_table.get(ticket_choice-1),1);
                    currentVisitor.set_visitor_balance(attractions_table.get(ticket_choice-1).getnew_attraction_price()-(attractions_table.get(ticket_choice-1).getnew_attraction_price()*discount_percentage/100),1);
                    visitor_total=visitor_total+attractions_table.get(ticket_choice-1).getnew_attraction_price()-(attractions_table.get(ticket_choice-1).getnew_attraction_price()*discount_percentage/100);
                    total_revenue=total_revenue+attractions_table.get(ticket_choice-1).getnew_attraction_price()-(attractions_table.get(ticket_choice-1).getnew_attraction_price()*discount_percentage/100);
                    System.out.println("The ticket for " + attractions_table.get(ticket_choice-1).getnew_attraction_name() + " was purchased successfully. "+ "Your current balance is ₹"+currentVisitor.getnewVisitorBalance()+".");
                }
                else{
                    System.out.println("No enough balance");
                    System.out.println("Current balance: "+ currentVisitor.getnewVisitorBalance());
                    cfd=1;
                    break;
                }
            }
            if (cfd !=1){
                int result=-1;
                for(int ga = 0;ga<Special_Deal_table.size();ga++){
                    if(Special_Deal_table.get(ga).getNoOfAttractionsToApplySpecialDeal()<=no_of_tickets_current_user && (result == -1 || Special_Deal_table.get(ga).getNoOfAttractionsToApplySpecialDeal()>=Special_Deal_table.get(result).getNoOfAttractionsToApplySpecialDeal())){
                        result=ga;
                    }
                }
                int special_discount_amount=0;
                if (result != -1) {
                    special_discount_amount = Special_Deal_table.get(result).getDiscountToBeOfferedOnSpecialDeal();
                }
                if (visitor_total*special_discount_amount/100 !=0){
                    currentVisitor.add_visitor_balance(visitor_total*special_discount_amount/100,1);
                    System.out.println("cashback amount due to Special Discount : "+visitor_total*special_discount_amount/100);
                    System.out.println("Balance after cashback: "+currentVisitor.getnewVisitorBalance());
                    total_revenue=total_revenue-visitor_total*special_discount_amount/100;
                }


            }



        }
        else{
            System.out.println("No membership plans bought yet");
        }

        // Implement buy tickets logic
    }

    public static void viewDiscounts() {
        if (discount_table.isEmpty()){
            System.out.println("no discounts available");
            return;
        }
        System.out.println("currently available discounts are: " );
        for(int i=0;i<discount_table.size();i++){
            System.out.println((i+1)+". "+ discount_table.get(i).getDiscount_percentage() + "for age criteria of "+ discount_table.get(i).getStart_eligible_age() + " to "+ discount_table.get(i).getEnd_eligible_age()+ " ." + "Discount code: "+ discount_table.get(i).getDiscount_code());
        }
        // Implement view discounts logic
    }

    public static void viewSpecialDeals() {
        if (Special_Deal_table.isEmpty()){
            System.out.println("no special deals available");
            return;
        }
//        System.out.println("Enter no Special Deal: ");
        for(int i=0;i<Special_Deal_table.size();i++){
            System.out.println((i+1)+"Discount of "+Special_Deal_table.get(i).getDiscountToBeOfferedOnSpecialDeal()+"% on purchase of "+Special_Deal_table.get(i).getNoOfAttractionsToApplySpecialDeal()+" Attractions.");
        }


        // Implement view special deals logic
    }

    public static void visitAnimals() {
        System.out.println("Select the animal to visit");
        new_zoo.view_names();
        Scanner scanner1 = new Scanner(System.in);
        int selectionu = scanner1.nextInt();
        if(selectionu<new_zoo.getmammal_count()+1){
            System.out.println("1. feed animal\n2. read about animal");
                        Scanner scnrt = new Scanner(System.in);
                        int chqu = scnrt.nextInt();
                        if(chqu == 1){
                            System.out.println(new_zoo.getmammals_table().get(selectionu-1).feed_animal());
                        }
                        else if(chqu == 2){
                            System.out.println(new_zoo.getmammals_table().get(selectionu-1).reading());

                        }
                        else{
                            System.out.println("Invalid input");
                        }
//                        attractions_table.get(selectionu-1).addAttractionAnimal(new_zoo.getmammals_table().get(selectionu-1));
//                        System.out.println("new mammal added successfully");
                    }
        else if(selectionu< (new_zoo.getreptiles_count()+ new_zoo.getmammal_count()+1)){


            System.out.println("1. feed animal\n2. read about animal");
            Scanner scnrt = new Scanner(System.in);
            int chqu = scnrt.nextInt();
            if(chqu == 1){
                System.out.println(new_zoo.getreptiles_table().get(selectionu-1- new_zoo.getmammal_count()).feed_animal());
            }
            else if(chqu == 2){
                System.out.println(new_zoo.getreptiles_table().get(selectionu-1- new_zoo.getmammal_count()).reading());

            }
            else{
                System.out.println("Invalid input");
            }
//                        attractions_table.get(selectionu-1).addAttractionAnimal(new_zoo.getreptiles_table().get(selectionu-1- new_zoo.getmammal_count()));
//                        System.out.println("new reptile added successfully");

                    }
        else if (selectionu< new_zoo.getmammal_count()+ new_zoo.getreptiles_count()+ new_zoo.getamphibian_count()+1) {

            System.out.println("1. feed animal\n2. read about animal");
            Scanner scnrt = new Scanner(System.in);
            int chqu = scnrt.nextInt();
            if(chqu == 1){
                System.out.println(new_zoo.getamphibians_table().get(selectionu-1- new_zoo.getmammal_count()- new_zoo.getreptiles_count()).feed_animal());
            }
            else if(chqu == 2){
                System.out.println(new_zoo.getamphibians_table().get(selectionu-1- new_zoo.getmammal_count()- new_zoo.getreptiles_count()).reading());

            }
            else{
                System.out.println("Invalid input");
            }
//                        attractions_table.get(selectionu-1).addAttractionAnimal(new_zoo.getamphibians_table().get(selectionu-1- new_zoo.getmammal_count()- new_zoo.getreptiles_count()));
//                        System.out.println("new amphibian added successfully");

                    }
        // Implement visit animals logic
    }

    public static void visitAttractions(Visitor currentVisitor) {
        if (attractions_table.isEmpty()){
            System.out.println("no attractions available");
            return;
        }
        Scanner scn87 =new Scanner(System.in);
        int count=0;
        ArrayList <Integer> attraction_table_list = new ArrayList<>();
        for(int k=0;k<attractions_table.size();k++){
            if(attractions_table.get(k).isAttraction_status()){
                System.out.println((count+1)+". "+attractions_table.get(k).getnew_attraction_name());
                attraction_table_list.add(k);
                count++;
            }

        }
        System.out.println("Select Attraction no to visit");
        int attraction_choice_visit = scn87.nextInt();
        int attraction_table_to_visit=attraction_table_list.get(attraction_choice_visit-1);
        int flag54=0;
        for (int j=0;j<currentVisitor.tickets_bought.size();j++){
            if(Objects.equals(attractions_table.get(attraction_table_to_visit).getnew_attraction_name(), currentVisitor.tickets_bought.get(j).getnew_attraction_name())){
                flag54=1;
                Attractions atr = currentVisitor.tickets_bought.get(j);
                currentVisitor.tickets_bought.remove(atr);

                break;
            }
        }
        if(flag54==1){

            System.out.println("Attraction Visited Successfully");
        }
        else{
            System.out.println("No tickets bought for such attraction");
        }
        // Implement visit attractions logic
    }

    public static void leaveFeedback(Visitor currentVisitor) {
        System.out.println("Enter your feedback:");
        Scanner scn2 = new Scanner(System.in);
        for(int i=0;i<Visitor_table.size();i++){
            if(Visitor_table.get(i)==currentVisitor){
                Visitor_table.get(i).set_feedback(scn2.nextLine());
            }
        }
        // Implement leave feedback logic
    }
}
