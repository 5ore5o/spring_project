export class noset{
backnoticelist(){
	location.href="./notice_list.do";
}

savenotice(){
	
	let noYN = "";
		if (document.querySelector("input[name='noYN']").checked) {
		    noYN = "1";
		} else {
		    noYN = "0";
		}
    const notitle = document.querySelector("input[name='notitle']").value;
    const adname = document.querySelector("input[name='adname']").value;
    const nofile = document.querySelector("input[name='nofile']").files[0];
    const noinfo = document.querySelector("textarea[name='noinfo']").value;

	let formData = new FormData();
        formData.append("noYN", noYN);
        formData.append("notitle", notitle);
        formData.append("adname", adname);
        formData.append("nofile", nofile);
        formData.append("noinfo", noinfo);

	fetch('./admin/notice_save.do', {
            method: 'POST',
            body: formData,
         })
	.then(response => response.json())
	.then(data => {
            if (data.success) {
                alert("공지사항이 성공적으로 등록되었습니다.");
                location.href = "./notice_list.do";
            } else {
                alert("공지사항 등록에 실패하였습니다. 다시 시도해주세요.");
            }
        })
        .catch(error => {
            console.error("Error:", error);
            alert("공지사항 등록 중 오류가 발생하였습니다.");
        });
    }

}