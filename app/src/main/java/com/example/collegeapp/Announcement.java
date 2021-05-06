package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.SearchView;


import java.util.ArrayList;

public class Announcement extends AppCompatActivity {
    RecyclerView.Adapter adapter;
    RecyclerView announceRCV;
    SearchView searchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announcement);
        ArrayList<AnnoncementHelperClass> annoncementHelperClassArrayList = new ArrayList<>();

        announceRCV = findViewById(R.id.annoncement_rcv);
        searchView = findViewById(R.id.annoncement_search);
        adapter = new AnnouncementAdapter(annoncementHelperClassArrayList, getApplicationContext());
        announceRCV.setAdapter(adapter);

        AnnouncementRecycler();
        

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });


    }


    private void AnnouncementRecycler() {

        announceRCV.setHasFixedSize(true);
        announceRCV.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

        ArrayList<AnnoncementHelperClass> annoncementHelperClassArrayList = new ArrayList<>();

        annoncementHelperClassArrayList.add(new AnnoncementHelperClass("Academic", "18 March 2021", "Global:Opportunity to spend a semester abroad at 100% tuttion fee scholership", "The public Viva-Voce examination of the Ph.D. Research Scholar Mr. Sukhdip Singh, registration number 41400148 in the discipline of Horticulture under the supervision of Dr. J S Bal and co-supervision of Dr. Jatinder Singh  is scheduled on 27th March, 2021 from 10:00 AM.  The title of the Ph.D. thesis is “PERFORMANCE OF EXOTIC MANDARIN CULTIVARS ON DIFFERENT ROOT STOCKS IN SUB-TROPICAL PLAINS”. The viva voce is an openly defended examination and will be conducted via online Google Meet platform due to the current prevailing situation. Any research scholar, staff and faculty member interested for attending viva can register at the link: https://forms.gle/oMpypDeSvffA3Vbk9 till 27th March, 2021 latest by 9:30 AM.\n" +
                "\n" +
                "The web link for joining google meet will be shared on the emails provided by participants on the above said link.\n" +
                "\n" +
                " \n" +
                "\n" +
                "The screenshots to join the session of Ph.D. Public Viva-Voce Examination and important points to be followed during Ph.D. Public Viva-Voce Examination of the research scholar are attached for reference with this announcement.\n" +
                "\n" +
                "In case of any query contact at Dr. Rajinder Singh Kaundal (Mob: 9780408591)/ Mr. Gagandeep Singh Cheema (Mob: 7888816232). ", "Office of HOD"));
        annoncementHelperClassArrayList.add(new AnnoncementHelperClass("Academic", "18 March 2021", "Global:Opportunity to spend a semester abroad at 100% tuttion fee scholership", "The public Viva-Voce examination of the Ph.D. Research Scholar Mr. Sukhdip Singh, registration number 41400148 in the discipline of Horticulture under the supervision of Dr. J S Bal and co-supervision of Dr. Jatinder Singh  is scheduled on 27th March, 2021 from 10:00 AM.  The title of the Ph.D. thesis is “PERFORMANCE OF EXOTIC MANDARIN CULTIVARS ON DIFFERENT ROOT STOCKS IN SUB-TROPICAL PLAINS”. The viva voce is an openly defended examination and will be conducted via online Google Meet platform due to the current prevailing situation. Any research scholar, staff and faculty member interested for attending viva can register at the link: https://forms.gle/oMpypDeSvffA3Vbk9 till 27th March, 2021 latest by 9:30 AM.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"The web link for joining google meet will be shared on the emails provided by participants on the above said link.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \" \\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"The screenshots to join the session of Ph.D. Public Viva-Voce Examination and important points to be followed during Ph.D. Public Viva-Voce Examination of the research scholar are attached for reference with this announcement.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"In case of any query contact at Dr. Rajinder Singh Kaundal (Mob: 9780408591)/ Mr. Gagandeep Singh Cheema (Mob: 7888816232). ", "Office of HOD"));
        annoncementHelperClassArrayList.add(new AnnoncementHelperClass("Placement", "18 March 2021", "Global:Opportunity to spend a semester abroad at 100% tuttion fee scholership", "The public Viva-Voce examination of the Ph.D. Research Scholar Mr. Sukhdip Singh, registration number 41400148 in the discipline of Horticulture under the supervision of Dr. J S Bal and co-supervision of Dr. Jatinder Singh  is scheduled on 27th March, 2021 from 10:00 AM.  The title of the Ph.D. thesis is “PERFORMANCE OF EXOTIC MANDARIN CULTIVARS ON DIFFERENT ROOT STOCKS IN SUB-TROPICAL PLAINS”. The viva voce is an openly defended examination and will be conducted via online Google Meet platform due to the current prevailing situation. Any research scholar, staff and faculty member interested for attending viva can register at the link: https://forms.gle/oMpypDeSvffA3Vbk9 till 27th March, 2021 latest by 9:30 AM.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"The web link for joining google meet will be shared on the emails provided by participants on the above said link.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \" \\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"The screenshots to join the session of Ph.D. Public Viva-Voce Examination and important points to be followed during Ph.D. Public Viva-Voce Examination of the research scholar are attached for reference with this announcement.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"In case of any query contact at Dr. Rajinder Singh Kaundal (Mob: 9780408591)/ Mr. Gagandeep Singh Cheema (Mob: 7888816232). ", "Office of HOD"));
        annoncementHelperClassArrayList.add(new AnnoncementHelperClass("Placement", "17 March 2021", "Schedule for Interview of WHEEBOX", "The public Viva-Voce examination of the Ph.D. Research Scholar Mr. Sukhdip Singh, registration number 41400148 in the discipline of Horticulture under the supervision of Dr. J S Bal and co-supervision of Dr. Jatinder Singh  is scheduled on 27th March, 2021 from 10:00 AM.  The title of the Ph.D. thesis is “PERFORMANCE OF EXOTIC MANDARIN CULTIVARS ON DIFFERENT ROOT STOCKS IN SUB-TROPICAL PLAINS”. The viva voce is an openly defended examination and will be conducted via online Google Meet platform due to the current prevailing situation. Any research scholar, staff and faculty member interested for attending viva can register at the link: https://forms.gle/oMpypDeSvffA3Vbk9 till 27th March, 2021 latest by 9:30 AM.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"The web link for joining google meet will be shared on the emails provided by participants on the above said link.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \" \\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"The screenshots to join the session of Ph.D. Public Viva-Voce Examination and important points to be followed during Ph.D. Public Viva-Voce Examination of the research scholar are attached for reference with this announcement.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"In case of any query contact at Dr. Rajinder Singh Kaundal (Mob: 9780408591)/ Mr. Gagandeep Singh Cheema (Mob: 7888816232). ", "Office of HOD"));
        annoncementHelperClassArrayList.add(new AnnoncementHelperClass("Placement", "17 March 2021", "Final Result of On Campus Drive by AMPLE", "The public Viva-Voce examination of the Ph.D. Research Scholar Mr. Sukhdip Singh, registration number 41400148 in the discipline of Horticulture under the supervision of Dr. J S Bal and co-supervision of Dr. Jatinder Singh  is scheduled on 27th March, 2021 from 10:00 AM.  The title of the Ph.D. thesis is “PERFORMANCE OF EXOTIC MANDARIN CULTIVARS ON DIFFERENT ROOT STOCKS IN SUB-TROPICAL PLAINS”. The viva voce is an openly defended examination and will be conducted via online Google Meet platform due to the current prevailing situation. Any research scholar, staff and faculty member interested for attending viva can register at the link: https://forms.gle/oMpypDeSvffA3Vbk9 till 27th March, 2021 latest by 9:30 AM.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"The web link for joining google meet will be shared on the emails provided by participants on the above said link.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \" \\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"The screenshots to join the session of Ph.D. Public Viva-Voce Examination and important points to be followed during Ph.D. Public Viva-Voce Examination of the research scholar are attached for reference with this announcement.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"In case of any query contact at Dr. Rajinder Singh Kaundal (Mob: 9780408591)/ Mr. Gagandeep Singh Cheema (Mob: 7888816232). ", "Office of HOD"));
        annoncementHelperClassArrayList.add(new AnnoncementHelperClass("Placement", "16 March 2021", "Global:Opportunity to spend a semester abroad at 100% tuttion fee scholership", "The public Viva-Voce examination of the Ph.D. Research Scholar Mr. Sukhdip Singh, registration number 41400148 in the discipline of Horticulture under the supervision of Dr. J S Bal and co-supervision of Dr. Jatinder Singh  is scheduled on 27th March, 2021 from 10:00 AM.  The title of the Ph.D. thesis is “PERFORMANCE OF EXOTIC MANDARIN CULTIVARS ON DIFFERENT ROOT STOCKS IN SUB-TROPICAL PLAINS”. The viva voce is an openly defended examination and will be conducted via online Google Meet platform due to the current prevailing situation. Any research scholar, staff and faculty member interested for attending viva can register at the link: https://forms.gle/oMpypDeSvffA3Vbk9 till 27th March, 2021 latest by 9:30 AM.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"The web link for joining google meet will be shared on the emails provided by participants on the above said link.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \" \\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"The screenshots to join the session of Ph.D. Public Viva-Voce Examination and important points to be followed during Ph.D. Public Viva-Voce Examination of the research scholar are attached for reference with this announcement.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"In case of any query contact at Dr. Rajinder Singh Kaundal (Mob: 9780408591)/ Mr. Gagandeep Singh Cheema (Mob: 7888816232). ", "Office of HOD"));
        annoncementHelperClassArrayList.add(new AnnoncementHelperClass("Academic", "18 March 2021", "Global:Opportunity to spend a semester abroad at 100% tuttion fee scholership", "", "Office of HOD"));
        annoncementHelperClassArrayList.add(new AnnoncementHelperClass("CO-curricular/Sports/Cultural", "18 March 2021", "Global:Opportunity to spend a semester abroad at 100% tuttion fee scholership", "", "Office of HOD"));
        annoncementHelperClassArrayList.add(new AnnoncementHelperClass("CO-curricular/Sports/Cultural", "12 March 2021", "Global:Opportunity to spend a semester abroad at 100% tuttion fee scholership", "", "Office of HOD"));
        annoncementHelperClassArrayList.add(new AnnoncementHelperClass("Administrative/Misc", "18 March 2021", "People staying in campus who are returning from states other than Punjab", "", "Office of HOD"));
        annoncementHelperClassArrayList.add(new AnnoncementHelperClass("Academic", "18 March 2021", "Global:Opportunity to spend a semester abroad at 100% tuttion fee scholership", "", "Office of HOD"));

        adapter = new AnnouncementAdapter(annoncementHelperClassArrayList, getApplicationContext());
        announceRCV.setAdapter(adapter);



    }

    public void callDashBoard(View view) {
        startActivity(new Intent(getApplicationContext(), DashBoard.class));
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        ArrayList<AnnoncementHelperClass> annoncementHelperClassArrayList = new ArrayList<>();

        getMenuInflater().inflate(R.menu.search_menu, menu);
        MenuItem item = menu.findItem(R.id.search_menu);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
               AnnouncementAdapter adapter=new AnnouncementAdapter(annoncementHelperClassArrayList,getApplicationContext());
               adapter.getFilter().filter(s);
                return false;
            }
        });


        return super.onCreateOptionsMenu(menu);
    }
}