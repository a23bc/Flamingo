package d0;

import E0.AbstractC0091b;
import E0.C0095f;
import e0.AbstractC0839d;
import f0.C0912t;
import f0.C0915u0;
import r0.C1395m;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: d0.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0774A {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC1398p f10814a = androidx.compose.foundation.layout.c.g(C1395m.f15634a, AbstractC0839d.f11377a);

    /* JADX WARN: Removed duplicated region for block: B:159:0x00ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(D0.b r15, java.lang.String r16, r0.InterfaceC1398p r17, long r18, f0.C0912t r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.AbstractC0774A.a(D0.b, java.lang.String, r0.p, long, f0.t, int, int):void");
    }

    public static final void b(C0095f c0095f, InterfaceC1398p interfaceC1398p, long j3, C0912t c0912t, int i7) {
        int i8;
        C0912t c0912t2;
        InterfaceC1398p interfaceC1398p2;
        long j7;
        c0912t.Z(-126890956);
        if ((i7 & 6) == 0) {
            i8 = (c0912t.f(c0095f) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0912t.f(null) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0912t.f(interfaceC1398p) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0912t.e(j3) ? 2048 : 1024;
        }
        if ((i8 & 1171) == 1170 && c0912t.z()) {
            c0912t.Q();
            c0912t2 = c0912t;
            j7 = j3;
            interfaceC1398p2 = interfaceC1398p;
        } else {
            c0912t.S();
            if ((i7 & 1) != 0 && !c0912t.x()) {
                c0912t.Q();
            }
            c0912t.q();
            c0912t2 = c0912t;
            a(AbstractC0091b.c(c0095f, c0912t), null, interfaceC1398p, j3, c0912t2, (i8 & 112) | 8 | (i8 & 896) | (i8 & 7168), 0);
            interfaceC1398p2 = interfaceC1398p;
            j7 = j3;
        }
        C0915u0 c0915u0R = c0912t2.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new b2.E0(c0095f, interfaceC1398p2, j7, i7);
        }
    }
}
