package nlnl.app.card;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by whdgm on 3/26/2016.
 */
public class cardItem {
    int profile;
    String textTitle;
    boolean checked;
    String textDesc;

    public cardItem(int profile, String textTitle, boolean checked, String textDesc){
        this.profile=profile;
        this.textTitle=textTitle;
        this.checked=checked;
        this.textDesc=textDesc;
    }

    public int getProfile(){return profile;}
    public String getTextTitle(){return textTitle;}
    public boolean getChecked(){return checked;}
    public String getTextDesc(){return textDesc;}

}
