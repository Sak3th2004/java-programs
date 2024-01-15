class test5{
    void display()
    {
        this.show();
        System.out.println("inside display function");
    }
    void show()
    {
        System.out.println("inside show function");
    }
    public static void main(String[] args) {
        test5 t1 = new test5();
        t1.display();

    }
}
