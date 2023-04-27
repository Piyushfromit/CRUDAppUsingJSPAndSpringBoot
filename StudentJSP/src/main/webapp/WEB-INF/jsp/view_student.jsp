<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List, com.student.model.Student" %>
<HTML>
	<HEAD><TITLE>This is my first program</TITLE></HEAD>
	<BODY>
		<%@include file="header.jsp" %>
		<hr />
		<% List<Student> myList = (List<Student>)request.getAttribute("studentList"); %>
		
		<fieldset>
			<legend><strong><big>Student List</big></strong></legend>
			<table width="100%" border="1" cellpadding="4" cellspacing="4">
				<tr>
					<th align="right">Roll No.</th>
					<th align="left">Name</th>
					<th align="right">Percentage</th>
					<th align="right">Admission Date</th>
				</tr>
				
				<% for(Student st: myList){
				%>
				<tr>
					<td align="right"><%= st.getId() %></td>
					<td align="left"><%= st.getName() %></td>
					<td align="right"><%= st.getMarks() %></td>
					<td align="right"><%= st.getAddress() %></td>
				</tr>
				<%
				} %>
				
			</table>
		</fieldset>
	</BODY>
</HTML>