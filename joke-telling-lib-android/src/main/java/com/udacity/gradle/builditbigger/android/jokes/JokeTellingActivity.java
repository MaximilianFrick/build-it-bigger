package com.udacity.gradle.builditbigger.android.jokes;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;


public class JokeTellingActivity extends Activity {

    public static final String EXTRA_JOKE = "EXTRA_JOKE";

    public static Intent newIntent(Context context, String joke) {
        Intent intent = new Intent(context, JokeTellingActivity.class);
        intent.putExtra(EXTRA_JOKE, joke);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new AlertDialog.Builder(this)
                .setMessage(getIntent().getStringExtra(EXTRA_JOKE))
                .setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialogInterface) {
                        finish();
                    }
                })
                .show();
    }
}
