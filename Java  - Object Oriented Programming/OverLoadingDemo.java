package MethodOverLoading;

class OverloadDemo
{
    public void display(char c)
    {
        System.out.println(c);
    }
    public void display(char c,int num)
    {
        System.out.println(c + " " + num);
    }
}

public class OverLoadingDemo{
    public static void main(String args[]){
        OverloadDemo obj = new OverloadDemo();
        obj.display('a');
        obj.display('b',0);
    }
}