package com.westlakestudent.camera.watermark.ui;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.westlakestudent.camera.systemmgr.UiCmdListener;

public class BubbleImage extends RelativeLayout{

	private Context mContext = null;
	private ListView mListView = null;
	private List<String> mData = null;
	private UiCmdListener mUiCmdListener =null;
	public BubbleImage(Context context) {
		super(context);
		mContext = context;
		initView();
		
	}
	
	
	private void initView(){
		mListView = new ListView (mContext);
		mData = new ArrayList<String>();
		mData.add("�Ǻ�");
		mData.add("��");
		mData.add("��ɪ");
		mData.add("�ӵ�");
		mData.add("ȥ��");
		mData.add("���ո�ȥ");
		mData.add("������");
		mData.add("������");
		mData.add("������");
		mData.add("����");
		mData.add("����");
		mData.add("��");
		mData.add("�ÿɰ�");
		mData.add("�ÿ���");
		mData.add("�ü���");
		mData.add("������");
		mData.add("����");
		mListView.setAdapter(new ArrayAdapter<String>(mContext, android.R.layout.simple_list_item_1,mData));
		RelativeLayout.LayoutParams Params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.MATCH_PARENT);
		addView(mListView,Params);
		setBackgroundColor(Color.WHITE);
		mListView.setOnItemClickListener(listener);
	}

	
	public void setmUiCmdListener(UiCmdListener mUiCmdListener) {
		this.mUiCmdListener = mUiCmdListener;
	}


	OnItemClickListener listener = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View v, int position,long arg3) {
			if(mUiCmdListener != null)
				mUiCmdListener.onUiCmd(position, null);	
			
		}
	};
	
}
