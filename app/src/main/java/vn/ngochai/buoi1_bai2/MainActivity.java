package vn.ngochai.buoi1_bai2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnmenu=(Button)findViewById(R.id.btntmenu);
        btnmenu.setOnCreateContextMenuListener(this);

        Button thoat=(Button)findViewById(R.id.btnthoat);
        thoat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        CreateOptionMenu(menu);
        return true;
    };

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenuInfo
            menuInfo){
        super.onCreateContextMenu(menu, view, menuInfo);
        CreateContextMenu(menu);
    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return menuChoice(item);
    };

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        return contextmenuChoice(item);
    };

    public void CreateOptionMenu(Menu menu) {
        MenuItem m1=menu.add(0, 0, 0, "Chon hinh 1");
        {
            m1.setAlphabeticShortcut('a');
            m1.setIcon(R.drawable.ic_launcher);
        }
        MenuItem m2=menu.add(0, 1, 1, "Chon hinh 2");
        {
            m2.setAlphabeticShortcut('b');
            m2.setIcon(R.drawable.ic_launcher);
        }
        MenuItem m3=menu.add(0, 2, 2, "Chon hinh 3");
        {
            m3.setAlphabeticShortcut('c');
            m3.setIcon(R.drawable.ic_launcher);
        }
        MenuItem m4=menu.add(0, 3, 3, "Chon hinh 4");
        {
            m4.setAlphabeticShortcut('d');
            m4.setIcon(R.drawable.ic_launcher);
        }
    };

    public void CreateContextMenu(Menu menu) {
        MenuItem m1=menu.add(0, 0, 0, "MUC 1");
        {
            m1.setAlphabeticShortcut('e');
            m1.setIcon(R.drawable.ic_launcher);
        }
        MenuItem m2=menu.add(0, 1, 1, "MUC 2");
        {
            m2.setAlphabeticShortcut('f');
            m2.setIcon(R.drawable.ic_launcher);
        }
        MenuItem m3=menu.add(0, 2, 2, "MUC 3");
        {
            m3.setAlphabeticShortcut('g');
            m3.setIcon(R.drawable.ic_launcher);
        }
        MenuItem m4=menu.add(0, 3, 3, "MUC 4");
        {
            m4.setAlphabeticShortcut('h');
            m4.setIcon(R.drawable.ic_launcher);
        }
    };

    public boolean menuChoice(MenuItem item){
        ImageView hinh=(ImageView)findViewById(R.id.img);
        switch(item.getItemId()){
            case 0:
                hinh.setImageResource(R.drawable.ca_lia_thia_1);
                return true;
            case 1:
                hinh.setImageResource(R.drawable.ca_lia_thia_2);
                return true;
            case 2:
                hinh.setImageResource(R.drawable.ca_lia_thia_3);
                return true;
            case 3:
                hinh.setImageResource(R.drawable.ca_lia_thia_4);
                return true;
        }
        return false;
    };

    public boolean contextmenuChoice(MenuItem item){
        //ImageView hinh=(ImageView)findViewById(R.id.img);
        switch(item.getItemId()){
            case 0:
                Toast.makeText(this, "Muc thu 1 da duoc chon", Toast.LENGTH_LONG).show();
                return true;
            case 1:
                Toast.makeText(this, "Muc thu 2 da duoc chon", Toast.LENGTH_LONG).show();
                return true;
            case 2:
                Toast.makeText(this, "Muc thu 3 da duoc chon", Toast.LENGTH_LONG).show();
                return true;
            case 3:
                Toast.makeText(this, "Muc thu 4 da duoc chon", Toast.LENGTH_LONG).show();
                return true;
        }
        return false;
    };
}
