package il.co.avpro.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView list;

    String[] title ={
            "Axelicker 1","Axelicker 2",
            "Axelicker 3"
    };


    Integer[] logoID={
            R.drawable.test_img1,R.drawable.test_img2,
            R.drawable.test_img3
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomList adapter=new CustomList(this, title,logoID);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        ImageButton home = (ImageButton) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.setSelection(0);
            }
        });

    }
}
