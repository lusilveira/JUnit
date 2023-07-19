package br.com.lsilveira;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.print.attribute.standard.NumberUpSupported;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class ArraysCompareTest {

	@Test
	void test() {
		int[] numbers = {25,8,21,32,3};
		int[] expectedArray = {3,8,21,25,32};
		
		Arrays.sort(numbers);
		assertArrayEquals(numbers, expectedArray);
	}
	
	@Test
	@Timeout(1)
	void testSortPerfomace() {
		int[] numbers = {25,8,21,32,3};
		 for (int i = 0; i < 1000000000; i++) {
				 numbers[0] = i;
				 Arrays.sort(numbers);	
		
		
	}

 }

}
