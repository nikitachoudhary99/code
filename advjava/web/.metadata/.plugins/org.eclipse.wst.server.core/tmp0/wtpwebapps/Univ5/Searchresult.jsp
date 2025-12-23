<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Results</title>
<style>
  table {
    border-collapse: collapse;
    width: 70%;
    margin: auto;
  }
  th, td {
    border: 1px solid #999;
    padding: 8px;
    text-align: center;
  }
  th {
    background-color: #005f99;
    color: white;
  }
</style>
</head>
<body>
<center>
<h1>Search Results</h1>
<hr>
<%
    String searchTerm = request.getParameter("searchTerm");
    if(searchTerm == null || searchTerm.trim().isEmpty()){
        out.print("<h3>Please enter a product name or ID to search.</h3>");
    } else {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/30apr25ad?user=root&password=mishthu99");
            
            String sql = "SELECT * FROM product WHERE pname LIKE ? OR pid = ?";
            
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + searchTerm + "%");
            
            // try to parse pid as int, if fails, set to -1 which won't match any pid
            int pid = -1;
            try {
                pid = Integer.parseInt(searchTerm);
            } catch(NumberFormatException e) {
                pid = -1;
            }
            ps.setInt(2, pid);
            
            rs = ps.executeQuery();
            
            if(!rs.isBeforeFirst()) { // no rows
                out.print("<h3>No products found matching: " + searchTerm + "</h3>");
            } else {
%>
                <table>
                    <tr>
                        <th>Product ID</th>
                        <th>Product Name</th>
                        <th>Price</th>
                    </tr>
<%
                while(rs.next()) {
                    int pidResult = rs.getInt("pid");
                    String pname = rs.getString("pname");
                    double price = rs.getDouble("price");
%>
                    <tr>
                        <td><%= pidResult %></td>
                        <td><%= pname %></td>
                        <td><%= price %></td>
                    </tr>
<%
                } // while
%>
                </table>
<%
            }
        } catch(Exception e) {
            out.print("<h3>Error: " + e.getMessage() + "</h3>");
            e.printStackTrace();
        } finally {
            try { if(rs != null) rs.close(); } catch(Exception e) {}
            try { if(ps != null) ps.close(); } catch(Exception e) {}
            try { if(con != null) con.close(); } catch(Exception e) {}
        }
    }
%>
<br>
<a href="search.jsp">Back to Search</a> | <a href="Home.jsp">Back to Home</a>
<hr>
<address>
Universal Informatics <br>
Bhawarkua, Indore<br>
Madhya Pradesh
</address>
</center>
</body>
</html>
