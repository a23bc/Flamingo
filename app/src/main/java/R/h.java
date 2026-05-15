package R;

import A2.d0;
import android.view.ActionMode;
import android.view.View;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import w5.AbstractC1767D;
import x.C1868o0;
import x.C1872q0;
import x.EnumC1862l0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements T.f {

    /* JADX INFO: renamed from: a */
    public final View f6178a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1182c f6179b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1180a f6180c;

    /* JADX INFO: renamed from: d */
    public final C1872q0 f6181d = new C1872q0();

    /* JADX INFO: renamed from: e */
    public final p0.u f6182e = new p0.u(new a(this, 0));

    /* JADX INFO: renamed from: f */
    public final a f6183f = new a(this, 1);

    /* JADX INFO: renamed from: g */
    public final a f6184g = new a(this, 2);
    public ActionMode h;

    /* JADX INFO: renamed from: i */
    public d0 f6185i;

    public h(View view, InterfaceC1182c interfaceC1182c, InterfaceC1180a interfaceC1180a) {
        this.f6178a = view;
        this.f6179b = interfaceC1182c;
        this.f6180c = interfaceC1180a;
    }

    @Override // T.f
    public final Object a(T.e eVar, AbstractC0871i abstractC0871i) {
        g gVar = new g(this, eVar, null, 0);
        EnumC1862l0 enumC1862l0 = EnumC1862l0.f19772o;
        C1872q0 c1872q0 = this.f6181d;
        c1872q0.getClass();
        Object objH = AbstractC1767D.h(new C1868o0(c1872q0, gVar, null), abstractC0871i);
        return objH == EnumC0830a.f11264o ? objH : Y4.o.f8736a;
    }
}
