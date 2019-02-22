package bean;

/*
 <icon>http://192168.31.150:8080/img/a.jpg</icon>  
 <title>科技温暖世界</title> 
 <content>进入一个更有爱的世界</content>
 <type>1</type>
 <comment>69</comment>
 新闻客户端的实体类
 */
public class NewsInfo {

	private String iconPath;// 图片路径
	private String title;// 新闻标题
	private String content;// 新闻内容
	private int type;// 新闻的类型
	private long comment;// 新闻的评论数字

	public String getIconPath() {
		return iconPath;
	}

	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public long getComment() {
		return comment;
	}

	public void setComment(long comment) {
		this.comment = comment;
	}
}
