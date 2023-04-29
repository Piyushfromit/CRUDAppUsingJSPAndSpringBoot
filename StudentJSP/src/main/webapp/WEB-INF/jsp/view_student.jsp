<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<HTML>
   <HEAD>
      <TITLE>JSP for CRUD</TITLE>
      <style type="text/css">
         #myTable{
         color: red;
         }
         table {
         border-collapse: collapse;
         border: 1px solid black;
         } 
         th,td {
         border: 1px solid black;
         }
         table.a {
         table-layout: auto;
         width: 180px;  
         }
         #tableDiv{
         border: 2px solid black;
         border-radius: 10px;
         width: 30%
         }
      </style>
   </HEAD>
   <BODY>
   <jsp:include page="header.jsp"></jsp:include>
      <div id= "tableDiv">
         <table id="myTable" class="display">
            <thead>
               <tr>
                  <th>Roll No: </th>
                  <th>Name</th>
                  <th>Marks</th>
                  <th>Address</th>
                  <th>Edit</th>
                  <th>Delete</th>
                  
               </tr>
            </thead>
            <tbody>
               <c:forEach var="data" items="${studentList}">
                  <tr>
                     <td>${data.id}</td>
                     <td>${data.name}</td>
                     <td>${data.marks}</td>
                     <td>${data.address}</td>
                     <td><a href="/editStudentById/${data.id}" class="btn">Edit</a></td>
                     <td><a href="/deleteStudentById/${data.id}" class="btn">delete</a></td>
                     
                  </tr>
               </c:forEach>
            </tbody>
         </table>
      </div>
      
      
      
      <script>
         $(document).ready( function () {
             $('#myTable').DataTable();
         } );
      </script>
      <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
      <script src="/DataTables/datatables.js"></script>
      
      
      
   </BODY>
</HTML>