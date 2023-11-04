package uz.coder.d2lesson68;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

import uz.coder.d2lesson68.databinding.ActivityMainBinding;
import uz.coder.d2lesson68.databinding.TabItemBinding;

public class MainActivity extends AppCompatActivity {
    private List<SplashModel> splashModelList;
    private SplashAdapter adapter;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
        adapter = new SplashAdapter(splashModelList);
        binding.vp2.setAdapter(adapter);
        setTabs();
        TabLayoutMediator tab = new TabLayoutMediator(binding.tab, binding.vp2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

            }
        });
        tab.attach();

    }

    private void setTabs() {
        int tabCount = binding.tab.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tab = binding.tab.getTabAt(i);
            TabItemBinding tabItemBinding  = TabItemBinding.inflate(LayoutInflater.from(this),null,false);
//            tabItemBinding
        }
    }

    private void loadData() {
        splashModelList = new ArrayList<>();
        splashModelList.add(new SplashModel("Bmw","https://storage.kun.uz/source/thumbnails/_medium/9/AxrN8u_Cr7YQowuxxcy1eIWAbg7svfqg_medium.jpg"));
        splashModelList.add(new SplashModel("Bmw2","https://storage.kun.uz/source/thumbnails/_medium/9/kjil3yrWzNf6rQa5uhTwdJ41fi3E-MW4_medium.jpg"));
        splashModelList.add(new SplashModel("Bmw","https://storage.kun.uz/source/thumbnails/_medium/9/AxrN8u_Cr7YQowuxxcy1eIWAbg7svfqg_medium.jpg"));
    }
}