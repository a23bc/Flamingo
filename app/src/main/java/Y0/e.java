package Y0;

import java.util.Comparator;
import x0.C1893c;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Comparator {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e f8437p = new e(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e f8438q = new e(1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f8439r = new e(2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8440o;

    public /* synthetic */ e(int i7) {
        this.f8440o = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8440o) {
            case 0:
                C1893c c1893cH = ((o) obj).h();
                C1893c c1893cH2 = ((o) obj2).h();
                int iCompare = Float.compare(c1893cH.f19869a, c1893cH2.f19869a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(c1893cH.f19870b, c1893cH2.f19870b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(c1893cH.f19872d, c1893cH2.f19872d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(c1893cH.f19871c, c1893cH2.f19871c);
            case 1:
                C1893c c1893cH3 = ((o) obj).h();
                C1893c c1893cH4 = ((o) obj2).h();
                int iCompare4 = Float.compare(c1893cH4.f19871c, c1893cH3.f19871c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(c1893cH3.f19870b, c1893cH4.f19870b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(c1893cH3.f19872d, c1893cH4.f19872d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(c1893cH4.f19869a, c1893cH3.f19869a);
            default:
                Y4.h hVar = (Y4.h) obj;
                Y4.h hVar2 = (Y4.h) obj2;
                int iCompare7 = Float.compare(((C1893c) hVar.f8726o).f19870b, ((C1893c) hVar2.f8726o).f19870b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((C1893c) hVar.f8726o).f19872d, ((C1893c) hVar2.f8726o).f19872d);
        }
    }
}
