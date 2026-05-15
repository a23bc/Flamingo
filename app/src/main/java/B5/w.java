package B5;

import m5.AbstractC1210l;
import w5.z0;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final w f921q = new w(2, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final w f922r = new w(2, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final w f923s = new w(2, 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f924p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i7, int i8) {
        super(i7);
        this.f924p = i8;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f924p) {
            case 0:
                c5.g gVar = (c5.g) obj2;
                if (!(gVar instanceof z0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? gVar : Integer.valueOf(iIntValue + 1);
            case 1:
                z0 z0Var = (z0) obj;
                c5.g gVar2 = (c5.g) obj2;
                if (z0Var != null) {
                    return z0Var;
                }
                if (gVar2 instanceof z0) {
                    return (z0) gVar2;
                }
                return null;
            default:
                return (y) obj;
        }
    }
}
