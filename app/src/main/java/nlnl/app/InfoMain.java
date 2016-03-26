package nlnl.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;

public class InfoMain extends AppCompatActivity {
    private ListView list;

    String[] web = {
            "조병철",
            "강지훈",
            "정민우",
            "박종흠",
            "김정흔"
    };
    Integer[] imageId = {
            R.mipmap.byeongcheol,
            R.mipmap.jihun,
            R.mipmap.minwoo,
            R.mipmap.jongheum,
            R.mipmap.jungheun
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        CustomList adapter = new
                CustomList(InfoMain.this, web, imageId);
        list = (ListView) findViewById(R.id.listView);
        if(list == null){
            Log.d("list","null");
            return;
        }
        list.setAdapter(adapter);

    }
}