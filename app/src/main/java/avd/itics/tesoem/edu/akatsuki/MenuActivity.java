package avd.itics.tesoem.edu.akatsuki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);


    }
    public void itachi(View v) {
        Intent itachi = new Intent (this, ITACHIActivity.class);
        startActivity(itachi);
        finish();

    }
        public void obito(View v) {
            Intent obito = new Intent (this, OBITOActivity.class);
            startActivity(obito);
            finish();

        }
        public void yahiko(View v) {
        Intent yahiko = new Intent (this, YAHIKOActivity.class);
        startActivity(yahiko);
        finish();

    }
    public void deidara(View v) {
        Intent deidara = new Intent (this, DEIDARAActivity.class);
        startActivity(deidara);
        finish();

    }
    public void sasori(View v) {
        Intent sasori = new Intent (this, SASORIActivity.class);
        startActivity(sasori);
        finish();

    }
    public void nagato(View v) {
        Intent nagato = new Intent (this, SASORIActivity.class);
        startActivity(nagato);
        finish();

    }
    public void konan(View v) {
        Intent konan = new Intent (this, KONANActivity.class);
        startActivity(konan);
        finish();

    }
    public void hidan(View v) {
        Intent hidan = new Intent (this, HIDANActivity.class);
        startActivity(hidan);
        finish();

    }
    public void kisame(View v) {
        Intent kisame = new Intent (this, KISAMEActivity.class);
        startActivity(kisame);
        finish();

    }
    public void kakuzu(View v) {
        Intent kakuzu = new Intent(this, KAKUSUActivity.class);
        startActivity(kakuzu);
        finish();
    }
    public void zetsu(View v) {
        Intent zetsu = new Intent(this, ZETSUActivity.class);
        startActivity(zetsu);
        finish();
    }
    public void desarrollador(View v) {
        Intent desarrollador = new Intent(this, DESARROLLADORActivity.class);
        startActivity(desarrollador);
        finish();
    }
    }

