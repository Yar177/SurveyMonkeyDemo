package com.yar.surveymonkeydemo;

import androidx.appcompat.app.AppCompatActivity;
import com.surveymonkey.surveymonkeyandroidsdk.SurveyMonkey;
import com.surveymonkey.surveymonkeyandroidsdk.utils.SMError;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private SurveyMonkey sm = new SurveyMonkey();
    public static final String SAMPLE_APP = "Sample App";
    public static final String SURVEY_HASH = "LBQK27G";
    public static final int SM_REQUEST_CODE = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sm.onStart(this, SAMPLE_APP, SM_REQUEST_CODE, SURVEY_HASH);

    }

    public void takeSurvey(){

    }

}
