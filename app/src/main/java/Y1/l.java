package Y1;

import d.AbstractC0773z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import r1.C1409c;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC0773z {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8610d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f8611e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i7, Object obj) {
        super(false);
        this.f8610d = i7;
        this.f8611e = obj;
    }

    @Override // d.AbstractC0773z
    public final void a() {
        switch (this.f8610d) {
            case 0:
                q qVar = (q) this.f8611e;
                qVar.e(true);
                if (!qVar.f8630g.f10811a) {
                    qVar.f8629f.c();
                    return;
                }
                qVar.e(false);
                qVar.d(true);
                ArrayList arrayList = qVar.f8619B;
                ArrayList arrayList2 = qVar.f8620C;
                ArrayList arrayList3 = qVar.f8627d;
                int size = (arrayList3 == null || arrayList3.isEmpty()) ? -1 : qVar.f8627d.size() - 1;
                if (size >= 0) {
                    for (int size2 = qVar.f8627d.size() - 1; size2 >= size; size2--) {
                        arrayList.add((a) qVar.f8627d.remove(size2));
                        arrayList2.add(Boolean.TRUE);
                    }
                    qVar.f8625b = true;
                    try {
                        qVar.j(qVar.f8619B, qVar.f8620C);
                    } finally {
                        qVar.a();
                    }
                }
                qVar.k();
                ((HashMap) qVar.f8626c.f7043p).values().removeAll(Collections.singleton(null));
                return;
            case 1:
                ((C1409c) this.f8611e).b(this);
                return;
            default:
                ((y3.x) this.f8611e).j();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C1409c c1409c) {
        super(true);
        this.f8610d = 1;
        this.f8611e = c1409c;
    }
}
