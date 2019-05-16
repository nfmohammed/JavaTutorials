package basics.java22.abstract_class;

/**
 * Created by nmohammed on 2/24/17.
 */
public class Test {

  public static void main(String[] args) {

    SubClass1 sc1 = new SubClass1();
    SubClass2 sc2 = new SubClass2();

    sc1.draw(); //invoking draw method on sub-class
    sc1.getCompany(); //public method on Parent Class is accessible to Sub-Class

    sc2.draw();
    sc2.getCompany();


    //Now we will define new subclass but give the object type as that of extended Class
    System.out.println();
    System.out.println("Declaring object type as extended type......");
    AbstractClass sc3 = new SubClass1();
    AbstractClass sc4 = new SubClass2();

    AbstractClass[] abstractArray = new AbstractClass[2];
    abstractArray[0] = sc3;
    abstractArray[1] = sc4;

    for(AbstractClass ab: abstractArray){
      ab.draw();
      ab.getCompany();
    }
  }
}
