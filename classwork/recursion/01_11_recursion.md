## Number Letter Counts  

### [Project Euler - Problem 17](https://projecteuler.net/problem=17)

This problem must be solved using recursion.

If the numbers 1 to 5 are to are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.

### Think about the problem:

First how can you implement this method to return the number in letters:

```
public static String numberToWords(int number) {

}
```

- How can you have a reference to the numbers in words? Should these words be predefined?
- How should the possible number cases be implemented?
    - Handling Hundreds: Greater than or equal to 100
    - Handling Tens: 20 to 99
    - Handling Teens: 10 to 19
    - Handling Ones:Less than 10
- How can you check the value of the number in the recursive method? How to decide whether to use the word for hundreds, tens, teens, or ones?
- What is the base case?
- What is the recursive case?
- What parameter must be sent in each recursive call?


Let's do it from 1-1000 to have the total number of letters in all those numbers:

```
declare an integer variable 'result' to store total number of letters
for each number from 1 to 1000
	call recursive method numberToWords(number here), this return number in words
	get the length of the word returned from the recursive method and add it to 'result'
 ```
 

### Debugging and Testing:

- Debug the program by running it with small inputs.
- Test the program with a range of numbers and verify the results.
