import java.sql.Connection;
import java.sql.*;
public class BookDao {
public static int save(String callno,String name,String author,String publisher,int quantity){
	int status=0;
	try{
		
		Connection con=DB.getConnection();
		Statement ps=con.createStatement();
		
		status=ps.executeUpdate("insert into books(callno,name,author,publisher,quantity,issued) values('"+callno+"','"+name+"','"+author+"','"+publisher+"','"+quantity+"','0')");
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
}
