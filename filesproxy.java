package proxypackage;

public class filesproxy implements resources{
	int priority=4;
	
		public filesproxy(){
	         
			
		}

		
		@Override
		public boolean access(int p) {
			
			if(p<priority){
				System.out.println("access denied");
			}
			else {
				filesclass fc= new filesclass();
				fc.access(4);
			}
			return false;
			
			
		}

}
