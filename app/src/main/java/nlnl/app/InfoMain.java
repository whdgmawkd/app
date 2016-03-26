package nlnl.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

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
    String[] Desc = {
            "기획자 영등포공고,3학년",
            "팀장, 기획자 시흥고, 2학년",
            "개발자 호곡중, 3학년",
            "개발자 용인정보고, 2학년",
            "디자이너 시흥능곡고 2학년"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        CustomList adapter = new
                CustomList(InfoMain.this, web, Desc, imageId);
        list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);

    }
}