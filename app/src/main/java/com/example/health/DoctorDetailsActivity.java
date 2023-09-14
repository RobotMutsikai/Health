package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorDetailsActivity extends AppCompatActivity {
    private String[][] doctor_details1 =
            {
                    {"Имя доктора: Борис1", "Адрес Больницы: ул. Мира1", "Опыт работы: 5 лет", "Номер: 111", "600"},
                    {"Имя доктора: Борис2", "Адрес Больницы: ул. Мира2", "Опыт работы: 6 лет", "Номер: 112", "700"},
                    {"Имя доктора: Борис3", "Адрес Больницы: ул. Мира3", "Опыт работы: 7 лет", "Номер: 113", "800"},
                    {"Имя доктора: Борис4", "Адрес Больницы: ул. Мира4", "Опыт работы: 8 лет", "Номер: 114", "900"},
                    {"Имя доктора: Борис5", "Адрес Больницы: ул. Мира5", "Опыт работы: 9 лет", "Номер: 115", "950"},
            };

    private String[][] doctor_details2 =
            {
                    {"Имя доктора: Борис1", "Адрес Больницы: ул. Мира1", "Опыт работы: 5 лет", "Номер: 111", "600"},
                    {"Имя доктора: Борис2", "Адрес Больницы: ул. Мира2", "Опыт работы: 6 лет", "Номер: 112", "700"},
                    {"Имя доктора: Борис3", "Адрес Больницы: ул. Мира3", "Опыт работы: 7 лет", "Номер: 113", "800"},
                    {"Имя доктора: Борис4", "Адрес Больницы: ул. Мира4", "Опыт работы: 8 лет", "Номер: 114", "900"},
                    {"Имя доктора: Борис5", "Адрес Больницы: ул. Мира5", "Опыт работы: 9 лет", "Номер: 115", "950"},
            };

    private String[][] doctor_details3 =
            {
                    {"Имя доктора: Борис1", "Адрес Больницы: ул. Мира1", "Опыт работы: 5 лет", "Номер: 111", "600"},
                    {"Имя доктора: Борис2", "Адрес Больницы: ул. Мира2", "Опыт работы: 6 лет", "Номер: 112", "700"},
                    {"Имя доктора: Борис3", "Адрес Больницы: ул. Мира3", "Опыт работы: 7 лет", "Номер: 113", "800"},
                    {"Имя доктора: Борис4", "Адрес Больницы: ул. Мира4", "Опыт работы: 8 лет", "Номер: 114", "900"},
                    {"Имя доктора: Борис5", "Адрес Больницы: ул. Мира5", "Опыт работы: 9 лет", "Номер: 115", "950"},
            };

    private String[][] doctor_details4 =
            {
                    {"Имя доктора: Борис1", "Адрес Больницы: ул. Мира1", "Опыт работы: 5 лет", "Номер: 111", "600"},
                    {"Имя доктора: Борис2", "Адрес Больницы: ул. Мира2", "Опыт работы: 6 лет", "Номер: 112", "700"},
                    {"Имя доктора: Борис3", "Адрес Больницы: ул. Мира3", "Опыт работы: 7 лет", "Номер: 113", "800"},
                    {"Имя доктора: Борис4", "Адрес Больницы: ул. Мира4", "Опыт работы: 8 лет", "Номер: 114", "900"},
                    {"Имя доктора: Борис5", "Адрес Больницы: ул. Мира5", "Опыт работы: 9 лет", "Номер: 115", "950"},
            };

    private String[][] doctor_details5 =
            {
                    {"Имя доктора: Борис1", "Адрес Больницы: ул. Мира1", "Опыт работы: 5 лет", "Номер: 111", "600"},
                    {"Имя доктора: Борис2", "Адрес Больницы: ул. Мира2", "Опыт работы: 6 лет", "Номер: 112", "700"},
                    {"Имя доктора: Борис3", "Адрес Больницы: ул. Мира3", "Опыт работы: 7 лет", "Номер: 113", "800"},
                    {"Имя доктора: Борис4", "Адрес Больницы: ул. Мира4", "Опыт работы: 8 лет", "Номер: 114", "900"},
                    {"Имя доктора: Борис5", "Адрес Больницы: ул. Мира5", "Опыт работы: 9 лет", "Номер: 115", "950"},
            };

    TextView tv;
    Button btn;
    HashMap<String, String> item;
    String[][] doctor_details = {};
    ArrayList list;
    SimpleAdapter sa;

    @SuppressLint({"MissingInflatedId", "SuspiciousIndentation"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        tv = findViewById(R.id.textViewDDTitle);
        btn = findViewById(R.id.buttonLDBack);
        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if(title.compareTo("Family Physicians") == 0)
            doctor_details = doctor_details1;
        else
        if(title.compareTo("Dietician") == 0)
            doctor_details = doctor_details2;
        else
        if(title.compareTo("Dantist") == 0)
            doctor_details = doctor_details3;
        else
        if(title.compareTo("Surgeon") == 0)
            doctor_details = doctor_details4;
        else
            doctor_details = doctor_details5;

            btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DoctorDetailsActivity.this, FindDoctorActivity.class));
                }
            });

          list = new ArrayList();
          for(int i=0; i<doctor_details.length; i++){
              item = new HashMap<String, String>();
              item.put("line1", doctor_details[i][0]);
              item.put("line2", doctor_details[i][1]);
              item.put("line3", doctor_details[i][2]);
              item.put("line4", doctor_details[i][3]);
              item.put("line5", "Cтоимость: " + doctor_details[i][4] + " +/-");
              list.add( item );
          }
          sa = new SimpleAdapter(this,list,
                  R.layout.multi_lines,
                  new String[]{"line1", "line2", "line3", "line4", "line5"},
                  new int[]{R.id.line_a, R.id.line_b, R.id.line_c, R.id.line_d, R.id.line_e}
          );
          ListView lst = findViewById(R.id.listViewLT);
          lst.setAdapter(sa);

          lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
              @Override
              public void onItemClick(AdapterView<?>  AdapterView, View view, int i, long l) {
                  Intent it = new Intent(DoctorDetailsActivity.this, BookAppointmentActivity.class);
                  it.putExtra("text1", title);
                  it.putExtra("text2", doctor_details[i][0]);
                  it.putExtra("text3", doctor_details[i][1]);
                  it.putExtra("text4", doctor_details[i][3]);
                  it.putExtra("text5", doctor_details[i][4]);
                  startActivity(it);
              }
          });
    }
}