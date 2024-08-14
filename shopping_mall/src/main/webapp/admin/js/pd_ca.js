export class caset{
cateset(){
	location.href="./cate_write.do";
}
catelist(){
	location.href="./cate_list.do";
}
catein(cacode_ck){
	if(cawr_frm.cacode.value==""||cawr_frm.cacode.value.length < 2){
		alert("분류코드를 최소 2자리 이상의 숫자로 입력하세요");
	}
	else if(cawr_frm.lcode.value==""||cawr_frm.lcode.value.length < 2|| isNaN(cawr_frm.lcode.value)){
		alert("대메뉴 코드를 최소 2자리 이상의 숫자로 입력하세요");
	}
	else if(cawr_frm.lname.value==""){
		alert("대메뉴명을 한글,또는 영어로 입력해주세요.");
	}
	else{
	cawr_frm.method="post";
	cawr_frm.action="./cate_in.do";
	cawr_frm.submit();
	}
}
}

export class pdset{
	
pdwr(){
	location.href="./product_write.do";
}
cali(){
	location.href="./cate_list.do";
}
pdcate(){
	location.href="./cate_list.do";	
}
pdcode_dupli(){
	
}
}