package com.pb.android_107_21_test.bean;

import java.io.Serializable;

/*
 * /**
 *  "count": 30,
 "err": 0,
 "items": [
 {
 "format": "word",
 "image": null,
 "published_at": 1474411501,
 "tag": "",
 "user": {
 "avatar_updated_at": 1474096732,
 "uid": 8231441,
 "last_visited_at": 1365402245,
 "created_at": 1365402245,
 "state": "bonded",
 "last_device": "android_2.2.1",
 "role": "n",
 "login": "波杰克波波",
 "id": 8231441,
 "icon": "2016091707185249.JPEG"
 },

 "image_size": null,
 "id": 117574586,
 "hot_comment": {
 "status": "publish",
 "user_id": 31350726,
 "floor": 4,
 "ip": "112.96.115.114",
 "created_at": "2016-09-21 06:53:11",
 "comment_id": 365495582,
 "like_count": 71,
 "pos": 0,
 "content": "其中有 短 信是某情 趣 酒店消费记录……",
 "source": "ios",
 "score": null,
 "parent_id": 0,
 "anonymous": 0,
 "neg": 0,
 "article_id": 117574586,
 "user": {
 "avatar_updated_at": 1471581258,
 "uid": 31350726,
 "last_visited_at": 1457280749,
 "created_at": 1457280749,
 "state": "binding",
 "last_device": "android_9.0.0",
 "role": "n",
 "login": "愿时光温柔以待～",
 "id": 31350726,
 "icon": "2016081912341828.JPEG"
 }
 },
 "votes": {
 "down": -76,
 "up": 4393
 },
 "created_at": 1474407515,
 "content": "最近工作太忙总是加班到深夜，三天没回家了。这是我和女友相处两年以来第一次连续三天没见面。能看出来她十分想念我，期间给我发了60来条短信，全是银行卡扣款信息。",
 "state": "publish",
 "comments_count": 76,
 "allow_comment": true,
 "share_count": 30,
 "type": "promote"
 },
 *{
 *
 *
 *}
 */
//需要解析的json所对应的实体类,实现序列化
@SuppressWarnings("serial")
public class ItemEntity implements Serializable {
	public int published_at;
	public String content;
	public int share_count;

	public int getPublished_at() {
		return published_at;
	}

	public void setPublished_at(int published_at) {
		this.published_at = published_at;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getShare_count() {
		return share_count;
	}

	public void setShare_count(int share_count) {
		this.share_count = share_count;
	}

}
