## Abstract Classes and Interfaces

- Copy the classes you created for homework #23  (Shape, Rectangle, Triangle) and paste them inside today's classwork folder (cw/xx_abstract_classes_interfaces/).
- Convert the superclass Shape to an abstract class.
- Create a Driver to execute today's code.
- Let's create an object applying polymorphism:
  
  ```
    Shape s = new Rectangle(2, 4)
  ```
- Let's try to calculate area:

  ```
    s.getArea()
  ```

Respond to the following questions, and save your answers in a txt, md, docx, pdf document (ex. answers.txt):

1. Did you get an error executing the getArea() method? Yes/No why? If yes, fix it and explain why your solution will work.
2. Try instantiating an object as an instance of the abstract class Shape. Did you get an error? Yes/No why?  

Let's add an interface on top of the abstract Shape:
```
interface ShapeInterface {
   double getHeight();
   double getWidth();
   void info();
   double getArea();
}

abstract class Shape implements ShapeInterface{....}
```

Respond to the following questions:

4. Now with the abstract implementing the interface, try to comment the methods getArea() in the class Shape and Rectangle: What happened?

5. If you uncomment the getArea on Rectangle and leave it commented on Shape. Does it work? Yes/No? Explain.
