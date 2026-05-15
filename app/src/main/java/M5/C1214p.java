package m5;

import k5.C1156a;
import s5.InterfaceC1436a;
import s5.InterfaceC1438c;

/* JADX INFO: renamed from: m5.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1214p extends AbstractC1215q implements InterfaceC1438c, l5.e {
    @Override // m5.AbstractC1201c
    public final InterfaceC1436a e() {
        AbstractC1221w.f14440a.getClass();
        return this;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        j();
        throw null;
    }

    public final void j() {
        if (this.f14434u) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        InterfaceC1436a interfaceC1436aI = i();
        if (interfaceC1436aI == this) {
            throw new C1156a("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((C1214p) ((InterfaceC1438c) interfaceC1436aI)).j();
    }
}
