package B5;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class u implements H3.c, M4.o, T1.n, I4.s {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f918o;

    /* JADX INFO: renamed from: p */
    public final String f919p;

    public /* synthetic */ u(String str, int i7) {
        this.f918o = i7;
        this.f919p = str;
    }

    public static u h(w2.m mVar) {
        String str;
        mVar.H(2);
        int iU = mVar.u();
        int i7 = iU >> 1;
        int iU2 = ((mVar.u() >> 3) & 31) | ((iU & 1) << 5);
        if (i7 == 4 || i7 == 5 || i7 == 7) {
            str = "dvhe";
        } else if (i7 == 8) {
            str = "hev1";
        } else {
            if (i7 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i7);
        sb.append(iU2 >= 10 ? "." : ".0");
        sb.append(iU2);
        return new u(sb.toString(), 6);
    }

    @Override // M4.o
    public Object F() {
        switch (this.f918o) {
            case 3:
                throw new K4.o(this.f919p);
            case 4:
                throw new K4.o(this.f919p);
            default:
                throw new K4.o(this.f919p);
        }
    }

    @Override // T1.n
    public boolean a(CharSequence charSequence, int i7, int i8, T1.v vVar) {
        if (!TextUtils.equals(charSequence.subSequence(i7, i8), this.f919p)) {
            return true;
        }
        vVar.f6903c = (vVar.f6903c & 3) | 4;
        return false;
    }

    @Override // H3.c
    public String d() {
        return this.f919p;
    }

    public void e(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f919p);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // I4.s
    public void f(Throwable th) {
        AbstractC1697a.x("custom command " + this.f919p + " produced an error: " + th.getMessage(), th);
    }

    @Override // I4.s
    public /* bridge */ /* synthetic */ void g(Object obj) {
    }

    public String toString() {
        switch (this.f918o) {
            case 0:
                return Z1.l.s(new StringBuilder("<"), this.f919p, '>');
            default:
                return super.toString();
        }
    }

    public u(String str) {
        this.f918o = 1;
        str.getClass();
        this.f919p = str;
    }

    @Override // T1.n
    public Object b() {
        return this;
    }

    @Override // H3.c
    public void c(I3.b bVar) {
    }
}
