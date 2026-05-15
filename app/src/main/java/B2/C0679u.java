package b2;

import android.os.Bundle;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: b2.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0679u extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0679u f10330q = new C0679u(0, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10331p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0679u(int i7, int i8) {
        super(i7);
        this.f10331p = i8;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f10331p) {
            case 0:
                return new Bundle();
            default:
                int i7 = C0662h0.f10192w;
                return new C0632B();
        }
    }
}
