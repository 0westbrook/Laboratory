package com.example.demo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends FragmentActivity implements OnCheckedChangeListener
{

    private RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initgroup();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment, new MyFragment3())
                .commit();
    }


    private void initgroup()
    {
        group = (RadioGroup) findViewById(R.id.radioGroup1);
        group.setOnCheckedChangeListener(MainActivity.this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId)
    {
        // TODO Auto-generated method stub
        switch (checkedId)
        {
            case R.id.first:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment, new MyFragment1())
                        .commit();

                break;

            case R.id.second:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment, new MyFragment2())
                        .commit();

                break;

            case R.id.third:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment, new MyFragment3())
                        .commit();

                break;

            case R.id.four:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.xxxx, new MyFragment4())
                        .commit();
                break;

            case R.id.five:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment, new MyFragment5())
                        .commit();
                break;

            default:
                break;
        }

        int radioButtonId = group.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(radioButtonId);
        String radioButtonLabel = rb.getText().toString();
    }
}


