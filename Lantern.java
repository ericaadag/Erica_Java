/* In Java, classes are blueprints for creating objects, which are instances of classes. A class defines attributes (data) and methods (functions) that describe the properties and behaviors of the objects. 
Classes and objects are crucial in object-oriented programming (OOP) because they promote modularity, encapsulation, and reusability. This allows developers to create more organized and manageable code, reflecting real-world entities.
Constructors are special methods used to initialize objects when they are created. They set the initial values of attributes. Methods are functions defined within a class that perform actions or operations on the object's data. Attributes, also known as fields or properties, store the state or characteristics of an object.
 Together, constructors, methods, and attributes form the foundation of how classes operate in Java, enabling effective data management and functionality.*/ 

 class Lantern {
    boolean isOn;
    int brightness; // Scale 1-10

    // Turns the lantern on
    void turnOn(int level) {
        isOn = true;
        brightness = level;
        System.out.println("Lantern is ON at brightness level " + brightness);
    }

    // Turns the lantern off
    void turnOff() {
        isOn = false;
        System.out.println("Lantern is OFF.");
    }
}
