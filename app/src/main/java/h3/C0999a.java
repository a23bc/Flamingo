package h3;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: h3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0999a extends AbstractC1001c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f12561q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f12562r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f12563s;

    public C0999a(long j3, int i7) {
        super(i7);
        this.f12561q = j3;
        this.f12562r = new ArrayList();
        this.f12563s = new ArrayList();
    }

    public final C0999a f(int i7) {
        ArrayList arrayList = this.f12563s;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C0999a c0999a = (C0999a) arrayList.get(i8);
            if (c0999a.f12566p == i7) {
                return c0999a;
            }
        }
        return null;
    }

    public final C1000b g(int i7) {
        ArrayList arrayList = this.f12562r;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C1000b c1000b = (C1000b) arrayList.get(i8);
            if (c1000b.f12566p == i7) {
                return c1000b;
            }
        }
        return null;
    }

    @Override // h3.AbstractC1001c
    public final String toString() {
        return AbstractC1001c.b(this.f12566p) + " leaves: " + Arrays.toString(this.f12562r.toArray()) + " containers: " + Arrays.toString(this.f12563s.toArray());
    }
}
