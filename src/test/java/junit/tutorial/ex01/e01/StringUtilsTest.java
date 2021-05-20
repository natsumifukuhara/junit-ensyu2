package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringUtilsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	//@ParameterizedTest
	//@CsvSource({
	//    "aaa,aaa",
	//    "HelloWorld, hello_world",
	//    "practiceJunit, practice_junit",
	//})void test(String text,String excepted) {
	//	String answer = StringUtils.toSnakeCase(text);
	//	assertEquals(text,answer);
	//}
	
	@Test
	void test1() {
	String answer = StringUtils.toSnakeCase("aaa");
	assertEquals("aaa",answer);
	}
	@Test
	void test2() {
	String answer = StringUtils.toSnakeCase("HelloWorld");
	assertEquals("hello_world",answer);
	}
	
	@Test
	void test3() {
	String answer = StringUtils.toSnakeCase("practiceJunit");
	assertEquals("practice_junit",answer);
	}

}
