package coursesession;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayListTest {

	 @Test
	    public void study() throws Exception {
	        ArrayList<String> list = new ArrayList<String>();
	        list.add("first");
	        list.add("second");

	         assertEquals(2, list.size() ); // list�� ũ�⸦ ���϶�.
	         assertEquals("first", list.get(0) ); // ù ��° ���� ã�ƶ�.
	         assertEquals(true, list.contains("first") ); // "first" ���� ���ԵǾ� �ִ����� Ȯ���ض�.
	         assertEquals("first", list.remove(0) ); // ù ��° ���� �����ض�.
	         assertEquals(false, list.contains("first") ); // "first" ���� ���ԵǾ� �ִ����� Ȯ���ض�.        
	    }
}
