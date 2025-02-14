package tp3exosYaip4;


public class Person {
	private String name;
	private String address;
	
	public Person(String n, String a) {
		this.name=n;
		this.address=a;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAdress(String a) {
		this.address =a ;
	}
	 
	public String toSting() {
		return "Person[name= " + this.name + ", Adress= "+ this.address+ "]";
	}
	
    public static void main(String[] args) {
        Person p1 = new Person ("CONTRUCCI", "aix-en-provence");
        System.out.println(p1.toSting());
        
        p1.setAdress("Barcelonette");
        System.out.println(p1.toSting());
        
        Person p2 = new Person ("MEJEAN", "Marseille");
        System.out.println(p2.toSting());
    } 
	
}
