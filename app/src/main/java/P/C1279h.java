package p;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import k.C1116d;
import k.DialogInterfaceC1119g;

/* JADX INFO: renamed from: p.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1279h implements x, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f14802o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayoutInflater f14803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l f14804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ExpandedMenuView f14805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public w f14806s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1278g f14807t;

    public C1279h(ContextWrapper contextWrapper) {
        this.f14802o = contextWrapper;
        this.f14803p = LayoutInflater.from(contextWrapper);
    }

    @Override // p.x
    public final void b(l lVar, boolean z6) {
        w wVar = this.f14806s;
        if (wVar != null) {
            wVar.b(lVar, z6);
        }
    }

    @Override // p.x
    public final void d() {
        C1278g c1278g = this.f14807t;
        if (c1278g != null) {
            c1278g.notifyDataSetChanged();
        }
    }

    @Override // p.x
    public final boolean f(SubMenuC1271D subMenuC1271D) {
        if (!subMenuC1271D.hasVisibleItems()) {
            return false;
        }
        m mVar = new m();
        mVar.f14837o = subMenuC1271D;
        Context context = subMenuC1271D.f14815a;
        C1.k kVar = new C1.k(context);
        C1116d c1116d = (C1116d) kVar.f960p;
        C1279h c1279h = new C1279h((ContextThemeWrapper) c1116d.f13884c);
        mVar.f14839q = c1279h;
        c1279h.f14806s = mVar;
        subMenuC1271D.b(c1279h, context);
        C1279h c1279h2 = mVar.f14839q;
        if (c1279h2.f14807t == null) {
            c1279h2.f14807t = new C1278g(c1279h2);
        }
        c1116d.f13889i = c1279h2.f14807t;
        c1116d.f13890j = mVar;
        View view = subMenuC1271D.f14827o;
        if (view != null) {
            c1116d.f13888g = view;
        } else {
            c1116d.f13886e = subMenuC1271D.f14826n;
            c1116d.f13887f = subMenuC1271D.f14825m;
        }
        c1116d.h = mVar;
        DialogInterfaceC1119g dialogInterfaceC1119gB = kVar.b();
        mVar.f14838p = dialogInterfaceC1119gB;
        dialogInterfaceC1119gB.setOnDismissListener(mVar);
        WindowManager.LayoutParams attributes = mVar.f14838p.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        mVar.f14838p.show();
        w wVar = this.f14806s;
        if (wVar == null) {
            return true;
        }
        wVar.B(subMenuC1271D);
        return true;
    }

    @Override // p.x
    public final void g(Context context, l lVar) {
        if (this.f14802o != null) {
            this.f14802o = context;
            if (this.f14803p == null) {
                this.f14803p = LayoutInflater.from(context);
            }
        }
        this.f14804q = lVar;
        C1278g c1278g = this.f14807t;
        if (c1278g != null) {
            c1278g.notifyDataSetChanged();
        }
    }

    @Override // p.x
    public final boolean h(n nVar) {
        return false;
    }

    @Override // p.x
    public final boolean i() {
        return false;
    }

    @Override // p.x
    public final void j(w wVar) {
        throw null;
    }

    @Override // p.x
    public final boolean k(n nVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        this.f14804q.q(this.f14807t.getItem(i7), this, 0);
    }
}
