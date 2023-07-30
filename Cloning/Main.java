package org.codewithease.javatopics.Cloning;

public class Main {
        public static void main(String[] args) throws CloneNotSupportedException {
            Address address = new Address("kolkata");
            Person person1 = new Person("Varsha",address );
            Person person2 = (Person) person1.clone();

            person2.address.setCity("mumbai");
            System.out.println(person1);
            System.out.println(person2);



        }

}
