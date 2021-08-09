package com.example.uas10118392;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WisataFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WisataFragment extends Fragment {

    RecyclerView recyclerView;
    WisataAdapter wisataAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_wisata, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        FirebaseRecyclerOptions<WisataModel> options =
                new FirebaseRecyclerOptions.Builder<WisataModel>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("wisata"), WisataModel.class)
                        .build();

        wisataAdapter = new WisataAdapter(options);
        recyclerView.setAdapter(wisataAdapter);

        return view;
    }
    @Override
    public void onStart() {
        super.onStart();
        wisataAdapter.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        wisataAdapter.stopListening();
    }
}