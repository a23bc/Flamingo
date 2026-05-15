package T5;

import S5.y;
import Y4.o;
import java.io.IOException;
import m5.AbstractC1210l;
import m5.C1216r;
import m5.C1219u;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1216r f7006p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f7007q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1219u f7008r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f7009s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1219u f7010t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1219u f7011u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C1216r c1216r, long j3, C1219u c1219u, y yVar, C1219u c1219u2, C1219u c1219u3) {
        super(2);
        this.f7006p = c1216r;
        this.f7007q = j3;
        this.f7008r = c1219u;
        this.f7009s = yVar;
        this.f7010t = c1219u2;
        this.f7011u = c1219u3;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 1) {
            C1216r c1216r = this.f7006p;
            if (c1216r.f14435o) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            c1216r.f14435o = true;
            if (jLongValue < this.f7007q) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            C1219u c1219u = this.f7008r;
            long jN = c1219u.f14438o;
            y yVar = this.f7009s;
            if (jN == 4294967295L) {
                jN = yVar.n();
            }
            c1219u.f14438o = jN;
            C1219u c1219u2 = this.f7010t;
            c1219u2.f14438o = c1219u2.f14438o == 4294967295L ? yVar.n() : 0L;
            C1219u c1219u3 = this.f7011u;
            c1219u3.f14438o = c1219u3.f14438o == 4294967295L ? yVar.n() : 0L;
        }
        return o.f8736a;
    }
}
