package com.example.playstorews;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ParentAdapter parentAdapter;
    List<ParentItem> parentItemList;

    Banner banner;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                recyclerView = findViewById(R.id.recycleView);
                recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
                parentItemList = new ArrayList<>();
                productData();

                parentAdapter = new ParentAdapter(parentItemList);
                recyclerView.setAdapter(parentAdapter);
            }



            private void productData() {

//                List<Banner> bannerList = new ArrayList<>();
//                bannerList.add(new Banner(R.drawable.baner1));
//

                List<ChildItem> childItemList1 = new ArrayList<>();
                childItemList1.add(new ChildItem(R.drawable.app1," Candy Crush","4.6 ★"));
                childItemList1.add(new ChildItem(R.drawable.app3,"Food Panda","2.5 ★"));
                childItemList1.add(new ChildItem(R.drawable.app4,"Daraz","1.6 ★"));
                childItemList1.add(new ChildItem(R.drawable.app5,"Easy Paisa","4.5 ★"));
                childItemList1.add(new ChildItem(R.drawable.app6,"Canva","2.9 ★"));
                childItemList1.add(new ChildItem(R.drawable.app1," Candy Crush","4.6 ★"));
                childItemList1.add(new ChildItem(R.drawable.app3,"Food Panda","2.5 ★"));
                childItemList1.add(new ChildItem(R.drawable.app4,"Daraz","1.6 ★"));
                childItemList1.add(new ChildItem(R.drawable.app5,"Easy Paisa","4.5 ★"));
                childItemList1.add(new ChildItem(R.drawable.app6,"Canva","2.9 ★"));


                List<ChildItem> childItemList2 = new ArrayList<>();
                childItemList2.add(new ChildItem(R.drawable.instaa,"Instagram","4.6 ★"));
                childItemList2.add(new ChildItem(R.drawable.twitter12,"Twitter","3.3 ★"));
                childItemList2.add(new ChildItem(R.drawable.threads1,"Threads","2.3★"));
                childItemList2.add(new ChildItem(R.drawable.whatapp12,"WhatsApp","4.5 ★"));
                childItemList2.add(new ChildItem(R.drawable.app8,"Jazz Cash","3.6 ★"));
                childItemList2.add(new ChildItem(R.drawable.instaa,"Instagram","4.6 ★"));
                childItemList2.add(new ChildItem(R.drawable.twitter12,"Twitter","3.3 ★"));
                childItemList2.add(new ChildItem(R.drawable.threads1,"Threads","2.3★"));
                childItemList2.add(new ChildItem(R.drawable.whatapp12,"WhatsApp","4.5 ★"));
                childItemList2.add(new ChildItem(R.drawable.app8,"Jazz Cash","3.6 ★"));


                List<ChildItem> childItemList3 = new ArrayList<>();
                childItemList3.add(new ChildItem(R.drawable.app9,"Settings","2.5 ★"));
                childItemList3.add(new ChildItem(R.drawable.see1,"InDrive","3.6 ★"));
                childItemList3.add(new ChildItem(R.drawable.see2,"Messenger","4.2 ★"));
                childItemList3.add(new ChildItem(R.drawable.see3,"Yango","3.2 ★"));
                childItemList3.add(new ChildItem(R.drawable.see4,"Chat gpt","4.6 ★"));
                childItemList3.add(new ChildItem(R.drawable.see5,"MC burger","4.6 ★"));
                childItemList3.add(new ChildItem(R.drawable.app9,"Settings","2.5 ★"));
                childItemList3.add(new ChildItem(R.drawable.see1,"InDrive","3.6 ★"));
                childItemList3.add(new ChildItem(R.drawable.see2,"Messenger","4.2 ★"));
                childItemList3.add(new ChildItem(R.drawable.see3,"Yango","3.2 ★"));
                childItemList3.add(new ChildItem(R.drawable.see4,"Chat gpt","4.6 ★"));
                childItemList3.add(new ChildItem(R.drawable.see5,"MC burger","4.6 ★"));

                List<ChildItem> childItemList4 = new ArrayList<>();
                childItemList4.add(new ChildItem(R.drawable.a5,"NotePad","4.6 ★"));
                childItemList4.add(new ChildItem(R.drawable.see7,"Go Khana","4.6 ★"));
                childItemList4.add(new ChildItem(R.drawable.see8,"Smart Food","4.6 ★"));
                childItemList4.add(new ChildItem(R.drawable.see9,"Tagline","4.6 ★"));
                childItemList4.add(new ChildItem(R.drawable.a1,"Learning Studio","4.6 ★"));
                childItemList4.add(new ChildItem(R.drawable.a2,"Microsoft","4.6 ★"));
                childItemList4.add(new ChildItem(R.drawable.a3,"Bykia","4.6 ★"));
                childItemList4.add(new ChildItem(R.drawable.a4,"True Caller","4.6 ★"));
                childItemList4.add(new ChildItem(R.drawable.a5,"NotePad","4.6 ★"));
                childItemList4.add(new ChildItem(R.drawable.see7,"Go Khana","4.6 ★"));
                childItemList4.add(new ChildItem(R.drawable.see8,"Smart Food","4.6 ★"));
                childItemList4.add(new ChildItem(R.drawable.see9,"Tagline","4.6 ★"));
                childItemList4.add(new ChildItem(R.drawable.a1,"Learning Studio","4.6 ★"));
                childItemList4.add(new ChildItem(R.drawable.a2,"Microsoft","4.6 ★"));
                childItemList4.add(new ChildItem(R.drawable.a3,"Bykia","4.6 ★"));
                childItemList4.add(new ChildItem(R.drawable.a4,"True Caller","4.6 ★"));


                List<ChildItem> childItemList5 = new ArrayList<>();
                childItemList5.add(new ChildItem(R.drawable.a6,"OLX","4.6 ★"));
                childItemList5.add(new ChildItem(R.drawable.a7,"Note app","2.5 ★"));
                childItemList5.add(new ChildItem(R.drawable.a8,"OffLine games","1.6 ★"));
                childItemList5.add(new ChildItem(R.drawable.app8,"Jazz Cash","4.5 ★"));
                childItemList5.add(new ChildItem(R.drawable.app6,"Canva","2.9 ★"));



                parentItemList.add(new ParentItem("Suggested for you ", childItemList1));
                parentItemList.add(new ParentItem("Recommended for you ", childItemList2));
                parentItemList.add(new ParentItem("Food & drinks", childItemList3));
                parentItemList.add(new ParentItem("Business tools ", childItemList4));
                parentItemList.add(new ParentItem("Business tools ", childItemList5));

    }
}