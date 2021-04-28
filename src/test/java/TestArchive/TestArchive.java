package TestArchive;

import static org.junit.Assert.*;
import org.testng.annotations.Test;

import Archive.Arch;

public class TestArchive {

	@Test
	public void test1() { 
		assertEquals( Arch.ArchString("SSScchoo5-90oooooooooooQQQQllllllllllllllll adfgggafbaf"), "3S2ch2o15-19109o2o4Q9l7l adf3gafbaf" );
	}
	@Test
	public void test2() { 
		assertEquals( Arch.ArchString("ScchoooooooooooooQllllllllllllllll"), "S2ch9o4oQ9l7l" );
	}
	@Test
	public void test3() { 
		assertEquals( Arch.ArchString("School"), "Sch2ol" );
	}
	@Test
	public void test4() { 
		assertEquals( Arch.ArchString("S"), "S" );
	}
	@Test
	public void test5() { 
		assertEquals( Arch.ArchString(" "), " " );
	}
	@Test
	public void test6() { 
		assertEquals( Arch.ArchString(""), "" );
	}
	@Test
	public void test7() { 
		assertEquals( Arch.ArchString("3School"), "13Sch2ol" );
	}
	@Test
	public void test8() { 
		assertEquals( Arch.ArchString("31258786"), "1311121518171816" );
	}
		
	


	@Test
	public void test11() { 
		assertEquals( Arch.DeArchString( "3S2ch2o15-19109o2o4Q9l7l adf3gafbaf" ),"SSScchoo5-90oooooooooooQQQQllllllllllllllll adfgggafbaf");
	}
	@Test
	public void test12() { 
		assertEquals( Arch.DeArchString("S2ch9o4oQ9l7l" ),  "ScchoooooooooooooQllllllllllllllll");
	}
	@Test
	public void test13() { 
		assertEquals( Arch.DeArchString("Sch2ol"),"School" );
	}
	@Test
	public void test14() { 
		assertEquals( Arch.DeArchString("S"), "S" );
	}
	@Test
	public void test15() { 
		assertEquals( Arch.DeArchString(" "), " " );
	}
	@Test
	public void test16() { 
		assertEquals( Arch.DeArchString(""), "" );
	}
	@Test
	public void test17() { 
		assertEquals( Arch.DeArchString("13Sch2ol"),"3School" );
	}
	@Test
	public void test18() { 
		assertEquals( Arch.DeArchString("1311121518171816"),"31258786" );
	}
	
	@Test
	public void test19() { 
		assertEquals( Arch.DeArchString("131112151qqq16"),"3125qqq6" );
	}
}
