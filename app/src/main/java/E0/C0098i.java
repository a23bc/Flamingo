package E0;

import a.AbstractC0509a;
import android.graphics.Path;
import m5.AbstractC1209k;
import y0.AbstractC1978k;
import y0.AbstractC1983p;
import y0.C1976i;
import y0.C1977j;

/* JADX INFO: renamed from: E0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0098i extends D {

    /* JADX INFO: renamed from: b */
    public AbstractC1983p f1747b;

    /* JADX INFO: renamed from: c */
    public float f1748c = 1.0f;

    /* JADX INFO: renamed from: d */
    public Object f1749d;

    /* JADX INFO: renamed from: e */
    public float f1750e;

    /* JADX INFO: renamed from: f */
    public float f1751f;

    /* JADX INFO: renamed from: g */
    public AbstractC1983p f1752g;
    public int h;

    /* JADX INFO: renamed from: i */
    public int f1753i;

    /* JADX INFO: renamed from: j */
    public float f1754j;

    /* JADX INFO: renamed from: k */
    public float f1755k;
    public float l;

    /* JADX INFO: renamed from: m */
    public float f1756m;

    /* JADX INFO: renamed from: n */
    public boolean f1757n;

    /* JADX INFO: renamed from: o */
    public boolean f1758o;

    /* JADX INFO: renamed from: p */
    public boolean f1759p;

    /* JADX INFO: renamed from: q */
    public A0.i f1760q;

    /* JADX INFO: renamed from: r */
    public final C1976i f1761r;

    /* JADX INFO: renamed from: s */
    public C1976i f1762s;

    /* JADX INFO: renamed from: t */
    public final Object f1763t;

    public C0098i() {
        int i7 = I.f1667a;
        this.f1749d = Z4.v.f8818o;
        this.f1750e = 1.0f;
        this.h = 0;
        this.f1753i = 0;
        this.f1754j = 4.0f;
        this.l = 1.0f;
        this.f1757n = true;
        this.f1758o = true;
        C1976i c1976iA = AbstractC1978k.a();
        this.f1761r = c1976iA;
        this.f1762s = c1976iA;
        this.f1763t = AbstractC0509a.N(Y4.f.f8724p, C0097h.f1744q);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // E0.D
    public final void a(A0.f fVar) {
        A0.f fVar2;
        A0.i iVar;
        if (this.f1757n) {
            AbstractC0091b.d(this.f1749d, this.f1761r);
            e();
        } else if (this.f1759p) {
            e();
        }
        this.f1757n = false;
        this.f1759p = false;
        AbstractC1983p abstractC1983p = this.f1747b;
        if (abstractC1983p != null) {
            fVar2 = fVar;
            A0.e.u(fVar2, this.f1762s, abstractC1983p, this.f1748c, null, 56);
        } else {
            fVar2 = fVar;
        }
        AbstractC1983p abstractC1983p2 = this.f1752g;
        if (abstractC1983p2 != null) {
            A0.i iVar2 = this.f1760q;
            if (this.f1758o || iVar2 == null) {
                A0.i iVar3 = new A0.i(this.f1751f, this.f1754j, this.h, this.f1753i, 16);
                this.f1760q = iVar3;
                this.f1758o = false;
                iVar = iVar3;
            } else {
                iVar = iVar2;
            }
            A0.e.u(fVar2, this.f1762s, abstractC1983p2, this.f1750e, iVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [Y4.e, java.lang.Object] */
    public final void e() {
        Path path;
        float f7 = this.f1755k;
        C1976i c1976i = this.f1761r;
        if (f7 == 0.0f && this.l == 1.0f) {
            this.f1762s = c1976i;
            return;
        }
        if (AbstractC1209k.a(this.f1762s, c1976i)) {
            this.f1762s = AbstractC1978k.a();
        } else {
            Path.FillType fillType = this.f1762s.f20241a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z6 = fillType == fillType2;
            this.f1762s.f20241a.rewind();
            C1976i c1976i2 = this.f1762s;
            c1976i2.getClass();
            if (!z6) {
                fillType2 = Path.FillType.WINDING;
            }
            c1976i2.f20241a.setFillType(fillType2);
        }
        ?? r02 = this.f1763t;
        C1977j c1977j = (C1977j) r02.getValue();
        if (c1976i != null) {
            c1977j.getClass();
            path = c1976i.f20241a;
        } else {
            path = null;
        }
        c1977j.f20244a.setPath(path, false);
        float length = ((C1977j) r02.getValue()).f20244a.getLength();
        float f8 = this.f1755k;
        float f9 = this.f1756m;
        float f10 = ((f8 + f9) % 1.0f) * length;
        float f11 = ((this.l + f9) % 1.0f) * length;
        if (f10 <= f11) {
            ((C1977j) r02.getValue()).a(f10, f11, this.f1762s);
        } else {
            ((C1977j) r02.getValue()).a(f10, length, this.f1762s);
            ((C1977j) r02.getValue()).a(0.0f, f11, this.f1762s);
        }
    }

    public final String toString() {
        return this.f1761r.toString();
    }
}
