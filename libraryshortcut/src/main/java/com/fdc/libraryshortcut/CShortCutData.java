package com.fdc.libraryshortcut;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class CShortCutData {

    @RequiresApi(api = Build.VERSION_CODES.N_MR1)
    public ShortcutInfo createShortCutData(Context inContext, String instrId, int in_nImageIcon, String instrLink, String instrShortLabel, String instrLongLabel) {
        return new ShortcutInfo.Builder(inContext, instrId)
                .setIcon(Icon.createWithResource(inContext, in_nImageIcon))
                .setIntent(new Intent(Intent.ACTION_VIEW, Uri.parse(instrLink)))
                .setShortLabel(instrShortLabel)
                .setLongLabel(instrLongLabel)
                .build();
    }

}