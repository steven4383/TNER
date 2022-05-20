package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class job extends AppCompatActivity {
    TextView jobss;
    Button next;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.job);
        next = (Button) findViewById(R.id.button3);
        jobss=(TextView)findViewById(R.id.jobss);
        jobss.setText(" \nFOR SSLC CANDIDATE \n \n Draughtsman, Computer Operator and Programming Assistant\n" +
                "Multi-Purpose Hospital Health Worker\n" +
                "Office Assistant\n" +
                "Assistant, Record Clerk\n" +
                "Worker, Helper\n" +
                "Professional Assistant - I, JRF\n" +
                "Assistant, Security Guard\n" +
                "Assistant, Record Clerk\n" +
                "Record Clerk, Assistant\n" +
                "Assistant, Record Clerk\n" +
                "Assistant, Security Guard\n" +
                "Peon and Driver\n" +
                "Record Clerk, Assistant\n" +
                "Village Assistant\n" +
                "Driver, Chowkidar\n" +
                "Psychologist, Social Worker\n" +
                "Record Clerk, Security/ Watchman\n" +
                "Medical Officer, Staff Nurse\n" +
                "Record Clerk, Assistant, Security / Watchman\n" +
                "Record Clerk, Assistant, Security / Watchman\n" +
                "Psychologist, Security\n" +
                "Record Clerk, Assistant\n" +
                "Medical Officer, Attender\n" +
                "Medical Officer, Staff Nurse\n" +
                "Medical Officer, Staff Nurse\n" +
                "Medical Officer, Staff Nurse\n" +
                "Medical Officer, Staff Nurse\n" +
                "Driver\n" +
                "Wireman\n" +
                "MHC - Driver, Physiotherapist\n" +
                "Medical Officer, Staff Nurse\n" +
                "Office Assistant\n" +
                "Peon\n" +
                "Staff Nurse, Data Entry Operator, Accountant, Social Worker & Various\n" +
                "Junior Assistant, Typist\n" +
                "Junior Assistant, Driver\n" +
                "Clerical Assistant, Peon\n" +
                "Peon\n"+"\n\n FOR HSS CANDIDATE"+"\n\nNational Health Mission Tamil Nadu \n" +
                "District Health Society Sivaganga \n" +
                "Tamil Nadu Civil Supplies Corporation Thanjavur \n" +
                "Greater Chennai Corporation \n" +
                "Tamil Nadu Civil Supplies Corporation Theni \n" +
                "Greater Chennai Corporation \n" +
                "Tamil Nadu Civil Supplies Corporation Thoothukudi \n" +
                "Tamil Nadu Civil Supplies Corporation Tiruchirappalli \n" +
                "Tamil Nadu Civil Supplies Corporation Perambalur \n" +
                "Tamil Nadu Civil Supplies Corporation Dindigul \n" +
                "District Health Society Trichy \n" +
                "Tamil Nadu Civil Supplies Corporation Tiruvannamalai \n" +
                "Tamil Nadu Civil Supplies Corporation Pudukkottai \n" +
                "Tamil Nadu Civil Supplies Corporation \n" +
                "Madurai Corporation \n" +
                "District Health Society Virudhunagar \n" +
                "Central University of Tamil Nadu \n" +
                "Indian Oil Corporation Limited \n" +
                "Chennai Corporation \n" +
                "Sivaganga Health Department \n" +
                "Ramanathapuram Juvenile Justice Board \n" +
                "Tamil Nadu Civil Supplies Corporation \n" +
                "Tidel Park Coimbatore \n" +
                "Thanjavur District Health Society \n" +
                "District Child Protection Unit kanniyakumari \n" +
                "TamilNadu State Rural Livelihood Mission Karur \n" +
                "Tamil Nadu Civil Supplies Corporation \n" +
                "Government Mohan Kumaramangalam Medical College Hospital Salem \n" +
                "Madras Regimental Centre \n" +
                "Coimbatore Health Department \n" +
                "Bharathiar University \n" +
                "Tirunelveli Water Resources Department \n" +
                "Indira Gandhi Centre for Atomic Research \n" +
                "Kanniyakumari Child Welfare Committee \n" +
                "Tamilnadu Hindu Religious and Charitable Endowments Department \n" +
                "Andrew Yule and Company \n" +
                "District Health Society Nagapattinam \n" +
                "Greater Chennai Corporation \n\n\n Anna University\n" +
                "IOCL\n" +
                "Commissioner of GST & Central Excise\n" +
                "District Health Society, Coimbatore\n" +
                "District Health Services, Ariyalur\n" +
                "District Court, Perambalur\n" +
                "Principal Commissioner of Customs, Chennai\n" +
                "District Health Society, Tiruvannamalai\n" +
                "District Health Society, Tiruchirappalli\n" +
                "District Health Society, Thanjavur\n" +
                "District Health Society, Virudhunagar\n" +
                "District Health Society, Salem\n" +
                "District Health Society, Virudhunagar\n" +
                "District Health Society, Ranipet\n" +
                "District Health Society, Villupuram\n" +
                "District Health Society, Ranipet\n" +
                "District Health Society, Vellore\n" +
                "District Health Society, Ramanathapuram\n" +
                "District Health Society, Vellore\n" +
                "District Health Society, Ramanathapuram\n" +
                "District Health Society, Tiruvallur\n" +
                "District Health Society, Pudukkottai\n" +
                "District Health Society, Perambalur\n" +
                "District Health Society, Tiruvallsur\n" +
                "District Health Society, Pudukkottai\n" +
                "District Health Society, Nilgiris\n" +
                "District Health Society, Tirunelveli\n" +
                "District Health Society, Nilgiris\n" +
                "District Health Society, Namakkal\n" +
                "District Health Society, Thoothukudi\n" +
                "District Health Society, Tiruppur\n" +
                "District Health Society, Kanniyakumari\n" +
                "District Health Society, Coimbatore\n" +
                "District Health Society, Kancheepuram\n" +
                "District Health Society, Krishnagiri\n" +
                "District Health Society, Sivagangai\n" +
                "District Health Society, Ariyalur\n" +
                "District Health Society, Kallakurichi\n" +
                "District Health Society, Karur\n" +
                "District Health Society, Sivagangai\n" +
                "District Health Society, Erode\n" +
                "District Health Society, Salem\n" +
                "District Health Society, Dindigul\n" +
                "District Health Society, Dharmapuri\n" +
                "District Health Society, Tiruvarur\n\n\n FOR  UG  CANDIDATE \n\n\n Anna University  Professional Assistant-I, III & Peon cum Mechanic \n" +
                "Trade & Technician Apprentice  \n" +
                "Tax Assistant, Stenographer Grade II & Multi Tasking Staff, Havaldar\n" +
                "District Quality Consultant, IT-Coordinator & Other \n" +
                "Midlevel Health Care Provider & MPHW (Male)/ Health Inspector Gr 2 \n" +
                "Steno Typist, Typist \n" +
                "Sukhami, Seamen, Greaser  \n" +
                "Mid Level Health Provider \n" +
                "Multipurpose Health Worker (Male)/ Health Inspector Grade II \n" +
                "Multipurpose Health Worker (Male)/ Health Inspector Grade II \n" +
                "Mid Level Health Provider (MLHP)  \n" +
                "MPHW (Male) /Health Inspector Grade II, Mid Level Health Provider \n" +
                "Multi Purpose Health Worker (Male)/ Health Inspector Gr. II \n" +
                "Mid Level Health Care Provider (MLHP) \n" +
                "Mid Level Health Provider \n" +
                "Multipurpose Health Worker (Male) /Health Inspector Gr II \n" +
                "Multi Purpose Health Worker (Male)/ Health Inspector Gr. II \n" +
                "Mid Level Health Care Provider \n" +
                "Multi Purpose Health Worker (Male)/ Health Inspector Gr. II \n" +
                "Multipurpose Health Worker (Male) /Health Inspector Gr II  \n" +
                "Mid Level Health Provider \n" +
                "Multipurpose Health Worker (Male) /Health Inspector Gr II \n" +
                "Mid Level Health Provider \n" +
                "Multi Purpose Health Worker (Male)/ Health Inspector Gr. II \n" +
                "Mid Level Health Provider (MLHP) \n" +
                "Multi Purpose Health Worker (Male)/ Health Inspector Gr. II – \n" +
                "Multi Purpose Health Worker (Male)/ Health Inspector Gr. II – \n" +
                "Multi Purpose Health Worker (Male)/ Health Inspector Gr. II – \n" +
                "Mid Level Health Provider \n" +
                "Mid Level Health Care Provider \n" +
                "Multipurpose Health Worker (Male)/ Health Inspector Grade II \n" +
                "Multi Purpose Health Worker (Male)/ Health Inspector Gr. II \n" +
                "Mid Level Health Provider\n" +
                "Mid Level Health Provider \n" +
                "Mid Level Health Provider \n" +
                "MLHP, MPHW (Male) / Health Inspector \n" +
                "MPHW (Male) /Health Inspector Grade II \n" +
                "MPHW (Male) /Health Inspector Grade II \n" +
                "MLHP, MPHW (Male) / Health Inspector Gr II \n" +
                "Mid Level Health Provider  \n" +
                "MPHW (Male) /Health Inspector Grade II, Mid Level Health Provider \n" +
                "Mid Level Health Provider \n" +
                "MLHP, MPHW (Male) / Health Inspector \n" +
                "Multi Purpose Health Worker (Male)/ Health Inspector Gr. II \n" +
                "Mid Level Health Provider \n" +
                "MPHW (Male) /Health Inspector Grade II \n" +
                "Mid Level Health Provider \n" +
                "Mid Level Health Provider \n" +
                "Mid Level Health Provider \n" +
                "MPHW (Male) /Health Inspector Grade II \n" +
                "Mid Level Health Provider (MLHP) \n\n\n FOR  PG  CANDIDATE  \n\n\n Instructional Designer - work\n" +
                "\n" +
                "Manager Finance\n" +
                "\n" +
                "Research Assistant\n" +
                "Project Associate II\n" +
                "\n" +
                "Research Assistant\n" +
                "\n" +
                "Senior Project Associate\n" +
                "\n" +
                "Senior Research Fellow\n" +
                "\n" +
                "\n" +
                "Senior R & D Engineer\n" +
                "\n" +
                "Project Associate I\n" +
                "\n" +
                "Content and Administrative Manager\n" +
                "\n" +
                "Clinical Trial Specialist\n" +
                "\n" +
                "Post Doctoral Fellow\n" +
                "\n" +
                "Project Linked Junior Reserach Fellow\n" +
                "\n" +
                "Associate\n" +
                "\n" +
                "Project Assistant\n" +
                "\n" +
                "Programme Manager\n" +
                "\n" +
                "Program Officer\n" +
                "\n" +
                "\n" +
                "Program Manager\n" +
                "\n" +
                "Program Officer\n" +
                "\n" +
                "Program Officer\n" +
                "\n" +
                "Program Manager\n" +
                "\n" +
                "Program Officer\n" +
                "\n" +
                "Program Manager\n" +
                "\n" +
                "Procurement Officer\n" +
                "\n" +
                "Technical Assistant\n" +
                "\n" +
                "Senior Research Fellow\n" +
                "\n" +
                "Scientist C\n" +
                "\n" +
                "Clinical Psychology Consultant\n" +
                "\n" +
                "Project Junior Software Developer\n" +
                "\n" +
                "Junior Research Fellow\n" +
                "\n" +
                "Junior Research Fellow/ Project Associate I\n" +
                "\n" +
                "Senior Research Fellow/ Project Associate II\n" +
                "\n" +
                "System Support Engineer Trainee\n" +
                "\n" +
                "Server and Network Administrator Trainee\n" +
                "\n" +
                "Junior Research Fellow    IIT BHU\n" +
                "\n" +
                "Junior Research Fellow    ICT\n" +
                "\n" +
                "Junior Research Fellow  NIT Calicut\n" +
                "\n" +
                "Project Technical Officer\n" +
                "\n" +
                "Senior Research Fellow\n" +
                "\n" +
                "TutorSpecialist\n" +
                "\n" +
                "Senior Resident\n" +
                "\n" +
                "Project Associate I\n" +
                "\n" +
                "Research Officer\n" +
                "\n" +
                "Research Assistant\n" +
                "\n" +
                "Marketing Officer, Admission Counsellor, More Vacancies\n" +
                "\n" +
                "Tutor/ Demonstrator\n" +
                "\n" +
                "Junior Research Fellow\n" +
                "\n" +
                "Assistant Professor\n" +
                "\n" +
                "Guest Relation Manager\n" +
                "\n" +
                "SEO Executive\n" +
                "\n" +
                "Senior Consultant\n" +
                "\n" +
                "Assistant Manager\n" +
                "\n" +
                "Video Editor\n");
        String[] para=jobss.getText().toString().split("\n");
        Toast.makeText(job.this,""+para.length,Toast.LENGTH_LONG).show();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(job.this, LASTPAGE.class);
                startActivity(intent);
            }
        });
    }
}
