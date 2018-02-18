package com.example.himanshu.adapter;
import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



/**
 * Created by himanshu on 2/18/2018.
 */

public class custum extends ArrayAdapter <String>

{
    private String[] fruitname;
    private String [] des;
    private Integer []img;
    private Activity context;

    public custum(Activity  context,String[]fruitname,String[]des,Integer[]img ) {
        super(context, R.layout.image,fruitname );
        this.context=context;
        this.fruitname=fruitname;
        this.des=des;
        this.img=img;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r=convertView;
ViewHolder viewHolder=null;
if(r==null){

    LayoutInflater layoutInflater=context.getLayoutInflater();
    r=layoutInflater.inflate(R.layout.image,null);
    viewHolder = new ViewHolder(r);
r.setTag(viewHolder);

}
else
{



    viewHolder = (ViewHolder) r.getTag();
}

viewHolder.img1.setImageResource(img[position]);
viewHolder.tv1.setText(fruitname[position]);
viewHolder.tv2.setText(des[position]);


        return super.getView(position, convertView, parent);
    }

    class ViewHolder

    {
        TextView tv1;
        ImageView img1;
        TextView tv2;
        ViewHolder(View v)
        {
tv2=v.findViewById(R.id.tv2);
tv1=v.findViewById(R.id.tv1);
img1=v.findViewById(R.id.img1);
        }



    }
}
