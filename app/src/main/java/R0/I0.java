package R0;

import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final I0 f6313q = new I0(0, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final I0 f6314r = new I0(0, 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f6315p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I0(int i7, int i8) {
        super(i7);
        this.f6315p = i8;
    }

    @Override // l5.InterfaceC1180a
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f6315p) {
            case 0:
                return null;
            default:
                return Boolean.FALSE;
        }
    }
}
