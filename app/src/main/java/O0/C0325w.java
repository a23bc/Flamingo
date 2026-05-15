package O0;

import java.io.Serializable;

/* JADX INFO: renamed from: O0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0325w {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5459a;

    /* JADX INFO: renamed from: b */
    public final C0324v f5460b;

    /* JADX INFO: renamed from: c */
    public final C0324v f5461c;

    /* JADX INFO: renamed from: d */
    public final C0324v f5462d;

    /* JADX INFO: renamed from: e */
    public final C0324v f5463e;

    /* JADX INFO: renamed from: f */
    public final Serializable f5464f;

    public C0325w(String str) {
        this.f5459a = 1;
        this.f5464f = str;
        this.f5460b = new C0324v(1, null);
        this.f5461c = new C0324v(0, null);
        this.f5462d = new C0324v(1, null);
        this.f5463e = new C0324v(0, null);
    }

    public final C0324v a() {
        switch (this.f5459a) {
        }
        return this.f5463e;
    }

    public final C0324v b() {
        switch (this.f5459a) {
        }
        return this.f5460b;
    }

    public final C0324v c() {
        switch (this.f5459a) {
        }
        return this.f5462d;
    }

    public final C0324v d() {
        switch (this.f5459a) {
        }
        return this.f5461c;
    }

    public final String toString() {
        switch (this.f5459a) {
            case 0:
                return Z4.l.m0((C0325w[]) this.f5464f, null, null, 57);
            default:
                String str = (String) this.f5464f;
                if (str == null) {
                    return super.toString();
                }
                return "RectRulers(" + str + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0325w(C0325w[] c0325wArr) {
        this.f5459a = 0;
        this.f5464f = c0325wArr;
        int length = c0325wArr.length;
        C0324v[] c0324vArr = new C0324v[length];
        for (int i7 = 0; i7 < length; i7++) {
            c0324vArr[i7] = ((C0325w[]) this.f5464f)[i7].b();
        }
        this.f5460b = new C0324v(1, new E0(c0324vArr, 0));
        int length2 = ((C0325w[]) this.f5464f).length;
        C0324v[] c0324vArr2 = new C0324v[length2];
        for (int i8 = 0; i8 < length2; i8++) {
            c0324vArr2[i8] = ((C0325w[]) this.f5464f)[i8].d();
        }
        this.f5461c = new C0324v(0, new C0323u(c0324vArr2, 0));
        int length3 = ((C0325w[]) this.f5464f).length;
        C0324v[] c0324vArr3 = new C0324v[length3];
        for (int i9 = 0; i9 < length3; i9++) {
            c0324vArr3[i9] = ((C0325w[]) this.f5464f)[i9].c();
        }
        this.f5462d = new C0324v(1, new E0(c0324vArr3, 1));
        int length4 = ((C0325w[]) this.f5464f).length;
        C0324v[] c0324vArr4 = new C0324v[length4];
        for (int i10 = 0; i10 < length4; i10++) {
            c0324vArr4[i10] = ((C0325w[]) this.f5464f)[i10].a();
        }
        this.f5463e = new C0324v(0, new C0323u(c0324vArr4, 1));
    }
}
