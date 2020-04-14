package JavaAssignment6;

public class constructorChaining {
    public constructorChaining(int argument1,int argument2){
        this(1,2,3);
    }
    public constructorChaining(int argument1,int argument2,int argument3){
        System.out.println(argument1+" "+argument2+" "+argument3);
    }
    public constructorChaining(String str){
        System.out.println(str);
    }

    public static void main(String[] args){
        constructorChaining constructor[]=new constructorChaining[10];
        constructor[0]=new constructorChaining(9,8);
        constructor[1]=new constructorChaining("hello world");




    }
}
