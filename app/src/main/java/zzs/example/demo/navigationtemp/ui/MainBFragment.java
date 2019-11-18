package zzs.example.demo.navigationtemp.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import zzs.example.demo.navigationtemp.R;
import zzs.example.demo.navigationtemp.bean.Word;
import zzs.example.demo.navigationtemp.kit.InjectorKit;
import zzs.example.demo.navigationtemp.viewmodel.WordHandleViewModel;

public class MainBFragment extends Fragment {
    private WordHandleViewModel mWordViewModel;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e("FragmentLifecycle","B    onCreateView");
        mWordViewModel = ViewModelProviders.of(this, InjectorKit.getmWordHandleFactory()).get(WordHandleViewModel.class);
        return inflater.inflate(R.layout.main_b_layout,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final EditText editText = view.findViewById(R.id.word_edt);


        view.findViewById(R.id.word_save_bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String word = editText.getText().toString();
                if (!TextUtils.isEmpty(word)){
                    mWordViewModel.insertWord(new Word(word));
                    Navigation.findNavController(v).navigateUp();
                }
            }
        });

        view.findViewById(R.id.action_to_in_Theater_movie).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle args = new Bundle();
                args.putString("type","in_theaters");
                Navigation.findNavController(v).navigate(R.id.action_jump_movie,args);
            }
        });

        view.findViewById(R.id.action_to_in_history_movie).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle args = new Bundle();
                args.putString("type","top250");
                Navigation.findNavController(v).navigate(R.id.action_jump_movie,args);
            }
        });

    }


}
