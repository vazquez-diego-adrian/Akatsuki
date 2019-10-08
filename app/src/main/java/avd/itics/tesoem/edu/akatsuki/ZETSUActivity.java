package avd.itics.tesoem.edu.akatsuki;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ZETSUActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zetsu);
    }

    public void anterior(View v){
        Intent anterior = new Intent(this, MenuActivity.class);
        startActivity(anterior);
        finish();
    }
}
