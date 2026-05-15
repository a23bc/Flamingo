package com.blankj.utilcode.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import i6.h;

/* JADX INFO: loaded from: classes.dex */
public final class ToastUtils$UtilsMaxWidthRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f10707o = (int) ((80.0f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);

    public ToastUtils$UtilsMaxWidthRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        WindowManager windowManager = (WindowManager) h.z().getSystemService("window");
        if (windowManager == null) {
            i9 = -1;
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            i9 = point.x;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i9 - f10707o, Integer.MIN_VALUE), i8);
    }
}
