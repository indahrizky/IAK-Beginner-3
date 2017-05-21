package indah.com.iakbeginner.home_view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import indah.com.iakbeginner.R;
import indah.com.iakbeginner.list_view.ListActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void onClickPesan(View view){
        Intent i = new Intent(this, ListActivity.class);
        startActivity(i);
    }
}
