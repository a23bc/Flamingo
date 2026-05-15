package Q0;

import java.util.Comparator;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements Comparator {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p0 f6062p = new p0(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6063o;

    public /* synthetic */ p0(int i7) {
        this.f6063o = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6063o) {
            case 0:
                K k7 = (K) obj;
                K k8 = (K) obj2;
                int iG = AbstractC1209k.g(k8.f5805D, k7.f5805D);
                return iG != 0 ? iG : AbstractC1209k.g(k7.hashCode(), k8.hashCode());
            default:
                K k9 = (K) obj;
                K k10 = (K) obj2;
                int iG2 = AbstractC1209k.g(k9.f5805D, k10.f5805D);
                return iG2 != 0 ? iG2 : AbstractC1209k.g(k9.hashCode(), k10.hashCode());
        }
    }
}
