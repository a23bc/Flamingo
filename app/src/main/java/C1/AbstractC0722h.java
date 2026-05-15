package c1;

import android.text.Layout;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: c1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0722h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Layout.Alignment f10633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f10634b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (AbstractC1209k.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (AbstractC1209k.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f10633a = alignment;
        f10634b = alignment2;
    }
}
