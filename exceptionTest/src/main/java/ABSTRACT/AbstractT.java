package ABSTRACT;

public abstract class AbstractT {
    protected Integer i;
    protected String s;
    //构造方法记得要带上，访问修饰符，特别是挎包运行
    public AbstractT(){

    }
    public AbstractT(int i,String ss){
        this.i = i;
        this.s = ss;
    }

    //不包含抽象方法的抽象类
    public void show(){
        System.out.println(this.i + " " +this.s);
    }
}
