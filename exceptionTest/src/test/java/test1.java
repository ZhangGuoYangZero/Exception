import ABSTRACT.general;
import org.junit.jupiter.api.Test;
import ABSTRACT.AbstractT;

import java.io.PrintWriter;

public class test1 {

    @Test
    public  void  test1(){
     /*
     抽象类无法实例化
      new AbstractT(5,"2");*/

   /*
   不走定义的无参构造
    AbstractT abstractT =  new AbstractT(5,"55"){
    没有什么可以重写的，但是也可以自己重写
    };
    如果是protected这里就访问不了
    abstractT.show();
    */
    /*
    来重写一下，非抽象方法
    * */
    AbstractT abstractT = new AbstractT(5,"55") {
        @Override
        public void show() {
            //super.show(); 如果不注释a这个，会自动调用父类的show方法
            System.out.println("this is son show method");
            //如果拿不到父类的成员，就是property没有变成protected 或者public
            System.out.println(this.i+ 2 + " " + this.s);
        }
    };

    abstractT.show();


    }



    @Test
    public  void  test2(){
    /*    general general1 = new general(9,"99"){

        };

        general1.show();*/
        int b = 91;
        // 以前的 new xx() 这是一个对象
        //   new xx(){  } 这是一个无参的匿名子类
        new  general(9,"99"){
            //自然也可以拿到外面的值
            int a = b;
            @Override
            public void show() {
                PrintWriter pw = new PrintWriter(System.out);
                pw.write("this is general show method" + '\n');
                pw.write( this.i + 2 + " " + this.s);
                System.out.println(a);
                pw.flush();

            }
        }.show();

    }
}
