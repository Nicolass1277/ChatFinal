package com.stomas.chatfinal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ChatsFragment extends Fragment {
    private RecyclerView recyclerViewChats;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chats, container, false);
        recyclerViewChats = view.findViewById(R.id.recyclerViewChats);
        recyclerViewChats.setLayoutManager(new LinearLayoutManager(getContext()));
        // Set adapter for RecyclerView (not implemented here)
        return view;
    }
}