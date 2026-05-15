package V;

import L2.C0247a;
import M.Z;
import R0.S0;
import T1.x;
import X.K0;
import Z4.B;
import a.AbstractC0509a;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import b1.L;
import g1.C0969k;
import g1.C0980v;
import i1.C1058a;
import i1.C1059b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f7368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f7369b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Z f7372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public K0 f7373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public S0 f7374g;
    public Rect l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r f7378m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1182c f7370c = new F.g(28);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1182c f7371d = new F.g(29);
    public C0980v h = new C0980v(L.f9943b, "", 4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C0969k f7375i = C0969k.f12361g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f7376j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f7377k = AbstractC0509a.N(Y4.f.f8724p, new E3.e(14, this));

    public u(View view, b bVar, o oVar) {
        this.f7368a = view;
        this.f7369b = oVar;
        this.f7378m = new r(bVar, oVar);
    }

    public final v a(EditorInfo editorInfo) {
        int i7;
        int i8;
        C0980v c0980v = this.h;
        String str = c0980v.f12384a.f9970p;
        C0969k c0969k = this.f7375i;
        int i9 = c0969k.f12366e;
        boolean z6 = c0969k.f12362a;
        if (i9 == 1) {
            i7 = z6 ? 6 : 0;
        } else if (i9 == 0) {
            i7 = 1;
        } else if (i9 == 2) {
            i7 = 2;
        } else if (i9 == 6) {
            i7 = 5;
        } else if (i9 == 5) {
            i7 = 7;
        } else if (i9 == 3) {
            i7 = 3;
        } else if (i9 == 4) {
            i7 = 4;
        } else {
            if (i9 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
        editorInfo.imeOptions = i7;
        if (Build.VERSION.SDK_INT >= 24) {
            C1059b c1059b = C1059b.f13289q;
            C1059b c1059b2 = c0969k.f12367f;
            if (AbstractC1209k.a(c1059b2, c1059b)) {
                editorInfo.hintLocales = null;
            } else {
                ArrayList arrayList = new ArrayList(Z4.p.j0(c1059b2));
                Iterator it = c1059b2.f13290o.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C1058a) it.next()).f13288a);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                editorInfo.hintLocales = x.e((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
            }
        }
        int i10 = c0969k.f12365d;
        if (i10 == 1) {
            i8 = 1;
        } else if (i10 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i8 = 1;
        } else if (i10 == 3) {
            i8 = 2;
        } else if (i10 == 4) {
            i8 = 3;
        } else if (i10 == 5) {
            i8 = 17;
        } else if (i10 == 6) {
            i8 = 33;
        } else if (i10 == 7) {
            i8 = 129;
        } else if (i10 == 8) {
            i8 = 18;
        } else {
            if (i10 != 9) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            i8 = 8194;
        }
        editorInfo.inputType = i8;
        if (!z6 && (i8 & 1) == 1) {
            editorInfo.inputType = 131072 | i8;
            if (c0969k.f12366e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i11 = editorInfo.inputType;
        if ((i11 & 1) == 1) {
            int i12 = c0969k.f12363b;
            if (i12 == 1) {
                editorInfo.inputType = i11 | 4096;
            } else if (i12 == 2) {
                editorInfo.inputType = i11 | 8192;
            } else if (i12 == 3) {
                editorInfo.inputType = i11 | 16384;
            }
            if (c0969k.f12364c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i13 = L.f9944c;
        long j3 = c0980v.f12385b;
        editorInfo.initialSelStart = (int) (j3 >> 32);
        editorInfo.initialSelEnd = (int) (4294967295L & j3);
        I1.d.a(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!U.c.f7025a || i10 == 7 || i10 == 8) {
            if (B1.b.c()) {
                I1.c.a(editorInfo, false);
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        } else {
            if (B1.b.c()) {
                I1.c.a(editorInfo, true);
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
            editorInfo.setSupportedHandwritingGestures(Z4.o.e0(R.t.n(), R.t.z(), R.t.v(), R.t.x(), R.t.B(), R.t.C(), R.t.D()));
            editorInfo.setSupportedHandwritingGesturePreviews(B.a0(R.t.n(), R.t.z(), R.t.v(), R.t.x()));
        }
        s sVar = t.f7367a;
        if (T1.j.d()) {
            T1.j.a().i(editorInfo);
        }
        v vVar = new v(this.h, new C0247a(11, this), this.f7375i.f12364c, this.f7372e, this.f7373f, this.f7374g);
        this.f7376j.add(new WeakReference(vVar));
        return vVar;
    }
}
