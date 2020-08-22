package carrira.elan.englishslanglist;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import com.elan.englishslanglist.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    EditText editText;
    ListView lv;
    FloatingActionButton fab;

    DatabaseHelper dbHelper;
    MyListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        lv = findViewById(R.id.slang_list);
        fab = findViewById(R.id.addWord);

        dbHelper = new DatabaseHelper(this);
        //final SQLiteDatabase database = dbHelper.getWritableDatabase();

        //get List<String>
        ArrayList<Product> mProductArrayList = new ArrayList<>();

        String GET_ALL_NOTES = "SELECT * FROM " + DatabaseHelper.TABLE + " ORDER BY "+DatabaseHelper.COLUMN_NAME + " ASC";

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        if(db!=null)
        {
            Cursor cursor = db.rawQuery(GET_ALL_NOTES, null);
            cursor.moveToFirst();
            while(!cursor.isAfterLast())
            {
                mProductArrayList.add(new Product(cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_NAME)), cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_EXPLAIN))));
                cursor.moveToNext();
            }
            cursor.close();
        }
        db.close();

        //list adapter
        adapter=new MyListAdapter(this, mProductArrayList);
        lv.setAdapter(adapter);

        //set search to list
        lv.setTextFilterEnabled(true);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //String searchString=editText.getText().toString();
                adapter.getFilter().filter(s.toString());
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) { }
        });

        //float button to sed me a new word
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //alert dialog builder
                AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
                a_builder.setMessage(R.string.message2)
                        //button for send me
                        .setPositiveButton(R.string.posbutt, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent browserIntent = new
                                        //set your link on button
                                        Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/carrira_elan?r=nametag"));
                                startActivity(browserIntent);
                                dialogInterface.cancel();
                            }
                        })

                        //cansel button
                        .setNeutralButton(R.string.negbutt, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });

                AlertDialog alert = a_builder.create();
                alert.setTitle(R.string.message1);
                alert.show();
            }
        });

    }


}