package t5;

import java.util.Iterator;
import l5.InterfaceC1182c;

/* JADX INFO: renamed from: t5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1522f implements InterfaceC1524h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1524h f17099a;

    /* JADX INFO: renamed from: b */
    public final boolean f17100b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1182c f17101c;

    public C1522f(InterfaceC1524h interfaceC1524h, boolean z6, InterfaceC1182c interfaceC1182c) {
        this.f17099a = interfaceC1524h;
        this.f17100b = z6;
        this.f17101c = interfaceC1182c;
    }

    @Override // t5.InterfaceC1524h
    public final Iterator iterator() {
        return new C1521e(this);
    }
}
