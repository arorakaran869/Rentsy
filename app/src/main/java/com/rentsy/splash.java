package com.rentsy;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class splash extends AppCompatActivity {

    //this activity will open when user launches app
    //this activity will ensure working data connection



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

    }

    class fetchalldataonsplash extends AsyncTask<String , String ,String> {
        ProgressDialog progressDialog;


        @Override
        protected void onPreExecute() {

            progressDialog= new ProgressDialog(splash.this);
            progressDialog.setMessage("Loading.......");
            progressDialog.show();
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... params) {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            return null;
        }

        @Override
        protected void onPostExecute(String result)
        {
            progressDialog.dismiss();
            Intent i = new Intent(splash.this,login.class);
            finish();
            startActivity(i);

            super.onPostExecute(result);
        }

    }



}
