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

	public int getCount() { // ��ȡ��Ŀ����
		return list.size();
	}

	public Object getItem(int position) { // ����λ�û�ȡ����
		return list.get(position);
	}

	public long getItemId(int position) { // ����λ�û�ȡid
		return position;
	}

	// ��ȡһ����Ŀ��ͼ
	public View getView(int position, View convertView, ViewGroup parent) {
		// ����convertView
//		View item = convertView != null ? convertView : View.inflate(context,
//				R.layout.item, null);
		convertView=inflater.inflate(R.layout.item, null);
		// ��ȡ����ͼ�е�TextView
		TextView idTV = (TextView) convertView.findViewById(R.id.idTV);
		TextView nameTV = (TextView) convertView.findViewById(R.id.nameTV);
		TextView balanceTV = (TextView) convertView.findViewById(R.id.balanceTV);
		// ���ݵ�ǰλ�û�ȡAccount����
		final Account a = list.get(position);
		// ��Account�����е����ݷŵ�TextView��
		idTV.setText(a.getId() + "");
		nameTV.setText(a.getName());
		balanceTV.setText(a.getBalance() + "");
		ImageView upIV = (ImageView) convertView.findViewById(R.id.upIV);
		ImageView downIV = (ImageView) convertView.findViewById(R.id.downIV);
		ImageView deleteIV = (ImageView) convertView.findViewById(R.id.deleteIV);
		// ���ϼ�ͷ�ĵ���¼������ķ���
		upIV.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				a.setBalance(a.getBalance() + 1); // �޸�ֵ
				notifyDataSetChanged(); // ˢ�½���
				dao.update(a); // �������ݿ�
			}
		});
		// ���¼�ͷ�ĵ���¼������ķ���
		downIV.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				a.setBalance(a.getBalance() - 1);
				notifyDataSetChanged();
				dao.update(a);
			}
		});
		// ɾ��ͼƬ�ĵ���¼������ķ���
		deleteIV.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// ɾ������֮ǰ���ȵ���һ���Ի���
				android.content.DialogInterface.OnClickListener listener = new android.content.DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						list.remove(a); // �Ӽ�����ɾ��
						dao.delete(a.getId()); // �����ݿ���ɾ��
						notifyDataSetChanged();// ˢ�½���
					}
				};
				Builder builder = new Builder(context); // �����Ի���
				builder.setTitle("ȷ��Ҫɾ����?"); // ���ñ���
				// ����ȷ����ť���ı��Լ�������
				builder.setPositiveButton("ȷ��", listener);
				builder.setNegativeButton("ȡ��", null); // ����ȡ����ť
				builder.show(); // ��ʾ�Ի���
			}
		});
		return convertView;
	}
}

//// ListView��Item����¼�
//private class MyOnItemClickListener implements OnItemClickListener {
//	public void onItemClick(AdapterView<?> parent, View view, int position,
//			long id) {
//		// ��ȡ���λ���ϵ�����
//		Account a = (Account) parent.getItemAtPosition(position);
//		Toast.makeText(getApplicationContext(), a.toString(),
//				Toast.LENGTH_SHORT).show();
//	}

