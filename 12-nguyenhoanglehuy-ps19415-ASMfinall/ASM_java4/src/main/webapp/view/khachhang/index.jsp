<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/comlic/taglib.jsp" %>
<!DOCTYPE html>
<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap" rel="stylesheet">
    <title>BARCELONA _ CLUB</title>
	<%@ include file="/comlic/head.jsp" %>
  </head>

<body>
	
  <%@ include file="/comlic/header.jsp" %>
  <!-- ***** Header Area End ***** -->

  <div class="container">
    <div class="row">
      <div class="col-lg-12">
        <div class="page-content">

          <!-- ***** Banner Start ***** -->
          <div class="main-banner">
            <div class="row">
              <div class="col-lg-7">
                <div class="header-text">
                  <h6>WELCOME FC BARCELONA</h6>
                  <h4><em>BARCELONA IS FOREVER TOP </em>FOREVER BEAUTIFUL</h4>
                  <div class="main-button">
                    <a href="browse.html">XEM</a>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <!-- ***** Banner End ***** -->

          <!-- ***** Most Popular Start ***** -->
          <div class="most-popular">
            <div class="row">
              <div class="col-lg-12">
                <div class="heading-section">
                  <h4><em>HIGHLIGHTS</em>FC BARCELONA</h4>
                </div>
                <div class="row">
                <c:forEach var="sanpham" items="${sanphams}">
                	<div class="col-lg-3 col-sm-6">
                	<h5>${sanpham.tensp}</h5>
                    <div class="item">
                      <a href="<c:url value='/videoct?action=Watch&id=${sanpham.codelink}'/>" target="_self"> 
   							<img src="https://taoanhonline.com/wp-content/uploads/2019/07/hinh-nen-barcelona-14.jpg" alt=""/></a> 
                      <h4>Highlights<br><span></span></h4>
                      <ul>
                        <li><i class="fa fa-star"></i>${sanpham.luottuongtac} Share</li>
                        <li><i class="fa fa-download"></i>${sanpham.luotxem} view</li>
                      </ul>
                    </div>
                  </div>
                </c:forEach>
                <!-- san pham -->
                 
                  </div>
                </div>
              </div>
            </div>
          </div>
          <!-- ***** Most Popular End ***** -->

          <!-- ***** Gaming Library Start ***** -->
         
          <!-- ***** Gaming Library End ***** -->
        </div>
      </div>
    </div>
  </div>
  
 <%@ include file="/comlic/Footter.jsp" %>


  </body>

</html>