package csitmnr.jsonparsinginrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Manoj Budha Ayer on 9/16/2017.
 */

public class DatumAdapter extends RecyclerView.Adapter<DatumAdapter.GithubViewHolder>{
   private List<Datum> list;
    private Context context;

    public DatumAdapter(MainActivity list, List<Datum> context) {
        this.list = (List<Datum>) list;
        this.context = (Context) context;
    }

    @Override
    public GithubViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.data_listview,parent,false);
        return new GithubViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GithubViewHolder holder, int position) {
        Datum data = list.get(position);

        Glide.with(holder.imageView.getContext()).load(data.getImage()).into(holder.imageView);

        holder.title.setText(data.getTitle());
        holder.intro.setText(data.getIntro());
        holder.author.setText(data.getAuthor());
        holder.date_en.setText(data.getDateEn());
        holder.date_np.setText(data.getDateNp());

    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class GithubViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView title,intro,author,date_en,date_np;
        public GithubViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.title);
            intro = itemView.findViewById(R.id.intro);
            author = itemView.findViewById(R.id.author);
            date_en = itemView.findViewById(R.id.dateEn);
            date_np = itemView.findViewById(R.id.dateNe);

        }
    }


}
