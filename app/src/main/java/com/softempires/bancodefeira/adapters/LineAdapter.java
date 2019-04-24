package com.softempires.bancodefeira.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.softempires.bancodefeira.R;
import com.softempires.bancodefeira.model.Product;
import com.softempires.bancodefeira.resourcesLayout.LineHolder;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LineAdapter extends RecyclerView.Adapter<LineHolder> {
    private final List<Product> listProducts;

    public LineAdapter(ArrayList products) {
        listProducts = products;
    }

    @Override
    public LineHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new LineHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_list, parent, false));
    }

    @Override
    public void onBindViewHolder(LineHolder holder, int position) {
        holder.description.setText(String.format(Locale.getDefault(), "%s, %d - %s",
                listProducts.get(position).getDescription(),
                listProducts.get(position).getSize(),
                listProducts.get(position).getPrice()
        ));
    }

    @Override
    public int getItemCount() {
        return listProducts != null ? listProducts.size() : 0;
    }

}
