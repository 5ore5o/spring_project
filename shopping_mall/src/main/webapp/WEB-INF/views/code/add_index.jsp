<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<body class="bodycss">
    <section class="admin_bgcolor">
    <form id="adminfrm" method="POST" onsubmit="return adminlogin()">
        <div class="admin_login">
            <span>
                <div class="left_div">
                <ul>
                <li><input type="text" class="input_text1" placeholder="관리자 아이디를 입력하세요" name="adid"></li>
                <li><input type="password" class="input_text1" placeholder="관리자 패스워드를 입력하세요" name="adpw"></li>
                </ul>
                </div>
                <div class="right_div">
                    <button type="submit" class="btn_submit" title="MASTER LOGIN">MASTER LOGIN</button>
                </div>
                <em class="alert_msg">※ 본 사이트는 관리자 외에는 접근을 금합니다. 페이지 접근에 대한 접속 정보는 모두 기록 됩니다.</em>
            </span>
            <span>
                <ol class="admin_info">
                    <li title="신규 관리자 등록요청"><a href="/admin/add_master.do">신규 관리자 등록요청</a></li>
                    <li title="아이디/패스워드 찾기">아이디/패스워드 찾기</li>
                </ol>                
            </span>
        </div>
     </form>
    </section>
</body>
<script>
function adminlogin(){
	var adid=document.getElementsByName("adid")[0].value;
	var adpw=document.getElementsByName("adpw")[0].value;
	
	//암호화해서 db에서 정보 갖고와서 맞는지 확인하는 코드로 바꾸기
	if(adid!="" && adpw!= ""){
	adminfrm.action="./admin_main.do";
	return true;
	}
	else{
		alert('아이디와 비밀번호를 넣어주세요.');
		return false;
	}
}

</script>