package T1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Spannable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6909o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Spannable f6910p;

    public z(Spannable spannable) {
        this.f6910p = spannable;
    }

    public final void a() {
        Spannable spannable = this.f6910p;
        if (!this.f6909o) {
            if ((Build.VERSION.SDK_INT < 28 ? new N2.z() : new y()).u(spannable)) {
                this.f6910p = new SpannableString(spannable);
            }
        }
        this.f6909o = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.f6910p.charAt(i7);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f6910p.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f6910p.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f6910p.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f6910p.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f6910p.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i7, int i8, Class cls) {
        return this.f6910p.getSpans(i7, i8, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f6910p.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i7, int i8, Class cls) {
        return this.f6910p.nextSpanTransition(i7, i8, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f6910p.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i7, int i8, int i9) {
        a();
        this.f6910p.setSpan(obj, i7, i8, i9);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i8) {
        return this.f6910p.subSequence(i7, i8);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f6910p.toString();
    }
}
