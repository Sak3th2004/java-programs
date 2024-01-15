class test2
{
    int a;
    int b;
    test2()
    {
        this(10,20);
        System.out.println("inside defult constructer\n");

    }
    test2(int a , int b)
    {
        this.a=a;
        this.b=b;
        System.out.println("inside parameterized constructor \n");
    }
    public static void main(String[] args){
        test2 object=new test2();
    }
}
