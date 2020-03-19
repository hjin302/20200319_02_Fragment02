package com.example.a20200319_02_fragment02.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a20200319_02_fragment02.R;
import com.example.a20200319_02_fragment02.adapters.RoomAdapter;
import com.example.a20200319_02_fragment02.databinding.FragmentRoomListBinding;
import com.example.a20200319_02_fragment02.datas.Room;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

public class RoomListFragment extends Fragment {
//    실무 : 서버에서 내려주는 방 목록을 담아두는 list
//    강의 : 코드로 직접 roomList에 방들을 추가


    List<Room> roomList = new ArrayList<>();

    RoomAdapter adapter = null;

    FragmentRoomListBinding binding = null;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_room_list, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        프래그먼트의 동작 코드 => 리스트뷰 띄워주기
        adapter = new RoomAdapter(getActivity(), R.layout.room_list_item, roomList);

        binding.roomListView.setAdapter(adapter);


        roomList.add(new Room(5000, "서울시 은평구"));
        adapter.notifyDataSetChanged();




    }
}
