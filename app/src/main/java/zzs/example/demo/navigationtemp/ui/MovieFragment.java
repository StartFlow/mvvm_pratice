package zzs.example.demo.navigationtemp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import zzs.example.demo.navigationtemp.R;
import zzs.example.demo.navigationtemp.bean.MovieBean;
import zzs.example.demo.navigationtemp.kit.InjectorKit;
import zzs.example.demo.navigationtemp.ui.adapter.MovieAdapter;
import zzs.example.demo.navigationtemp.viewmodel.MovieViewModel;

public class MovieFragment  extends Fragment {


    private MovieViewModel mMovieViewModel;
    private MovieAdapter mMovieAdapter;
    private String movieType = "";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments()!=null){
            movieType = getArguments().getString("type");
        }
        ActionBar bar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        if (bar!=null){
            bar.hide();
        }
        mMovieAdapter = new MovieAdapter(getActivity());
        mMovieViewModel = ViewModelProviders.of(this, InjectorKit.getmMovieFactory()).get(MovieViewModel.class);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.movie_fragment_layout,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView movieRv = view.findViewById(R.id.movie_rv);
        movieRv.setLayoutManager(new LinearLayoutManager(getActivity()));
        movieRv.setAdapter(mMovieAdapter);
        mMovieViewModel.fetchMovie(movieType).observe(this, new Observer<PagedList<MovieBean.SubjectsBean>>() {
            @Override
            public void onChanged(PagedList<MovieBean.SubjectsBean> subjectsBeans) {
                mMovieAdapter.submitList(subjectsBeans);
            }
        });
        mMovieAdapter.setOnItemClick(new MovieAdapter.OnItemClick() {
            @Override
            public void onClick(View view, MovieBean.SubjectsBean bean, int position) {
                Toast.makeText(getContext(), "movie uid = " +bean.getId(), Toast.LENGTH_SHORT).show();
                mMovieViewModel.fetchMovieDetail(bean.getId());
            }
        });
    }

}
