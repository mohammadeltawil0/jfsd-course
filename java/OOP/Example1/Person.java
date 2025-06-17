public class Person {
    private String name;
    // int age;
    // String address;
    // String contactNumber;

    public void setName(String newname)
    {
        name = newname;
    }

    public void showName(){
        System.out.println("Name : "  + name);
    }

    public String getName(){
        return name;
    }
}
