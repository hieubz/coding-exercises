package core;

public class VNDog extends Dog {
  String name;

  public VNDog(int age, String name) {
    super(age);
    this.name = name;
  }
  
  


  public static void main(String[] args) {
    Dog dog = new VNDog(10, "ll");
    VNDog c = (VNDog) dog;
    System.out.println(c.name);

  }
}
