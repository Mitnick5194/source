package com.ajie.trans;


/**
 * 
 * @author niezhenjie
 *
 */
public class UserVo {
	User u;
	public UserVo(User u){
		this.u = u;
	}

	public String getUserJson(){
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		sb.append("名字：");
		sb.append(u.getName());
		sb.append(",");
		sb.append("性别:");
		sb.append(u.getSex());
		sb.append("]");
		return sb.toString();
	}
}
