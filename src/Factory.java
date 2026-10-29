import org.w3c.dom.ls.LSOutput;

public class Factory {
    //instance
    public Donuts donutOrder1;
    public Donuts donutOrder2;
    public boolean isOpen=true;
    public int yearFounded=2026;
    public int RandomNumber;
    public int randomnumber2;
    //todo make a new donut called DonutsOrder2onlu do the mononilpy box creation not constructpr
    public static void main() {
        Factory f=new Factory();
    }
    public Factory(){
        System.out.println("Welcome to the factory");
        System.out.println("the factory was founded in ");
        System.out.println(yearFounded);
        System.out.println("happy" + isOpen+ "the factory is open");

        RandomNumber= (int)(Math.random()*100)+1;//range1-100 donuts
        randomnumber2=(int)(Math.random()*45+1);

        //make an object type of dounts
        donutOrder1= new Donuts();
        donutOrder1.numOfDonuts=donutOrder1.numOfDonuts+1;
        System.out.println(donutOrder1.numOfDonuts);

        System.out.println("Each back of donuts comes with"+donutOrder1.numOfDonuts+"");

        System.out.println(donutOrder1.hasfilling);

        //todo:print all of the instance varables
        //mkae seconf orderhvae a range of 1-45
        donutOrder2= new Donuts( 6);
        donutOrder1.numOfDonuts=donutOrder1.numOfDonuts+2;
        System.out.println(donutOrder2.numOfDonuts);
        System.out.println(donutOrder2.hasfilling);
        System.out.println("forsting type is"+ donutOrder2.frostingType);
        //donutOrder2.numOfDonuts=donutOrder1.numOfDonut*2

        //class->blue print
        //object->the house

        donutOrder2.printInfo();



    }


}
