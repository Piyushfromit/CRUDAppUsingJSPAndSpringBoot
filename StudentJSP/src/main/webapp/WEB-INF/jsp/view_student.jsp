<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<HTML>
   <HEAD>
      <TITLE>JSP for CRUD</TITLE>
      <style type="text/css">
         
         #myTable{
         border-collapse: collapse;
         border: 1px solid black;
         margin: auto;
         }
         a{
         text-decoration: none;
         }
         
         th,td {
         border: 1px solid black;
         text-align: center;
         padding:10px;
         }
         .btn{
         text-decoration: none;
        
         }
         
         .editbtncolor{
         background-color: green;
         border: none;
          border-radius: 10px;
           color:white;
         }
         
         
         .deletebtncolor{
          background-color: red;
           border: none;
           border-radius: 10px;
           color:white;
         }
         
         #addbtn{
         background-color: #61fac2;
           border: none;
           border-radius: 10px;
           margin:1% 0 1% 45%;
           padding:5px 10px;
           
           
         
         }
         
      </style>
   </HEAD>
   <BODY>
   
   
   
   

		<button id="addbtn"><a href="add_student">Add Student</a></button>

   
   
   
   
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
                     <td><a href="/editStudentById/${data.id}" class="btn edit"><button class="editbtncolor">Edit</button></a></td>
                     <td><a href="/deleteStudentById/${data.id}" class="btn delete"><button class="deletebtncolor">delete</button></a></td>
                     
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