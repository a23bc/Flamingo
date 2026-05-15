package h6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m5.AbstractC1209k;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: h6.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1020h extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13060o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ List f13061p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1020h(InterfaceC0878b0 interfaceC0878b0, List list, c5.d dVar) {
        super(2, dVar);
        this.f13060o = interfaceC0878b0;
        this.f13061p = list;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1020h(this.f13060o, this.f13061p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C1020h c1020h = (C1020h) create((InterfaceC1765B) obj, (c5.d) obj2);
        Y4.o oVar = Y4.o.f8736a;
        c1020h.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        InterfaceC0878b0 interfaceC0878b0 = this.f13060o;
        boolean zIsEmpty = ((Collection) interfaceC0878b0.getValue()).isEmpty();
        Y4.o oVar = Y4.o.f8736a;
        if (!zIsEmpty) {
            return oVar;
        }
        System.out.getClass();
        List list = this.f13061p;
        AbstractC1209k.f(list, "<this>");
        List listM0 = Z4.n.M0(list);
        Collections.shuffle(listM0);
        interfaceC0878b0.setValue(Z4.n.H0(5, listM0));
        return oVar;
    }
}
