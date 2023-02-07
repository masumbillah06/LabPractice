// Lab_05-02-2023

public class Box {

    int ht,wt,lt;
    void display(){

        int ara = ht*wt*lt;
        System.out.println(ara);
    }
    static int area(int h, int w,int l){
        int ar = h*w*l;
        return ar;
    }
    static int area(int l, int w){
        int area = w*l;
        return area;
    }
    public static void main(String[] args) {
        Box ob = new Box();

        ob.ht=5;
        ob.wt=4;
        ob.lt=8;

        int a1 = area(ob.lt , ob.wt);
        System.out.println(a1);

        int a2 = area(ob.ht, ob.wt, ob.lt);
        System.out.println(a2);

        ob.display();
    }

}
