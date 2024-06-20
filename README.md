# Design Patterns

Design Patterns - GoF

1) Creation
- Abstract Factory: A contract for a factory (multiple factories). You build the object related at runtime.
  * When there are multiple related product families and you want to ensure that products within a family are used together.
  * Defines multiple factory methods to create a variety of related products.
- Factory Method: Define an interface to create the object, allowing the subclass to decide which instance should be created.
  * When there is a single product family and you want to allow subclasses to decide how to instantiate the products)
  * Defines a single factory method that subclasses implement to create specific instances.
- Singleton: Ensure that the class has only one instance and provide a unique access point to it.
- Prototype: Allow copying of an existing object.
- Builder: Allow building an object step-by-step, in a controlled and customized manner.
