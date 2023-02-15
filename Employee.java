public class Employee {

    private int var;

    public Employee(){
        this.var = 10;
    }

    public Employee(int num) {
        this.var = num;
    }

    public int getvar()
    {
        return var;
               }
    public static void main(String[] args)

    {
        Employee obj=new Employee();
        Employee obj1=new Employee(100);

        System.out.println("var is:  "+obj1.getvar());
        System.out.println("var is:  "+obj.getvar());
    }

}
