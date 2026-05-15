package b2;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m5.AbstractC1209k;
import yos.music.player.appwidget.layout.TwoByTwoReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f10107o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ ArrayList f10108p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(ArrayList arrayList, c5.d dVar) {
        super(2, dVar);
        this.f10108p = arrayList;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        Q q7 = new Q(this.f10108p, dVar);
        q7.f10107o = obj;
        return q7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((R1.b) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(((R1.b) this.f10107o).f6654a);
        AbstractC1209k.e(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        R1.b bVar = new R1.b(Z4.y.q0(mapUnmodifiableMap), false);
        R1.e eVar = W.f10127g;
        ArrayList<TwoByTwoReceiver> arrayList = this.f10108p;
        ArrayList arrayList2 = new ArrayList(Z4.p.j0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((TwoByTwoReceiver) it.next()).getClass().getName());
        }
        Set setO0 = Z4.n.O0(arrayList2);
        AbstractC1209k.f(eVar, "key");
        bVar.b(eVar, setO0);
        for (TwoByTwoReceiver twoByTwoReceiver : arrayList) {
            C0645O c0645o = W.f10124d;
            c0645o.getClass();
            String canonicalName = twoByTwoReceiver.getClass().getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("no receiver name");
            }
            R1.e eVarB = C0645O.b(c0645o, canonicalName);
            String canonicalName2 = twoByTwoReceiver.f20579b.getClass().getCanonicalName();
            if (canonicalName2 == null) {
                throw new IllegalArgumentException("no provider name");
            }
            bVar.b(eVarB, canonicalName2);
        }
        return bVar.c();
    }
}
