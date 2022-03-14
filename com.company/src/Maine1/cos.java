package Maine1;

import java.security.Key;

public class cos {
    public static void main(String[] args) {
    score s1=new score();
    Test1 test1 = new Test1();
    Test1 test2 = new Test1();
    Test1 test3 = new Test1();
    s1.scorehand();
    s1.scorehands();

        //实例变量
        System.out.println(test1.statects);
        //静态变量
        System.out.println(test1.statect);
    }
}
//函数的作用域
class score{
    int num1 = 30;
    int num2 = 10;
    public void scorehand(){
        int sum = num1 + num2;
        System.out.println("num1+num2="+sum);
    }

    public void scorehands(){
        int sif = num1 - num2;
        System.out.println("num3-num4="+sif);
    }
}
class Test1{
    static int statect = 0;
    int statects = 0;
    Test1(){
        statect ++;
        statects ++;
        System.out.println("静态变量执行次数="+statect+"实例变量执行次数="+statects);
    }
}
class initalization
{
    int num1;
    int num2;
    public void initalization(){
        int num3 = 10;
        int num4 = 10;
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num1);
        System.out.println(num2);
    }
}