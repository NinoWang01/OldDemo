package com.pb.android_107_9_03_sqlite_test;

import java.util.List;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.pb.android_107_9_03_sqlite_test.bean.Account;
import com.pb.android_107_9_03_sqlite_test.dao.AccountDao;

/*
 * 实体类
 * 需要一个数据库
 * 数据库的工具类，对数据库进行增删改查
 * 主函数入口MainActivity           xml：显示整页面效果
 * 适配器        xml显示添加到数据库中的数据的信息
 */
public class MainActivity extends Activity {

	// 创建一个集合接收
	public List<Account> list;
	// 数据库操作的工具类对象
	public AccountDao dao;
	// 接收输入name
	public EditText edit_name;
	// 接收输入balance
	public EditText edit_balance;
	// 创建listview
	public ListView listview;
	// 适配器
	public MyAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 初始化控件
		init();
		// 实例化数据库操作类对象
		dao = new AccountDao(this);
		// 从数据库中取所有的数据
		list = dao.queryAll();
		// 创建adapter
		adapter = new MyAdapter();
		listview.setAdapter(adapter);

	}

	private void init() {
		// 实例化控件
		listview = (ListView) findViewById(R.id.list_view_id);
		edit_name = (EditText) findViewById(R.id.nameET);
		edit_balance = (EditText) findViewById(R.id.balanceET);
		// 添加监听listview
		listview.setOnItemClickListener(new MyOnItemClickListener());

	}

	// 向数据库中添加数据
	public void add(View v) {
		switch (v.getId()) {
		case R.id.addIV:
			// 获得输入商品名字
			String name = edit_name.getText().toString().trim();
			// 获得商品的余额
			String balance = edit_balance.getText().toString().trim();
			/*
			 * 添加内容到数据库 判断商品余额为不为空
			 */
			Account a = new Account(name, balance.equals("") ? 0
					: Integer.parseInt(balance));
			// 添加数据
			dao.insert(a);
			list.add(a);
			// 刷新数据
			adapter.notifyDataSetChanged();
			// 选中最后一个
			listview.setSelection(listview.getCount() - 1);
			edit_balance.setText("");
			edit_name.setText("");
			break;

		default:
			break;
		}

	}

	// /自定义一个监听
	public class MyOnItemClickListener implements OnItemClickListener {

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {

			// 获取点击位置的数据
			Account a = (Account) parent.getItemAtPosition(position);
			Toast.makeText(getApplicationContext(), a.toString(),
					Toast.LENGTH_LONG).show();

		}
	}

	public class MyAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			return list.size();
		}

		@Override
		public Object getItem(int position) {
			return list.get(position);
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// 获得一个视图
			View view = convertView != null ? convertView : View.inflate(
					getApplicationContext(), R.layout.adapter_item, null);
			// 实例化各个控件
			TextView idTV = (TextView) view.findViewById(R.id.idTV);
			TextView nameTV = (TextView) view.findViewById(R.id.nameTV);
			TextView balanceTV = (TextView) view.findViewById(R.id.balanceTV);
			// 获取当前位置的Account
			final Account a = list.get(position);
			// 给控件放内容
			idTV.setText(a.getId() + "");
			nameTV.setText(a.getName());
			balanceTV.setText(a.getBalance() + "");
			// 实例化三张图片
			ImageView upIV = (ImageView) view.findViewById(R.id.upIV);
			ImageView downIV = (ImageView) view.findViewById(R.id.downIV);

			ImageView deleteIV = (ImageView) view.findViewById(R.id.deleteIV);

			// 向上的按钮
			upIV.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					// 修改值
					a.setBalance(a.getBalance() + 1);
					// 刷新界面
					notifyDataSetChanged();
					// 更新数据库中的表的值
					dao.update(a);

				}
			});
			// 向下的按钮
			downIV.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					a.setBalance(a.getBalance() - 1);
					// 刷新界面
					notifyDataSetChanged();
					// 更新数据库中的表的值
					dao.update(a);
				}
			});

			// 删除按钮
			deleteIV.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					// 给用户一个对话框，告诉他要不要删除
					android.content.DialogInterface.OnClickListener listener = new android.content.DialogInterface.OnClickListener() {

						@Override
						public void onClick(DialogInterface dialog, int which) {
							// 先从集合中删除
							list.remove(a);
							// 自从数据库中删除
							dao.delete(a.getId());
							// 刷新数据
							notifyDataSetChanged();
						}
					};

					Builder builder = new Builder(MainActivity.this);
					// 设置标题
					builder.setTitle("你确定要删除吗？");
					builder.setPositiveButton("确定", listener);
					builder.setNegativeButton("取消", null);
					// 对话框的显示
					builder.show();
				}
			});

			return view;
		}
	}

}
