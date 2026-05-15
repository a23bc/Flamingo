package t5;

import Z4.C0508b;
import java.util.Iterator;

/* JADX INFO: renamed from: t5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1518b implements InterfaceC1524h, InterfaceC1519c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1524h f17091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17092b;

    public C1518b(InterfaceC1524h interfaceC1524h, int i7) {
        this.f17091a = interfaceC1524h;
        this.f17092b = i7;
        if (i7 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i7 + '.').toString());
    }

    @Override // t5.InterfaceC1519c
    public final InterfaceC1524h a(int i7) {
        int i8 = this.f17092b + i7;
        return i8 < 0 ? new C1518b(this, i7) : new C1518b(this.f17091a, i8);
    }

    @Override // t5.InterfaceC1524h
    public final Iterator iterator() {
        return new C0508b(this);
    }
}
