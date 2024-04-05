import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
Создайте абстрактный класс "Animal" с полями "name" и "age"
Реализуйте два класса-наследника от "Animal" (например "Dog" и "Cat") с уникальными полями и методами.
Создайте массив обектов типа "Animal" и с использованием Reflection API выполните следующие действия
выведите на экранинформацию о каждом обьекте
Вызовите метод "makeSound()" у каждого обьекта если он есть
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //Class<?> animal = Animal.class;
        Class<?> dogs = Class.forName("Dog");
        Constructor<?>[] constructorDog = dogs.getConstructors();
        Class<?> cats = Class.forName("Cat");
        Constructor<?>[] constructorCat = cats.getConstructors();

        Object[] animals = {
                constructorDog[0].newInstance("New Dog", 2),
                constructorCat[0].newInstance("New Cat", 1),
                constructorDog[0].newInstance("New Dog2", 3),
                constructorCat[0].newInstance("New Cat2",4)};

        System.out.println();

        for (Object animal : animals)
        {
            System.out.println(animal.toString());
            Class<?> i = animal.getClass();
            Field[] fieldAll = animal.getClass().getFields();

            //Как получить доступ до родительского защищенного параметра я не понял

            for (Field field : fieldAll)
            {
                field.setAccessible(true);
                System.out.println("Field = " + field.getName() + " : " + field.get(animal));
            }

        }
        System.out.println();
        for (Object animal : animals)
        {
            System.out.println(animal);
            Method[] methods = animal.getClass().getDeclaredMethods();
            for (Method method : methods)
            {
                System.out.println("Method = " + method.getName());
            }
        }


        //System.out.println(animal);
        /*Animal[] animal2 = {new Dog("dog1", 2), new Cat("cat1", 1)};
        System.out.println(animal2.length);*/
        }
    }
