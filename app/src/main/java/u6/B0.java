package u6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0888g0;
import java.util.List;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f17341o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0888g0 f17342p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(List list, C0888g0 c0888g0, c5.d dVar) {
        super(2, dVar);
        this.f17341o = list;
        this.f17342p = c0888g0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new B0(this.f17341o, this.f17342p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        B0 b0 = (B0) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        b0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        int i7;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        Long l = new Long(E0.f17384b.h());
        List list = this.f17341o;
        int size = list.size();
        Z4.o.h0(list.size(), size);
        int i8 = size - 1;
        int i9 = 0;
        while (true) {
            if (i9 > i8) {
                i7 = -(i9 + 1);
                break;
            }
            i7 = (i9 + i8) >>> 1;
            int iR = N5.l.r(Long.valueOf(((d6.f) list.get(i7)).f11291p), l);
            if (iR >= 0) {
                if (iR <= 0) {
                    break;
                }
                i8 = i7 - 1;
            } else {
                i9 = i7 + 1;
            }
        }
        if (i7 < 0) {
            i7 = (-i7) - 2;
        }
        int i10 = i7 >= 0 ? i7 : 0;
        C0888g0 c0888g0 = this.f17342p;
        if (i10 != c0888g0.h()) {
            c0888g0.j(i10);
        }
        return Y4.o.f8736a;
    }
}
