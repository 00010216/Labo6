package com.example.kcruz.labo6drawer.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kcruz.labo6drawer.R;
import com.example.kcruz.labo6drawer.adapters.MenuListAdapter;
import com.example.kcruz.labo6drawer.models.Dish;

import java.util.ArrayList;
import java.util.List;

public class RestaurantDinnerMenuListFragment extends Fragment {
    Activity activity;
    MenuListAdapter menuListAdapter;
    RecyclerView restaurantMenuView;
    LinearLayoutManager lManager;
    List<Dish> menu;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = getActivity();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu_list,container,false);

        restaurantMenuView = (RecyclerView) view.findViewById(R.id.list_menu);
        restaurantMenuView.setHasFixedSize(true);

        lManager = new LinearLayoutManager(container.getContext());
        restaurantMenuView.setLayoutManager(lManager);

        setMenu();

        menuListAdapter = new MenuListAdapter(activity,menu);
        restaurantMenuView.setAdapter(menuListAdapter); //se le asigna al recycler lo que procesa el adapter de la informacion
        return view;
    }

    public void setMenu(){
        Dish dish1 = new Dish("dinner",R.drawable.pizza,"Pizza","Hamburger with meat, tomatoes, lettce and extra cheese");
        Dish dish2 = new Dish("dinner",R.drawable.pasta,"Pasta","Hamburger with meat, tomatoes, lettce and extra cheese");
        Dish dish3 = new Dish("dinner",R.drawable.soup,"Chicken noodle soup","Hamburger with meat, tomatoes, lettce and extra cheese");
        Dish dish4 = new Dish("dinner",R.drawable.burger,"Cheesebuger","Hamburger with meat, tomatoes, lettce and extra cheese");
        Dish dish5 = new Dish("dinner",R.drawable.burger,"Cheesebuger","Hamburger with meat, tomatoes, lettce and extra cheese");

        menu = new ArrayList<Dish>();
        menu.add(dish1);
        menu.add(dish2);
        menu.add(dish3);
        menu.add(dish4);
        menu.add(dish5);
    }

    @Override
    public void onResume() {
        getActivity().setTitle(R.string.dinner);
        super.onResume();
    }
}
