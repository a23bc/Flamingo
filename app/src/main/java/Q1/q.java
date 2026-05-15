package q1;

import Q0.s0;
import R0.AbstractC0370a;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import f0.r;
import l5.InterfaceC1182c;
import o0.C1247d;
import o0.InterfaceC1250g;
import o0.InterfaceC1251h;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractC1368i {

    /* JADX INFO: renamed from: N */
    public final View f15519N;

    /* JADX INFO: renamed from: O */
    public final J0.d f15520O;

    /* JADX INFO: renamed from: P */
    public InterfaceC1250g f15521P;

    /* JADX INFO: renamed from: Q */
    public InterfaceC1182c f15522Q;

    /* JADX INFO: renamed from: R */
    public InterfaceC1182c f15523R;

    /* JADX INFO: renamed from: S */
    public InterfaceC1182c f15524S;

    public q(Context context, C1247d c1247d, r rVar, InterfaceC1251h interfaceC1251h, int i7, s0 s0Var) {
        View view = (View) c1247d.b(context);
        J0.d dVar = new J0.d();
        super(context, rVar, i7, dVar, view, s0Var);
        this.f15519N = view;
        this.f15520O = dVar;
        setClipChildren(false);
        String strValueOf = String.valueOf(i7);
        Object objF = interfaceC1251h != null ? interfaceC1251h.f(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objF instanceof SparseArray ? (SparseArray) objF : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (interfaceC1251h != null) {
            setSavableRegistryEntry(interfaceC1251h.d(strValueOf, new C1367h(this, 2)));
        }
        C1361b c1361b = C1361b.f15452t;
        this.f15522Q = c1361b;
        this.f15523R = c1361b;
        this.f15524S = c1361b;
    }

    public static final void o(q qVar) {
        qVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(InterfaceC1250g interfaceC1250g) {
        InterfaceC1250g interfaceC1250g2 = this.f15521P;
        if (interfaceC1250g2 != null) {
            ((A0.b) interfaceC1250g2).q0();
        }
        this.f15521P = interfaceC1250g;
    }

    public final J0.d getDispatcher() {
        return this.f15520O;
    }

    public final InterfaceC1182c getReleaseBlock() {
        return this.f15524S;
    }

    public final InterfaceC1182c getResetBlock() {
        return this.f15523R;
    }

    public /* bridge */ /* synthetic */ AbstractC0370a getSubCompositionView() {
        return null;
    }

    public final InterfaceC1182c getUpdateBlock() {
        return this.f15522Q;
    }

    public final void setReleaseBlock(InterfaceC1182c interfaceC1182c) {
        this.f15524S = interfaceC1182c;
        setRelease(new C1367h(this, 3));
    }

    public final void setResetBlock(InterfaceC1182c interfaceC1182c) {
        this.f15523R = interfaceC1182c;
        setReset(new C1367h(this, 4));
    }

    public final void setUpdateBlock(InterfaceC1182c interfaceC1182c) {
        this.f15522Q = interfaceC1182c;
        setUpdate(new C1367h(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
