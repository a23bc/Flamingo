package b2;

import androidx.glance.appwidget.protobuf.AbstractC0568p;
import d2.C0816d;
import d2.C0817e;
import d2.C0818f;
import d2.C0819g;
import d2.C0821i;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.Map;

/* JADX INFO: renamed from: b2.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0668k0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f10213o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0670l0 f10214p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0668k0(C0670l0 c0670l0, c5.d dVar) {
        super(2, dVar);
        this.f10214p = c0670l0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0668k0 c0668k0 = new C0668k0(this.f10214p, dVar);
        c0668k0.f10213o = obj;
        return c0668k0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0668k0) create((C0817e) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        C0817e c0817e = (C0817e) this.f10213o;
        AbstractC0568p abstractC0568p = (AbstractC0568p) c0817e.b(5);
        if (!abstractC0568p.f9654o.equals(c0817e)) {
            abstractC0568p.c();
            AbstractC0568p.d(abstractC0568p.f9655p, c0817e);
        }
        C0816d c0816d = (C0816d) abstractC0568p;
        int iP = ((C0817e) c0816d.f9655p).p();
        c0816d.c();
        C0817e.m((C0817e) c0816d.f9655p, iP);
        c0816d.c();
        C0817e.l((C0817e) c0816d.f9655p);
        C0670l0 c0670l0 = this.f10214p;
        for (Map.Entry entry : c0670l0.f10221b.entrySet()) {
            C0821i c0821i = (C0821i) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            if (c0670l0.f10224e.contains(new Integer(iIntValue))) {
                C0818f c0818fO = C0819g.o();
                c0818fO.c();
                C0819g.k((C0819g) c0818fO.f9655p, c0821i);
                c0818fO.c();
                C0819g.l((C0819g) c0818fO.f9655p, iIntValue);
                c0816d.c();
                C0817e.k((C0817e) c0816d.f9655p, (C0819g) c0818fO.a());
            }
        }
        return c0816d.a();
    }
}
