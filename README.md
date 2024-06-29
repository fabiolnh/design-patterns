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

2) Structure
- Adapter: It is used to adapt an existent class, but the interface does not correpond to the interface that we need.
  * Usually we use to integrate legacy systems with new systems.
  * Commonly found in persistence frameworks (such as Hibernate) to adapt methods from different database APIs, in payment systems to integrate new gateways with existing systems, and in mobile applications to adapt different device APIs.
- Bridge: Separates abstraction from implementation, allowing both to vary independently. It is useful when you want to avoid a complex class hierarchy by combining two dimensions of variation.
  * Commonly found in home automation systems, where different devices need to be controlled in various ways
- Composite: It allows individual objects and compositions of objects to be treated in a uniform manner. It allows you to create a tree-like structure to represent object hierarchies
  * Commonly found in file management
- Decorator: Allows you to add behavior to objects individually, without affecting the behavior of other objects in the same class. Useful for adding functionality to objects in a flexible and dynamic way.
  * Involves creating a series of decoration classes that are used to wrap concrete component classes.
  * Commonly used in Custom Coffee Systems, E-Commerce, Notification Systems, and Log Frameworks.
- Facade: Provides a simplified interface to a complex subsystem. It is useful for hiding the complexity of a system and providing a simpler and more user-friendly interface for customers.
  * Involves creating a single class that provides a simplified interface to a set of classes or a complex subsystem. It facilitates the use of the subsystem without exposing its complexity to the customer.