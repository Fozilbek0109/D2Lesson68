package uz.coder.d2lesson68;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import uz.coder.d2lesson68.databinding.ItemSplashBinding;

public class SplashAdapter extends RecyclerView.Adapter<SplashAdapter.VH> {
    private List<SplashModel> splashModelList;

    public SplashAdapter(List<SplashModel> splashModelList) {
        this.splashModelList = splashModelList;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(ItemSplashBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        Picasso.get().load(splashModelList.get(position).getImg()).into(holder.binding.img);
        holder.binding.txt.setText(splashModelList.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return splashModelList.size();
    }

    public static class VH extends RecyclerView.ViewHolder{
        ItemSplashBinding binding;
        public VH(@NonNull ItemSplashBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
