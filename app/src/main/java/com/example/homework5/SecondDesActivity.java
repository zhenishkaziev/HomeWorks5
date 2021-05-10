package com.example.homework5;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondDesActivity extends AppCompatActivity {

     TextView txtName, txtDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_des);
        txtName = findViewById(R.id.name_txt);
        txtDescription = findViewById(R.id.des_txt);

        String take = getIntent().getStringExtra("name");

        switch (take){
            case  "Java":
                txtName.setText("Java");
                txtDescription.setText("Java — строго типизированный объектно-ориентированный язык программирования общего назначения, разработанный компанией Sun Microsystems. Разработка ведётся сообществом, организованным через Java Community Process; язык и основные реализующие его технологии распространяются по лицензии GPL.");
                break;
            case "Kotlin":
                 txtName.setText("Kotlin");
                 txtDescription.setText(" Kotlin — статически типизированный, объектно-ориентированный язык программирования, работающий поверх Java Virtual Machine и разрабатываемый компанией JetBrains. Также компилируется в JavaScript и в исполняемый код ряда платформ через инфраструктуру LLVM.");
                 break;
            case "Phython":
                   txtName.setText("Phython");
                   txtDescription.setText("Python — высокоуровневый язык программирования общего назначения с динамической строгой типизацией и автоматическим управлением памятью, ориентированный на повышение производительности разработчика, читаемости кода и его качества, а также на обеспечение переносимости написанных на нём программ. ");
                   break;
            case "PHP":
                txtName.setText("PHP");
                txtDescription.setText("PHP — скриптовый язык общего назначения, интенсивно применяемый для разработки веб-приложений. В настоящее время поддерживается подавляющим большинством хостинг-провайдеров и является одним из лидеров среди языков, применяющихся для создания динамических веб-сайтов.");

        }


    }



}