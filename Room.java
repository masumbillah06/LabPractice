public class Room {

    int roomNo;
    String roomType;
    float roomArea;
    boolean AcMechine;
    public Room(){
        System.out.println("An Object of Room class is created.");
    }
    public Room(int x, String s, float ar, boolean b){
        this.roomNo = x;
        this.roomType = s;
        this.roomArea = ar;
        this.AcMechine = b;
    }
    public void display(){
        System.out.println("Room No : "+roomNo);
        System.out.println("Room Type : "+roomType);
        System.out.println("Room Area : "+roomArea);
        System.out.println("Ac is on : "+AcMechine);
    }
    
}
