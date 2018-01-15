package com.ajie.trans;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author niezhenjie
 *
 */
public class TransList {
	
	public static List<UserVo> transListEntity(List<User> list){
		if(list.isEmpty()){
			return null;
		}
		List<UserVo> listVo = new ArrayList<UserVo>();
		for (User user : list) {
			listVo.add(new UserVo(user));
		}
		return listVo;
	}

}
