/*
Annonymous Inner Classes vs Lambda Expressions:
-----------------------------------------------
	1. The class without having name is called Annonymous inner class.
		
	2.	Thread t =  new Thread()
		{
			.........
		};
		We are writting a calss that extends Thread class.
	
	3. Runnable r = new Runnable()
	   {
		.......
	   };
	   We are creating child class for the Runnable interface or implementing Runnable Interface.
	4. An annonymous inner class extends a class or implementing runnable interface.
*/

class AnnonymousInnerClassLambdaExp{
	public static void main(String[] args){
		/*Runnable r = new Runnable()
		{
			public void run(){
				for(int i =0; i<10; i++){
					System.out.println("Child Thread");
				}
			}
		};*/
		
		Thread t = new Thread(r);
		t.start();
		for(int i =0; i<10; i++){
			System.out.println("Main Thread");
		}
	}
}
