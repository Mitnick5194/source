package com.ajie.mysource;

/**
 * @author Mitnick
 * 
 */
public class Blog {
	/** 标记是否可以评论 */
	public static final int FLAG_COMMENT = 1;
	/** 标记是否可以收藏 */
	public static final int FLAG_COLLECT = 1 << 1;
	/** 标记是否可以点赞 */
	public static final int FLAG_PRISE = 1 << 2;
	/** 标记是否私密 */
	public static final int FLAG_PRIVATE = 1 << 3;

	private int mark = 0;
	
	public Blog(){
		//默认博文是可以点赞收藏评价且为公开
		setCanCollect(true);
		setCanComment(true);
		setCanPrise(true);
		setPrivate(false);
	}

	protected synchronized void setMask(int mark) {
		if (0 == mark) {
			return;
		}
		int oldmark = this.mark;
		if (0 < mark) {
			this.mark |= mark;
		}
		if (0 > mark) {
			//负数表示将标志位设为 0（即设为false）
			mark = -mark;
			this.mark &= (~mark);
		}
		if (oldmark == this.mark) {
			return; //不用做保存操作
		}
		// TODO 可以保存到数据库或文件中
	}

	protected boolean isMark(int mark) {
		return mark == (mark & this.mark);
	}

	/** 是否可以评论 */
	public boolean isCanComment() {
		return isMark(Blog.FLAG_COMMENT);
	}

	/** 设置是否可以评论 */
	public void setCanComment(boolean b) {
		setMask(b ? Blog.FLAG_COMMENT : -Blog.FLAG_COMMENT);
	}

	/** 是否可以收藏 */
	public boolean isCanCollect() {
		return isMark(Blog.FLAG_COLLECT);
	}

	/** 设置是否可以收藏 */
	public void setCanCollect(boolean b) {
		setMask(b ? Blog.FLAG_COLLECT : -Blog.FLAG_COLLECT);
	}

	/** 是否为私密 */
	public boolean isPrivate() {
		return isMark(Blog.FLAG_PRIVATE);
	}

	/** 是否设置为私密 */
	public void setPrivate(boolean b) {
		setMask(b ? Blog.FLAG_PRIVATE : -Blog.FLAG_PRIVATE);
	}

	/** 是否可以点赞 */
	public boolean isCanPrise() {
		return isMark(Blog.FLAG_PRISE);
	}

	/** 设置是否可以点赞 */
	public void setCanPrise(boolean b) {
		setMask(b ? Blog.FLAG_PRISE : -Blog.FLAG_PRISE);
	}

	/**查看mark的值*/
	public int getMark(){
		return this.mark;
	}
}
