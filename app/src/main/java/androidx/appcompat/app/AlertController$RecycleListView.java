package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import j.AbstractC1089a;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f8939o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f8940p;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1089a.f13611t);
        this.f8940p = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f8939o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
