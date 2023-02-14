public class Employee {
    int emplyid;
    String name;
    Employee(String x, int y){
        this.name = x;
        this.emplyid = y;
    }
    void info(){
        System.out.println("Name: "+name);
        System.out.println("Employee Id: "+emplyid);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Masum Billah", 5571);

        emp1.info();
    }
}