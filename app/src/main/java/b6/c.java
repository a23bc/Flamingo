package b6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.ArrayList;
import m5.C1218t;
import w3.C1760y;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f10414o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1218t f10415p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f10416q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ArrayList arrayList, C1218t c1218t, long j3, c5.d dVar) {
        super(2, dVar);
        this.f10414o = arrayList;
        this.f10415p = c1218t;
        this.f10416q = j3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new c(this.f10414o, this.f10415p, this.f10416q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        C1760y c1760y = i.f10423c;
        if (c1760y != null) {
            c1760y.m(this.f10414o, this.f10415p.f14437o, this.f10416q);
        }
        C1760y c1760y2 = i.f10423c;
        if (c1760y2 == null) {
            return null;
        }
        c1760y2.b();
        return Y4.o.f8736a;
    }
}
