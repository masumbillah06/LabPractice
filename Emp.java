package EMP;

public class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String n,Address add) {
        this.id = id;
        this.name = n;
        this.address=add;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Address Add1 = new Address("Dhaka","YKSG_2 hall","Bangladesh");
        Address Add2 = new Address("Dhaka","Dopta Para","Bangladesh");

        Emp E1=new Emp(0055,"varun",Add1);
        Emp E2=new Emp(0056,"arun",Add2);

        E1.display();
        E2.display();

    }
}
