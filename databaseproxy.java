package proxypackage;

public class databaseproxy implements resources{
	int priority=2;
	
		public databaseproxy(){
	       
			
		}

		
		@Override
		public boolean access(int p) {
			
			if(p<priority){
				System.out.println("access denied");
			} 
			else {
				databaseclass dc = new databaseclass();
				dc.access(2);
			}
			return false;
			
			
		}

}
