package B5;

import f0.Z0;
import l5.InterfaceC1180a;
import m5.AbstractC1215q;
import m5.AbstractC1221w;
import s5.InterfaceC1436a;
import s5.InterfaceC1438c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i extends AbstractC1215q implements InterfaceC1438c, InterfaceC1180a {

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ int f899v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i7, int i8, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i7);
        this.f899v = i8;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        return j();
    }

    @Override // m5.AbstractC1201c
    public final InterfaceC1436a e() {
        AbstractC1221w.f14440a.getClass();
        return this;
    }

    public final Object j() {
        switch (this.f899v) {
        }
        return ((Z0) this.f14420p).getValue();
    }
}
