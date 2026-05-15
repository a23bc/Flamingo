package O0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class N extends Q0.H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S f5343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l5.e f5344c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(S s7, l5.e eVar, String str) {
        super(str);
        this.f5343b = s7;
        this.f5344c = eVar;
    }

    @Override // O0.Z
    public final InterfaceC0296a0 g(InterfaceC0298b0 interfaceC0298b0, List list, long j3) {
        S s7 = this.f5343b;
        n1.n layoutDirection = interfaceC0298b0.getLayoutDirection();
        L l = s7.f5362v;
        l.f5334o = layoutDirection;
        l.f5335p = interfaceC0298b0.b();
        l.f5336q = interfaceC0298b0.n();
        boolean zS = interfaceC0298b0.s();
        l5.e eVar = this.f5344c;
        if (zS || s7.f5355o.f5837v == null) {
            s7.f5358r = 0;
            InterfaceC0296a0 interfaceC0296a0 = (InterfaceC0296a0) eVar.invoke(l, new n1.a(j3));
            return new M(interfaceC0296a0, s7, s7.f5358r, interfaceC0296a0, 1);
        }
        s7.f5359s = 0;
        InterfaceC0296a0 interfaceC0296a02 = (InterfaceC0296a0) eVar.invoke(s7.f5363w, new n1.a(j3));
        return new M(interfaceC0296a02, s7, s7.f5359s, interfaceC0296a02, 0);
    }
}
