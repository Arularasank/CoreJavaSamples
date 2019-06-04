class RegularInnerClassAccessFromIntanceArea{
	class InnerClass1{
		public void m1(){
			System.out.println("Inner Class");
		}
	}
	public void m2(){
		InnerClass1 i = new InnerClass1();
		i.m1();
		
	}
	public static void main(String[] args){
		RegularInnerClassAccessFromIntanceArea o = new RegularInnerClassAccessFromIntanceArea();
		o.m2();
	}
}