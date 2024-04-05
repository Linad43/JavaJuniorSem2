public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
        this.name = name;
        System.out.println("Create Cat");
    }
    public int getAge(){
        return age;
    }
    private void makeSound(){
        System.out.println("meu");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
