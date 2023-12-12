package com.company.patterns.builder;

public class Person {
    private String name;
    private Integer age;
    private String address;
    private String phone;

    private Person() {}

    public String getName(){
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class Builder {
        private Person person = new Person();

        public Builder setName(String name) {
            person.name = name;
            return this;
        }

        public Builder setAge(Integer age) {
            person.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            person.address = address;
            return this;
        }

        public Builder setPhone(String phone) {
            person.phone = phone;
            return this;
        }

        public Person build() {
            return person;
        }
    }

    public static class BuilderPatternExample {
        public static void main(String[] args) {
            var person = new Person.Builder()
                    .setName("Kenan")
                    .setAge(22)
                    .setAddress("sssss")
                    .setPhone("787871245")
                    .build();

            System.out.println(person);
        }
    }
}
