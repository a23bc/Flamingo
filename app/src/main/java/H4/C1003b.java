package h4;

import D2.B;
import S5.u;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: h4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1003b {

    /* JADX INFO: renamed from: a */
    public final String f12710a;

    /* JADX INFO: renamed from: b */
    public final long[] f12711b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f12712c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f12713d;

    /* JADX INFO: renamed from: e */
    public boolean f12714e;

    /* JADX INFO: renamed from: f */
    public boolean f12715f;

    /* JADX INFO: renamed from: g */
    public B f12716g;
    public int h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ f f12717i;

    public C1003b(f fVar, String str) {
        this.f12717i = fVar;
        this.f12710a = str;
        fVar.getClass();
        this.f12711b = new long[2];
        fVar.getClass();
        this.f12712c = new ArrayList(2);
        fVar.getClass();
        this.f12713d = new ArrayList(2);
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        fVar.getClass();
        for (int i7 = 0; i7 < 2; i7++) {
            sb.append(i7);
            this.f12712c.add(this.f12717i.f12728o.d(sb.toString()));
            sb.append(".tmp");
            this.f12713d.add(this.f12717i.f12728o.d(sb.toString()));
            sb.setLength(length);
        }
    }

    public final C1004c a() {
        if (this.f12714e && this.f12716g == null && !this.f12715f) {
            ArrayList arrayList = this.f12712c;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                f fVar = this.f12717i;
                if (i7 >= size) {
                    this.h++;
                    return new C1004c(fVar, this);
                }
                if (fVar.f12727D.c((u) arrayList.get(i7))) {
                    i7++;
                } else {
                    try {
                        fVar.q(this);
                        return null;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return null;
    }
}
