## New methods in Point class

- Check if the coordinate values are equal. We have learned that  data precision can be a problem with double values. The following method should return true when value1 is equal to value2 or when the difference between them is not greater than 0.001%. Otherwise, return false. 

```
 public static boolean isClose(double value1, double value2){
   return false;
 }
```

- A point is equal to another one when the values x and y are close to each other. Use method isClose to determine if values are close.

 ```
public boolean isEqual(Point other){
   return false;
 }
```
   

## New methods in Triangle class

 - Return true when the Points in one triangle are equal to the ones in another triangle.
   
```
public boolean equals(Triangle other){
    return false;
 }
```


 - Identify the type of triangle and return the name "scalene", "isosceles", or "equilateral". Reuse code. Do not duplicate lines of code.
   
 ```
public String getTriangleType(){
    return "";
 }
```
   

- Calculate the area with 3 sides:
  
 ``` 
 Area = √[s(s-a)(s-b)(s-c)]
```

  "s" is the semi-perimeter of the triangle, i.e., s = (a + b + c)/2.

  "a", "b", and "c" are the three sides of a triangle.

  Area of triangle with 3 sides formula is called Heron's formula and using this, area is equal to square root of s times s minus a times s minus b times s minus c

```
public double getArea(){
    return 0.0;
}
```
