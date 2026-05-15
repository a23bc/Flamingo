package w5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: w5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1781e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19526b = AtomicIntegerFieldUpdater.newUpdater(C1781e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1770G[] f19527a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public C1781e(InterfaceC1770G[] interfaceC1770GArr) {
        this.f19527a = interfaceC1770GArr;
        this.notCompletedCount$volatile = interfaceC1770GArr.length;
    }
}
