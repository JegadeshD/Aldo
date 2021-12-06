package org.emp;

public class Client extends Company{//child 1
	public void cliID() {
	System.out.println("client Id is 007");
	}
	public void cliName() {
		System.out.println("client name is JamesBond");
	}
	@Override
	public void comName() {	
		System.out.println("company name is Julphar");
	}
public static void main(String[] args) {
	Client c = new Client();
	c.cliID();
	c.cliName();
	c.comId();
	c.comName();
}
	}


