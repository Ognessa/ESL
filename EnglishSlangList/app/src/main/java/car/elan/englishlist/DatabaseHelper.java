package car.elan.englishlist;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "slenglist.db"; // DB name
    private static int DATABASE_VERSION = 27; // DB version
    public static final String TABLE = "sleng"; // DB table name

    //column names
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_EXPLAIN = "expl";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //DB create
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE + "(" + COLUMN_ID + " integer primary key, " + COLUMN_NAME + " text, " + COLUMN_EXPLAIN + " text" + ")");

        // добавление начальных данных
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Idn', 'I don’t know');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Btw' , 'By the way');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Icymi', 'In case you miss it');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('WYD' , 'What are you doing');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('What’s up?', 'Hey what are you doing?');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('I get it', 'I get it now! Thank you for explaining that');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Same here', 'I agree');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('You bet', 'Certainly you’re welcome');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('W8', 'Wait');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Cock-up', 'Screw up');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Rubbish', 'Garbage or that’s crap');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Blimey', 'My goodness');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Gutted', 'Devastated');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Chuffed', 'Proud');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Lost the plot', 'Gone crazy');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Sorted', 'Arranged');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Hoover', 'Vacuum');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Kip', 'Sleep or nap');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Bee’s knees', 'Awesome');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Dodgy', 'Suspicious');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Wonky', 'Not right');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Tad', 'A little bit');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Nicked', 'Stolen');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Nutter', 'Crazy person');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Knackered', 'Tired');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Gobsmacked', 'Amazed');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Dog’s bollocks', 'Awesome');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Chap', 'Male or friend');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Bob’s your uncle', 'You have it made');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Absobloodylutely', 'Yes indeed!');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Nosh', 'Food');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Shambles', 'Mess');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Dog’s dinner', 'A mess');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Bangers', 'Sausage');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Chips', 'French fries');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Starkers', 'Naked');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Plastered', 'Intoxicated');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Chav', 'White trash');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Stag night', 'Bachelor party');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Ace', 'Cool');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Plonker', 'Idiot');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Blighty', 'Britain');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Give you a bell', 'Call you');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Tenner', 'A ten-pound note');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Fiver', 'A five-pound note');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Toff', 'Upper class person');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Quid', 'One pound sterling');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Trolley', 'Shopping cart');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Diary', 'Calendar');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Mate', 'Pal');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Nappy', 'Diaper');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Chips', 'French fries');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Ring', 'To phone');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Potato crisps', 'Potato chips');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Bloke', 'A man');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Bugger all', 'Nothing at all');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Posh', 'High-class');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Trainers', 'Tennis shoes');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Biscuit', 'Cookie');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Pram', 'Baby stroller');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Off-license', 'Liquor store');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Pub', 'Bar');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Pissed', 'Intoxicated');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Honking', 'Vomiting');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Post', 'Mail');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Blinding', 'Excellent');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Minging', 'Disgusting');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Bloody', 'Used for emphasis');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Skive', 'Play hookey');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Wanker', 'Jerk');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Brilliant', 'Wonderful');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Fit bird', 'Attractive woman');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Fit bloke', 'Attractive man');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Loo', 'Bathroom');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Bum', 'Butt');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Dishy', 'Attractive man');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Holiday', 'Vacation');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Sweets', 'Candy');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Scrummy', 'Delicious');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Nice one', 'Messed up');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Sick', 'Cool');");
        db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('Have a gander', 'Look');");
        //db.execSQL("INSERT INTO "+ TABLE +" (" + COLUMN_NAME + ", " + COLUMN_EXPLAIN  + ") VALUES ('', '');");
    }


    public void addNewWords(String name, String explain){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, name);
        values.put(COLUMN_EXPLAIN, explain);
        db.insert(TABLE, null, values);
    }

    //cтворює новий рядок замість видалення
    public void delete(String name) {
        String sql = "DELETE FROM "+ TABLE +" WHERE "+COLUMN_NAME+"="+ name +";";
        /*SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(sql);*/

    }

    //DB upgrade
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,  int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE);
        onCreate(db);
    }
}

