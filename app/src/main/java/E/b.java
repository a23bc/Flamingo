package e;

import java.util.UUID;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f11304q = new b(0, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f11305r = new b(0, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f11306s = new b(0, 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f11307p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, int i8) {
        super(i7);
        this.f11307p = i8;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f11307p) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                return null;
            default:
                return null;
        }
    }
}
