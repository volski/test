package il.co.avpro.test;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] title;
    private final Integer[] logoID;

    public CustomList(Activity context, String[] title, Integer[] logoID) {
        super(context, R.layout.list_item_view, title);

        this.context=context;
        this.title=title;
        this.logoID=logoID;

    }

    public View getView(int position, View view, final ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        final View rowView=inflater.inflate(R.layout.list_item_view, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.name);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
        ImageButton more = (ImageButton) rowView.findViewById(R.id.more) ;
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Clicked on More",Toast.LENGTH_SHORT).show();
            }
        });

        titleText.setText(title[position]);
        imageView.setImageResource(logoID[position]);
        return rowView;

    };
}