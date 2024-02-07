## Exercise 1: Reverse a String

The following function must reverse a string ("hello" => "olleh"):

```
public static String reverse(String s){}
```

Work with a partner and solve this exercise on your notebook or use the whiteboard. You will respond to the following questions and make a trace that shows how the recursion works including the initial call.

* What is the base case?
* What is the recursive case?
* Make a trace that shows how the recursion works.
* Can you solve the problem using a method with a different list of parameters? If so,
  * What parameters would you need?
  * What would be the base case?
  * What would be the recursive case?
  * Make a trace to show how it works.

Take pictures of your answers and upload it here: classwork/xx_recursion/ReverseString/your_files_here

## Exercise 2: Improving Fibonacci

Remember our Fibinacci recursive method? 

We implemented a double recursion, which was so inefficient.

We can use a better approach to solve Fibonacci, so we can reduce the repeated recursive calls. We can add some extra parameters to the method to make the recursion work as a loop.

The idea is to have two parameters fib1 and fib2 to store the previous two Fibonacci numbers (fib2 is the older value).

When fib1 and fib2 are 1 and 0 the output of fibonacciIterative(n, fib1, fib2) will be the nth fibonacci number such that n=0 returns 0, n=1 returns 1, n=2 returns 1 etc.

This is a tail recursion which means there is no other operation to perform after executing the recursive function itself.

Since you can change the starting values of fib1 and fib2, be aware that this is only a Fibonacci number when you start them at 1 and 0.

When fib1 and fi2 are 1 and 0 the output of fibonacciIterative(n,fib1,fib2) will be the nth fibonacci number such that n=0 returns 0, n=1 returns 1, n=2 returns 1 etc.


```
fibonacciIterative(0, 1, 0) returns 0
fibonacciIterative(1, 1, 0) returns 1
fibonacciIterative(2, 1, 0) returns 1
...
```

Work with a parter and explain how this recursive fibonacciIterative works. Write your notes in your notebook.

After you discussion, implement the following method. Remmber do not call fibonacciIterative more than once.

```
public static int fibonacciIterative(int n, int f1, int f2){
  
}
```

Take pictures of your notes and upload it here: classwork/xx_recursion/FibonacciIteractive/your_files_here
