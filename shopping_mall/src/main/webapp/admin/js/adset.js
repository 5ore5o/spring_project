export class homeset{

save(){
	if(adhomeset.hi_title.value==""||adhomeset.hi_ademail.value==""||adhomeset.hi_point.value==""||adhomeset.hi_level.value==""){
		alert("홈페이지 가입환경 설정을 전부다 입력하세요.");
	}
	else if(adhomeset.hs_com.value==""||adhomeset.hs_kname.value==""){
		alert("회사명 또는 대표자명을 입력하세요.");
	}
	else if(adhomeset.hs_bnum.value==""||adhomeset.hs_knum.value==""){
		alert("사업자등록번호 또는 대표전화번호를 입력하세요.");
	}
	else if(adhomeset.hs_postal.value==""||adhomeset.hs_badd.value==""){
		alert("사업장 우편번호와 사업장 주소를 입력하세요.");
	}
	else if(adhomeset.hs_adname.value==""||adhomeset.hs_ademail.value==""){
		alert("정보관리책임자명 또는 이메일을 입력하세요.");
	}
	else if(adhomeset.pb_bk.value!=""&&adhomeset.pb_bknum.value==""){
			alert("은행계좌번호를 '-'포함해서 입력하세요.");
	}
	else if(adhomeset.pb_min.value==""||adhomeset.pb_max.value==""){
		alert("포인트를 입력하세요.");
	}
	else if(adhomeset.pb_min.value >= adhomeset.pb_max.value){
			alert("최소 포인트보다 최대 포인트를 더 큰 숫자로 잡아주세요.");
		}
	else if(adhomeset.de_name.value==""||adhomeset.de_price.value==""){
		alert("배송업체명 또는 배송비 가격을 입력하세요.");
	}
	else{
	adhomeset.method="post";
	adhomeset.action="./homesave.do";
	adhomeset.submit();
}
}
cancle(){
	if(confirm("저장을 취소하겠습니까?")){
	alert("저장이 취소 되었습니다.");
	location.href="./admin_siteinfo.do";
	}else{
		alert("저장 취소가 취소되었습니다.");
	}
}	
}