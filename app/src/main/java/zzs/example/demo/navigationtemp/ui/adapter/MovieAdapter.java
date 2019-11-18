package zzs.example.demo.navigationtemp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import zzs.example.demo.navigationtemp.R;
import zzs.example.demo.navigationtemp.bean.MovieBean;

public class MovieAdapter extends PagedListAdapter<MovieBean.SubjectsBean, MovieAdapter.MyHolder> {

    private Context context;


    private OnItemClick onItemClick;

    public MovieAdapter(Context context) {
        super(call);
        this.context = context;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v  = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item,parent,false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, final int position) {
        final MovieBean.SubjectsBean subjectsBean = getItem(position);
        if (subjectsBean!=null){
            holder.no.setText(String.valueOf(position+1));
            Glide.with(context).load(subjectsBean.getImages().getLarge()).into(holder.posterImage);
            holder.title.setText(subjectsBean.getTitle());
            holder.type.setText(subjectsBean.getGenres().toString());
            holder.pub_date.setText(subjectsBean.getPubdates().toString());
            holder.rating.setText(String.valueOf(subjectsBean.getRating().getAverage()));
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onItemClick!=null){
                        onItemClick.onClick(v,subjectsBean,position);
                    }
                }
            });
        }
    }

    static class MyHolder extends RecyclerView.ViewHolder{
        ImageView posterImage;
        TextView title;
        TextView type;
        TextView pub_date;
        TextView no;
        TextView rating;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            posterImage = itemView.findViewById(R.id.movie_poster);
            title = itemView.findViewById(R.id.movie_title);
            type = itemView.findViewById(R.id.movie_type);
            pub_date = itemView.findViewById(R.id.pub_date);
            no = itemView.findViewById(R.id.movie_no);
            rating = itemView.findViewById(R.id.movie_rating);
        }
    }

    public static final DiffUtil.ItemCallback<MovieBean.SubjectsBean> call = new DiffUtil.ItemCallback<MovieBean.SubjectsBean>() {
        @Override
        public boolean areItemsTheSame(@NonNull MovieBean.SubjectsBean oldItem, @NonNull MovieBean.SubjectsBean newItem) {
            return oldItem.getId().equals(newItem.getId());
        }

        @Override
        public boolean areContentsTheSame(@NonNull MovieBean.SubjectsBean oldItem, @NonNull MovieBean.SubjectsBean newItem) {
            return oldItem.getOriginal_title().equals(newItem.getOriginal_title());
        }
    };

    public interface OnItemClick{
        void onClick(View view, MovieBean.SubjectsBean bean,int position);
    }

    public void setOnItemClick(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

}
