<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Big5"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="javax.naming.*"%>

<HTML>
<HEAD>
<TITLE> �d�߭��u��� </TITLE>
</HEAD>
<BODY>
<%
       Context ctx = new javax.naming.InitialContext();
       DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/cga103g1");
       Connection con =  ds.getConnection();
       Statement stmt = con.createStatement();
       ResultSet rs = stmt.executeQuery("SELECT EMP_NO ���u�s��,  EMP_NAME ���u�m�W,  emp_acc �b��, emp_pwd �K�X,  emp_state ���A from emp");
            
       ResultSetMetaData rsmd = rs.getMetaData();
	     int numberOfColumns = rsmd.getColumnCount();
%>

 <table border="1" bordercolor="blue">

     <tr> 
       <% for (int i = 1; i <= numberOfColumns; i++) { %>
	         <th><%=rsmd.getColumnLabel(i)%></th>
	     <% } %>      
	   </tr>
   
   <% while (rs.next()) { %>
     <tr>
        <% for (int i = 1; i <= numberOfColumns; i++) { %> 
           <td><%=rs.getString(i)%></td>
        <% } %>
     </tr>
   <% } %>

 </table>

<%con.close(); %>

</BODY>
</HTML>