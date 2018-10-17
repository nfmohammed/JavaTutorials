package tutorials.abfa.inheritance;

public class Test {

  public static void main(String[] args) {
    Child c = new Child();
    System.out.println(c.eyeColor); //Childs eyecolor is same as Parent
    System.out.println(c.lastName); //Childs lastname is same as Parent
    c.firstName  = "Michael";
    System.out.println(c.firstName);
    c.singASong(); //Child can sing the same song as Parent can.
  }

}
