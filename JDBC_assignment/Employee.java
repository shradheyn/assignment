import java.sql.*;
public class Employee {

	Connection con;
	PreparedStatement ps;
	Statement st;
	ResultSet res;
	
	Employee()
	{
		con=null;
	}
	
	public Connection getConnection()
	{
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/training","root","bitch123");
		}
		catch(Exception e){
			System.out.println(e);
		}
		return con;
	}
	
	public void insertEmployee(String name, String city, String contact) 
	{
		System.out.println("**************** Insert new Employees*****************");
		
		try {
			con=getConnection();
			ps=con.prepareStatement("insert into employees (name,city,contact) values(?,?,?)");
			ps.setString(1, name);
			ps.setString(2, city);
			ps.setString(3, contact);
			ps.setInt(4, id);
			int r=ps.executeUpdate();
			System.out.println(r+" employees successfully inserted.");
			con.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		}
	
	public void getEmployee() 
	{
	 System.out.println("**************** Display Employees*****************");
	 try {
		 con=getConnection();
		 //st=con.createStatement();
		 ps=con.prepareStatement("select * from employees");
		 //res=st.executeQuery("select * from user");
		 res=ps.executeQuery();
		 System.out.println("Id\t Name\t City\t Contact");
		 System.out.println("-----------------------------------");
		 
		 while(res.next())
		 {
			 System.out.print(res.getInt(4)+"\t");
			 System.out.print(res.getString(2)+"\t");
			 System.out.print(res.getString(3));
			 System.out.println(res.getDate(1));
		 }
		 System.out.println("-----------------------------------");
		 res.close(); con.close();
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
	 
	}
	
	public void updateEmployee(int id,String name,String contact,String city) 
	{
		System.out.println("**************** Update Employees*****************");
		con = getConnection();
        ps = con.prepareStatement("UPDATE employees SET name=?, city=? WHERE id=?");
        ps.setString(1, name);
        ps.setString(2, city);
        ps.setString(3, contact);
        ps.setInt(4, id);
        int rows = ps.executeUpdate();
        System.out.println(rows + " Employee updated successfully.");
        con.close();
    } catch (Exception e) {
        System.out.println(e);
    }
	}
	
	public void deleteEmployee(int cid) 
	{
		System.out.println("**************** Delete Employees*****************");
		try {
			con = getConnection();
	        ps = con.prepareStatement("DELETE from employees WHERE id=?");
	        ps.setInt(1,id);
	        int r=ps.executeUpdate();
	        System.out.println(r+" employee deleted successfully");
	        con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
