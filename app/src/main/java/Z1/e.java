package Z1;

import h2.AbstractC0997a;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e f8756q = new e(2, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f8757r = new e(2, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f8758s = new e(2, 2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e f8759t = new e(2, 3);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final e f8760u = new e(2, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e f8761v = new e(2, 5);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f8762p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i7, int i8) {
        super(i7);
        this.f8762p = i8;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8762p) {
            case 0:
                String str = (String) obj;
                n nVar = (n) obj2;
                if (str.length() == 0) {
                    return nVar.toString();
                }
                return str + ", " + nVar;
            case 1:
                ((j) obj).f8777b = (r) obj2;
                return Y4.o.f8736a;
            case 2:
                ((j) obj).f8776a = (o) obj2;
                return Y4.o.f8736a;
            case 3:
                ((j) obj).f8778c = ((g2.j) obj2).f12437a;
                return Y4.o.f8736a;
            case 4:
                j jVar = (j) obj;
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                jVar.getClass();
                return Y4.o.f8736a;
            default:
                n nVar2 = (n) obj2;
                return nVar2 instanceof AbstractC0997a ? nVar2 : obj;
        }
    }
}
