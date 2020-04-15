package ee.ut.cs.swt;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MinimumBinaryHeapTest {
	
	private MinimumBinaryHeap heap;
	private List<Integer> result;

	public void assertMinHeap(List<Integer> heap,Integer... integers) {
		List<Integer> expected = Arrays.stream(integers).collect(Collectors.toList());
		if(expected.size() != heap.size()) {
			fail();
		}
		for (int i = 0; i < heap.size(); i++) {
			if(!expected.contains(heap.get(i))) {
				fail();
			}
			if (i > 0 && !(heap.get(i) > heap.get(Math.floorDiv(i-1,2)))) {
				fail();
			}
		}
	}
	
	@Before
	public void setUp() {
		heap = new MinimumBinaryHeap();
		result = new ArrayList<>();
		result.add(10);
		result.add(5);
		result.add(4);
		result.add(8);
		result.add(12);
	}
	
	@Test
	public void minHeapifyTest() {
		heap.minHeapify(result);
		assertMinHeap(heap.getArray(),4,5,8,10,12);
	}
	
	@Test
	public void extractMinTest() {
		heap.add(7);
		heap.add(1);
		heap.add(6);
		int min = heap.exractMin();
		assertEquals(1, min);
	}
	
	@Test
	public void swapTest() {
		heap.add(5);
		heap.add(8);
		heap.add(13);
		heap.swap(1, 2);
		assertEquals(5, heap.getArray().get(0), 0);
		assertEquals(13, heap.getArray().get(1), 0);
		assertEquals(8, heap.getArray().get(2), 0);
	}
	
	@Test
	public void addTest() {
		heap.add(10);
		heap.add(5);
		heap.add(4);
		heap.add(8);
		heap.add(12);
		assertMinHeap(heap.getArray(),10,5,4,8,12);
		//assertEquals(4, heap.getArray().get(0), 0);
		//assertEquals(5, heap.getArray().get(1), 0);
		//assertEquals(10, heap.getArray().get(2), 0);
	}
	
	@Test
	public void removeTest() {
		heap.add(5);
		heap.add(3);
		heap.add(2);
		boolean b1 = heap.remove(3);

		assertTrue(b1);
	}

	@Test
	public void isEmptyTest() {
		heap = new MinimumBinaryHeap();
		assertEquals(true, heap.isEmpty());
	}

	// -----------
	// Added Tests
	// -----------

	@Test
	public void removeOrderTest() {
		heap.add(5);
		heap.add(4);
		heap.add(3);
		heap.add(2);
		boolean b1 = heap.remove(3);
		assertTrue(b1);
		assertMinHeap(heap.getArray(),2,4,5);
	}

	@Test
	public void removeImpossibleOrderTest() {
		heap.add(5);
		heap.add(4);
		heap.add(3);
		heap.add(2);
		boolean b1 = heap.remove(10);
		assertFalse(b1);
		assertMinHeap(heap.getArray(),2,3,4,5);
	}

	@Test
	public void extractAllMinTest() {
		List<Integer> integers = new ArrayList<>();
		integers.add(5);
		integers.add(4);
		integers.add(4);
		integers.add(3);
		integers.add(2);
		integers.add(2);
		integers.sort(Integer::compareTo);
		heap.minHeapify(integers);
		for (int i = 0; i < 6; i++) {
			int minval = heap.exractMin();
			assertEquals(minval,integers.get(i),0);
		}
		assertEquals(heap.getArray().size(),0);
	}

	@Test
	public void removeLastTest() {
		heap.add(5);
		heap.add(4);
		heap.add(3);
		heap.add(2);
		assertTrue(heap.remove(5));
		assertMinHeap(heap.getArray(),2,3,4);
	}

	@Test
	public void bubbleDownLeftSmallerTest() {
		heap.add(2);
		heap.add(3);
		heap.add(4);
		heap.add(7);
		assertTrue(heap.remove(2));
		assertMinHeap(heap.getArray(),7,3,4);
	}

	@Test
	public void bubbleDownRightSmallerTest() {
		heap.add(2);
		heap.add(4);
		heap.add(3);
		heap.add(7);
		assertTrue(heap.remove(2));
		assertMinHeap(heap.getArray(),7,3,4);
	}
}

