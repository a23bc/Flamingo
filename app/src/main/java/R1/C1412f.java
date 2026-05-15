package r1;

import java.util.UUID;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: r1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1412f extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1412f f15680q = new C1412f(0, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1412f f15681r = new C1412f(0, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1412f f15682s = new C1412f(0, 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f15683p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1412f(int i7, int i8) {
        super(i7);
        this.f15683p = i8;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f15683p) {
        }
        return UUID.randomUUID();
    }
}
