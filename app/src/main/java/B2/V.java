package b2;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class V extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f10121o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ String f10122p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ String f10123q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(String str, String str2, c5.d dVar) {
        super(2, dVar);
        this.f10122p = str;
        this.f10123q = str2;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        V v3 = new V(this.f10122p, this.f10123q, dVar);
        v3.f10121o = obj;
        return v3;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((V) create((R1.b) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        R1.b bVar = (R1.b) this.f10121o;
        Map mapUnmodifiableMap = Collections.unmodifiableMap(bVar.f6654a);
        AbstractC1209k.e(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        R1.b bVar2 = new R1.b(Z4.y.q0(mapUnmodifiableMap), false);
        R1.e eVar = W.f10127g;
        Set set = (Set) bVar.a(eVar);
        if (set == null) {
            set = Z4.x.f8820o;
        }
        String str = this.f10122p;
        bVar2.b(eVar, Z4.B.Z(set, str));
        bVar2.b(C0645O.b(W.f10124d, str), this.f10123q);
        return bVar2.c();
    }
}
