# Data Types and Variables

Go inside the folder homework, and create a folder 04_variables. Inside this folder, you will write the following programs:

1. Write a Java program (Temperature.java) to convert temperature from Fahrenheit to Celsius degrees. You must use variables.
   
Output:

50.0 degrees Fahrenheit is equal to 10.0 Celsius

2. Write a Java program (Calculator.java) that calculates the sum of two numbers (int or double).

Output:

10 + 12 = 22

3. Create a file TrickyCalc.java and copy the following code inside. Run the program. Create a file answers.txt or answers.md and respond to the following questions:
   
* What do you notice about the mySum value?
* What is the value of checkResult, and why do we get that result?

```
public class TrickyCalc{
   public static void main(String[] args){
       double mySum = 0.1 + 0.1 +0.1;
       double tmp = 0.3;
       boolean checkResult = mySum == tmp;

       System.out.println("0.1 + 0.1 + 0.1 = " + mySum);
       System.out.println(mySum + " == " + tmp + " is " + checkResult);
   }
}
```
