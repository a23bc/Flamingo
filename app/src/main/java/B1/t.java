package b1;

import h1.AbstractC0996a;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class t implements InterfaceC0617b {

    /* JADX INFO: renamed from: a */
    public final int f10006a;

    /* JADX INFO: renamed from: b */
    public final int f10007b;

    /* JADX INFO: renamed from: c */
    public final long f10008c;

    /* JADX INFO: renamed from: d */
    public final m1.q f10009d;

    /* JADX INFO: renamed from: e */
    public final v f10010e;

    /* JADX INFO: renamed from: f */
    public final m1.i f10011f;

    /* JADX INFO: renamed from: g */
    public final int f10012g;
    public final int h;

    /* JADX INFO: renamed from: i */
    public final m1.s f10013i;

    public t(int i7, int i8, long j3, m1.q qVar, v vVar, m1.i iVar, int i9, int i10, m1.s sVar) {
        this.f10006a = i7;
        this.f10007b = i8;
        this.f10008c = j3;
        this.f10009d = qVar;
        this.f10010e = vVar;
        this.f10011f = iVar;
        this.f10012g = i9;
        this.h = i10;
        this.f10013i = sVar;
        if (n1.p.a(j3, n1.p.f14526c) || n1.p.c(j3) >= 0.0f) {
            return;
        }
        AbstractC0996a.b("lineHeight can't be negative (" + n1.p.c(j3) + ')');
    }

    public final t a(t tVar) {
        if (tVar == null) {
            return this;
        }
        return u.a(this, tVar.f10006a, tVar.f10007b, tVar.f10008c, tVar.f10009d, tVar.f10010e, tVar.f10011f, tVar.f10012g, tVar.h, tVar.f10013i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f10006a == tVar.f10006a) {
            if (this.f10007b != tVar.f10007b || !n1.p.a(this.f10008c, tVar.f10008c) || !AbstractC1209k.a(this.f10009d, tVar.f10009d) || !AbstractC1209k.a(this.f10010e, tVar.f10010e) || !AbstractC1209k.a(this.f10011f, tVar.f10011f)) {
                return false;
            }
            int i7 = tVar.f10012g;
            int i8 = m1.e.f14331b;
            if (this.f10012g == i7) {
                return this.h == tVar.h && AbstractC1209k.a(this.f10013i, tVar.f10013i);
            }
        }
        return false;
    }

    public final int hashCode() {
        int iD = (n1.p.d(this.f10008c) + (((this.f10006a * 31) + this.f10007b) * 31)) * 31;
        m1.q qVar = this.f10009d;
        int iHashCode = (iD + (qVar != null ? qVar.hashCode() : 0)) * 31;
        v vVar = this.f10010e;
        int iHashCode2 = (iHashCode + (vVar != null ? vVar.hashCode() : 0)) * 31;
        m1.i iVar = this.f10011f;
        int iHashCode3 = (iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        int i7 = m1.e.f14331b;
        int i8 = (((iHashCode3 + this.f10012g) * 31) + this.h) * 31;
        m1.s sVar = this.f10013i;
        return i8 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) m1.k.a(this.f10006a)) + ", textDirection=" + ((Object) m1.m.a(this.f10007b)) + ", lineHeight=" + ((Object) n1.p.e(this.f10008c)) + ", textIndent=" + this.f10009d + ", platformStyle=" + this.f10010e + ", lineHeightStyle=" + this.f10011f + ", lineBreak=" + ((Object) m1.e.a(this.f10012g)) + ", hyphens=" + ((Object) m1.d.a(this.h)) + ", textMotion=" + this.f10013i + ')';
    }
}
