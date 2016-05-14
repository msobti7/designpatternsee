package proxypackage;

public class databaseclass implements resources{
int priority=1;
	@Override
	public boolean access(int P) {
		System.out.println("access given");
	return true;
	}

}
