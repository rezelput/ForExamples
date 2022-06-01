package com.example.forexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.BreakIterator;

public class PersonalPageActivity extends AppCompatActivity {


    //Объявляем используемые переменные:
    private ImageView imageView;
    private final int Pick_image = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_page);
        //Связываемся с нашим ImageView:
        imageView = (ImageView)findViewById(R.id.imageView1);



        //Связываемся с нашей кнопкой Button:
        Button PickImage = (Button) findViewById(R.id.button2);
        //Настраиваем для нее обработчик нажатий OnClickListener:
        PickImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Вызываем стандартную галерею для выбора изображения с помощью Intent.ACTION_PICK:
                Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
                //Тип получаемых объектов - image:
                photoPickerIntent.setType("image/*");
                //Запускаем переход с ожиданием обратного результата в виде информации об изображении:
                startActivity(photoPickerIntent);
            }
        });

    }


    public void goBackMain(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void toText(View v){
        EditText edit = (EditText)findViewById(R.id.editText);
        TextView tview = (TextView)findViewById(R.id.textView1);
        String result = edit.getText().toString();
        tview.setText(result);
    }
}