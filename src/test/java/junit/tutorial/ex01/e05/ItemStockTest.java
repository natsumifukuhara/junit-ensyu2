package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ItemStockTest {

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

	@Test
	void test1() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item("apple",100);
		assertEquals(0,itemStock.getNum(item));
	}
	
	@Test
	void test2() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item("apple",100);
		itemStock.add(item);
		assertEquals(1,itemStock.getNum(item));
	}
	
	@Test
	void test3() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item("apple",100);
		itemStock.add(item);
		assertEquals(1,itemStock.getNum(item));
	}
	
	@Test
	void test4() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item("apple",100);
		itemStock.add(item);
		itemStock.add(item);
		assertEquals(2,itemStock.getNum(item));
	}
	
	
	@Test
	void test5() {
		ItemStock itemStock = new ItemStock();
		Item item = new Item("apple",100);
		itemStock.add(item);
		Item item2 = new Item("banana",200);
		itemStock.add(item2);
		assertEquals(1,itemStock.getNum(item2));
	}
	

}
