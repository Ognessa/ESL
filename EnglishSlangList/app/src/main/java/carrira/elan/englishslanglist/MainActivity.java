package carrira.elan.englishslanglist;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
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
    ArrayList<Product> mProductArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        lv = findViewById(R.id.slang_list);
        fab = findViewById(R.id.addWord);

        dbHelper = new DatabaseHelper(this);

        //add data to list view
        updateListView();

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
                //create items in list
                LayoutInflater factory = LayoutInflater.from(MainActivity.this);
                final View textEntryView = factory.inflate(R.layout.create_new_row, null);
                final EditText input1 = (EditText) textEntryView.findViewById(R.id.word);
                final EditText input2 = (EditText) textEntryView.findViewById(R.id.explain);


                //alert dialog builder
                AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
                a_builder.setMessage(R.string.message2)
                        //edits word and explain
                        .setView(textEntryView)

                        //button for add new word
                        .setPositiveButton(R.string.posbutt, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dbHelper.addNewWords(input1.getText().toString(), input2.getText().toString());
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

    public void updateListView(){
        //get List<String>
        mProductArrayList = new ArrayList<>();

        String GET_ALL_NOTES = "SELECT * FROM " + DatabaseHelper.TABLE + " ORDER BY "+DatabaseHelper.COLUMN_NAME + " ASC";

        final SQLiteDatabase db = dbHelper.getWritableDatabase();
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
    }

}