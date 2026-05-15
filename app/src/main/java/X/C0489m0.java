package X;

import java.util.Comparator;
import t.C1439A;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: renamed from: X.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0489m0 implements Comparator {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8103o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f8104p;

    public /* synthetic */ C0489m0(int i7, Object obj) {
        this.f8103o = i7;
        this.f8104p = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8103o) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                C1439A c1439a = (C1439A) this.f8104p;
                return N5.l.r(Integer.valueOf(c1439a.c(jLongValue)), Integer.valueOf(c1439a.c(((Number) obj2).longValue())));
            case 1:
                int iCompare = ((Comparator) this.f8104p).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return Q0.K.f5801h0.compare(((Y0.o) obj).f8483c, ((Y0.o) obj2).f8483c);
            case 2:
                int iCompare2 = ((C0489m0) this.f8104p).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : N5.l.r(Integer.valueOf(((Y0.o) obj).f8487g), Integer.valueOf(((Y0.o) obj2).f8487g));
            default:
                int iCompare3 = ((j6.h) this.f8104p).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : N5.l.r(((YosMediaItem) obj).getTitle(), ((YosMediaItem) obj2).getTitle());
        }
    }

    public C0489m0(Comparator comparator) {
        this.f8103o = 1;
        this.f8104p = comparator;
    }
}
