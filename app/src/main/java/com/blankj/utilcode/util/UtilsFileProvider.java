package com.blankj.utilcode.util;

import android.app.Application;
import androidx.core.content.FileProvider;
import i6.h;

/* JADX INFO: loaded from: classes.dex */
public class UtilsFileProvider extends FileProvider {
    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final boolean onCreate() {
        h.B((Application) getContext().getApplicationContext());
        return true;
    }
}
