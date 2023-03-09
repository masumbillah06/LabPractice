package Lab_07_03;

public class Volvo extends Car {
    double price;
    String productionYear;
    String regNum;
    Engine eg;
    Dashboard D;
    public Volvo(double price, String productionYear, String registrationNumber, Engine eng, Dashboard db)
    {
        this.price=price;
        this.productionYear=productionYear;
        this.regNum=registrationNumber;
        this.eg=eng;
        this.D=db;
    }
    public void checkBattery() {
        System.out.println("Checking battery");
    }
    public void changeFuel()
    {
        System.out.println("Changing Fuel");
    }
}
