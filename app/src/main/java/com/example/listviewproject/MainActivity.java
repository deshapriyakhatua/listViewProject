package com.example.listviewproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        ArrayList<Data> list = new ArrayList<>();

        list.add(new Data("H","#6F38C5","HackerRank","We missed you try solving","Hi Deshapriya we missed you join our..."));
        list.add(new Data("I","#319DA0","InterViewBit","Welcome to interviewbit","Welcome to interviewbit ! if you have any..."));
        list.add(new Data("C","#87A2FB","CodeChef","We missed You","Hi Deshapriya we missed you try solving..."));
        list.add(new Data("G","#FF9F29","GitHUb","[GitHUb] Please verify your device","Hi Deshapriya please verify your device..."));
        list.add(new Data("L","#FF8787","LeetCode","We missed You","Weekly contest 315 sign in and register..."));
        list.add(new Data("G","#905E96","Google","Security alert","A new sign-in on windows deshapriya..."));
        list.add(new Data("D","#FF74B1","Definedge","Link Google","Hi Deshapriya link your google account..."));
        list.add(new Data("H","#6F38C5","HackerRank","We missed you try solving","Hi Deshapriya we missed you join our..."));
        list.add(new Data("I","#319DA0","InterViewBit","Welcome to interviewbit","Welcome to interviewbit ! if you have any..."));
        list.add(new Data("C","#87A2FB","CodeChef","We missed You","Hi Deshapriya we missed you try solving..."));
        list.add(new Data("G","#FF9F29","GitHUb","[GitHUb] Please verify your device","Hi Deshapriya please verify your device..."));
        list.add(new Data("L","#FF8787","LeetCode","We missed You","Weekly contest 315 sign in and register..."));
        list.add(new Data("G","#905E96","Google","Security alert","A new sign-in on windows deshapriya..."));
        list.add(new Data("D","#FF74B1","Definedge","Link Google","Hi Deshapriya link your google account..."));
        list.add(new Data("H","#6F38C5","HackerRank","We missed you try solving","Hi Deshapriya we missed you join our..."));
        list.add(new Data("I","#319DA0","InterViewBit","Welcome to interviewbit","Welcome to interviewbit ! if you have any..."));
        list.add(new Data("C","#87A2FB","CodeChef","We missed You","Hi Deshapriya we missed you try solving..."));
        list.add(new Data("G","#FF9F29","GitHUb","[GitHUb] Please verify your device","Hi Deshapriya please verify your device..."));
        list.add(new Data("L","#FF8787","LeetCode","We missed You","Weekly contest 315 sign in and register..."));
        list.add(new Data("G","#905E96","Google","Security alert","A new sign-in on windows deshapriya..."));
        list.add(new Data("D","#FF74B1","Definedge","Link Google","Hi Deshapriya link your google account..."));


        CustomAdapter customAdapter = new CustomAdapter(this, R.layout.card_view, list);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(customAdapter);
    }

    //Creating Data class


    public class Data{

        String nameChar;
        String color;
        String name;
        String subject;
        String content;

        public Data(String nameChar, String color, String name, String subject, String content){
            this.nameChar=nameChar;
            this.color=color;
            this.name=name;
            this.subject=subject;
            this.content=content;
        }

        public String getNameChar() {
            return nameChar;
        }

        public void setNameChar(String nameChar) {
            this.nameChar = nameChar;
        }

        public String getColor() { return color; }

        public void setColor(String color) { this.color = color; }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

    //Creating Adapter class

    public class CustomAdapter extends ArrayAdapter<Data>{

        Context context;
        int resource;

        public CustomAdapter(Context context, int resource, ArrayList<Data> list){
            super(context,resource,list);
            this.context=context;
            this.resource=resource;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            convertView = LayoutInflater.from(context).inflate(resource,parent,false);

            TextView nameChar = convertView.findViewById(R.id.textView);
            TextView name = convertView.findViewById(R.id.textView2);
            TextView subject = convertView.findViewById(R.id.textView3);
            TextView content = convertView.findViewById(R.id.textView4);

            nameChar.setText(getItem(position).getNameChar());
            nameChar.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(getItem(position).getColor())));
            name.setText(getItem(position).getName());
            subject.setText(getItem(position).getSubject());
            content.setText(getItem(position).getContent());


            return  convertView;
        }

    }

}