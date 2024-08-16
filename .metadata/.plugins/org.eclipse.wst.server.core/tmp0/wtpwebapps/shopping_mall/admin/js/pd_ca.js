var ca_idx= document.getElementsByName("ca_idx");
var cackall= document.getElementById("cackall");
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
cack_all(){
var w=0;
while(w<ca_idx.length){
	ca_idx[w].checked=cackall.checked;
	w++;
}
}
ca_del(){
var w=0;
var count=0;
while(w<ca_idx.length){
	if(ca_idx[w].checked==true){
		count++;
	}
	w++;
}
if(count>0){
	if(confirm("해당 데이터를 삭제하겠습니까?(단, 등록된 상품이 있을 경우 삭제 X)")){
		cateset_frm.method="post";
		cateset_frm.action="./del_cateck.do";
		cateset_frm.submit();
	}
}
else{
	alert("선택한 데이터가 1개 이상 체크되어야 합니다.");
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