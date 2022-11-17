<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!-- ***** Preloader Start ***** -->
  <div id="js-preloader" class="js-preloader">
    <div class="preloader-inner">
      <span class="dot"></span>
      <div class="dots">
        <span></span>
        <span></span>
        <span></span>
      </div>
    </div>
  </div>
  <!-- ***** Preloader End ***** -->

  <!-- ***** Header Area Start ***** -->
  <header class="header-area header-sticky">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <nav class="main-nav">
                    <!-- ***** Logo Start ***** -->
                    <a href="index.jsp" class="logo">
                        <img src="<c:url value='/template/khachhang/assets/images/FC-Barcelona-PNG-HD-Quality.png'/>" alt="">
                    </a>
                    <!-- ***** Logo End ***** -->
                    <!-- ***** Search End ***** -->
                    <div class="search-input">
                      <form id="search" action="#">
                        <input type="text" placeholder="Type Something" id='searchText' name="searchKeyword" onkeypress="handle" />
                        <i class="fa fa-search"></i>
                      </form>
                    </div>
                    <!-- ***** Search End ***** -->
                    <!-- ***** Menu Start ***** -->
                    <ul class="nav">
                    <c:choose>
                    	<c:when test="${not empty sessionScope.CurrenTaikhoan}">
								<li><a href="<c:url value='/view/khachhang/index.jsp'/>"
									class="active">Home</a></li>
								<li><a
									href="<c:url value='/view/khachhang/Traditionalroom.jsp'/>">Traditional
										room</a></li>
								<li><a href="logout">Log out</a></li>
								<li><a href="#">Xin Chào,${sessionScope.CurrenTaikhoan.taikhoan}</a></li>
								<li><a href="<c:url value='/Dangnhap'/>" onclick="session.invalidate();">Login/Sign up</a></li>
							</c:when> 
							<c:otherwise> 
								<li><a href="<c:url value='/Dangnhap'/>" onclick="session.invalidate();">Login/Sign up</a></li>
							</c:otherwise>
                    </c:choose> 
                       
                    </ul>   
                    <a class='menu-trigger'>
                        <span>Menu</span>
                    </a>
                    <!-- ***** Menu End ***** -->
                </nav>
            </div>
        </div>
    </div>
  </header>