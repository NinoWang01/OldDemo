#### **安卓直播互动层对接**
**此文档针对于自己有播放器的客户完成互动层的对接。**

-------

<h4 style="font-weight: bold;font-size: 18px;">SDK添加方法:</h4>

  **1.1 下载[SDK](http://vpls.cdn.videojj.com/download/docs/flash/Android/LingdongSDK_android_160926.zip),引入到自己的项目中**

  **1.2 sdk提供了两种对接方式`jar+res`和`VenvyLiveLibrary`:其中`jar+res`文件夹下包含了`venvy_live_1.0.jar`和`drawable-xhdpi`文件夹，其中jar文件放入项目的libs中，`drawable-xhdpi`的图片资源放入`drawable-xhdpi`文件夹下；`venvyLiveLibrary`直接作为library的形式在主项目中引入即可。**

  **1.3 SDK主要包括了商品清单互动层、投票互动层、红包互动层等若干个互动层，这些互动层由SDK的`VenvyLiveLayout`组件统一管理，该组件位于`cn.com.live.videopls.venvy.entry.VenvyLiveLayout`包下。SDK支持配置三种状态的互动层展示：仅竖屏展示互动层、仅横屏展示互动层、横竖屏都支持的互动层展示。**


<h4 style="font-weight: bold;font-size: 18px;">SDK使用方法:</h4>

**2.1 初始化VenvyLiveLayout组件：**

  在android xml布局文件中使用(注意需要引入正确的包名)

```
<cn.com.live.videopls.venvy.entry.VenvyLiveLayout
        android:id="@+id/vll"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        ></cn.com.live.videopls.venvy.entry.VenvyLiveLayout>
```
然后在相应的页面(如Activity中)初始化一个VenvyLiveLayout对象vll：
```
VenvyLiveLayout vll = findViewById(R.id.vll);
```
VenvyLiveLayout组件初始化完毕后就可以对该组件进行配置了。

**2.2 配置互动层展示方式**

   SDK在客户端的展现支持三种类型：仅横屏、仅竖屏、横屏和竖屏。客户端可以通过如下代码设置对应的互动层展现形式

```
//设置仅支持横屏
vll.setDirection(VenvyLiveLayout.LANDSCAPE);
//设置仅支持竖屏
vll.setDirection(VenvyLiveLayout.VERTICAL);
//设置横竖屏都支持
vll.setDirection(VenvyLiveLayout.BOTH);

```
**2.3 设置互动层的宽高**

  SDK的宽和高是根据客户端的宽高来设置的，客户端可以通过如下代码来设置互动层的宽高：

```
//设置屏幕宽度        	 
vll.setScreenWidth(client.getWidth());
//设置屏幕高度
vll.setScreenHeight(client.getHeight());
//设置横屏状态下视频宽度
vll.setLandscapeVideoWidth(client.getHeight());
//设置横屏状态下视频高度    	  
vll.setLandscapeVideoHeight(client.getWidth());
 //设置竖屏状态下视频宽度
vll.setVerticalVideoWidth(client.getWidth());
//设置和竖屏状态下视频高度
vll.setVerticalVideoHeight(client.getHeight());

```
**2.4 设置用户或者主播账号**

  互动层需要通过绑定平台id和平台主播号才能进行互动，客户端需要调用如下代码对平台id和平台主播／房间号进行绑定：
  主播房间号必须在V＋＋灵动后台创建，非平台直播间。具体请看灵动使用手册 [使用手册](http://vpls.cdn.videojj.com/download/docs/flash/Android/%E7%81%B5%E5%8A%A8%E5%B9%B3%E5%8F%B0%E4%BD%BF%E7%94%A8%E6%89%8B%E5%86%8C.pdf)

```
//key：平台ID,value：平台主播号
vll.setKey("556c38e7ec69d5bf655a0fb2", "34");
```
**2.5 获取购物车里的商品ID**

  在商品清单互动层中有“加入购物车”字样的按钮，点击此按钮的时候，客户端可以通过如下方法获取商品ID:

```
vll.setClickShoppingChartListener(new IOnClickShoppingChartListener() {
	/**
	 * 点击购物车按钮获取时的回调
	 * @param goodsId 某商品的ID
	 */
	@Override
	public void callback(String goodsId) {

	}
});

```
**2.6 客户端监听中插**

  sdk提供了两种中插监听的接口：第一种是客户端直接加载网络中插资源;第二种是客户端加载本地缓存好的中插资源。另种接口不可同时选择，只能调用其一来进行中插播放。

  1) 客户端直接加载网络中插资源

  `客户端如果是直接从网络获取中插资源，则可以通过以下两种方式(注：两种方式只能选择其一)：`

```
//中插监听方式1
vll.setWedgeListener(new OnWedgeListener() {
	@Override
	public void onWedge(List<LiveHotDataVideo> mDataVideo) {
		//这里开始播放中插广告
	}
	@Override
	public void onShutDown() {
	  //关闭中插广告时调用
	}
});
//中插监听方式2
vll.setWedgeConcatListener(new OnWedgeConCatListener() {

	@Override
	public void onWedgeConcat(final List<LiveHotDataVideo> mDataVideos, String mPath) {
	  //这里开始播放中插广告
	  //mPath为符合ffmpeg的concat合并流文件的文件路径名
	}

	@Override
	public void onShutDown() {
	  //关闭中插广告时调用
	}
}

```

  2) 客户端加载缓存好的中插广告资源

  客户端除了直接从网络中获取插广告资源外，还可以访问本地缓存好的中插资源。具体可采用如下两种方式(注：两种方式只能选择其一)：

  ```
  //获取本地缓存的中插资源方式1：
  vll.setDownLoadWedgeListener(new OnDownLoadWedgeListener() {
  	@Override
  	public void onShutDown() {
  	// 关闭中插广告时调用：当广告主通过后台把当前中插广告撤销，收到onShutDown方法后直接结束中插广告，与广告播放时间无关

  	}
  	@Override
  	public void onDownLoadWedge(List<LiveHotDataVideo> mDataVideo) {
  	//这里开始播放中插广告:mDataVieo为本地缓存好的中插资源
  	}
  });

  //获取本地缓存的中插资源方式2：
  vll.setDownLoadWedgeConcatListener(new OnDownLoadWedgeConCatListener() {

      @Override
      public void onShutDown() {
      	// 关闭中插广告时调用：当广告主通过后台把当前中插广告撤销，收到onShutDown方法后直接结束中插广告，与广告播放时间无关

      }

      @Override
      public void onDownLoadWedgeConcat(List<LiveHotDataVideo> mDataVideos,
      		String mPath) {
      	//这里开始播放中插广告:mDataVieo为本地缓存好的中插资源
      	//mPath为符合ffmpeg的concat合并流文件的文件路径名，是把mDataVideos集合里面的数据写入本地文件后生成的文件绝对路径
      }
      });
  ```

其中LiveHotDataVideo封装了视频的一些参数，对外提供了如下方法可以获取视频的相关信息：

方法名 | 方法作用
---|---
`isDsp()` | 是否是dsp广告
`getDsp()` | dsp广告获取地址
`getSource()`|获取视频源地址
`getLink()`|点击外链地址
`getEx()`|视频长度


**2.7 客户端对互动层的控制**

  在配置以上互动层所需参数之后客户端就可以通过如下方法来对互动层的播放、暂停以及销毁等进行控制了：

```
//开始加载并展示互动层（负责开启请求以及长连接，该方法是所有互动的入口)
vll.start();
//停止展示互动层
vll.stop();
//销毁互动层
vll.destroy();

```

如果在互动的过程中需要切换房间，需要先调用stop方法停止当前互动层展示；然后调用setKey方法绑定新的房间号；

最后调用start方法开始新的互动。
