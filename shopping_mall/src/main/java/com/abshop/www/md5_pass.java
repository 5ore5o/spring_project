package com.abshop.www;

import java.security.MessageDigest;

//패스워드를 md5형태로 변환하는 메소드
//@Repository("md5pass")
abstract class md5_pass { //public 대신 abstract로 써야된다. 
	
	public String md5_makeing(String upass) {
		StringBuilder sb = new StringBuilder(); // return에 사용되는 객체
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			md.update(upass.getBytes());
			for(byte bt : md.digest()) {
				sb.append(String.format("%x", bt));//x로만 넣으면 암호화했을 때 x로만 나온다. % 꼭 넣기 !
			}}catch(Exception e) {
			sb.append("인자값 오류 발생으로 생성이 되지 않음");
		}
		return sb.toString(); // 메소드가 String이여서 여기도 toString으로 잡아야됨.
	}
}
