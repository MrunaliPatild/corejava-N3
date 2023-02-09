package org.tnsif.multilevelinheritance;
//child class
public class Android extends Nokia {
	private String version;
	public void accept()
	{
		System.out.println("the android version name is:"+version);
	
	}
	//getters and setters
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	//default constructor
	public Android() {
		super();
	}
	public Android(int modelno) {
		super(modelno);
		
	}
	//parameterized constructor
	public Android(String version) {
		super();
		this.version = version;
	}
	
	
	

}
