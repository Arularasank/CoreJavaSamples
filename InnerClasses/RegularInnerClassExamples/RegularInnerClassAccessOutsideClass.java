class RegularInnerClassAccessOutsideClass{
	class InnerClass1{
		public void m1(){
			System.out.println("Inner Class");
		}
	}
	public void m2(){
		InnerClass1 i = new InnerClass1();
		i.m1();
		
	}
}

class Test{
	public static void main(String[] args){
		RegularInnerClassAccessOutsideClass o = new RegularInnerClassAccessOutsideClass();
		RegularInnerClassAccessOutsideClass.InnerClass1 i = o.new InnerClass1();
		i.m1();
		
	}
}