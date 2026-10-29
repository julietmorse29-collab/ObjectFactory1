public class Donuts{

//class blur prints for the things we want to make

    //instance variables
//todo: make the three comments into a variable. Think about the data type
//frosting type
    public String frostingType;
//is  there filling
    public boolean hasfilling;
//how ment donuts
    public int numOfDonuts;



    //making a constructor of donuts-name of constructor has to be the name of the class
    //has to fallow the name of the java class
    //dont write void
    public Donuts(int pNumberOfDonuts){
        frostingType="Boston Cream";
        hasfilling=true;
        numOfDonuts= pNumberOfDonuts;


    }//end of constructor
    public void printInfo(){
        System.out.println("the frosting type of this donut is"+frostingType);
        System.out.println("and the filling is"+hasfilling);
        System.out.println("and the amount of donuts are" +numOfDonuts);



    }
}//end of class donuts
