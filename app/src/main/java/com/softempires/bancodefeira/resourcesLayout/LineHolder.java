package com.softempires.bancodefeira.resourcesLayout;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.softempires.bancodefeira.R;

public class LineHolder extends RecyclerView.ViewHolder {

    public TextView description;
    public TextView price;
    public TextView size;
    public TextView avaliable;
    public ImageButton picProduct;


    public LineHolder(View itemView) {
        super(itemView);
        description = (TextView) itemView.findViewById(R.id.tw_description_product);
        price = (TextView) itemView.findViewById(R.id.tw_price_product);
        avaliable = (TextView) itemView.findViewById(R.id.tw_avaliable_product);
        size = (TextView) itemView.findViewById(R.id.tw_size_product);
        picProduct = (ImageButton) itemView.findViewById(R.id.iv_pic_product);

    }
}
