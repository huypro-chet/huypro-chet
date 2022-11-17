<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
 <html lang="en">
 <head>
     <meta charset="UTF-8">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <title>ĐĂNG NHẬP</title>
     <link rel="stylesheet" href="template/khachhang/asset/css/dn.css">
     <link rel="preconnect" href="https://fonts.gstatic.com">
     <link rel="shortcut icon" type="image/png" href="template/khachhang/assets/images/Barcelona-Logo.ico"/>
     <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap" rel="stylesheet">
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
    <section>
        <div class="img-bg">
            <img src="https://hanoispiritofplace.com/wp-content/uploads/2017/11/hinh-nen-barcelona-13.jpg" alt="Hình Ảnh Minh Họa">
        </div>
        <div class="noi-dung">
            <div class="form">
                <h2>Đăng Nhập</h2>
                <form action="Dangnhap" method="post">
                    <div id="input-form">
                        <span>Tên Người Dùng</span>
                        <input type="text" name="username">
                    </div>
                    <div id="input-form">
                        <span>Mật Khẩu</span>
                        <input type="password" name="password">
                    </div>
                    <div id="nho-dang-nhap">
                        <label><input type="checkbox" name=""> Nhớ Đăng Nhập</label>
                    </div>
                    <div id="input-form">
                        <input type="submit"value="Đăng Nhập">
                    </div>
                    <div id="input-form">
                        <p>Bạn Chưa Có Tài Khoản? <a href="Dangky">Đăng Ký</a></p>
                    </div>
                </form>
                <h3>Đăng Nhập Bằng Mạng Xã Hội</h3>
                <ul class="icon-dang-nhap">
                    <li><i class="fa fa-facebook" aria-hidden="true"></i></li>
                    <li><i class="fa fa-google" aria-hidden="true"></i></li>
                    <li><i class="fa fa-twitter" aria-hidden="true"></i></li>
                </ul>
            </div>
        </div>
    </section>

    <script src="template/khachhang/asset/js/dn.js"></script>

    

</body>
</html>