package proxypackage;

public class applicationproxy implements resources{
	int priority=3;
	
		public applicationproxy(){
	           
			
		}

		
		@Override
		public boolean access(int p) {
			
			if(p<priority){
				System.out.println("access denied");
			}
			else {
				 applicationclass ac = new applicationclass();
				 ac.access(3);
			}
			return false;
			
			
		}

}
