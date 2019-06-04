class RegularInnerClass{
	class InnerClass1{
		public void m1(){
			System.out.println("Inner Class");
		}
	}
	public static void main(String[] args){
		RegularInnerClass o = new RegularInnerClass();
		RegularInnerClass.InnerClass1 i = o.new InnerClass1();
		i.m1();
	}
}