package uz.coder.d2lesson68.navigationbottom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;

import uz.coder.d2lesson68.R;
import uz.coder.d2lesson68.databinding.ActivityNavBottomViewBinding;


public class NavBottomView extends AppCompatActivity {
    private ActivityNavBottomViewBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNavBottomViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavHostFragment navHostFragment =
                (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
        NavController navController  =navHostFragment.getNavController();
        NavigationUI.setupWithNavController(binding.bottomView,navController);


        binding.bottomView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                    if (itemId == R.id.cartFragment) {
                        Toast.makeText(NavBottomView.this, "sds", Toast.LENGTH_SHORT).show();
                    }


                return true;
            }
        });
    }
}