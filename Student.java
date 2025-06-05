package Spring_Demo;

public class Student {
	private int Id;
	private String Name;
	private String Mail;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getMail() {
		return Mail;
	}

	public void setMail(String mail) {
		Mail = mail;
	}

	public void Display() {
		System.out.println("|Std_ID: " + Id + "| Name: " + Name + "| Mail: " + Mail);
	}

}