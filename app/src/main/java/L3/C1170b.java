package l3;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import v2.C1635b;

/* JADX INFO: renamed from: l3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1170b {

    /* JADX INFO: renamed from: a */
    public final ArrayList f14171a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f14172b;

    /* JADX INFO: renamed from: c */
    public final StringBuilder f14173c;

    /* JADX INFO: renamed from: d */
    public int f14174d;

    /* JADX INFO: renamed from: e */
    public int f14175e;

    /* JADX INFO: renamed from: f */
    public int f14176f;

    /* JADX INFO: renamed from: g */
    public int f14177g;
    public int h;

    public C1170b(int i7, int i8) {
        ArrayList arrayList = new ArrayList();
        this.f14171a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f14172b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f14173c = sb;
        this.f14177g = i7;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f14174d = 15;
        this.f14175e = 0;
        this.f14176f = 0;
        this.h = i8;
    }

    public final void a(char c7) {
        StringBuilder sb = this.f14173c;
        if (sb.length() < 32) {
            sb.append(c7);
        }
    }

    public final void b() {
        StringBuilder sb = this.f14173c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f14171a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C1169a c1169a = (C1169a) arrayList.get(size);
                int i7 = c1169a.f14170c;
                if (i7 != length) {
                    return;
                }
                c1169a.f14170c = i7 - 1;
            }
        }
    }

    public final C1635b c(int i7) {
        float f7;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f14172b;
            if (i8 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i8));
            spannableStringBuilder.append('\n');
            i8++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i9 = this.f14175e + this.f14176f;
        int length = (32 - i9) - spannableStringBuilder.length();
        int i10 = i9 - length;
        int i11 = i7 != Integer.MIN_VALUE ? i7 : (this.f14177g != 2 || (Math.abs(i10) >= 3 && length >= 0)) ? (this.f14177g != 2 || i10 <= 0) ? 0 : 2 : 1;
        if (i11 != 1) {
            if (i11 == 2) {
                i9 = 32 - length;
            }
            f7 = ((i9 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f7 = 0.5f;
        }
        float f8 = f7;
        int i12 = this.f14174d;
        if (i12 > 7) {
            i12 -= 17;
        } else if (this.f14177g == 1) {
            i12 -= this.h - 1;
        }
        return new C1635b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i12, 1, Integer.MIN_VALUE, f8, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f14173c);
        int length = spannableStringBuilder.length();
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        boolean z6 = false;
        while (true) {
            ArrayList arrayList = this.f14171a;
            if (i11 >= arrayList.size()) {
                break;
            }
            C1169a c1169a = (C1169a) arrayList.get(i11);
            boolean z7 = c1169a.f14169b;
            int i13 = c1169a.f14168a;
            if (i13 != 8) {
                boolean z8 = i13 == 7;
                if (i13 != 7) {
                    i10 = C1171c.f14179B[i13];
                }
                z6 = z8;
            }
            int i14 = c1169a.f14170c;
            i11++;
            if (i14 != (i11 < arrayList.size() ? ((C1169a) arrayList.get(i11)).f14170c : length)) {
                if (i7 != -1 && !z7) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i7, i14, 33);
                    i7 = -1;
                } else if (i7 == -1 && z7) {
                    i7 = i14;
                }
                if (i8 != -1 && !z6) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i8, i14, 33);
                    i8 = -1;
                } else if (i8 == -1 && z6) {
                    i8 = i14;
                }
                if (i10 != i9) {
                    if (i9 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i9), i12, i14, 33);
                    }
                    i9 = i10;
                    i12 = i14;
                }
            }
        }
        if (i7 != -1 && i7 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i7, length, 33);
        }
        if (i8 != -1 && i8 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i8, length, 33);
        }
        if (i12 != length && i9 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i9), i12, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f14171a.isEmpty() && this.f14172b.isEmpty() && this.f14173c.length() == 0;
    }
}
