package nlnl.app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] web;
    private final String[] Desc;
    private final Integer[] imageId;
    public CustomList(Activity context,
                      String[] web, String[] Desc, Integer[] imageId) {
        super(context, R.layout.list_single, web);
        this.context = context;
        this.web = web;
        this.Desc = Desc;
        this.imageId = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_single, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.list_name);
        TextView txtDesc = (TextView) rowView.findViewById(R.id.list_desc);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.list_profile);
        txtTitle.setText(web[position]);
        txtDesc.setText(Desc[position]);

        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}
