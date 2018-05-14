package com.example.kcruz.labo6drawer.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kcruz.labo6drawer.R;
import com.example.kcruz.labo6drawer.models.Dish;

import java.util.List;

public class MenuListAdapter extends RecyclerView.Adapter<MenuListAdapter.MenuViewHolder> {
    private Context context;
    List<Dish> menu;

    public MenuListAdapter(Context mContext, List<Dish> mMenu) {
        context = mContext;
        menu = mMenu;
    }

    public static class MenuViewHolder extends RecyclerView.ViewHolder {
        //indica la vista donde se ubicaran la informaciond de la lista
        CardView card;
        ImageView img;
        TextView title,description;

        public MenuViewHolder(View itemView) {
            super(itemView);
            card = itemView.findViewById(R.id.card_view);
            img = itemView.findViewById(R.id.img);
            title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
        }
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cardview_item,parent,false);
        return (new MenuViewHolder(view));
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        holder.img.setImageResource(menu.get(position).getPhoto());
        holder.title.setText(menu.get(position).getName());
        holder.description.setText(menu.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return menu.size();
    }

}

