## FRQ: APLine

An APLine is a line defined by the equation ax + by + c = 0,where a is not equal to zero, b is not equal to zero, and a, b, and c are all integers. The slope of an APLine is defined to be the double value -a / b . A point (represented by integers x and y) is on an APLine if the equation of the APLine is satisfied when those x and y values are substituted into the equation. That is, a point represented by x and y is on the line if ax + by + c is equal to 0. Examples of two APLine equations are shown in the following table.

![image](https://github.com/novillo-cs/apcsa_material/assets/123229891/0d3e070b-62f1-4a24-97f7-36857d4a8013)


Create a Driver.java, and add the following code, which shows an example of using the APLine class to represent the two equations shown in the table.

```
APLine line1 = new APLine(5, 4, -17);
double slope1 = line1.getSlope();        // slope1 is assigned -1.25
boolean onLine1 = line1.isOnLine(5, -2); // true because 5(5) + 4(-2) + (-17) = 0

APLine line2 = new APLine(-25, 40, 30);
double slope2 = line2.getSlope();        // slope2 is assigned 0.625
boolean onLine2 = line2.isOnLine(5, -2); // false because -25(5) + 40(-2) + 30 != 0
```
