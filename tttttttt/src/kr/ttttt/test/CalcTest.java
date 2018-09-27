package kr.ttttt.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.ttttt.Calc;

class CalcTest {

	@Test
	void test() {
		assertEquals(3, Calc.sum(1, 2));
	}

}
