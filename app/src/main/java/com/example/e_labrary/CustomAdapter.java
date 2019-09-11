package com.example.e_labrary;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter implements Filterable {

    Context c;
    ArrayList<Player> players;
    CustomFilter filter;
    ArrayList<Player> filterList;

    public CustomAdapter(Context ctx,ArrayList<Player> players){

        this.c=ctx;
        this.players=players;
        this.filterList=players;


    }


    @Override
    public int getCount() {
        return players.size();
    }

    @Override
    public Object getItem(int position) {
        return players.get(position);
    }

    @Override
    public long getItemId(int position) {

        return players.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView==null){
            convertView=layoutInflater.inflate(R.layout.activity_temp_view,null);
        }

        TextView textView=(TextView)convertView.findViewById(R.id.bookNameId);
        ImageView imageView=convertView.findViewById(R.id.imageViewId);

       textView.setText(players.get(position).getName());
       imageView.setImageResource(players.get(position).getImg());
        return convertView;
    }

    @Override
    public Filter getFilter() {
        if (filter==null){
            filter=new CustomFilter();
        }
        return filter;
    }

    //Inner Class
    class CustomFilter extends Filter
    {

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            FilterResults results=new FilterResults();

            if (constraint !=null && constraint.length()>0){
                constraint=constraint.toString().toUpperCase();

                ArrayList<Player> filters=new ArrayList<Player>();

                for (int i=0;i<filterList.size();i++){
                    if (filterList.get(i).getName().toUpperCase().contains(constraint)){
                        Player p=new Player(filterList.get(i).getName(),filterList.get(i).getImg());

                        filters.add(p);
                    }
                }
                results.count=filters.size();
                results.values=filters;
            }else {
                results.count=filterList.size();
                results.values=filterList;
            }
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            players= (ArrayList<Player>) results.values;
            notifyDataSetChanged();

        }
    }
}
