package hello;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

/**
 * @author  Srikanth
 * @version 1.0
 * @since   2022-12-31
 */
public class HelloWorldTests {

	private final ByteArrayOutputStream baos = new ByteArrayOutputStream();
	private final PrintStream ps = new PrintStream(baos);

	@Before
	public void setup() {
		System.setOut(ps);
	}

	@Test
	public void shouldPrintTimeToConsole() {
		HelloWorld.main(new String[] { });

		assertThat(output(), containsString("The current local time is"));
	}

	@Test
	public void shouldPrintHelloWorldToConsole() {
		HelloWorld.main(new String[] { });

		assertThat(output(), containsString("Hello world!"));
	}

	private String output() {
		return new String(baos.toByteArray(), StandardCharsets.UTF_8);
	}
}
