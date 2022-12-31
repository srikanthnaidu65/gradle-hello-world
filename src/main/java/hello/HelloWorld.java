package hello;

import java.time.LocalDateTime;

/**
 * @author  Srikanth
 * @version 1.0
 * @since   2022-12-31
 */
public class HelloWorld {
  public static void main(String[] args) {
	System.out.println("The current local time is: " + LocalDateTime.now());

	Greeter greeter = new Greeter();
	System.out.println(greeter.sayHello());
  }
}