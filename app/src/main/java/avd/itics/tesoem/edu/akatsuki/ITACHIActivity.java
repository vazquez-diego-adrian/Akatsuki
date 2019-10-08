package avd.itics.tesoem.edu.akatsuki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ITACHIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itachi);
    }
    public void anterior(View v){
        Intent anterior = new Intent(this, MenuActivity.class);
        startActivity(anterior);
        finish();
    }
}
