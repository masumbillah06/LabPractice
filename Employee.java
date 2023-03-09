package EMP;

public class Employee {
    String name;
    AddressInfo Address;
    InsuranceInfo Insurance;
    public Employee(String name, AddressInfo add, InsuranceInfo ins)
    {
        this.name=name;
        this.Address=add;
        this.Insurance=ins;

    }
    public void display()
    {
        System.out.println("Name of Employee : "+this.name);
        System.out.println("Address of Employee: "+ Address.street+", "+Address.city+", "+ Address.state+", "+Address.postalCode);
        System.out.println("Insurance information: "+ Insurance.policyName+", "+Insurance.policyId);
    }

}
