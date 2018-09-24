import java.sql.Connection;
import java.sql.*;
public class RequestBookDao {
public static int save(String enrollment,String name,String author,String publisher,int quantity){
	int status=0;
	try{
		
		Connection con=DB.getConnection();
		Statement ps=con.createStatement();
		
		status=ps.executeUpdate("insert into requestBook(enrollment,bookname,author,publisher,quantity) values('"+enrollment+"','"+name+"','"+author+"','"+publisher+"','"+quantity+"')");
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
}
