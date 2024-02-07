## Exercise 1: Reverse a String

The following function must reverse a string ("hello" => "olleh"):

```
public static String reverse(String s){}
```

Work with a partner and solve this exercise on your notebook or use the whiteboard. You will respond to the following questions and make a trace that shows how the recursion works including the initial recursive call.

* What is the base case?
* What is the recursive case?
* Can you solve the problem using a method with a different list of parameters? If so, respond to question 1 an 2 for this new method and make a trace?
* Which of the two method could be more efficient?

## Exercise 2: Improving Fibonacci

Remember our fibinacci recursive method? 

We implemented a double recursion, which was so inefficient.

We can use a better approach to solve Fibonacci, so we can reduce the repeated recursive calls. We can add some extra parameters to the method, to make the recursion work as a loop.

The idea is to have two parameter fib1 and fib2 to store the previous two Fibonacci numbers (fib2 is the older value).

When fib1 and fib2 are 1 and 0 the output of fibonacciIterative(n,fib1,fib2) will be the nth fibonacci number such that n=0 returns 0, n=1 returns 1, n=2 returns 1 etc.




fibIter is a recursive function to calculate fibonacci numbers that uses tail recursion.

You may not call the recursion more than once. This will cause the runtime to be linear.

The way this works is that f1 and f2 always store the most recent two Fibonacci numbers (f2 being the older one in this case). This will allow you to calculate the next value in constant time.

Since you can change the starting values of f1 and f2, be aware that this is only a Fibonacci number when you start them at 1 and 0.

When f1 and f2 are 1 and 0 the output of fibIter(n,f1,f2) will be the nth fibonacci number such that n=0 returns 0, n=1 returns 1, n=2 returns 1 etc.


```
fibonacciIterative(0, 1, 0) returns 0
fibonacciIterative(1, 1, 0) returns 1
fibonacciIterative(2, 1, 0) returns 1
...
```

Work with a parter and draw how fibIter(8,1,0) would calculate the correct result.

Implement the following method. Remmber do not make more than one recursive call to fibonacciIterative.

```
public static int fibonacciIterative(int n, int f1, int f2){
  
}
```
