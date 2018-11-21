import org.junit.Test;
public class test {

	//测试全为正数数组
	@Test
	public void testexecute1(){
		int[] array = {1, 2, 3, 5, 7, 8, 9, 9};
		int n=10;
		assertEquals("(1 9) (1 9) (2 8) (3 7) ", new ArrSum().execute(array,n));
	}
	
	//测试含有负数的数组
	@Test
	public void testexecute2(){
		int[] array = {-1, -2, 3, 5, 7, 8, 9, 9};
		int n=7;
		assertEquals("(-1 8) (-2 9) (-2 9) ", new ArrSum().execute(array,n));
	}
	
	//测试长度为1的数组
	@Test
	public void testexecute3(){
		int[] array = {1};
		int n=2;
		assertEquals("", new ArrSum().execute(array,n));
	}
	
	//测试空数组
	@Test
	public void testexecute4(){
		int[] array = {};
		int n=1;
		assertEquals("", new ArrSum().execute(array,n));
	}
	
	//测试非整型数组
	@Test
	public void testexecute5(){
		char[] array = {1,2,a,a};
		int n=194;
		assertEquals("Exception in thread 'main' java.lang.Error: Unresolved compilation problems: ", new ArrSum().execute(array,n));
	}
}
