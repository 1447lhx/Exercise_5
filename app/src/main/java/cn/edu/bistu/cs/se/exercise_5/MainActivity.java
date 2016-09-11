package cn.edu.bistu.cs.se.exercise_5;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
 import android.support.v7.app.AppCompatActivity;
 import android.support.v7.widget.GridLayoutManager;
 import android.support.v7.widget.LinearLayoutManager;
 import android.support.v7.widget.RecyclerView;
 import android.support.v7.widget.StaggeredGridLayoutManager;
 import android.support.v7.widget.Toolbar;
import android.view.Menu;
 import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {


     private RecyclerView mRecyclerView;
      private RecyclerView.Adapter mAdapter;
       private RecyclerView.LayoutManager mLayoutManager;
     protected void onCreate(Bundle savedInstanceState) {
              super.onCreate(savedInstanceState);
             setContentView(R.layout.activity_main);
                 Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
             setSupportActionBar(toolbar);
                FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
              fab.setOnClickListener(new View.OnClickListener() {
                       public void onClick(View view) {
                               Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                                        .setAction("Action", null).show();
                           }
                    });


                 mRecyclerView=(RecyclerView)findViewById(R.id.recylerView);
        mRecyclerView.setHasFixedSize(true);

               mLayoutManager = new LinearLayoutManager(this);

             mRecyclerView.setLayoutManager(mLayoutManager);

               String[] myDataset={"北京","上海","广州","深圳","天津","重庆"};
               mAdapter = new MyAdapter(myDataset);
               mRecyclerView.setAdapter(mAdapter);
             }

        public boolean onCreateOptionsMenu(Menu menu) {
               // Inflate the menu; this adds items to the action bar if it is present.
               getMenuInflater().inflate(R.menu.menu_main, menu);
               return true;
           }

    public boolean onOptionsItemSelected(MenuItem item) {

            int id = item.getItemId();
        //noinspection SimplifiableIfStatement
                if (id == R.id.action_settings) {
                         return true;
                   }
                return super.onOptionsItemSelected(item);
           }
    }
