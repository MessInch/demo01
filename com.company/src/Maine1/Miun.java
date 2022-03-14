package Maine1;
class a{
    public void show(){
        System.out.println("int a");
    }
}
class b extends a{
    public void show1(){
        System.out.println("int b");
    }
}
public class Miun {
    public static void main(String[] args) {
        b obji = new b();
        obji.show();
    }
}
