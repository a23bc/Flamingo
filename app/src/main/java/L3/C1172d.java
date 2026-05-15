package l3;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import v2.C1635b;

/* JADX INFO: renamed from: l3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1172d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1.b f14202c = new C1.b(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1635b f14203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14204b;

    public C1172d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f7, int i7, float f8, int i8, boolean z6, int i9, int i10) {
        boolean z7;
        int i11;
        if (z6) {
            z7 = true;
            i11 = i9;
        } else {
            z7 = false;
            i11 = -16777216;
        }
        this.f14203a = new C1635b(spannableStringBuilder, alignment, null, null, f7, 0, i7, f8, i8, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z7, i11, Integer.MIN_VALUE, 0.0f);
        this.f14204b = i10;
    }
}
