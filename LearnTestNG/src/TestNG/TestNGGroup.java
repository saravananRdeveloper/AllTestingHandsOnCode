package TestNG;

import org.testng.annotations.Test;

public class TestNGGroup {
	@Test(groups={"smoke"})
	public void f1() {
		System.out.println("i am in f1");
	}
	@Test(groups={"sanity"})
	public void f2() {
		System.out.println("i am in f2");
	}
	@Test(groups={"smoke"})
	public void f3() {
		System.out.println("i am in f3");
	}
	@Test(groups={"sanity"})
	public void f4() {
		System.out.println("i am in f4");
	}
	@Test(groups={"smoke"})
	public void f5() {
		System.out.println("i am in f5");
	}
	@Test(groups={"sanity"})
	public void f6() {
		System.out.println("i am in f6");
	}
	@Test(groups={"smoke"})
	public void f7() {
		System.out.println("i am in f7");
	}
	@Test(groups={"sanity"})
	public void f8() {
		System.out.println("i am in f8");
	}

}
