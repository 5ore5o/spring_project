package admin;

import java.security.MessageDigest;

abstract class passwd_sh {
	public String sh2_making(String adpw) {
		StringBuilder sb= new StringBuilder();
		try {
		MessageDigest md= MessageDigest.getInstance("SHA256");	
		md.update(adpw.getBytes());
		for(byte bt: md.digest()) {
			sb.append(String.format("%x", bt));
		}
		}catch(Exception e) {
			sb.append("인자값 오류 발생으로 생성 되지 않음");
		}
		return sb.toString();
	}
	
}
