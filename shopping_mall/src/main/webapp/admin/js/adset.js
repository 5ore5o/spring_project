export class homeset{

save(){
	
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