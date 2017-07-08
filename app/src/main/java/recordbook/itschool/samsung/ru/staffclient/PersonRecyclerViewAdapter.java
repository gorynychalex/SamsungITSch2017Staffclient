package recordbook.itschool.samsung.ru.staffclient;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;

/**
 * Adapter Recycler View
 * Адаптер для создания списка
 */

public class PersonRecyclerViewAdapter extends RecyclerView.Adapter<PersonRecyclerViewAdapter.PersonViewHolder> {

    //Define data set
    private List<Person> childrens;

    /*
        Initialize View
     */
    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        final Context context;

        //Text from Dataset
        TextView mTextName;
        TextView mTextNumber;
        ImageView imageView;

        public PersonViewHolder(View itemView) {
            super(itemView);

            mTextName = (TextView) itemView.findViewById(R.id.textName);
            mTextNumber = (TextView) itemView.findViewById(R.id.rumNumber);
            imageView = (ImageView) itemView.findViewById(R.id.smile);
            imageView.setImageResource(R.drawable.smile05);
            context = itemView.getContext();
        }
    }

    public PersonRecyclerViewAdapter(List<Person> persons) {
        this.childrens = persons;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(final ViewGroup parent,
                                               int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_text_view, parent, false);
        // set the view's size, margins, paddings and layout parameters


        //First fashion: HANDLE ONCLICK Set on click listener
        //Первый способ обработать касания (откуда взять номер позиции - непонятно)
//        v.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(parent.getContext(),"Hello! " , Toast.LENGTH_SHORT).show();
//            }
//        });

        return new PersonViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
//        holder.mTextName.setText(mDataset[position]);
        holder.mTextName.setText(childrens.get(position).getName());
        holder.mTextNumber.setText(String.valueOf(childrens.get(position).getRoom()));

        //SHOW SMILE!!!
        if(childrens.get(position).getState() == 0)
            holder.imageView.setImageResource(R.drawable.smile03);
        else
            holder.imageView.setImageResource(R.drawable.smile05);
    }

    // Return the size of your dataset (invoked by the layout manager)
    public int getItemCount() {
        return childrens.size();
    }

}