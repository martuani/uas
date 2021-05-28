// "Gagal beribu kali Lebih baik daripada menyerah meskipun hanya sekali"
// NIM : 11419048
// Nama : Gahasa Timothius B.P. Purba
// Alamat : Jln. Naboi Maju, No. 7, Komplek Bulu Nauli, Desa Sosor Gonting, Kec. Dolok Sanggul, Kab. Humbang Hasundutan, Sumatera Utara

package uts.nim11419048.uts11419048;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class BiodataActivity9048 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata9048);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater ();
        inflater.inflate ( R.menu.menu_option, menu );
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId ()) {
            case R.id.pendataan_keluarga: {
                Intent intent = new Intent( BiodataActivity9048.this , PendataanKeluargaActivity9048.class);
                startActivity(intent);
                break;
            }
            case R.id.about_developer: {
                Intent intent = new Intent( BiodataActivity9048.this , BiodataActivity9048.class);
                startActivity(intent);
                break;
            }
            case R.id.button_logout: {
                Intent intent = new Intent( BiodataActivity9048.this , LoginActivity9048.class);
                startActivity(intent);
                break;
            }
        }
        return super.onOptionsItemSelected ( item );
    }
}

// "Gagal beribu kali Lebih baik daripada menyerah meskipun hanya sekali"
// NIM : 11419048
// Nama : Gahasa Timothius B.P. Purba
// Alamat : Jln. Naboi Maju, No. 7, Komplek Bulu Nauli, Desa Sosor Gonting, Kec. Dolok Sanggul, Kab. Humbang Hasundutan, Sumatera Utara