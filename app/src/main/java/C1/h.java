package C1;

import java.util.ArrayList;
import t.T;

/* JADX INFO: loaded from: classes.dex */
public final class h implements F1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f952b;

    public /* synthetic */ h(int i7, Object obj) {
        this.f951a = i7;
        this.f952b = obj;
    }

    @Override // F1.a
    public final void c(Object obj) {
        switch (this.f951a) {
            case 0:
                i iVar = (i) obj;
                if (iVar == null) {
                    iVar = new i(-3);
                }
                ((V.o) this.f952b).z(iVar);
                return;
            default:
                i iVar2 = (i) obj;
                synchronized (j.f957c) {
                    try {
                        T t7 = j.f958d;
                        ArrayList arrayList = (ArrayList) t7.get((String) this.f952b);
                        if (arrayList == null) {
                            return;
                        }
                        t7.remove((String) this.f952b);
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            ((F1.a) arrayList.get(i7)).c(iVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
