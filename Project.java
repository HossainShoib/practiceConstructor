public class Project {
    private int id;
    private int number;
    private String name;

    // Constructor
    public Project(int id,int number ,String name){
		this.id=id;
		this.name=name;
		this.number=number;
		
		
	}
	;
/*
    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for number
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
	
	void showDetails (){
		
		System.out.println("ID : "+getId());
		System.out.println("NAME :" +getName());
		System.out.println("Number :" +getNumber());
		
		
	}
	
	public static void main(String[] args){
		Project obj = new Project();
		
		obj.setId(2);
		obj.setName("Shoib");
		obj.setNumber(00000);
		obj.showDetails();
	}
	*/
	
	//////////////////////////////////////////////////////////////////////////////////
	
	public void showDetails(){
		System.out.println("ID:"+id);
		System.out.println("NAME:"+name);
		System.out.println("NUMBER:"+number);
		
		
	}
	public static void main(String[]args){
		
		Project obj=new Project(2,03,"Shoib");
		
		/*obj.name("shoib");
		obj.number(223344);
		obj.id(2);*/
		obj.showDetails();
		
	}
	
	
	
	
	
	
	
	
	
}
