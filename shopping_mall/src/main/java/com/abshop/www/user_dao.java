package com.abshop.www;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class user_dao {
	int uidx;
	String uid,upass,uname,ujoin, uemail; //컬럼 추가하면 dao에 추가하자
}
