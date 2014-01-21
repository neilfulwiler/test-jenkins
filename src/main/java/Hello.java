package main;

public class Hello {

  private final String name;

  public Hello(String name) {
    this.name = name;
  }

  public void sayHi() {
    System.out.println(String.format("Hello, %s!", name));
  }
}

