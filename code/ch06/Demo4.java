package ch06;

import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo4 {
	@BeforeGroups("person")
	public void bGPerson() {
		System.out.println("在person前执行");
	}
	@BeforeGroups("animal")
	public void bGanimal() {
		System.out.println("在animal前执行");
	}
	@Test(groups= {"person"})
	public void teacher() {
		System.out.println();
	}
	
	@Test(groups= {"person"})
	public void student() {
		System.out.println();
	}
	
	@Test(groups= {"animal"})
	public void dog() {
		System.out.println();
	}

	@Test(groups= {"animal"})
	public void cat() {
		System.out.println();
	}
	
	@Test
	@Parameters({"u_name","password"})
	public void login(String name,String pwd) {
		System.out.println(name);
//		System.out.println(pwd);
	}
	

	
	

}
