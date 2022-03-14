package Maine1;
import java.nio.charset.MalformedInputException;
class superman {
    //等级
    private int level;
    //名字
    private String name;
    public superman(int lvl) {
    }
    //无参构造函数
    void superman(int lvl) {
        System.out.println("在构建超人");
        this.name = "superman";
        this.level = lvl;
    }
    public int getLevel() {
        return level;
    }
    static class laserman extends superman {
        private int numbercharges;
        //无参构造函数
        public laserman(int lvl) {
            super(lvl);
            System.out.println("在构造函数");
            numbercharges = 100;
        }
        public int getNumbercharges() {
            return numbercharges;
        }
    }
    public static class Maine {
        public static void main(String[] args) {
            laserman laserman = new laserman(2);
            System.out.println("level" + laserman.getLevel());
            System.out.println("charges=" + laserman.getNumbercharges());
        }
    }
}