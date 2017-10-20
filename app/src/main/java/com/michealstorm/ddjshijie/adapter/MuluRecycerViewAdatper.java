package com.michealstorm.ddjshijie.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.michealstorm.ddjshijie.R;
import com.michealstorm.ddjshijie.bean.Article;

import java.util.List;

/**
 * Author       : Michealstorm@aliyun.com
 * Project Name ：DdjShijie
 * Created Time : 2017/10/19 23:44
 * Description  : //
 */

public class MuluRecycerViewAdatper extends RecyclerView.Adapter<MuluRecycerViewAdatper.MuluViewHolder> {
    private List<Article> mArticleList;
    public MuluRecycerViewAdatper(List<Article> list) {
        this.mArticleList =list;
    }

    @Override
    public MuluViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem_index_mulu, parent, false);
        return new MuluViewHolder(view);

    }

    @Override
    public void onBindViewHolder(MuluViewHolder holder, int position) {
        holder.tv_Artitcle_title.setText(mArticleList.get(position).getTitle());
        holder.tv_Article_content.setText(mArticleList.get(position).getContent());

    }

    @Override
    public int getItemCount() {
        return mArticleList.size();
    }

    public class MuluViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_Artitcle_title;
        private TextView tv_Article_content;

        public MuluViewHolder(View itemView) {
            super(itemView);
            this.tv_Artitcle_title = itemView.findViewById(R.id.article_title);
            this.tv_Article_content = itemView.findViewById(R.id.article_content);
        }
    }
}
