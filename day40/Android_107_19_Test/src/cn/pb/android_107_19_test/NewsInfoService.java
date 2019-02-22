package cn.pb.android_107_19_test;

import java.io.InputStream;

import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import bean.NewsInfo;

//处理XML文件类
public class NewsInfoService {
	// 声明一个方法
	public static List<NewsInfo> getNewsInfo(InputStream is) {
		try {
			// 先获取
			XmlPullParser parser = Xml.newPullParser();
			// 拿到输入流之后，先来设置它的编码格式
			parser.setInput(is, "utf-8");
			// 得到一个指针
			int a = parser.getEventType();
			// 创建一个集合
			List<NewsInfo> list = null;
			// 实体类对象
			NewsInfo newsinfo = null;
			// 如果指针指向不等于文档的结束
			while (a != XmlPullParser.END_DOCUMENT) {
				switch (a) {
				// 拿到标签的名字并判断
				case XmlPullParser.START_TAG:
					if ("news".equals(parser.getName())) {
						list = new ArrayList<NewsInfo>();
					} else if ("newsInfo".equals(parser.getName())) {
						newsinfo = new NewsInfo();
					} else if ("icon".equals(parser.getName())) {
						String icon = parser.nextText();
						newsinfo.setIconPath(icon);
					} else if ("title".equals(parser.getName())) {
						String title = parser.nextText();
						newsinfo.setTitle(title);
					} else if ("content".equals(parser.getName())) {
						// 新闻内容
						String content = parser.nextText();
						newsinfo.setContent(content);
					} else if ("type".equals(parser.getName())) {
						String type = parser.nextText();
						newsinfo.setType(Integer.parseInt(type));
					} else if ("comment".equals(parser.getName())) {
						String comment = parser.nextText();
						newsinfo.setComment(Integer.parseInt(comment));
					}
					break;

				case XmlPullParser.END_TAG:
					if ("newsInfo".equals(parser.getName())) {
						list.add(newsinfo);
						newsinfo = null;
					}
					break;
				}
				// 判断a的指向的下一个节点
				a = parser.next();
			}
			return list;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;

	}

}
