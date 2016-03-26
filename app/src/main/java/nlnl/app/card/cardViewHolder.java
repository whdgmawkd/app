package nlnl.app.card;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import nlnl.app.R;

/**
 * Created by whdgm on 3/26/2016.
 */
public class cardViewHolder extends RecyclerView.ViewHolder {
    ImageView profile;
    ToggleButton checked;
    TextView textTitle, textDesc;

    public cardViewHolder(View itemView){
        super(itemView);
        profile=(ImageView)itemView.findViewById(R.id.card_profile);
        checked=(ToggleButton)itemView.findViewById(R.id.card_checked);
        textTitle=(TextView)itemView.findViewById(R.id.card_title);
        textDesc=(TextView)itemView.findViewById(R.id.card_desc);
        itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
