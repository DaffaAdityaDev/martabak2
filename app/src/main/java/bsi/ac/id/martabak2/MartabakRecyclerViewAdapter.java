package bsi.ac.id.martabak2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MartabakRecyclerViewAdapter extends RecyclerView.Adapter<MartabakRecyclerViewAdapter.MyViewHolder> {
    Context context;
    ArrayList<Martabak> MartabakModel;
    public MartabakRecyclerViewAdapter(Context context, ArrayList<Martabak> MartabakModel) {
        this.context = context;
        this.MartabakModel = MartabakModel;
    }

    @NonNull
    @Override
    public MartabakRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);

        return new MartabakRecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MartabakRecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(MartabakModel.get(position).getImage());
        holder.tvName.setText(MartabakModel.get(position).getNama());
        holder.tvBintang.setText(MartabakModel.get(position).getNama());
        holder.tvPrice.setText(MartabakModel.get(position).getNama());


    }

    @Override
    public int getItemCount() {
        return MartabakModel.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvName, tvPrice, tvBintang;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.textView);
            tvPrice = itemView.findViewById(R.id.textView2);
            tvBintang = itemView.findViewById(R.id.textView3);
        }
    }

}
