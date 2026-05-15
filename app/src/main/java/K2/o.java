package K2;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final C1.b h = new C1.b(11);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C1.b f4039i = new C1.b(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4040a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4046g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n[] f4042c = new n[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4041b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4043d = -1;

    public o(int i7) {
        this.f4040a = i7;
    }

    public final void a(int i7, float f7) {
        n nVar;
        int i8 = this.f4043d;
        ArrayList arrayList = this.f4041b;
        if (i8 != 1) {
            Collections.sort(arrayList, h);
            this.f4043d = 1;
        }
        int i9 = this.f4046g;
        n[] nVarArr = this.f4042c;
        if (i9 > 0) {
            int i10 = i9 - 1;
            this.f4046g = i10;
            nVar = nVarArr[i10];
        } else {
            nVar = new n();
        }
        int i11 = this.f4044e;
        this.f4044e = i11 + 1;
        nVar.f4036a = i11;
        nVar.f4037b = i7;
        nVar.f4038c = f7;
        arrayList.add(nVar);
        this.f4045f += i7;
        while (true) {
            int i12 = this.f4045f;
            int i13 = this.f4040a;
            if (i12 <= i13) {
                return;
            }
            int i14 = i12 - i13;
            n nVar2 = (n) arrayList.get(0);
            int i15 = nVar2.f4037b;
            if (i15 <= i14) {
                this.f4045f -= i15;
                arrayList.remove(0);
                int i16 = this.f4046g;
                if (i16 < 5) {
                    this.f4046g = i16 + 1;
                    nVarArr[i16] = nVar2;
                }
            } else {
                nVar2.f4037b = i15 - i14;
                this.f4045f -= i14;
            }
        }
    }

    public final float b() {
        int i7 = this.f4043d;
        ArrayList arrayList = this.f4041b;
        if (i7 != 0) {
            Collections.sort(arrayList, f4039i);
            this.f4043d = 0;
        }
        float f7 = 0.5f * this.f4045f;
        int i8 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            n nVar = (n) arrayList.get(i9);
            i8 += nVar.f4037b;
            if (i8 >= f7) {
                return nVar.f4038c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((n) arrayList.get(arrayList.size() - 1)).f4038c;
    }
}
