export class login{

adidcheck(){
	if(adminfrm2.adid.value==""){
		alert("아이디를 입력하세요");
	}
	else if(adminfrm2.adid.value=="master"||adminfrm2.adid.value=="admin"){
		alert("현재 사용중인 아이디입니다.")
	}
	else{
		alert("중복되지 않은 아이디 입니다.");
	}
}

login_check(){
	
if(adminfrm2.adid.value==""||adminfrm2.adpw.value==""){
	alert("아이디 또는 비밀번호를 입력하세요.");
}
else if(adminfrm2.adid.value=="master"||adminfrm2.adid.value=="admin"){
		alert("현재 사용중인 아이디입니다.")
}
else if(adminfrm2.adpw.value!=adminfrm2.adpwck.value){
	alert("비밀번호가 동일하지 않습니다.");
}
else if(adminfrm2.adname.value==""||adminfrm2.ademail.value==""||adminfrm2.adnum1.value==""||adminfrm2.adnum2.value==""||adminfrm2.adnum3.value==""){
	alert("담당자이름 또는 이메일 또는 번호를 입력하세요");
}
else if(adminfrm2.addepart.value==""||adminfrm2.adposition.value==""){
	alert("담당자 부서 또는 직책을 선택하세요");
}
else{
	adminfrm2.method="post";
	adminfrm2.action="./admin_insert.do";
	adminfrm2.submit();
	/*
	setTimeout(function(){
		location.href="./admin_index.jsp";
	},1000);
	*/
}
}

login_no(){
	if(confirm("등록을 취소하시겠습니까?")){
	alert("등록이 취소 되었습니다.");
	location.href="./index.do";
	}else{
		alert("등록 취소가 취소되었습니다.");
	}
}
}

//ajax
$(function(){
	$("#btn").click(function(){
		$.ajax({
		url :"./idcheck.do",
		cache : false,
		type : "post",
		dataType:"html",
		
		data:{
		adid : $("#adid").val()
		},
		contentType:"application/x-www-form-urlencoded",
		success : function($data,$adckresult){
			if($data=="no"){
				alert("이미 사용중인 아이디 입니다.");
			}
			else if($data=="error"){
				alert("아이디 값을 넣어주세요.");
			}
			else{
				alert("사용 가능한 아이디 입니다.");
			}
		},
		error : function ($adckresult){
			alert("통신오류발생으로 인해 작동되지 않습니다.");
		}	
		});
	});
});
