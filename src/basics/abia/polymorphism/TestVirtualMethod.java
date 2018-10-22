package basics.abia.polymorphism;


public class TestVirtualMethod {

  public static void main(String [] args) {
    Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
    Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
    System.out.println("Call mailCheck using Salary reference --");

    s.mailCheck();//  Compiler sees mailCheck() in the Salary class at compile-time and
                  //  JVM invokes mailCheck() in the Salary class at run-time

    System.out.println("\n Call mailCheck using Employee reference--");
    e.mailCheck();//  Compiler sees mailCheck() in the Employee class at compile-time BUT
                  //  JVM invokes mailCheck() in the Salary class at run-time
  }
}
