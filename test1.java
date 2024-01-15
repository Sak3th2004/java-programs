class test1
{
    int a;
    int b;
    test1(int c , int d)
    {
        this.a=c;
        this.b=d;

    }
    void display()
    {
        System.out.println("Value of a is : "+a+" b="+b);
    
    }
    public static void main(String[] args){
        test1 object = new test1(10,20);
        object.display();
    }
}
