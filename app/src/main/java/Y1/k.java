package Y1;

import g.InterfaceC0935b;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k implements InterfaceC0935b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8608o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q f8609p;

    public /* synthetic */ k(q qVar, int i7) {
        this.f8608o = i7;
        this.f8609p = qVar;
    }

    @Override // g.InterfaceC0935b
    public final void d(Object obj) {
        switch (this.f8608o) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    iArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue() ? 0 : -1;
                }
                q qVar = this.f8609p;
                if (((p) qVar.f8645x.pollFirst()) != null) {
                    qVar.f8626c.F();
                    break;
                }
                break;
            case 1:
                q qVar2 = this.f8609p;
                if (((p) qVar2.f8645x.pollFirst()) != null) {
                    qVar2.f8626c.F();
                    break;
                }
                break;
            default:
                q qVar3 = this.f8609p;
                if (((p) qVar3.f8645x.pollFirst()) != null) {
                    qVar3.f8626c.F();
                    break;
                }
                break;
        }
    }
}
