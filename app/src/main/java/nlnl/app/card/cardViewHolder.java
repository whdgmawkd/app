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
                TextView txt =(TextView) view.findViewById(R.id.card_title);
                TextView desc = (TextView)view.findViewById(R.id.card_desc);
                if(txt.getText().equals("프로그래머가 되고싶어?")){
                    desc.setText("안녕 얘들아 난 프로그래밍 회사에서 노예로 일하고 있는 강지훈이야 \n프로그래머가 되고 싶으면 먼저 알고리즘이라는 것을 알아야되.\n" +
                            "알고리즘은 한마디로 논리구조인데 자신이 생각한 논리구조를 구현하는게 프로그래머지\n" +
                            "단순히 코드만 치는 사람은 코더이고.\n" +
                            "그리고 알고리즘을 잘 다룰 수 있다면 그때부터 언어를 배워도 늦지 않아.\n" +
                            "언어는 해당플랫폼에 따라 달라\n" +
                            "윈도우 같은 경우 C, C++, JAVA이렇게 나눌 수 있어.\n" +
                            "웹 같은 경우 HTML, CSS, RUBY등이 있어.\n" +
                            "안드로이드는 JAVA를 이용하고 아이폰은 스위프트나 Object-C를 이용해.\n" +
                            "여기서 너가 개발하길 원하는 플랫폼에 따라 언어를 배워\n" +
                            "\"난 안드로이드를 개발하겠어!\"이런다면 JAVA언어를 배워서 안드로이드를 개발해.\n" +
                            " JAVA를 배우기 막막하다고? 그러면 구글에서 구글링을 해서 자료를 찾고, 아니면 JAVA언어 관련 책을 사서 배우는 것도 좋아.");
                    txt.setText("프로그래머가 되고싶어?(열림)");
                } else if(txt.getText().equals("프로그래머가 되고싶어?(열림)")){
                    desc.setText("안녕 얘들아 난 프로그래밍 회사에서 노예로 일하고 있는 강지훈이야 ...자세하게");
                    txt.setText("프로그래머가 되고싶어?");
                } else if(txt.getText().equals("프로그래머를 진로로 하는데 어쩌죠")){
                    desc.setText("Q.중3때부터 프로그래머가 되고싶어온 1인입니다.\n 이제 고2가 되어 슬슬 대학걱정이 되요.\n" +
                            "대학은 무작정 컴퓨터공학과로 가야되나요? \n 컴공과 가면 정말로 체크무늬 와이셔츠가 과티인가요? \n" +
                            "여성분 없나요? 정말로 궁금합니다.\n A.대학을 무작정 컴퓨터 공학과로 간다고 되는게 아니야. \n" +
                            "대학의 컴퓨터 공학과도 많이 분류되어 있어 사전조사를 착실히한 후에 결정을 해야되.\n" +
                            " 그리고 과티 체크무니야 색깔만 같고 무늬만 틀려. \n" +
                            "여성 개발자분들도 점점 늘어나고 있으니 그런 걱정은 Thats NoNo. \n" +
                            "그리고 미팅은 참고로 무용과랑 하려무나");
                    txt.setText("프로그래머를 진로로 하는데 어쩌죠(열림)");
                } else if(txt.getText().equals("프로그래머를 진로로 하는데 어쩌죠(열림)")){
                    desc.setText("Q.중3때부터 프로그래머가 되고싶어온 1인입니다. 이제 고2가 되어 슬슬 대학걱정 ...자세하게");
                    txt.setText("프로그래머를 진로로 하는데 어쩌죠");
                }
            }
        });
    }
}
