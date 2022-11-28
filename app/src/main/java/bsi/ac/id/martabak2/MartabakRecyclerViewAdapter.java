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
    private final RecyclerViewInterface recyclerViewInterface;

    Context context;
    ArrayList<Martabak> MartabakModel;

    public MartabakRecyclerViewAdapter(Context context, ArrayList<Martabak> MartabakModel,
                                       RecyclerViewInterface recyclerViewInterface) {
        this.context = context;
        this.MartabakModel = MartabakModel;
        this.recyclerViewInterface = recyclerViewInterface;
    }

    @NonNull
    @Override
    public MartabakRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);

        return new MartabakRecyclerViewAdapter.MyViewHolder(view, recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull MartabakRecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.imageView.setImageResource(MartabakModel.get(position).getImage());
        holder.tvMartabakNama.setText(MartabakModel.get(position).getNama());
        holder.tvBintang.setText(MartabakModel.get(position).getBintang());
        holder.tvPrice.setText(MartabakModel.get(position).getHarga());
    }

    @Override
    public int getItemCount() {
        return MartabakModel.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvMartabakNama, tvPrice, tvBintang;

        public MyViewHolder(@NonNull View itemView, RecyclerViewInterface recyclerViewInterface) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            tvMartabakNama = itemView.findViewById(R.id.MartabakNama);
            tvPrice = itemView.findViewById(R.id.MartabakPrice);
            tvBintang = itemView.findViewById(R.id.MartabakBintang);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(recyclerViewInterface != null) {
                        int pos = getAdapterPosition();

                        if(pos != RecyclerView.NO_POSITION) {
                            recyclerViewInterface.onItemClick(pos);
                        }
                    }
                }
            });
        }
    }

}
