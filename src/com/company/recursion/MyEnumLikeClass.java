package com.company.recursion;

public class MyEnumLikeClass {
  public static final MyEnumLikeClass VALUE1 = new MyEnumLikeClass("Value 1");
  public static final MyEnumLikeClass VALUE2 = new MyEnumLikeClass("Value 2");
  public static final MyEnumLikeClass VALUE3 = new MyEnumLikeClass("Value 3");

  private final String name;

  private MyEnumLikeClass(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public static MyEnumLikeClass[] values() {
    return new MyEnumLikeClass[]{VALUE1, VALUE2, VALUE3};
  }

  public static MyEnumLikeClass valueOf(String name) {
    if (VALUE1.name.equals(name)) {
      return VALUE1;
    } else if (VALUE2.name.equals(name)) {
      return VALUE2;
    } else if (VALUE3.name.equals(name)) {
      return VALUE3;
    }
    throw new IllegalArgumentException("No such value: " + name);
  }

  // Example usage
  public static void main(String[] args) {
    MyEnumLikeClass myValue = MyEnumLikeClass.VALUE1;
    System.out.println(myValue.getName());

    for (MyEnumLikeClass value : MyEnumLikeClass.values()) {
      System.out.println(value.getName());
    }

    MyEnumLikeClass parsedValue = MyEnumLikeClass.valueOf("Value 2");
    System.out.println(parsedValue.getName());
  }
}

