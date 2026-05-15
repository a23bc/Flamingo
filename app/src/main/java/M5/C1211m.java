package m5;

import k5.C1156a;
import l5.InterfaceC1182c;
import s5.InterfaceC1436a;
import s5.InterfaceC1438c;

/* JADX INFO: renamed from: m5.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1211m extends AbstractC1215q implements InterfaceC1438c, InterfaceC1182c {
    public C1211m(Class cls, String str, String str2, int i7) {
        super(C1200b.f14418o, cls, str, str2, i7);
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        j();
        throw null;
    }

    @Override // m5.AbstractC1201c
    public final InterfaceC1436a e() {
        AbstractC1221w.f14440a.getClass();
        return this;
    }

    public final void j() {
        if (this.f14434u) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC1436a interfaceC1436aI = i();
        if (interfaceC1436aI == this) {
            throw new C1156a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((C1211m) ((InterfaceC1438c) interfaceC1436aI)).j();
    }
}
