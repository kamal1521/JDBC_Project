package dao;

import java.sql.*;

import connection.ConnectionManager;
import model.product;

public class Productdao {

	public void addProduct(product product)throws ClassNotFoundException,SQLException
	{
		//1. Java and JDBC connect
		ConnectionManager conm=new ConnectionManager();
		Connection con=conm.establishConnection();
		
		String sql_query="insert into product(productId,productName,minSellQuantity,price,qulatity) values (?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql_query);
		ps.setInt(1,product.getProductId());
		ps.setString(2,product.getPorductName());
		ps.setInt(3, product.getMinSellQuantity());
		ps.setInt(4, product.getPrice());
		ps.setInt(5, product.getQulatity());
		
		ps.executeUpdate();
		
		conm.closeConnection();
	}
		
	public void display() throws ClassNotFoundException,SQLException
	{
		//1. Java and JDBC connect
		ConnectionManager conm = new ConnectionManager();
		Connection con = conm.establishConnection();
		
		//1. statement class declare
		Statement st=con.createStatement();
		
		//2. write query
		ResultSet rs=st.executeQuery("select * from product");
		
		//check username and password
			while(rs.next())
			{
				System.out.println(rs.getString("productId")+" | "+rs.getString("productName")+" | "+rs.getInt("minSellQuantity")+" | "+rs.getInt("price")+" | "+rs.getInt("qulatity"));
			}
			conm.closeConnection();
	}
}
