package proxypackage;

public class networkproxy implements resources{
int priority=1;

	public networkproxy(){
          
		
	}

	
	@Override
	public boolean access(int up) {
		
		if(up<priority){
		
			System.out.println("access denied");
		}
		else {
			netwoekClass nc = new netwoekClass();
			 nc.access(1);
		}
		return false;
		
		
	}




	}
	


