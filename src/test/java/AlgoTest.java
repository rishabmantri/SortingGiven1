/**
 * 
 */
package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.javafx.geom.Vec2d;

import main.java.SortAlgos;
import main.java.SortDemoData;


public class AlgoTest {

	SortDemoData arr = new SortDemoData();
	SortDemoData res = new SortDemoData();
	
	@Test 
	// For node coverege
	public void BubbleSort1() {
		
		arr.initializeArray("40 20 30 50 60"); 
		res.initializeArray("20 30 40 50 60");
		arr.runAlgo(0);
		assertTrue(arr.myArray[0].key == res.myArray[0].key);
		assertTrue(arr.myArray[1].key == res.myArray[1].key);
		assertTrue(arr.myArray[2].key == res.myArray[2].key);
		assertTrue(arr.myArray[3].key == res.myArray[3].key);
		assertTrue(arr.myArray[4].key == res.myArray[4].key);
		
		}
	
	
	//condition coverege
	@Test
	public void BubbleSort2() {
		
		arr.initializeArray("30 20 10 40"); 
		res.initializeArray("10 20 30 40");
		arr.runAlgo(0);
		assertTrue(arr.myArray[0].key == res.myArray[0].key);
		assertTrue(arr.myArray[1].key == res.myArray[1].key);
		assertTrue(arr.myArray[2].key == res.myArray[2].key);
		assertTrue(arr.myArray[3].key == res.myArray[3].key);
		
		}
	
	@Test
	public void BubbleSort3() {
		
		arr.initializeArray("10 20 30 40"); 
		res.initializeArray("10 20 30 40");
		arr.runAlgo(0);
		assertTrue(arr.myArray[0].key == res.myArray[0].key);
		assertTrue(arr.myArray[1].key == res.myArray[1].key);
		assertTrue(arr.myArray[2].key == res.myArray[2].key);
		assertTrue(arr.myArray[3].key == res.myArray[3].key);
		
		}
	
	


	
	@Test
	public void insertionSort1() {
		arr.initializeArray("30 60 80 40 20"); 
		res.initializeArray("20 30 40 60 80");
		arr.runAlgo(2);
		assertTrue(arr.myArray[0].key == res.myArray[0].key);
		assertTrue(arr.myArray[1].key == res.myArray[1].key);
		assertTrue(arr.myArray[2].key == res.myArray[2].key);
		assertTrue(arr.myArray[3].key == res.myArray[3].key);
		assertTrue(arr.myArray[4].key == res.myArray[4].key);
		
	}
	@Test 
	public void insertionSort2() {
		arr.initializeArray("-10 -30"); 
		res.initializeArray("-30 -10");
		arr.runAlgo(2);
		assertTrue(arr.myArray[0].key == res.myArray[0].key);
		assertTrue(arr.myArray[1].key == res.myArray[1].key);
	}
	
	
	@Test
	public void selectionSort1() {
		arr.initializeArray("10 20"); 
		res.initializeArray("10 20");
		arr.runAlgo(1);
		assertTrue(arr.myArray[0].key == res.myArray[0].key);
		assertTrue(arr.myArray[1].key == res.myArray[1].key);
	}
	@Test
	public void selectionSort2() {
		arr.initializeArray("40 20 30 50 60"); 
		res.initializeArray("20 30 40 50 60");
		arr.runAlgo(1);
		assertTrue(arr.myArray[0].key == res.myArray[0].key);
		assertTrue(arr.myArray[1].key == res.myArray[1].key);
		assertTrue(arr.myArray[2].key == res.myArray[2].key);
		assertTrue(arr.myArray[3].key == res.myArray[3].key);
		assertTrue(arr.myArray[4].key == res.myArray[4].key);
	}
	
	
	

	@Test
	public void mergeSort1() {
		arr.initializeArray("30 40 70 20"); 
		res.initializeArray("20 30 40 70");
		arr.runAlgo(3);
		assertTrue(arr.myArray[0].key == res.myArray[0].key);
		assertTrue(arr.myArray[1].key == res.myArray[1].key);
		assertTrue(arr.myArray[2].key == res.myArray[2].key);
		assertTrue(arr.myArray[3].key == res.myArray[3].key);
		
	}
	
	@Test
	public void mergeSort2() {
		arr.initializeArray("70 50"); 
		res.initializeArray("50 70");
		arr.runAlgo(3);
		assertTrue(arr.myArray[1].key == res.myArray[1].key);
		assertTrue(arr.myArray[0].key == res.myArray[0].key);
		
	}
	@Test
	public void mergeSort3() {
		arr.initializeArray("4 2 9 7 3"); 
		res.initializeArray("2 3 4 7 9");
		arr.runAlgo(3);
		assertTrue(arr.myArray[0].key == res.myArray[0].key);
		assertTrue(arr.myArray[1].key == res.myArray[1].key);
		assertTrue(arr.myArray[2].key == res.myArray[2].key);
		assertTrue(arr.myArray[3].key == res.myArray[3].key);
		assertTrue(arr.myArray[4].key == res.myArray[4].key);
	}
	
	@Test
	public void quickSort1() {
		arr.initializeArray("30 40 70 20"); 
		res.initializeArray("20 30 40 70");
		arr.runAlgo(4);
		assertTrue(arr.myArray[0].key == res.myArray[0].key);
		assertTrue(arr.myArray[1].key == res.myArray[1].key);
		assertTrue(arr.myArray[2].key == res.myArray[2].key);
		assertTrue(arr.myArray[3].key == res.myArray[3].key);
		
		
	}
	
	@Test
	public void quickSort2() {
		arr.initializeArray("80 40 20 50"); 
		res.initializeArray("20 40 50 80");
		arr.runAlgo(4);
		assertTrue(arr.myArray[0].key == res.myArray[0].key);
		assertTrue(arr.myArray[1].key == res.myArray[1].key);
		assertTrue(arr.myArray[2].key == res.myArray[2].key);
		assertTrue(arr.myArray[3].key == res.myArray[3].key);
		
	}
	
	
	@Test
	public void heapSort1() {
		arr.initializeArray("80 40 20 50"); 
		res.initializeArray("20 40 50 80");
		arr.runAlgo(5);
		assertTrue(arr.myArray[0].key == res.myArray[0].key);
		assertTrue(arr.myArray[1].key == res.myArray[1].key);
		assertTrue(arr.myArray[2].key == res.myArray[2].key);
		assertTrue(arr.myArray[3].key == res.myArray[3].key);
		
	}
	

	

}
