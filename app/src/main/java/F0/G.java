package f0;

import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import p0.AbstractC1280A;
import p0.AbstractC1289f;

/* JADX INFO: loaded from: classes.dex */
public final class G extends p0.z implements Z0 {

    /* JADX INFO: renamed from: p */
    public final InterfaceC1180a f11661p;

    /* JADX INFO: renamed from: q */
    public final Q0 f11662q;

    /* JADX INFO: renamed from: r */
    public F f11663r = new F(p0.l.k().g());

    public G(Q0 q02, InterfaceC1180a interfaceC1180a) {
        this.f11661p = interfaceC1180a;
        this.f11662q = q02;
    }

    @Override // p0.y
    public final AbstractC1280A c() {
        return this.f11663r;
    }

    @Override // p0.y
    public final void g(AbstractC1280A abstractC1280A) {
        AbstractC1209k.d(abstractC1280A, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f11663r = (F) abstractC1280A;
    }

    @Override // f0.Z0
    public final Object getValue() {
        InterfaceC1182c interfaceC1182cE = p0.l.k().e();
        if (interfaceC1182cE != null) {
            interfaceC1182cE.b(this);
        }
        AbstractC1289f abstractC1289fK = p0.l.k();
        return h((F) p0.l.j(this.f11663r, abstractC1289fK), abstractC1289fK, true, this.f11661p).f11655f;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f0.F h(f0.F r22, p0.AbstractC1289f r23, boolean r24, l5.InterfaceC1180a r25) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.G.h(f0.F, p0.f, boolean, l5.a):f0.F");
    }

    public final F j() {
        AbstractC1289f abstractC1289fK = p0.l.k();
        return h((F) p0.l.j(this.f11663r, abstractC1289fK), abstractC1289fK, false, this.f11661p);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        F f7 = (F) p0.l.i(this.f11663r);
        sb.append(f7.c(this, p0.l.k()) ? String.valueOf(f7.f11655f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
