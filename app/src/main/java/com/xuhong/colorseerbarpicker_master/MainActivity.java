package com.xuhong.colorseerbarpicker_master;

import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBarColorPicker mSeekBarColorPicker;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvShow = (TextView) findViewById(R.id.tvShow);
        mSeekBarColorPicker = (SeekBarColorPicker) findViewById(R.id.mSeekBarColorPicker);
        mSeekBarColorPicker.setSeekBarColorPickerChangeListener(new SeekBarColorPicker.SeekBarColorPickerChangeListener() {
            @Override
            public void onProgressChange(SeekBarColorPicker seekBarColorPicker, int color, String htmlRgb) {
                findViewById(R.id.mViewResult).setBackgroundColor(color);
                tvShow.setText("采集结果：" + htmlRgb);
            }
        });
    }

    public void btBlue(View view) {
        //#01DDFF
        mSeekBarColorPicker.setColorByhtmlRGB("#01DDFF");
    }

    public void btGreen(View view) {
        //#98CB00
        mSeekBarColorPicker.setColorByhtmlRGB("#98CB00");
    }

    public void btRed(View view) {
        //#FF4444
        mSeekBarColorPicker.setColorByhtmlRGB("#ff4444");

    }

}
