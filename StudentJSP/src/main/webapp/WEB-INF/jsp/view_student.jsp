<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List, com.student.model.Student" %>
<HTML>
	<HEAD><TITLE>This is my first program</TITLE>
	
	
	
	
	</HEAD>
	<BODY>
		<%@include file="header.jsp" %>
		<hr />
		<% List<Student> myList = (List<Student>)request.getAttribute("studentList"); %>
		
		<fieldset>
			<legend><strong><big>Student List</big></strong></legend>
			<table width="100%" border="1" cellpadding="4" cellspacing="4">
				<tr>
					<th align="auto">Roll No.</th>
					<th align="auto">Name</th>
					<th align="auto">Marks</th>
					<th align="auto">Address</th>
				</tr>
				
				<% for(Student st: myList){
				%>
				<tr>
					<td align="middle"><%= st.getId() %></td>
					<td align="left"><%= st.getName() %></td>
					<td align="left"><%= st.getMarks() %></td>
					<td align="left"><%= st.getAddress() %></td>
				</tr>
				<%
				} %>
				
			</table>
		</fieldset>
		
		

	
		
		
		
		
	</BODY>
</HTML>