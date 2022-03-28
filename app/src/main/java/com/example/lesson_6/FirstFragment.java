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

public class FirstFragment extends Fragment implements OnClick {
    private ArrayList<Model> list;
    public AdapterFlag adapterFlag;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycle_first);
        loadData();
        adapterFlag = new AdapterFlag(list, this);
        recyclerView.setAdapter(adapterFlag);
    }

    private void loadData() {
        list = new ArrayList<>();
        list.add(new Model(R.drawable.caf_1x, "Евразия", 1));
        list.add(new Model(R.drawable.cas_1x, "Северная Америка", 2));
        list.add(new Model(R.drawable.ceu_1x, "Африка", 3));
        list.add(new Model(R.drawable.cna_1x, "Антарктида", 4));
        list.add(new Model(R.drawable.coc_1x, "Австралия", 5));
        list.add(new Model(R.drawable.csa_1x, "Южная Америка", 6));
    }

    @Override
    public void onClick(Model model) {
        Bundle bundle = new Bundle();
        bundle.putInt("key", model.getId());
        Fragment fragment = new SecondFragment();
        fragment.setArguments(bundle);
        requireActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.container_main, fragment)
                .commit();
    }
}