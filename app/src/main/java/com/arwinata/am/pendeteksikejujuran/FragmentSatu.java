package com.arwinata.am.pendeteksikejujuran;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentSatu extends Fragment {

    View tampilan;
    EditText editText1;
    TextView textView1;
    Button button1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        tampilan = inflater.inflate(R.layout.activity_fragment_satu, container, false);
        button1 = tampilan.findViewById(R.id.button1);
        editText1 = tampilan.findViewById(R.id.edtText1);
        textView1 = tampilan.findViewById(R.id.txtView1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText1.getText().toString();
                input = input.toLowerCase();
                String[] arrayInput = input.split(" ");
                String result = "";

                for (int i = arrayInput.length - 1; i > 0; i--) {
                    if (arrayInput[i].equals(("bohong"))) {
                        arrayInput[i - 1] = balikan(arrayInput[i - 1]);
                    }
                }
                result = arrayInput[0];
                textView1.setText(result);
            }
        });
        return tampilan;
    }

    public String balikan(String masukan) {
        String hasil = "";
        if (masukan.equals("bohong")) {
            hasil = "jujur";
        } else {
            hasil = "bohong";
        }
        return hasil;
    }
}