In software engineering, creational design patterns are design patterns that deal with object creation mechanisms, trying
to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems 
or added complexity to the design. 

Creational design patterns solve this problem by somehow controlling this object creation.

### **Abstract Factory**
Creates an instance of several families of classes

### **Builder**
Separates object construction from its representation

It is currently used by larger libraries on Java. Here are some of them:
- StringBuilder
- StringBVuffer
- ByteBuffer, CharBuffer, ShortBuffer, IntBuffer, LongBuffer, FloatBuffer, DoubleDuffer
- Everything that implements `java.lang.Appendable`

### **Factory Method**
Creates an instance of several derived classes

### **Object Pool**
Avoid expensive acquisition and release of resources by recycling objects that are no longer in use

Object pooling can offer a significant performance boost; it is most effective in situations where the cost of initializing 
a class instance is high, the rate of instantiation of a class is high, and the number of instantiations in use at any one time is low.

### **Prototype**
A fully initialized instance to be copied or cloned

### **Singleton**
A class of which only a single instance can exist