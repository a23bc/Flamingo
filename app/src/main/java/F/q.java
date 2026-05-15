package F;

import O0.l0;
import f0.InterfaceC0878b0;
import java.util.ArrayList;
import java.util.List;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2110o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f2111p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2112q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2113r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f2114s;

    public /* synthetic */ q(InterfaceC0878b0 interfaceC0878b0, ArrayList arrayList, List list, boolean z6, int i7) {
        this.f2110o = i7;
        this.f2111p = interfaceC0878b0;
        this.f2112q = arrayList;
        this.f2113r = list;
        this.f2114s = z6;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        l0 l0Var = (l0) obj;
        switch (this.f2110o) {
            case 0:
                ArrayList arrayList = this.f2112q;
                ?? r12 = this.f2113r;
                l0Var.f5412o = true;
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    boolean z6 = this.f2114s;
                    if (i7 >= size) {
                        int size2 = r12.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            ((s) r12.get(i8)).a(l0Var, z6);
                        }
                        l0Var.f5412o = false;
                        this.f2111p.getValue();
                    } else {
                        ((s) arrayList.get(i7)).a(l0Var, z6);
                        i7++;
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList2 = this.f2112q;
                ?? r13 = this.f2113r;
                l0Var.f5412o = true;
                int size3 = arrayList2.size();
                int i9 = 0;
                while (true) {
                    boolean z7 = this.f2114s;
                    if (i9 >= size3) {
                        int size4 = r13.size();
                        for (int i10 = 0; i10 < size4; i10++) {
                            ((G.o) r13.get(i10)).a(l0Var, z7);
                        }
                        l0Var.f5412o = false;
                        this.f2111p.getValue();
                    } else {
                        ((G.o) arrayList2.get(i9)).a(l0Var, z7);
                        i9++;
                    }
                    break;
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
