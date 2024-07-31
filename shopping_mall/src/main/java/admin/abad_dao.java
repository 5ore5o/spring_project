package admin;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class abad_dao {

	int adidx;
	String adid,adpw,adname,ademail,adnum1,adnum2,adnum3,addepart,adposition,adYN,addate;

public ArrayList<String> addata(){
ArrayList<String> one_addata =new ArrayList<String>();
one_addata.add(this.getAdid());
one_addata.add(this.getAdpw());
return one_addata;
}

}
