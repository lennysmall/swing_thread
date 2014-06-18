package thread;

public class SampleThread {

	public static void main(String[] args) {
		Thread th1 = new MyThread("first");
		Thread th2 = new MyThread("second");
		
		th1.start();
		th2.start();
//		th1.run();   이렇게 실행하면 안됨
//		th2.run();   순서대로 호출함
	}

}

	class MyThread extends Thread{
		String name;
		
		public MyThread(String name){
			this.name = name;
		}
		
		@Override
		public void run(){
			System.out.println(Thread.currentThread()+name);
			for(int i=0;i<10;i++){
				System.out.println("Thread name: "+name);
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){
					
				}
			}
		}
	}