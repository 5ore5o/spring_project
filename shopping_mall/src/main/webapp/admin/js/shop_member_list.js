export class modify {
termsmodify() {
        const terms = document.querySelector('#terms_of_service').value; // 정확한 ID 확인

        let formData = new FormData();
        formData.append('terms', terms);

        fetch('/admin/terms', {
            method: 'POST',
            body: formData
        })
        .then(response => response.json())
        .then(data => {
            if (data.success) {
                alert("이용약관이 성공적으로 수정되었습니다.");
            } else {
                alert("이용약관 수정에 실패했습니다.");
            }
        })
        .catch(error => {
            console.error('Error:', error);
            alert("이용약관 수정 중 오류가 발생했습니다.");
        });
}

policymodify() {
        const privacy = document.querySelector('#privacy_policy').value;

        let formData = new FormData();
        formData.append('privacy', privacy);

        fetch('/admin/privacy', {
            method: 'POST',
            body: formData
        })
        .then(response => response.json())
        .then(data => {
            if (data.success) {
                alert("개인정보 수집 및 이용이 성공적으로 수정되었습니다.");
            } else {
                alert("개인정보 수집 및 이용 수정에 실패했습니다.");
            }
        })
        .catch(error => {
            console.error('Error:', error);
            alert("개인정보 수정 중 오류가 발생했습니다.");
        });
    }
}
