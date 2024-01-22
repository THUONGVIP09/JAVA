package TEST;

import Dao.userdao;
import MODEL.user;

public class testuser {
	public static void main(String[] args) {
		user u1=new user("dat1","u123","uuu");
		userdao.getInstace().them(u1);
		
		user u2=new user("x\' or 1=1;--","","");
		user u3=userdao.getInstace().selectById(u2);
		System.out.println(u3);
	}

}
