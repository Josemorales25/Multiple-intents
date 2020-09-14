package cl.talentodigital.multipleintentsactivity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import cl.talentodigital.multipleintentsactivity.databinding.ActivityResultadoBinding;

public class ResultadoActivity extends AppCompatActivity {


   private ActivityResultadoBinding binding ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

    }
}
