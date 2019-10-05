package com.arwinata.am.pendeteksikejujuran;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.net.URI;

public class FragmentDua extends Fragment {

    View tampilan;
    Button buttonAd;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        tampilan = inflater.inflate(R.layout.activity_fragment_dua, container, false);
        buttonAd = tampilan.findViewById(R.id.buttonAd);

        buttonAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("lms.jti.polinema"));
                startActivity(i);
            }
        });

        return tampilan;
    }
}
