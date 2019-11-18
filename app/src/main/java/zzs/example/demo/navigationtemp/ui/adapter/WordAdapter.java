package zzs.example.demo.navigationtemp.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import zzs.example.demo.navigationtemp.R;
import zzs.example.demo.navigationtemp.bean.Word;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.Holder> {



    private List<Word> words;



    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

            ( holder).mTextTv.setText(words.get(position).getWord());

    }

    @Override
    public int getItemCount() {
        return words==null?0:words.size();
    }

    public void setWords(List<Word> words) {
        this.words = words;
        notifyDataSetChanged();
    }

    static class Holder extends RecyclerView.ViewHolder{
        TextView mTextTv;
        public Holder(@NonNull View itemView) {
            super(itemView);
            mTextTv =  itemView.findViewById(R.id.item_content);
        }
    }
}
