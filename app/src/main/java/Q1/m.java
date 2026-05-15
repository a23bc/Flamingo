package q1;

import Q0.s0;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import f0.r;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import o0.C1247d;
import o0.InterfaceC1251h;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Context f15507p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1247d f15508q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f15509r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1251h f15510s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f15511t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ View f15512u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, C1247d c1247d, r rVar, InterfaceC1251h interfaceC1251h, int i7, View view) {
        super(0);
        this.f15507p = context;
        this.f15508q = c1247d;
        this.f15509r = rVar;
        this.f15510s = interfaceC1251h;
        this.f15511t = i7;
        this.f15512u = view;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        KeyEvent.Callback callback = this.f15512u;
        AbstractC1209k.d(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        s0 s0Var = (s0) callback;
        return new q(this.f15507p, this.f15508q, this.f15509r, this.f15510s, this.f15511t, s0Var).getLayoutNode();
    }
}
