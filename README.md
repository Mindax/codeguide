# codeguide
## Don't Reinvent The Wheel, Unless You Plan on Learning More About Wheels
Reinventing the wheel means to make unnessesary or redundant preparations. In programming, it means to duplicate a basic method that has already been created or optimized by others. So you shouldn't waste your time trying to create some thing that is already exist and ready to use. Using available API or libraries will make your code look easier, cleaner, and less likely to have mistakes. But if you just want to practice your skills or learn more about it, it's fine to re-create all the functions by yourself.
  ```
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
  
## Programming for Interface not implementation

