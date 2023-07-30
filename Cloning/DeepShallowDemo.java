package org.codewithease.javatopics.Cloning;

    class Person implements Cloneable {
         String name;
        Address address; // Non-primitive field

        public Person(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return "Person [name=" + name + ", address=" + address + "]";
        }



    }
class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address [city=" + city + "]";
    }
}








