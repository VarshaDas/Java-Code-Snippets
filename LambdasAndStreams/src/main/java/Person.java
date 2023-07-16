
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name,int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && age == person.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.getName());
    }



    public static void main(String[] args) {
        Person person1 = new Person("John", 23);
        Person person2 = new Person("John",25);
        System.out.println(person1.compareTo(person2));
        System.out.println(person1.equals(person2));


    }
}


