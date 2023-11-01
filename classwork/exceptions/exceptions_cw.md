## Practice Exceptios with SuperArray

### SuperArrray(int initialCapacity)

Throws an IllegalArgumentException when the initialCapacity is negative.

### add(int index,String value)

Throws an IndexOutOfBoundsException when the index is negative or the index larger than size().

### String remove(int index)

Throws an IndexOutOfBoundsException when the index is negative or the index is at least size().

### String get(int index)

Throws an IndexOutOfBoundsException when the index is negative or the index is at least size().

### String set(int index, String value)

Throws an IndexOutOfBoundsException when the index is negative or the index is at least size(). 

## Practice Exceptions:

- Create a method that takes an integer as a parameter and throws an exception if the number is odd.
  
- Create a method that takes an array of integer as a parameter and throws and exception if there is any negative number.

- What is wrong with the following code? Why it is showing compilation error?
  
```
public class JavaExceptionHandlingQuiz 
{
    public static void main(String[] args) 
    {
        try
        {
            System.out.println("Try Block");
        }
         
        System.out.println("-----");
         
        catch (Exception e) 
        {
            System.out.println("Catch Block");
        }
    }
}
```
- What will be the output of the following program?

```
public class JavaExceptionHandlingQuiz 
{
    public static void main(String[] args) 
    {
        int i = 1;
         
        try
        {
            i++;
        }
        catch (Exception e) 
        {
            i++;
        }
        finally
        {
            i++;
        }
         
        System.out.println(i);
    }
}
```

