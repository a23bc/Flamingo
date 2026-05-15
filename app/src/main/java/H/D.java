package H;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class D implements Comparator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2780o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D4.i f2781p;

    public /* synthetic */ D(D4.i iVar, int i7) {
        this.f2780o = i7;
        this.f2781p = iVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2780o) {
            case 0:
                Object key = ((O) obj).getKey();
                D4.i iVar = this.f2781p;
                return N5.l.r(Integer.valueOf(iVar.l(key)), Integer.valueOf(iVar.l(((O) obj2).getKey())));
            case 1:
                Object key2 = ((O) obj).getKey();
                D4.i iVar2 = this.f2781p;
                return N5.l.r(Integer.valueOf(iVar2.l(key2)), Integer.valueOf(iVar2.l(((O) obj2).getKey())));
            case 2:
                Object key3 = ((O) obj2).getKey();
                D4.i iVar3 = this.f2781p;
                return N5.l.r(Integer.valueOf(iVar3.l(key3)), Integer.valueOf(iVar3.l(((O) obj).getKey())));
            default:
                Object key4 = ((O) obj2).getKey();
                D4.i iVar4 = this.f2781p;
                return N5.l.r(Integer.valueOf(iVar4.l(key4)), Integer.valueOf(iVar4.l(((O) obj).getKey())));
        }
    }
}
