package b1;

import android.graphics.Canvas;
import android.text.TextUtils;
import c1.AbstractC0725k;
import c1.C0723i;
import c1.C0724j;
import y0.AbstractC1970c;
import y0.AbstractC1983p;
import y0.C1962L;
import y0.InterfaceC1985r;

/* JADX INFO: renamed from: b1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0616a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1.c f9952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0724j f9955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f9956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f9957f;

    /* JADX WARN: Removed duplicated region for block: B:105:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0616a(j1.c r21, int r22, int r23, long r24) {
        /*
            Method dump skipped, instruction units count: 857
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C0616a.<init>(j1.c, int, int, long):void");
    }

    public final C0724j a(int i7, int i8, TextUtils.TruncateAt truncateAt, int i9, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        v vVar;
        float fD = d();
        j1.c cVar = this.f9952a;
        j1.a aVar = j1.b.f13647a;
        w wVar = cVar.f13649p.f9949c;
        return new C0724j(charSequence, fD, cVar.f13654u, i7, truncateAt, cVar.f13659z, (wVar == null || (vVar = wVar.f10017a) == null) ? false : vVar.f10016a, i9, i11, i12, i13, i10, i8, cVar.f13656w);
    }

    public final float b() {
        return this.f9955d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Type inference failed for: r13v25, types: [c1.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(x0.C1893c r12, int r13, B2.g r14) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C0616a.c(x0.c, int, B2.g):long");
    }

    public final float d() {
        return n1.a.h(this.f9954c);
    }

    public final void e(InterfaceC1985r interfaceC1985r) {
        Canvas canvasA = AbstractC1970c.a(interfaceC1985r);
        C0724j c0724j = this.f9955d;
        if (c0724j.f10639d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, d(), b());
        }
        if (canvasA.getClipBounds(c0724j.f10649p)) {
            int i7 = c0724j.h;
            if (i7 != 0) {
                canvasA.translate(0.0f, i7);
            }
            C0723i c0723i = AbstractC0725k.f10651a;
            c0723i.f10635a = canvasA;
            c0724j.f10641f.draw(c0723i);
            if (i7 != 0) {
                canvasA.translate(0.0f, (-1) * i7);
            }
        }
        if (c0724j.f10639d) {
            canvasA.restore();
        }
    }

    public final void f(InterfaceC1985r interfaceC1985r, long j3, C1962L c1962l, m1.l lVar, A0.d dVar) {
        j1.e eVar = this.f9952a.f13654u;
        int i7 = eVar.f13664c;
        eVar.d(j3);
        eVar.f(c1962l);
        eVar.g(lVar);
        eVar.e(dVar);
        eVar.b(3);
        e(interfaceC1985r);
        eVar.b(i7);
    }

    public final void g(InterfaceC1985r interfaceC1985r, AbstractC1983p abstractC1983p, float f7, C1962L c1962l, m1.l lVar, A0.d dVar) {
        j1.e eVar = this.f9952a.f13654u;
        int i7 = eVar.f13664c;
        float fD = d();
        eVar.c(abstractC1983p, (((long) Float.floatToRawIntBits(b())) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32), f7);
        eVar.f(c1962l);
        eVar.g(lVar);
        eVar.e(dVar);
        eVar.b(3);
        e(interfaceC1985r);
        eVar.b(i7);
    }
}
