public class App {
    public static void main(String[] args) {
        
        //create an object of Person class
        Person obj1 = new Person();
        // obj1.name = "John";
        // obj1.age = 23;
        // obj1.address = "ABC";
        // obj1.contactNumber = "0123456789";

       

        // System.out.println(obj1.name);
        // System.out.println(obj1.age);
        // System.out.println(obj1.address);
        // System.out.println(obj1.contactNumber);

        obj1.setName("Bob");
        obj1.showName();

        String personName = obj1.getName();
        System.out.println(personName);
        System.out.println(obj1.getName());

    }
}


//Define a Person class to store name, age, address, contactnumber


 
