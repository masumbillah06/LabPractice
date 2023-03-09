package EMP;

public class Main {
    public static void main(String[] args) {

        AddressInfo Add1 = new AddressInfo("YKSG-2 Hall, DIU", "Ashulia", "Dhaka", "0000");
        InsuranceInfo Ins1 =new InsuranceInfo("Life Insurance", 456);
        Employee Emp1 =new Employee("Masum Billah",Add1, Ins1 );

        Emp1.display();
    }
}
