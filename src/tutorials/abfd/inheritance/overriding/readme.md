#### Method Overriding

- https://www.tutorialspoint.com/java/java_overriding.htm

- In the previous chapter, we talked about superclasses and subclasses. If a class inherits a method from its superclass, then there is a chance to override the method provided that it is not marked final.
  
- The benefit of overriding is: ability to define a behavior that's specific to the subclass type, which means a subclass can implement a parent class method based on its requirement.
  
- In object-oriented terms, overriding means to override the functionality of an existing method.


#### Rules for Method Overriding

- The argument list should be exactly the same as that of the overridden method.

- The return type should be the same or a subtype of the return type declared in the original overridden method in the superclass.

- The access level cannot be more restrictive than the overridden method's access level. For example: If the superclass method is declared public then the overridding method in the sub class cannot be either private or protected.

- Instance methods can be overridden only if they are inherited by the subclass.

- A method declared final cannot be overridden.

- A method declared static cannot be overridden but can be re-declared.

- If a method cannot be inherited, then it cannot be overridden.

- A subclass within the same package as the instance's superclass can override any superclass method that is not declared private or final.

- A subclass in a different package can only override the non-final methods declared public or protected.

- An overriding method can throw any uncheck exceptions, regardless of whether the overridden method throws exceptions or not. However, the overriding method should not throw checked exceptions that are new or broader than the ones declared by the overridden method. The overriding method can throw narrower or fewer exceptions than the overridden method.

- Constructors cannot be overridden.

