package jdbcsql;
import java.util.*;
import java.sql.*;
public class jdbcc {
	public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String DB_URL="jdbc:mysql://localhost:3306/pritione";
	public static final String user="root";
	public static final String password="Priti@2000";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		String query="";
		PreparedStatement p=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(DB_URL, user, password);
			query="insert into teachers values(?,?,?,?,?,?);";
			System.out.println("Enter name");
			String var_name=sc.next();
			System.out.println("Enter addr");
			String addr=sc.next();
			System.out.println("Enter phone no");
			String phno=sc.next();
			System.out.println("Enter qualification");
			String dop=sc.next();
			System.out.println("Enter doj");
			String ch=sc.next();
			System.out.println("Enter salary");
			String salary=sc.next();
			p=con.prepareStatement(query);
			p.setString(1, var_name);
			p.setString(2,addr);
			p.setString(3,phno);
			p.setString(4, dop);
			p.setString(5, ch);
			p.setString(6, salary);
			p.executeUpdate();
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
