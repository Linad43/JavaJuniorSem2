public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
        System.out.println("Create Dog");
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
