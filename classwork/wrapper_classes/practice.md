## Wrapper Classes

### Currency

Fill in the Currency class using the method comments as a guide.

For getDollars and getCents, you can isolate the dollar part by rounding the Double to an Integer. To do that, get the double value using doubleValue and cast the result to an Integer.

There are several ways to get the cents, but you need to be careful not to get a double rounding error. The safest way is to multiple the orginal value by 100, then cast to an integer and then use a mod 100 function:
cents = (int)(value * 100) % 100

When you run, you should get
```
Value of bankroll: $12.45
Dollars: 12
Cents: 45
Value of bankroll: $20.56
Dollars: 20
Cents: 56
Value of bankroll: $67.78
Dollars: 67
Cents: 78
```
