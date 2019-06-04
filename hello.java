
import static java.lang.System.out;

class A extends A{
	
}

class B extends C{
	
}
class C extends B{
	
}
class p {
	p(){
		out.println("Parent Constrcutor == "+this.hashCode());
	}
	
	void m1(){
		out.println("I am in abtract class");
	}
}

class c extends p{
	c(){
		out.println("Child class contructor == "+this.hashCode());
	}
	
	void m2(){
		out.println("I am in child class");
	}
}
public class hello {
	
	public static void main(String[] args) {
	
		p p = new p();
		p.m1();
		
		c c = new c();
		c.m1();
		c.m2();
		
		
		
		
	}
}