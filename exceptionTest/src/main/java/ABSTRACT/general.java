package ABSTRACT;

public class general {
    protected Integer i;
    protected String s;

    //构造方法记得要带上，访问修饰符，特别是挎包运行
    public general(){

    }
    public general(int i,String ss){
        this.i = i;
        this.s = ss;
    }

    //普通类验证
    public void show(){
        System.out.println(this.i + " " +this.s);
    }
}


//一个类文件 只有一个公共类可以被外部访问，其他类要么成为成员类，可以被访问
//要那么就是类外类，只能在本文件中被访问
class  tttt{
    Integer i;
}
