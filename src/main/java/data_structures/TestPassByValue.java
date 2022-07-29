package data_structures;

public class TestPassByValue {

  public static void main(String[] args) {
    Dog dog = new Dog("Max");

    System.out.println("first = " + dog);
    changeDog(dog);
    System.out.println(dog.name);


    String a = "1";
    changeString(a);
    System.out.println(a);
  }

  private static void changeString(String a) {
    a = "100";
  }

  private static void changeDog(Dog dog) {
    dog = null;
  }
}
