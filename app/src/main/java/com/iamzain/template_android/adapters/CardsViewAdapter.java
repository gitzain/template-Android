package com.iamzain.template_android.adapters;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.iamzain.template_android.models.Card;
import com.iamzain.template_android.R;

import java.util.List;


public class CardsViewAdapter extends RecyclerView.Adapter<CardsViewAdapter.CardViewHolder> {

    List<Card> cardList;

    public CardsViewAdapter(List<Card> cards) {

        this.cardList = cards;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card, parent, false);

        return new CardViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        Card card = cardList.get(position);
        holder.title.setText(card.getTitle());
        holder.description.setText(card.getDescription());
        holder.meta.setText(card.getMeta());
    }

    @Override
    public int getItemCount() {

        return cardList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        FloatingActionButton fab;
        public TextView title, description, meta;

        public CardViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            description = (TextView) view.findViewById(R.id.description);
            meta = (TextView) view.findViewById(R.id.meta);
/*            fab = (FloatingActionButton) view.findViewById(R.id.fab);
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //TODO
                }
            });*/
        }
    }
}