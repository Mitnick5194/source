package com.ajie.mysource;

/**
 * @author Mitnick
 * 
 */
public class Client {
	
	public static void main(String[] args) {
		Blog blog = new Blog();
		System.out.println("--------------------设置前     mark = "+blog.getMark()+"---------------------");
		System.out.println("博文是否可以评价: "+blog.isCanComment());
		System.out.println("博文是否可以收藏: "+blog.isCanCollect());
		System.out.println("博文是否可以点赞: "+blog.isCanPrise());
		System.out.println("博文是否为私密: "+blog.isPrivate());
		//设置博文不可收藏
		blog.setCanCollect(false);
		System.out.println("---------------------设置不可收藏     mark = "+blog.getMark()+"-------------------");
		System.out.println("博文是否可以评价: "+blog.isCanComment());
		System.out.println("博文是否可以收藏: "+blog.isCanCollect());
		System.out.println("博文是否可以点赞: "+blog.isCanPrise());
		System.out.println("博文是否为私密: "+blog.isPrivate());
		
		//设置博文不可评论
		blog.setCanCollect(true); //复位
		blog.setCanComment(false);
		System.out.println("----------------------设置不可评论    mark = "+blog.getMark()+"---------------------");
		System.out.println("博文是否可以评价: "+blog.isCanComment());
		System.out.println("博文是否可以收藏: "+blog.isCanCollect());
		System.out.println("博文是否可以点赞: "+blog.isCanPrise());
		System.out.println("博文是否为私密: "+blog.isPrivate());
		
		//设置为私密博文
		blog.setCanComment(true);  //复位
		blog.setPrivate(true);
		System.out.println("-----------------------设置不可评论    mark = "+blog.getMark()+"------------------");
		System.out.println("博文是否可以评价: "+blog.isCanComment());
		System.out.println("博文是否可以收藏: "+blog.isCanCollect());
		System.out.println("博文是否可以点赞: "+blog.isCanPrise());
		System.out.println("博文是否为私密: "+blog.isPrivate());
		
	}

}
