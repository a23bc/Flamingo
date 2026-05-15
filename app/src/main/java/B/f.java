package B;

import f0.InterfaceC0878b0;
import java.util.ArrayList;
import z5.InterfaceC2111f;

/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC2111f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f591o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ArrayList f592p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f593q;

    public /* synthetic */ f(ArrayList arrayList, InterfaceC0878b0 interfaceC0878b0, int i7) {
        this.f591o = i7;
        this.f592p = arrayList;
        this.f593q = interfaceC0878b0;
    }

    @Override // z5.InterfaceC2111f
    public final Object f(Object obj, c5.d dVar) {
        switch (this.f591o) {
            case 0:
                j jVar = (j) obj;
                boolean z6 = jVar instanceof d;
                ArrayList arrayList = this.f592p;
                if (z6) {
                    arrayList.add(jVar);
                } else if (jVar instanceof e) {
                    arrayList.remove(((e) jVar).f590a);
                }
                this.f593q.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                j jVar2 = (j) obj;
                boolean z7 = jVar2 instanceof m;
                ArrayList arrayList2 = this.f592p;
                if (z7) {
                    arrayList2.add(jVar2);
                } else if (jVar2 instanceof n) {
                    arrayList2.remove(((n) jVar2).f601a);
                } else if (jVar2 instanceof l) {
                    arrayList2.remove(((l) jVar2).f599a);
                }
                this.f593q.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                break;
        }
        return Y4.o.f8736a;
    }
}
