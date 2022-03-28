package com.example.lesson_6;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements OnClick {

    private AdapterFlag adapterFlag;
    private RecyclerView recyclerView;
    private ArrayList<Model> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycle_second);
        loadData();
        adapterFlag = new AdapterFlag(list, this);
        recyclerView.setAdapter(adapterFlag);
    }
    private void loadData() {
        Bundle bundle = getArguments();
        Integer id = bundle.getInt("key");
        list = new ArrayList<>();
        switch (id){
            case 1:{
                list.add(new Model(R.drawable.ai_1x, "Kipr"));
                list.add(new Model(R.drawable.am_1x, "Armeniya"));
                list.add(new Model(R.drawable.an_1x, "Belgiya"));
                list.add(new Model(R.drawable.cd_1x, "Oktongvia"));
                list.add(new Model(R.drawable.ar_1x, "Argentina"));
                break;
            }
            case 2:{
                list.add(new Model(R.drawable.ax_1x, "Strana"));
                list.add(new Model(R.drawable.aw_1x, "Armeniya"));
                list.add(new Model(R.drawable.at_1x, "BelgiStranaya"));
                list.add(new Model(R.drawable.au_1x, "Strana"));
                list.add(new Model(R.drawable.ci_1x, "Shvecia"));
                break;
            }
            case 3:{
                list.add(new Model(R.drawable.cv_1x, "Strana"));
                list.add(new Model(R.drawable.cy_1x, "Strana"));
                list.add(new Model(R.drawable.co_1x, "Strana"));
                list.add(new Model(R.drawable.cz_1x, "Strana"));
                list.add(new Model(R.drawable.cm_1x, "Strana"));
                break;
            }
            case 4:{
                break;
            }
            case 5:{
                list.add(new Model(R.drawable.bf_1x, "Strana"));
                list.add(new Model(R.drawable.bg_1x, "Strana"));
                list.add(new Model(R.drawable.bt_1x, "Strana"));
                list.add(new Model(R.drawable.br_1x, "Strana"));
                list.add(new Model(R.drawable.ba_1x, "Strana"));
                break;
            }
            case 6:{
                list.add(new Model(R.drawable.ba_1x, "Strana"));
                list.add(new Model(R.drawable.bo_1x, "Strana"));
                list.add(new Model(R.drawable.bg_1x, "Strana"));
                list.add(new Model(R.drawable.bh_1x, "Strana"));
                list.add(new Model(R.drawable.bz_1x, "Strana"));
                break;
            }
        }
    }

    @Override
    public void onClick(Model model) {

    }
}