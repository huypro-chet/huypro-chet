// định nghĩa đối tượng dk
function dk(options){

    // function getparen(element, selector) {
    //     while(element.parentElement){
    //         if(element.parentElement.matches(selector)){
    //             return element.parentElement;
    //         }
    //         element = element.parentElement
    //     }
    // }

    var seletorRule = {};
    // hàm thực hiện lỗi
    function loi(inputElement, rule){
        // var errorElement = getparen(inputElement, '#form-group')
        var errormessage;
        var errorElement = inputElement.parentElement.querySelector(options.errorSelector); 
        // lấy ra các Rule của selec
        var rules = seletorRule[rule.selector];
        // lặp lại từng rule (check)
        // nếu lối = dừng check
        for (var i=0 ; i < rules.length; i++){
           errormessage = rules[i] (inputElement.value);
           if (errormessage) break;
        }
                    
        if(errormessage) {
            errorElement.innerText = errormessage;
            inputElement.parentElement.classList.add('invalid');
        }else {
            errorElement.innerText = '';
            inputElement.parentElement.classList.remove('invalid');
        }

        return !errormessage;
    }
    // lấy element form
    var formElement = document.querySelector(options.form);

    if(formElement){
        // khi submit form
        formElement.onsubmit = function(e) {
            e.preventDefault();

            var iskhongloi = true;
            // lặp qua từng rule và loi
            options.rules.forEach(function (rule) {
                var inputElement = formElement.querySelector(rule.selector);
                var khongloi = loi(inputElement, rule);
                if(! khongloi) {
                    iskhongloi = false;
                }
            });

          

            if(iskhongloi){
                if(typeof options.onsubmit === 'function'){
                    // trường hợp có submit js
                    var enableinputs = formElement.querySelectorAll('[name]');
                    var formvalues = Array.from(enableinputs).reduce(function(values, input){
                        values[input.name] = input.value
                        return values;
                    }, {});
                    options.onsubmit(formvalues);
                }
                // trường hợp submit với hành vi mặc định
                else{
                    formElement.submit();
                }
            }
        }


        //lặp qua mỗi rule và xử lý(....)
        options.rules.forEach(function (rule) {

            // lưu lại các rule
            if (Array.isArray(seletorRule[rule.selector])){
                seletorRule[rule.selector].push(rule.text);
            }else{
                seletorRule[rule.selector] = [rule.text];
            }


            var inputElement = formElement.querySelector(rule.selector);
          
            if(inputElement){
                // xử lý trường hợp blur khỏi input
                inputElement.onblur = function() {
                   loi(inputElement, rule);
                }

                // xử lý nhập input
                inputElement.oninput = function(){
                    var errorElement = inputElement.parentElement.querySelector(options.errorSelector);
                    errorElement.innerText = '';
                    inputElement.parentElement.classList.remove('invalid');
                }
            }

        });
    }


}
// đinh nghĩa các rules
// nguyên tắc rule:
// 1. khi có lỗi -> Trả ra mess lỗi
// 2. khi hợp lệ -> ko trả ra kết quả
dk.isrequired = function(selector, message) {
    return {
        selector : selector,
        text : function (value) {
            return value.trim() ? undefined :  message || 'Vui lòng nhập trường này !'
        }
    };
}

dk.isEmail = function(selector, message) {
    return {
        selector : selector,
        text : function (value) {
            var regex = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
            return regex.test(value) ? undefined:  message || 'Vui lòng nhập trường này !'
        }
    };
}

dk.minlength = function(selector, min, message) {
    return {
        selector : selector,
        text : function (value) {
            return value.length >= min ? undefined:  message || `Vui lòng nhập tối thiểu ${min} ký tự`;
        }
    };
}

dk.isConform = function(selector, getConform, message) {
    return {
        selector : selector,
        text : function (value) {
            return value == getConform() ? undefined : message || 'Vui lòng nhập trường này !'
        }
    };
}