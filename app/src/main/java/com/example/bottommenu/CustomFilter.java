package com.example.bottommenu;

import android.widget.Filter;

import java.util.ArrayList;
import java.util.List;

public class CustomFilter extends Filter {
    RecyclerViewAdapter adapter;
    List<ModelIhram> filterList;
    public CustomFilter(List<ModelIhram> filterList, RecyclerViewAdapter adapter) {
        this.adapter=adapter;
        this.filterList= filterList;
    }

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults results = new FilterResults();
        if(constraint != null && constraint.length() > 0)
        {
            constraint = constraint.toString().toUpperCase();
            ArrayList<ModelIhram> filteredTitle=new ArrayList<>();
            for (int i=0;i<filterList.size();i++)
            {
                if(filterList.get(i).getTitle().toUpperCase().contains(constraint))
                {
                    filteredTitle.add(filterList.get(i));
                }
            }
            results.count=filteredTitle.size();
            results.values=filteredTitle;
        }else
        {
            results.count=filterList.size();
            results.values=filterList;
        }
        return results;
    }

    @Override
    protected void publishResults(CharSequence charSequence, FilterResults results) {
        adapter.ihramModel= (ArrayList<ModelIhram>) results.values;
        adapter.notifyDataSetChanged();
    }


}
