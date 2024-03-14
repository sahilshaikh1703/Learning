package passwordValidation;

class User {
	private Integer id;
	private String userName;
	private String password;

	// Defining constructor
	public User(Integer id, String userName, String password) {
		this.setId(id);
		this.setUserName(userName);
		this.setPassword(password);
	}

	// Getter
	public Integer getId() {
		return id;
	}

	// Setter
	public void setId(Integer id) {
		this.id = id;
	}

	// Getter
	public String getUserName() {
		return userName;
	}

	// Setter
	public void setUserName(String userName) {
		this.userName = userName;
	}

	// Getter
	public String getPassword() {
		return password;
	}

	// Setter
	public void setPassword(String password) {
		this.password = password;
	}
}

class userBO {

	// Create method which r eturn array of objects
	private User[] getUsers() {

		User[] users = new User[5];
		// Create objects
		users[0] = new User(1, "Luis", "BCDFEG");
		users[1] = new User(2, "Sahil", "BCDFEG");
		users[2] = new User(3, "Ajay", "BCDFEG");
		users[3] = new User(4, "Dave", "H&^#%$");
		users[4] = new User(5, "Max", "BCDFEG");

		return users;

	}

	private String passwordEncription(String password) {
		String res = "";

		for (int i = 0; i < password.length(); i++) {
			
			res = res + (char) (password.charAt(i) + 1);
	
		} 	

		return res;
	}

	public boolean validation(String userName, String password) {
		User users[] = getUsers();

		for (int i = 0; i < users.length; i++) {

			String un = users[i].getUserName();
			String up = users[i].getPassword();
			if (un.equals(userName) && up.equals(passwordEncription(password))) {
				return true;
			}
		}
		return false;

	}
}

public class main {
	public static void main(String[] args) {
		
	userBO	u = new userBO();

	System.out.println(u.validation("Max", "ABCEDF"));
	System.out.println(u.validation("Luis", "ABCEDF"));
	System.out.println(u.validation("Ajay", "ABsEDF"));

	}
}
