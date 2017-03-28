package najmul.bitm.customdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AlertDialog.Builder customDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customDialog = new AlertDialog.Builder(this);
    }

    public void enterAddress(View view) {

        /*LayoutInflater inflater = getLayoutInflater();
        View v = inflater.inflate(R.layout.someLayout,null);*/

        final EditText addressET = new EditText(this);
        addressET.setHint("Enter Delivery Location");
        customDialog.setTitle("Food Delivery");
        customDialog.setIcon(R.mipmap.ic_launcher);
        customDialog.setView(addressET);
        customDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String address = addressET.getText().toString();
                Toast.makeText(MainActivity.this, address, Toast.LENGTH_SHORT).show();
            }
        });
        customDialog.setNegativeButton("Cancel",null);
        customDialog.show();
    }
}
