package main;

public class Hello {

  private final String name;

  public Hello(String name) {
    this.name = name;
  }

  public void sayHi() {
    for (int i=0; i<5; i++) {
      System.out.println(String.format("Hello, %s!", name));
    }
  }
}

