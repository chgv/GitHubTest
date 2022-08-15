<%@ page contentType="text/html; charset=UTF-8" pageEncoding="Big5"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="javax.naming.*"%>

<HTML>
<HEAD>
<TITLE> 查詢員工資料 </TITLE>
</HEAD>
<BODY>
<%
       Context ctx = new javax.naming.InitialContext();
       DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/cga103g1");
       Connection con =  ds.getConnection();
       Statement stmt = con.createStatement();
       ResultSet rs = stmt.executeQuery("SELECT EMP_NO 員工編號,  EMP_NAME 員工姓名,  emp_acc 帳號, emp_pwd 密碼,  emp_state 狀態 from emp");
            
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