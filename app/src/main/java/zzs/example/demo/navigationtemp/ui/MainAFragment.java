package zzs.example.demo.navigationtemp.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import zzs.example.demo.navigationtemp.R;
import zzs.example.demo.navigationtemp.bean.Word;
import zzs.example.demo.navigationtemp.kit.InjectorKit;
import zzs.example.demo.navigationtemp.ui.adapter.WordAdapter;
import zzs.example.demo.navigationtemp.viewmodel.WordViewModel;

public class MainAFragment extends Fragment {

    private WordViewModel mWordViewModel;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e("FragmentLifecycle","A onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mWordViewModel = ViewModelProviders.of(this, InjectorKit.getmWordFactory()).get(WordViewModel.class);
        return inflater.inflate(R.layout.main_a_layout,container,false);
    }

    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView wordRv = view.findViewById(R.id.word_rv);
        wordRv.setLayoutManager(new LinearLayoutManager(view.getContext()));
        final WordAdapter adapter = new WordAdapter();
        wordRv.setAdapter(adapter);
        view.findViewById(R.id.add_word_floatBt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_jump_b);
            }
        });
        mWordViewModel.fetchAllWords().observe(this, new Observer<List<Word>>() {
            @Override
            public void onChanged(List<Word> words) {
                adapter.setWords(words);
            }
        });
    }
}
