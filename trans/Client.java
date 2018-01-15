package com.ajie.trans;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author niezhenjie
 *
 */
public class Client {
	public static void main(String[] args) {
		User u1 = new User();
		u1.setName("ajie");
		u1.setSex("男");
		User u2 = new User();
		u2.setName("Mitnick");
		u2.setSex("男");
		User u3 = new User();
		u3.setName("qing");
		u3.setSex("女");
		List<User> list = new ArrayList<User>();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		List<UserVo> json = TransList.transListEntity(list);
		for (UserVo userVo : json) {
			System.out.println(userVo.getUserJson());
		}
	}

}
