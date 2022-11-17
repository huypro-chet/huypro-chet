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

          <!-- ***** Featured Games Start ***** -->
          <div class="row">
            <div class="col-lg-8">
              <div class="featured-games header-text">
                <div class="heading-section">
                  <h4><em>DANH SÁCH</em>CẦU THỦ TIÊU BIỂU</h4>
                </div>
                <div class="owl-features owl-carousel">
                  <div class="item">
                    <div class="thumb">
                      <img src="https://upload.wikimedia.org/wikipedia/commons/c/c1/Lionel_Messi_20180626.jpg" height=380px alt="">
                      <div class="hover-effect">
                        <h6>Cầu thủ huyền thoại</h6>
                      </div>
                    </div>
                    <h4>Leonel Messi<br><span>Tiền Đạo</span></h4>
                    <!--<ul>
                      <li><i class="fa fa-star"></i> 4.8</li>
                      <li><i class="fa fa-download"></i> 2.3M</li>
                    </ul> -->
                  </div>
                  <div class="item">
                    <div class="thumb">
                      <img src="https://upload.wikimedia.org/wikipedia/commons/6/6d/Luis_Su%C3%A1rez_2018.jpg" height=380px alt="">
                      <div class="hover-effect">
                        <h6>Cầu Thủ Siêu Sao</h6>
                      </div>
                    </div>
                    <h4>Luis SuÃ¡rez<br><span>Tiền Đạo</span></h4>
                    <!--<ul>
                      <li><i class="fa fa-star"></i> 4.8</li>
                      <li><i class="fa fa-download"></i> 2.3M</li>
                    </ul> -->
                  </div>
                  <div class="item">
                    <div class="thumb">
                      <img src="https://upload.wikimedia.org/wikipedia/commons/5/53/Xavi_13981129001173637176666027076571.jpg" height=380px alt="">
                      <div class="hover-effect">
                        <h6>Cầu thủ huyền thoại</h6>
                      </div>
                    </div>
                    <h4>Xavier HernÃ¡ndez<br><span>Tiền Vệ</span></h4>
                    <!-- <ul>
                      <li><i class="fa fa-star"></i> 4.8</li>
                      <li><i class="fa fa-download"></i> 2.3M</li>
                    </ul> -->
                  </div>
                  <div class="item">
                    <div class="thumb">
                      <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Andr%C3%A9s_Iniesta_%28cropped%29.jpg/330px-Andr%C3%A9s_Iniesta_%28cropped%29.jpg" height=380px alt="">
                      <div class="hover-effect">
                        <h6>Cầu thủ huyền thoại</h6>
                      </div>
                    </div>
                    <h4>AndrÃ©s Iniesta LujÃ¡n<br><span>Tiền Vệ</span></h4>
                    <!-- <ul>
                      <li><i class="fa fa-star"></i> 4.8</li>
                      <li><i class="fa fa-download"></i> 2.3M</li>
                    </ul> -->
                  </div>
                  <div class="item">
                    <div class="thumb">
                      <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/Premios_Goya_2020_-_Carles_Pujol.jpg/330px-Premios_Goya_2020_-_Carles_Pujol.jpg" height=380px alt="">
                      <div class="hover-effect">
                        <h6>Cầu thủ huyền thoại</h6>
                      </div>
                    </div>
                    <h4>Carles Puyol<br><span>Trung Vệ</span></h4>
                    <!--  <ul>
                      <li><i class="fa fa-star"></i> 4.8</li>
                      <li><i class="fa fa-download"></i> 2.3M</li>
                    </ul>-->
                  </div>
                  <div class="item">
                    <div class="thumb">
                      <img src="https://upload.wikimedia.org/wikipedia/commons/c/c8/Real_Valladolid-Valencia_CF%2C_2019-05-18_%2890%29_%28cropped%29.jpg" height="380px" alt="">
                      <div class="hover-effect">
                        <h6>Cầu thủ huyền thoại</h6>
                      </div>
                    </div>
                    <h4>Ronaldo LuÃ­s NazÃ¡rio de Lima<br><span>Tiền Đạo</span></h4>
                   <!-- <ul>
                      <li><i class="fa fa-star"></i> 4.8</li>
                      <li><i class="fa fa-download"></i> 2.3M</li>
                    </ul>-->
                  </div>
                </div>
              </div>
            </div>
            <div class="col-lg-4">
              <div class="top-downloaded">
                <div class="heading-section">
                  <h4><em>Top</em>View & Share</h4>
                </div>
                <ul>
                  <li>
                    <img src="assets/images/game-01.jpg" alt="" class="templatemo-item">
                    <h4>Fortnite</h4>
                    <h6>Sandbox</h6>
                    <span><i class="fa fa-star" style="color: yellow;"></i> 4.9</span>
                    <span><i class="fa fa-download" style="color: #ec6090;"></i> 2.2M</span>
                    <div class="download">
                      <a href="#"><i class="fa fa-download"></i></a>
                    </div>
                  </li>
                  <li>
                    <img src="assets/images/game-02.jpg" alt="" class="templatemo-item">
                    <h4>CS-GO</h4>
                    <h6>Legendary</h6>
                    <span><i class="fa fa-star" style="color: yellow;"></i> 4.9</span>
                    <span><i class="fa fa-download" style="color: #ec6090;"></i> 2.2M</span>
                    <div class="download">
                      <a href="#"><i class="fa fa-download"></i></a>
                    </div>
                  </li>
                  <li>
                    <img src="assets/images/game-03.jpg" alt="" class="templatemo-item">
                    <h4>PugG</h4>
                    <h6>Battle Royale</h6>
                    <span><i class="fa fa-star" style="color: yellow;"></i> 4.9</span>
                    <span><i class="fa fa-download" style="color: #ec6090;"></i> 2.2M</span>
                    <div class="download">
                      <a href="#"><i class="fa fa-download"></i></a>
                    </div>
                  </li>
                </ul>
                <div class="text-button">
                  <a href="profile.html">View All Games</a>
                </div>
              </div>
            </div>
          </div>
          <!-- ***** Featured Games End ***** -->

          <!-- ***** Start Stream Start ***** -->
          <div class="start-stream">
            <div class="col-lg-12">
              <div class="heading-section">
                <h4><em>How To Start Your</em> Live Stream</h4>
              </div>
              <div class="row">
                <div class="col-lg-4">
                  <div class="item">
                    <div class="icon">
                      <img src="assets/images/service-01.jpg" alt="" style="max-width: 60px; border-radius: 50%;">
                    </div>
                    <h4>Go To Your Profile</h4>
                    <p>Cyborg Gaming is free HTML CSS website template provided by TemplateMo. This is Bootstrap v5.2.0 layout.</p>
                  </div>
                </div>
                <div class="col-lg-4">
                  <div class="item">
                    <div class="icon">
                      <img src="assets/images/service-02.jpg" alt="" style="max-width: 60px; border-radius: 50%;">
                    </div>
                    <h4>Live Stream Button</h4>
                    <p>If you wish to support us, you can make a <a href="https://paypal.me/templatemo" target="_blank">small contribution via PayPal</a> to info [at] templatemo.com</p>
                  </div>
                </div>
                <div class="col-lg-4">
                  <div class="item">
                    <div class="icon">
                      <img src="assets/images/service-03.jpg" alt="" style="max-width: 60px; border-radius: 50%;">
                    </div>
                    <h4>You Are Live</h4>
                    <p>You are not allowed to redistribute this template's downloadable ZIP file on any other template collection website.</p>
                  </div>
                </div>
                <div class="col-lg-12">
                  <div class="main-button">
                    <a href="profile.html">Go To Profile</a>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <!-- ***** Start Stream End ***** -->

          <!-- ***** Live Stream Start ***** -->
          
           <div class="gaming-library">
            <div class="col-lg-12">
              <div class="heading-section">
                <h4><em>YOU</em> Library</h4>
              </div>
              <div class="item">
                <ul>
                  <li><img src="assets/images/game-01.jpg" alt="" class="templatemo-item"></li>
                  <li><h4>Dota 2</h4><span>Sandbox</span></li>
                  <li><h4>Date Added</h4><span>24/08/2036</span></li>
                  <li><h4>Hours Played</h4><span>634 H 22 Mins</span></li>
                  <li><h4>Currently</h4><span>Downloaded</span></li>
                  <li><div class="main-border-button border-no-active"><a href="#">Donwloaded</a></div></li>
                </ul>
              </div>
              <div class="item">
                <ul>
                  <li><img src="assets/images/game-02.jpg" alt="" class="templatemo-item"></li>
                  <li><h4>Fortnite</h4><span>Sandbox</span></li>
                  <li><h4>Date Added</h4><span>22/06/2036</span></li>
                  <li><h4>Hours Played</h4><span>740 H 52 Mins</span></li>
                  <li><h4>Currently</h4><span>Downloaded</span></li>
                  <li><div class="main-border-button"><a href="#">Donwload</a></div></li>
                </ul>
              </div>
              <div class="item last-item">
                <ul>
                  <li><img src="assets/images/game-03.jpg" alt="" class="templatemo-item"></li>
                  <li><h4>CS-GO</h4><span>Sandbox</span></li>
                  <li><h4>Date Added</h4><span>21/04/2036</span></li>
                  <li><h4>Hours Played</h4><span>892 H 14 Mins</span></li>
                  <li><h4>Currently</h4><span>Downloaded</span></li>
                  <li><div class="main-border-button border-no-active"><a href="#">Donwloaded</a></div></li>
                </ul>
              </div>
            </div>
            <div class="col-lg-12">
              <div class="main-button">
                <a href="profile.html">View Your Library</a>
              </div>
            </div>
          </div>
        
          <!-- ***** Live Stream End ***** -->

        </div>
      </div>
    </div>
  </div>
  
 <%@ include file="/comlic/Footter.jsp" %>


  </body>

</html>