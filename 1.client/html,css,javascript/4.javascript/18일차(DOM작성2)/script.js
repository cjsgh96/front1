/* 
기능:회원가입및 로그인을 위한 유효성 검사
*/
function loginCheck(){
    if(document.login.mem_id.value==""){
        alert("아이디를 먼저 입력해 주세요");
        document.login.mem_id.focus();
        return;
    }

    if(document.login.mem_passwd.value==""){
        alert("비밀번호를 먼저 입력해 주세요");
        document.login.mem_passwd.focus();
        return;
    }
    document.login.submit(); //서버로 전송하는 함수
}
//중복 id를 체크해주는 자바스크립트 함수선언
function idCheck(id){
    if(id==""){
        alert("아이디를 먼저 입력하세요");
        document.regForm.mem_id.focus();//커서입력
    }else{//입력했다면
        //window.open(1.불러올 문서명,2.창의 제목,3.창의 옵션[위치,크기 지정])
        open('idcheck.html','w','left=900,top=150,width=300,height=150');
        
    }
}
//회원가입 체크유무
function inputCheck(){
    if(document.regForm.mem_id.value==""){
        alert("아이디를 먼저 입력해 주세요");
        document.regForm.mem_id.focus();
        return;
    }
    //mem_passwd
    if(document.regForm.mem_passwd.value==""){
        alert("패스워드를 먼저 입력해 주세요");
        document.regForm.mem_passwd.focus();
        return;
    }
    //mem_repasswd
    if(document.regForm.mem_repasswd.value==""){
        alert("패스워드 확인을 먼저 입력해 주세요");
        document.regForm.mem_repasswd.focus();
        return;
    }   
    //mem_name
    if(document.regForm.mem_name.value==""){
        alert("이름을 먼저 입력해 주세요");
        document.regForm.mem_name.focus();
        return;
    }
    //mem_email
    if(document.regForm.mem_email.value==""){
        alert("이메일을 먼저 입력해 주세요");
        document.regForm.mem_email.focus();
        return;
    }
    //mem_phone
    if(document.regForm.mem_phone.value==""){
        alert("전화번호를 먼저 입력해 주세요");
        document.regForm.mem_phone.focus();
        return;
    }
    //mem_zipcode
    if(document.regForm.mem_zipcode.value==""){
        alert("우편번호를 먼저 입력해 주세요");
        document.regForm.mem_zipcode.focus();
        return;
    }
    //mem_address
    if(document.regForm.mem_address.value==""){
        alert("주소를 먼저 입력해 주세요");
        document.regForm.mem_address.focus();
        return;
    }
    //mem_job
    if(document.regForm.mem_job.value=="0"){
        alert("직업을 먼저 선택해 주세요");
        document.regForm.mem_job.focus();
        return;
    }
    //암호가 서로 일치하는지 검증
    if(document.regForm.mem_passwd.value!=document.regForm.mem_repasswd.value){
        alert("비밀번호가 일치하지 않습니다.");
        document.regForm.mem_repasswd.focus();
        return;
    }
    document.regForm.submit(); //서버로 전송시키는 함수

}
//우편번호를 검색해주는 함수선언
function zipCheck(){
    //left,top,width,height+menubar,status(상태바),scrollbars(스크롤기능),toolbar=yes|no(출연유무)
    open('zipcheck.html','w','left=400,top=220,width=550,height=300,'+
                            'menubar=no,status=yes,toolbar=no,scrollbars=yes');
}


