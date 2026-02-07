public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name);
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Adult: " + (age >= 18));
        System.out.println("Name length: " + name.length());
        System.out.println("Uppercase name: " + name.toUpperCase());
    }

    public void changeName(String newName) {
        if (newName != null && newName.length() > 0) {
            this.name = newName;
        }
    }

    public void celebrateBirthday() {
        age = age + 1;
        System.out.println(name + " is now " + age + " years old");
    }
}
