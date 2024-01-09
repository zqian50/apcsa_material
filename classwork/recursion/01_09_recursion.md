## Recursion Practice

### Sum digits

Write the solution to the following problem in your notebook:

Given a non-negative int n, return the sum of its digits recursively (no loops). Do not use strings to solve the problem. Example: 12945 -> 1 + 2 + 9 + 4 + 5 = 21

**Possible solution:**

How to get the digit at the end 12945 => 5?

How to remove the last digit 12945 => 1294?

What is the base case?

Which operations can break up the numbers into a single digit and the rest? 

What is the recursive case?

Write the code to solve this problem using recursion. Save the code in the classwork directory: xx_recursion/SumDigits.java

---

### Fibonacci sequence

The sequence follows the rule that each number is equal to the sum of the preceding two numbers (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233 … )

1. What is the recursive case? 
2. When do you call the recursive case?
3. What is(are) the base case(s)?

Write the code to solve Fibonacci using recursion. Save the code in the classwork directory:
xx_recursion/Fibonacci.java
   
When you test your fibonacci method:

Check how long it takes to run the method. Run this command in your terminal: 

```time java Fibonacci.java```

What is the largest number such that fibonacci(number) fits in an int? (does not overflow)

Is Fibonacci efficient with recursion?

![image](https://github.com/novillo-cs/apcsa_material_private/assets/123229891/15c3d314-deb7-4258-9181-7d06b2a07288)


