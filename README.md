# codeguide
## Don't Reinvent The Wheel, Unless You Plan on Learning More About Wheels
Reinventing the wheel means to make unnessesary or redundant preparations. In programming, it means to duplicate a basic method that has already been created or optimized by others. So you shouldn't waste your time trying to create some thing that is already exist and ready to use. Using available API or libraries will make your code look easier, cleaner, and less likely to have mistakes. But if you just want to practice your skills or learn more about it, it's fine to re-create all the functions by yourself.
  ```java
int x = 123;
// print the sign of x
if (x < 0)
  System.out.println(-1);
else if (x == 0)
  System.out.println(0);
else
  System.out.println(1); 
  ```
From the example above, printing the sign of a number is an easy task, but it still takes about 6 lines of code to complete it. It is also time consuming to write the code that is not the main purpose of the application, because it might cause some bugs that you overlooked. It is very useful to know about existing APIs and libraries, so you can get your task done quickly. In this example, you can find the sign of a number easily by using existing Java API `Math.signum( x );` 

Exercise: [Click here](/src/codeguide/Exercise1.java)

Reference: https://blog.codinghorror.com/dont-reinvent-the-wheel-unless-you-plan-on-learning-more-about-wheels/
## KISS (Keep it simple, stupid!)
When you write a code, the first thing to think about is "What is easiest way to get the job done?" Keep the code as simple as possible, so it can be easy to maintain in the future. Simple code takes less time to write, and easier to find mistakes. You don't need to use fancy features in your programming language to complete a task, if it can be re-written using a simple logic. This principle will reduce the complexity of your code, therefor it is easier to modify and understand.

For an int array `int[] numbers = { 1, 4, 2, 5, 7, 2, 92, 23, 3 };` if we want to find the sum of integers inside we could:
```java
Integer sum = null;
try {
  Integer i = new Integer(0);
  sum = new Integer(0);
  while (true) {
    sum = new Integer(sum.intValue() + numbers[i++]);
  }
} catch (ArrayIndexOutOfBoundsException e) {
  System.out.println(sum); // 139
}
```
But here is another simpler solution:
```java
int sum = 0;
for (int i = 0; i < numbers.length; i++) {
  sum += numbers[i];
}
System.out.println(sum); // 139
```
Because we know that Java can handle exceptions using try-catch, we create an infinite loop and sum the element of increasing index `i` until it throws an `ArrayIndexOutOfBoundsException` then we print out the result. Eventhough Java can do that, it doesn't mean that you must use it. The second code block is easier to read and maintain, and more importantly it prints out the same result. A simple code is easier to find bugs, and use less time to finish.

Exercise: [Click here](/src/codeguide/Exercise2.java)

Reference: http://www.itexico.com/blog/bid/99765/software-development-kiss-yagni-dry-3-principles-to-simplify-your-life
