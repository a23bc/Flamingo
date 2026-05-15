package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p.k;
import p.l;
import p.n;
import p.z;
import q.S0;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements k, z, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: p */
    public static final int[] f8952p = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: o */
    public l f8953o;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        S0 s0K = S0.k(context, attributeSet, f8952p, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) s0K.f15226q;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(s0K.g(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(s0K.g(1));
        }
        s0K.l();
    }

    @Override // p.z
    public final void a(l lVar) {
        this.f8953o = lVar;
    }

    @Override // p.k
    public final boolean b(n nVar) {
        return this.f8953o.q(nVar, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        b((n) getAdapter().getItem(i7));
    }
}
