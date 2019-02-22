package cn.itcast.product.adapter;

import java.util.List;

import cn.itcast.product.MainActivity;
import cn.itcast.product.R;
import cn.itcast.product.bean.Account;
import cn.itcast.product.dao.AccountDao;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MyMyAdapter extends BaseAdapter {
	public Context context;
	public List<Account> list;
	public AccountDao dao;

	public LayoutInflater inflater;
	public MyMyAdapter(Context context, List<Account> list, AccountDao dao) {
		this.dao = dao;
		this.list = list;
		inflater=LayoutInflater.from(context);

	}

	public int getCount() { // 获取条目总数
		return list.size();
	}

	public Object getItem(int position) { // 根据位置获取对象
		return list.get(position);
	}

	public long getItemId(int position) { // 根据位置获取id
		return position;
	}

	// 获取一个条目视图
	public View getView(int position, View convertView, ViewGroup parent) {
		// 重用convertView
//		View item = convertView != null ? convertView : View.inflate(context,
//				R.layout.item, null);
		convertView=inflater.inflate(R.layout.item, null);
		// 获取该视图中的TextView
		TextView idTV = (TextView) convertView.findViewById(R.id.idTV);
		TextView nameTV = (TextView) convertView.findViewById(R.id.nameTV);
		TextView balanceTV = (TextView) convertView.findViewById(R.id.balanceTV);
		// 根据当前位置获取Account对象
		final Account a = list.get(position);
		// 把Account对象中的数据放到TextView中
		idTV.setText(a.getId() + "");
		nameTV.setText(a.getName());
		balanceTV.setText(a.getBalance() + "");
		ImageView upIV = (ImageView) convertView.findViewById(R.id.upIV);
		ImageView downIV = (ImageView) convertView.findViewById(R.id.downIV);
		ImageView deleteIV = (ImageView) convertView.findViewById(R.id.deleteIV);
		// 向上箭头的点击事件触发的方法
		upIV.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				a.setBalance(a.getBalance() + 1); // 修改值
				notifyDataSetChanged(); // 刷新界面
				dao.update(a); // 更新数据库
			}
		});
		// 向下箭头的点击事件触发的方法
		downIV.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				a.setBalance(a.getBalance() - 1);
				notifyDataSetChanged();
				dao.update(a);
			}
		});
		// 删除图片的点击事件触发的方法
		deleteIV.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// 删除数据之前首先弹出一个对话框
				android.content.DialogInterface.OnClickListener listener = new android.content.DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						list.remove(a); // 从集合中删除
						dao.delete(a.getId()); // 从数据库中删除
						notifyDataSetChanged();// 刷新界面
					}
				};
				Builder builder = new Builder(context); // 创建对话框
				builder.setTitle("确定要删除吗?"); // 设置标题
				// 设置确定按钮的文本以及监听器
				builder.setPositiveButton("确定", listener);
				builder.setNegativeButton("取消", null); // 设置取消按钮
				builder.show(); // 显示对话框
			}
		});
		return convertView;
	}
}

//// ListView的Item点击事件
//private class MyOnItemClickListener implements OnItemClickListener {
//	public void onItemClick(AdapterView<?> parent, View view, int position,
//			long id) {
//		// 获取点击位置上的数据
//		Account a = (Account) parent.getItemAtPosition(position);
//		Toast.makeText(getApplicationContext(), a.toString(),
//				Toast.LENGTH_SHORT).show();
//	}

