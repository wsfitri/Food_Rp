package com.example.foodrp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class RdActivity extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rd);

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("re3.pdf")
                .enableSwipe(true)
                .load();
    }
}
