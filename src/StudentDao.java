import java.sql.*;
public class StudentDao {

	
	public static int save(String enrollment,String name,String password,String department,String email,String contact){
		int status=0;
		try{
			Connection con=DB.getConnection();
			Statement ps=con.createStatement();
		
			status=ps.executeUpdate("insert into student(enrollment,name,password,department,email,fine,contact) values('"+enrollment+"','"+name+"','"+password+"','"+department+"','"+email+"','0','"+contact+"')");
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int delete(String enroll){
		int status=0;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from student where enrollment=?");
			ps.setString(1,enroll);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

	public static boolean validate(String enrollment,String password){
		boolean status=false;
		try{
			Connection con=DB.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from student where enrollment=? and password=?");
			ps.setString(1,enrollment);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

}
