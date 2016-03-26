package nlnl.app.card;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nlnl.app.R;

/**
 * Created by whdgm on 3/26/2016.
 */
public class cardAdapter extends RecyclerView.Adapter<cardViewHolder> {

    private List<cardItem> items;

    public cardAdapter(){
        super();
        items=new ArrayList<>();
    }

    public void addCard(cardItem item){
        items.add(item);
    }

    @Override
    public cardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dream_card,parent,false);
        return new cardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(cardViewHolder holder, int position) {
        final cardItem item = items.get(position);
        holder.profile.setImageResource(item.getProfile());
        holder.textTitle.setText(item.getTextTitle());
        holder.checked.setChecked(item.getChecked());
        holder.textDesc.setText(item.getTextDesc());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
