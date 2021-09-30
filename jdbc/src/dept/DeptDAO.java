package dept;

public class DeptDAO {

	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			
	}
	public static Connection getConnection () {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user= "C##scott";
		String password ="tiger";
		
		
	}
}
