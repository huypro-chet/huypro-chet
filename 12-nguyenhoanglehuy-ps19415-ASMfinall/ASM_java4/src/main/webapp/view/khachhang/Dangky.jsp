<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
 <html lang="en">
 <head>
     <meta charset="UTF-8">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <title>ĐĂNG KÝ</title>
     <link rel="stylesheet" href="template/khachhang/asset/css/dk.css">
     <link rel="preconnect" href="https://fonts.gstatic.com">
     <link rel="shortcut icon" type="image/png" href="/template/khachhang/assets/images/Barcelona-Logo.ico"/>
     <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500&display=swap" rel="stylesheet">
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
    <section>
        <div class="img-bg">
            <img src="https://hanoispiritofplace.com/wp-content/uploads/2017/11/hinh-nen-barcelona-13.jpg" alt="Hình Ảnh Minh Họa">
        </div>
        <div class="noi-dung">
            <div id="form">
                <h2>Đăng Ký</h2>
                <form action="Dangky" method="POST">
                    <div class="form-group">
                        <label for="fullname" class="form-label">Tên Người Dùng</label>
                        <input id="fullname" type="text" name="username" placeholder="VD:Huy lee">
                        <span class="form-message"></span>
                    </div>
                    <div class="form-group">
                        <label for="email" class="form-label">Email người dùng</label>
                        <input id="email" type="text" name="email" placeholder="VD:Huymat890@gmail.com">
                        <span class="form-message"></span>
                    </div>
                    <div class="form-group">
                        <label for="password" class="form-label">Mật Khẩu</label>
                        <input id="password" type="password" name="password" placeholder="">
                        <span class="form-message"></span>
                    </div>
                    <div class="form-group">
                        <label for="password_confirmation" class="form-label">Nhập Lại Mật Khẩu</label>
                        <input id="password_confirmation" type="password" name="password_confirmation" placeholder="">
                        <span class="form-message"></span>
                    </div>
                 
                    <div class="form-group">
                        <button type="form_submit">ĐĂNG KÝ</button>
                    </div>

                    <div class="form-group">
                        <p>Bạn đã có tài khoản rồi? <a href="./Dangnhap">Đăng nhập</a>.</p>
                        </div>
                </form>
                <h3>Đăng Ký Bằng Mạng Xã Hội</h3>
                <ul class="icon-dang-nhap">
                    <li><i class="fa fa-facebook" aria-hidden="true"></i></li>
                    <li><i class="fa fa-google" aria-hidden="true"></i></li>
                    <li><i class="fa fa-twitter" aria-hidden="true"></i></li>
                </ul>
            </div>
        </div>
    </section>

    <script src="template/khachhang/asset/js/dk.js"></script>
<!-- điều muốn làm -->
    <script>
        dk({
            form: '#form-2',
            // formgroupselector: '#form-group',
            errorSelector: '.form-message',
            rules:[
                dk.isrequired('#fullname', 'Vui lòng nhập tên đầy đủ !'),
                dk.isrequired('#email'),
                dk.isEmail('#email', 'Vui lòng nhập đúng email !'),
                dk.minlength('#password', 8),
                dk.isrequired('#password_confirmation'),
                dk.isrequired('#province', 'Vui lòng chọn Tỉnh/TP của bạn !'),
                dk.isConform('#password_confirmation', function () {
                    return document.querySelector('#form-2 #password').value;
                }, 'Mật khẩu nhập lại không chính xác !')
            ],
            onsubmit: function (data) {
                // call API
                console.log(data);
            }
        });
    </script>

</body>
</html>