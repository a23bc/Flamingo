package d1;

import Q3.g;
import T1.j;
import Z4.l;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import androidx.datastore.preferences.protobuf.C0535h;
import c1.C0716b;
import h1.AbstractC0996a;
import h3.r;
import java.lang.Character;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;
import m5.AbstractC1209k;
import q.V;
import q.W;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11183a;

    /* JADX INFO: renamed from: b */
    public int f11184b;

    /* JADX INFO: renamed from: c */
    public int f11185c;

    /* JADX INFO: renamed from: d */
    public Object f11186d;

    /* JADX INFO: renamed from: e */
    public Object f11187e;

    public e(int i7, byte b7) {
        this.f11183a = i7;
        switch (i7) {
            case 4:
                this.f11186d = new long[10];
                this.f11187e = new Object[10];
                break;
        }
    }

    public synchronized void a(long j3, Object obj) {
        if (this.f11185c > 0) {
            if (j3 <= ((long[]) this.f11186d)[((this.f11184b + r0) - 1) % ((Object[]) this.f11187e).length]) {
                d();
            }
        }
        e();
        int i7 = this.f11184b;
        int i8 = this.f11185c;
        Object[] objArr = (Object[]) this.f11187e;
        int length = (i7 + i8) % objArr.length;
        ((long[]) this.f11186d)[length] = j3;
        objArr[length] = obj;
        this.f11185c = i8 + 1;
    }

    public void b(int i7) {
        new Handler(Looper.getMainLooper()).post(new B2.e(this, i7));
    }

    public void c(int i7) {
        boolean z6 = false;
        int i8 = this.f11184b;
        int i9 = this.f11185c;
        if (i7 <= i9 && i8 <= i7) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        AbstractC0996a.a("Invalid offset: " + i7 + ". Valid range is [" + i8 + " , " + i9 + ']');
    }

    public synchronized void d() {
        this.f11184b = 0;
        this.f11185c = 0;
        Arrays.fill((Object[]) this.f11187e, (Object) null);
    }

    public void e() {
        int length = ((Object[]) this.f11187e).length;
        if (this.f11185c < length) {
            return;
        }
        int i7 = length * 2;
        long[] jArr = new long[i7];
        Object[] objArr = new Object[i7];
        int i8 = this.f11184b;
        int i9 = length - i8;
        System.arraycopy((long[]) this.f11186d, i8, jArr, 0, i9);
        System.arraycopy((Object[]) this.f11187e, this.f11184b, objArr, 0, i9);
        int i10 = this.f11184b;
        if (i10 > 0) {
            System.arraycopy((long[]) this.f11186d, 0, jArr, i9, i10);
            System.arraycopy((Object[]) this.f11187e, 0, objArr, i9, this.f11184b);
        }
        this.f11186d = jArr;
        this.f11187e = objArr;
        this.f11184b = 0;
    }

    public int f() {
        C0535h c0535h = (C0535h) this.f11187e;
        if (c0535h == null) {
            return ((String) this.f11186d).length();
        }
        return (c0535h.f9479b - c0535h.c()) + (((String) this.f11186d).length() - (this.f11185c - this.f11184b));
    }

    public boolean g(int i7) {
        int i8 = this.f11184b + 1;
        if (i7 > this.f11185c || i8 > i7) {
            return false;
        }
        CharSequence charSequence = (CharSequence) this.f11186d;
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i7))) {
            int i9 = i7 - 1;
            if (!Character.isSurrogate(charSequence.charAt(i9))) {
                if (!j.d()) {
                    return false;
                }
                j jVarA = j.a();
                if (jVarA.c() != 1 || jVarA.b(charSequence, i9) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean h(int i7) {
        int i8 = this.f11184b + 1;
        if (i7 > this.f11185c || i8 > i7) {
            return false;
        }
        return android.support.v4.media.session.b.u(Character.codePointBefore((CharSequence) this.f11186d, i7));
    }

    public boolean i(int i7) {
        c(i7);
        if (!((BreakIterator) this.f11187e).isBoundary(i7)) {
            return false;
        }
        if (k(i7) && k(i7 - 1) && k(i7 + 1)) {
            return false;
        }
        return i7 <= 0 || i7 >= ((CharSequence) this.f11186d).length() - 1 || !(j(i7) || j(i7 + 1));
    }

    public boolean j(int i7) {
        int i8 = i7 - 1;
        CharSequence charSequence = (CharSequence) this.f11186d;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i8));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (AbstractC1209k.a(unicodeBlockOf, unicodeBlock) && AbstractC1209k.a(Character.UnicodeBlock.of(charSequence.charAt(i7)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return AbstractC1209k.a(Character.UnicodeBlock.of(charSequence.charAt(i7)), unicodeBlock) && AbstractC1209k.a(Character.UnicodeBlock.of(charSequence.charAt(i8)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean k(int i7) {
        if (i7 >= this.f11185c || this.f11184b > i7) {
            return false;
        }
        CharSequence charSequence = (CharSequence) this.f11186d;
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i7)) && !Character.isSurrogate(charSequence.charAt(i7))) {
            if (!j.d()) {
                return false;
            }
            j jVarA = j.a();
            if (jVarA.c() != 1 || jVarA.b(charSequence, i7) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean l(int i7) {
        if (i7 >= this.f11185c || this.f11184b > i7) {
            return false;
        }
        return android.support.v4.media.session.b.u(Character.codePointAt((CharSequence) this.f11186d, i7));
    }

    public int m(int i7) {
        c(i7);
        int iFollowing = ((BreakIterator) this.f11187e).following(i7);
        return (k(iFollowing + (-1)) && k(iFollowing) && !j(iFollowing)) ? m(iFollowing) : iFollowing;
    }

    public void n(Typeface typeface) {
        int i7;
        if (Build.VERSION.SDK_INT >= 28 && (i7 = this.f11184b) != -1) {
            typeface = V.a(typeface, i7, (this.f11185c & 2) != 0);
        }
        W w7 = (W) this.f11187e;
        if (w7.f15241m) {
            w7.l = typeface;
            TextView textView = (TextView) ((WeakReference) this.f11186d).get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new g(textView, typeface, w7.f15239j, 2));
                } else {
                    textView.setTypeface(typeface, w7.f15239j);
                }
            }
        }
    }

    public synchronized Object o() {
        return this.f11185c == 0 ? null : q();
    }

    public synchronized Object p(long j3) {
        Object objQ;
        objQ = null;
        while (this.f11185c > 0 && j3 - ((long[]) this.f11186d)[this.f11184b] >= 0) {
            objQ = q();
        }
        return objQ;
    }

    public Object q() {
        AbstractC1697a.i(this.f11185c > 0);
        Object[] objArr = (Object[]) this.f11187e;
        int i7 = this.f11184b;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f11184b = (i7 + 1) % objArr.length;
        this.f11185c--;
        return obj;
    }

    public int r(int i7) {
        c(i7);
        int iPreceding = ((BreakIterator) this.f11187e).preceding(i7);
        return (k(iPreceding) && g(iPreceding) && !j(iPreceding)) ? r(iPreceding) : iPreceding;
    }

    public void s(String str, int i7, int i8) {
        if (i7 > i8) {
            AbstractC0996a.a("start index must be less than or equal to end index: " + i7 + " > " + i8);
        }
        if (i7 < 0) {
            AbstractC0996a.a("start must be non-negative, but was " + i7);
        }
        C0535h c0535h = (C0535h) this.f11187e;
        if (c0535h == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i7, 64);
            int iMin2 = Math.min(((String) this.f11186d).length() - i8, 64);
            String str2 = (String) this.f11186d;
            int i9 = i7 - iMin;
            AbstractC1209k.d(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i9, i7, cArr, 0);
            String str3 = (String) this.f11186d;
            int i10 = iMax - iMin2;
            int i11 = iMin2 + i8;
            AbstractC1209k.d(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i8, i11, cArr, i10);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            C0535h c0535h2 = new C0535h(3, (byte) 0);
            c0535h2.f9479b = iMax;
            c0535h2.f9482e = cArr;
            c0535h2.f9480c = length;
            c0535h2.f9481d = i10;
            this.f11187e = c0535h2;
            this.f11184b = i9;
            this.f11185c = i11;
            return;
        }
        int i12 = this.f11184b;
        int i13 = i7 - i12;
        int i14 = i8 - i12;
        if (i13 < 0 || i14 > c0535h.f9479b - c0535h.c()) {
            this.f11186d = toString();
            this.f11187e = null;
            this.f11184b = -1;
            this.f11185c = -1;
            s(str, i7, i8);
            return;
        }
        int length2 = str.length() - (i14 - i13);
        if (length2 > c0535h.c()) {
            int iC = length2 - c0535h.c();
            int i15 = c0535h.f9479b;
            do {
                i15 *= 2;
            } while (i15 - c0535h.f9479b < iC);
            char[] cArr2 = new char[i15];
            l.X((char[]) c0535h.f9482e, cArr2, 0, 0, c0535h.f9480c);
            int i16 = c0535h.f9479b;
            int i17 = c0535h.f9481d;
            int i18 = i16 - i17;
            int i19 = i15 - i18;
            l.X((char[]) c0535h.f9482e, cArr2, i19, i17, i18 + i17);
            c0535h.f9482e = cArr2;
            c0535h.f9479b = i15;
            c0535h.f9481d = i19;
        }
        int i20 = c0535h.f9480c;
        if (i13 < i20 && i14 <= i20) {
            int i21 = i20 - i14;
            char[] cArr3 = (char[]) c0535h.f9482e;
            l.X(cArr3, cArr3, c0535h.f9481d - i21, i14, i20);
            c0535h.f9480c = i13;
            c0535h.f9481d -= i21;
        } else if (i13 >= i20 || i14 < i20) {
            int iC2 = c0535h.c() + i13;
            int iC3 = c0535h.c() + i14;
            int i22 = c0535h.f9481d;
            char[] cArr4 = (char[]) c0535h.f9482e;
            l.X(cArr4, cArr4, c0535h.f9480c, i22, iC2);
            c0535h.f9480c += iC2 - i22;
            c0535h.f9481d = iC3;
        } else {
            c0535h.f9481d = c0535h.c() + i14;
            c0535h.f9480c = i13;
        }
        str.getChars(0, str.length(), (char[]) c0535h.f9482e, c0535h.f9480c);
        c0535h.f9480c = str.length() + c0535h.f9480c;
    }

    public synchronized int t() {
        return this.f11185c;
    }

    public String toString() {
        switch (this.f11183a) {
            case 1:
                C0535h c0535h = (C0535h) this.f11187e;
                if (c0535h == null) {
                    return (String) this.f11186d;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) this.f11186d, 0, this.f11184b);
                sb.append((char[]) c0535h.f9482e, 0, c0535h.f9480c);
                char[] cArr = (char[]) c0535h.f9482e;
                int i7 = c0535h.f9481d;
                sb.append(cArr, i7, c0535h.f9479b - i7);
                String str = (String) this.f11186d;
                sb.append((CharSequence) str, this.f11185c, str.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public e(CharSequence charSequence, int i7, Locale locale) {
        this.f11183a = 0;
        this.f11186d = charSequence;
        if (charSequence.length() < 0) {
            AbstractC0996a.a("input start index is outside the CharSequence");
        }
        if (i7 < 0 || i7 > charSequence.length()) {
            AbstractC0996a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f11187e = wordInstance;
        this.f11184b = Math.max(0, -50);
        this.f11185c = Math.min(charSequence.length(), i7 + 50);
        wordInstance.setText(new C0716b(charSequence, i7));
    }

    public e(W w7, int i7, int i8, WeakReference weakReference) {
        this.f11183a = 3;
        this.f11187e = w7;
        this.f11184b = i7;
        this.f11185c = i8;
        this.f11186d = weakReference;
    }

    public e(int i7) {
        this.f11183a = 2;
        this.f11186d = new r[i7];
        this.f11185c = 0;
    }
}
