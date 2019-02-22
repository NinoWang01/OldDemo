package com.pb.android_107_12_01_test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.xmlpull.v1.XmlSerializer;

import android.content.Context;
import android.os.Environment;
import android.util.Xml;
import android.widget.Toast;

/*
 * 将短信保存到一个文件当中
 */
public class SmsUtils {

	// 保存到手机上,SD卡中

	public static void CopySms(Context context, List<SmsInfo> smsinfo) {
		try {
			// 得到一个和XML有关序列化对象
			XmlSerializer serializer = Xml.newSerializer();
			// 文件的指向
			File file = new File(Environment.getExternalStorageDirectory(),
					"sms.xml");
			// 输出流对象
			FileOutputStream os = new FileOutputStream(file);
			
			// 指定写入文件data.xml中编码格式
			serializer.setOutput(os, "utf-8");

			serializer.startDocument("utf-8", true);
			serializer.startTag(null, "smss");

			// 需要一个遍历
			for (SmsInfo info : smsinfo) {

				// 构造父节点的开始标签
				serializer.startTag(null, "sms");

				serializer.attribute(null, "id", info.getId() + "");
				// 构造子节点
				serializer.startTag(null, "body");
				serializer.text(info.getBody());// 短信的内容
				serializer.endTag(null, "body");
				// 构造子节点
				serializer.startTag(null, "address");
				serializer.text(info.getAddress());
				serializer.endTag(null, "address");
				// 构造子节点
				serializer.startTag(null, "type");
				serializer.text(info.getType() + "");
				serializer.endTag(null, "type");

				// 构造子节点
				serializer.startTag(null, "date");
				serializer.text(info.getDate() + "");
				serializer.endTag(null, "date");

				serializer.endTag(null, "sms");
				// 构造子节点

			}
			serializer.endTag(null, "smss");
			serializer.endDocument();
			os.close();
			// 吐丝
			Toast.makeText(context, "备份短信成功", Toast.LENGTH_LONG).show();

		} catch (Exception e) {
			e.printStackTrace();
			Toast.makeText(context, "备份失败", Toast.LENGTH_LONG).show();
		}

	}

}
