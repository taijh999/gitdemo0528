package demo1023;

public class MyClass {

    public static void main(String[] args){

        String test1 = "";
        String test2 = null;
        /***还未为其分配空间,所以不可用**/
        String test3;
        String test4 = new String();

        if(test1.isEmpty()){
            System.out.println("1-test1 is empty");
        }

        if(test1 == null){
            System.out.println("2-test1 is null");
        }

        /***
         * NullPointException
         * **/
        /**
        if(test2.isEmpty()){
            System.out.println("3-test2 is empty");
        }***/

        if(test2 == null){
            System.out.println("4-test2 is null");
        }

        /**
         * 由于test3，其并未初始化，
         * 所以系统并不会为其分配空间，
         * 也就表明其并不存在内存中，
         * 所以在这里就无法进行测试，故略之...
         * **/

        if(test4.isEmpty()){
            System.out.println("5-test4 is empty");
        }

        if(test4 == null){
            System.out.println("6-test4 is null");
        }

    }

}
/*--------------------- 
作者：drinkingcode 
来源：CSDN 
原文：https://blog.csdn.net/u010661782/article/details/51366422 
版权声明：本文为博主原创文章，转载请附上博文链接！*/