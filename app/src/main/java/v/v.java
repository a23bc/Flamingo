package V;

import L2.C0247a;
import M.E0;
import M.N;
import M.Z;
import R0.S0;
import X.K0;
import a.AbstractC0509a;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import b1.C0612H;
import b1.C0622g;
import b1.L;
import g1.C0959a;
import g1.C0963e;
import g1.C0964f;
import g1.C0967i;
import g1.C0977s;
import g1.C0978t;
import g1.C0979u;
import g1.C0980v;
import g1.InterfaceC0965g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import y0.AbstractC1959I;

/* JADX INFO: loaded from: classes.dex */
public final class v implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final C0247a f7379a;

    /* JADX INFO: renamed from: b */
    public final boolean f7380b;

    /* JADX INFO: renamed from: c */
    public final Z f7381c;

    /* JADX INFO: renamed from: d */
    public final K0 f7382d;

    /* JADX INFO: renamed from: e */
    public final S0 f7383e;

    /* JADX INFO: renamed from: f */
    public int f7384f;

    /* JADX INFO: renamed from: g */
    public C0980v f7385g;
    public int h;

    /* JADX INFO: renamed from: i */
    public boolean f7386i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f7387j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public boolean f7388k = true;

    public v(C0980v c0980v, C0247a c0247a, boolean z6, Z z7, K0 k02, S0 s02) {
        this.f7379a = c0247a;
        this.f7380b = z6;
        this.f7381c = z7;
        this.f7382d = k02;
        this.f7383e = s02;
        this.f7385g = c0980v;
    }

    public final void a(InterfaceC0965g interfaceC0965g) {
        this.f7384f++;
        try {
            this.f7387j.add(interfaceC0965g);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i7 = this.f7384f - 1;
        this.f7384f = i7;
        if (i7 == 0) {
            ArrayList arrayList = this.f7387j;
            if (!arrayList.isEmpty()) {
                ((u) this.f7379a.f4105p).f7370c.b(Z4.n.L0(arrayList));
                arrayList.clear();
            }
        }
        return this.f7384f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z6 = this.f7388k;
        if (!z6) {
            return z6;
        }
        this.f7384f++;
        return true;
    }

    public final void c(int i7) {
        sendKeyEvent(new KeyEvent(0, i7));
        sendKeyEvent(new KeyEvent(1, i7));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i7) {
        boolean z6 = this.f7388k;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f7387j.clear();
        this.f7384f = 0;
        this.f7388k = false;
        u uVar = (u) this.f7379a.f4105p;
        int size = uVar.f7376j.size();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList arrayList = uVar.f7376j;
            if (AbstractC1209k.a(((WeakReference) arrayList.get(i7)).get(), this)) {
                arrayList.remove(i7);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z6 = this.f7388k;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        boolean z6 = this.f7388k;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z6 = this.f7388k;
        return z6 ? this.f7380b : z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i7) {
        boolean z6 = this.f7388k;
        if (z6) {
            a(new C0959a(String.valueOf(charSequence), i7));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        boolean z6 = this.f7388k;
        if (!z6) {
            return z6;
        }
        a(new C0963e(i7, i8));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        boolean z6 = this.f7388k;
        if (!z6) {
            return z6;
        }
        a(new C0964f(i7, i8));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z6 = this.f7388k;
        if (!z6) {
            return z6;
        }
        a(new C0967i());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i7) {
        C0980v c0980v = this.f7385g;
        return TextUtils.getCapsMode(c0980v.f12384a.f9970p, L.f(c0980v.f12385b), i7);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        boolean z6 = (i7 & 1) != 0;
        this.f7386i = z6;
        if (z6) {
            this.h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC1267a.j(this.f7385g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i7) {
        if (L.c(this.f7385g.f12385b)) {
            return null;
        }
        return N5.d.H(this.f7385g).f9970p;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i7, int i8) {
        return N5.d.I(this.f7385g, i7).f9970p;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i7, int i8) {
        return N5.d.J(this.f7385g, i7).f9970p;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i7) {
        boolean z6 = this.f7388k;
        if (z6) {
            z6 = false;
            switch (i7) {
                case R.id.selectAll:
                    a(new C0979u(0, this.f7385g.f12384a.f9970p.length()));
                    break;
                case R.id.cut:
                    c(277);
                    return false;
                case R.id.copy:
                    c(278);
                    return false;
                case R.id.paste:
                    c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x000a  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean performEditorAction(int r4) {
        /*
            r3 = this;
            boolean r0 = r3.f7388k
            if (r0 == 0) goto L27
            r0 = 1
            if (r4 == 0) goto La
            switch(r4) {
                case 2: goto L16;
                case 3: goto L14;
                case 4: goto L12;
                case 5: goto L10;
                case 6: goto Le;
                case 7: goto Lc;
                default: goto La;
            }
        La:
            r4 = r0
            goto L17
        Lc:
            r4 = 5
            goto L17
        Le:
            r4 = 7
            goto L17
        L10:
            r4 = 6
            goto L17
        L12:
            r4 = 4
            goto L17
        L14:
            r4 = 3
            goto L17
        L16:
            r4 = 2
        L17:
            L2.a r1 = r3.f7379a
            java.lang.Object r1 = r1.f4105p
            V.u r1 = (V.u) r1
            l5.c r1 = r1.f7371d
            g1.j r2 = new g1.j
            r2.<init>(r4)
            r1.b(r2)
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V.v.performEditorAction(int):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x001f  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [long] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void performHandwritingGesture(android.view.inputmethod.HandwritingGesture r20, java.util.concurrent.Executor r21, java.util.function.IntConsumer r22) {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V.v.performHandwritingGesture(android.view.inputmethod.HandwritingGesture, java.util.concurrent.Executor, java.util.function.IntConsumer):void");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z6 = this.f7388k;
        if (z6) {
            return true;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Z z6;
        C0622g c0622g;
        C0612H c0612h;
        if (Build.VERSION.SDK_INT >= 34 && (z6 = this.f7381c) != null && (c0622g = z6.f4505j) != null) {
            E0 e0D = z6.d();
            if (c0622g.equals((e0D == null || (c0612h = e0D.f4386a.f9929a) == null) ? null : c0612h.f9920a)) {
                boolean zS = R.t.s(previewableHandwritingGesture);
                K0 k02 = this.f7382d;
                if (zS) {
                    SelectGesture selectGestureM = R.t.m(previewableHandwritingGesture);
                    if (k02 != null) {
                        long jF = AbstractC0509a.F(z6, AbstractC1959I.A(selectGestureM.getSelectionArea()), selectGestureM.getGranularity() != 1 ? 0 : 1);
                        Z z7 = k02.f7942d;
                        if (z7 != null) {
                            z7.f(jF);
                        }
                        Z z8 = k02.f7942d;
                        if (z8 != null) {
                            z8.e(L.f9943b);
                        }
                        if (!L.c(jF)) {
                            k02.s(false);
                            k02.p(N.f4425o);
                        }
                    }
                } else if (l.p(previewableHandwritingGesture)) {
                    DeleteGesture deleteGestureH = l.h(previewableHandwritingGesture);
                    if (k02 != null) {
                        long jF2 = AbstractC0509a.F(z6, AbstractC1959I.A(deleteGestureH.getDeletionArea()), deleteGestureH.getGranularity() != 1 ? 0 : 1);
                        Z z9 = k02.f7942d;
                        if (z9 != null) {
                            z9.e(jF2);
                        }
                        Z z10 = k02.f7942d;
                        if (z10 != null) {
                            z10.f(L.f9943b);
                        }
                        if (!L.c(jF2)) {
                            k02.s(false);
                            k02.p(N.f4425o);
                        }
                    }
                } else if (l.u(previewableHandwritingGesture)) {
                    SelectRangeGesture selectRangeGestureK = l.k(previewableHandwritingGesture);
                    if (k02 != null) {
                        long jI = AbstractC0509a.i(z6, AbstractC1959I.A(selectRangeGestureK.getSelectionStartArea()), AbstractC1959I.A(selectRangeGestureK.getSelectionEndArea()), selectRangeGestureK.getGranularity() != 1 ? 0 : 1);
                        Z z11 = k02.f7942d;
                        if (z11 != null) {
                            z11.f(jI);
                        }
                        Z z12 = k02.f7942d;
                        if (z12 != null) {
                            z12.e(L.f9943b);
                        }
                        if (!L.c(jI)) {
                            k02.s(false);
                            k02.p(N.f4425o);
                        }
                    }
                } else if (l.v(previewableHandwritingGesture)) {
                    DeleteRangeGesture deleteRangeGestureI = l.i(previewableHandwritingGesture);
                    if (k02 != null) {
                        long jI2 = AbstractC0509a.i(z6, AbstractC1959I.A(deleteRangeGestureI.getDeletionStartArea()), AbstractC1959I.A(deleteRangeGestureI.getDeletionEndArea()), deleteRangeGestureI.getGranularity() != 1 ? 0 : 1);
                        Z z13 = k02.f7942d;
                        if (z13 != null) {
                            z13.e(jI2);
                        }
                        Z z14 = k02.f7942d;
                        if (z14 != null) {
                            z14.f(L.f9943b);
                        }
                        if (!L.c(jI2)) {
                            k02.s(false);
                            k02.p(N.f4425o);
                        }
                    }
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new m(0, k02));
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z6) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i7) {
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9 = this.f7388k;
        if (!z9) {
            return z9;
        }
        boolean z10 = false;
        boolean z11 = (i7 & 1) != 0;
        boolean z12 = (i7 & 2) != 0;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33) {
            z6 = (i7 & 16) != 0;
            z7 = (i7 & 8) != 0;
            boolean z13 = (i7 & 4) != 0;
            if (i8 >= 34 && (i7 & 32) != 0) {
                z10 = true;
            }
            if (z6 || z7 || z13 || z10) {
                z8 = z10;
                z10 = z13;
            } else if (i8 >= 34) {
                z8 = true;
                z10 = true;
                z6 = true;
                z7 = true;
            } else {
                z6 = true;
                z7 = true;
                z8 = z10;
                z10 = true;
            }
        } else {
            z6 = true;
            z7 = true;
            z8 = false;
        }
        r rVar = ((u) this.f7379a.f4105p).f7378m;
        synchronized (rVar.f7353c) {
            try {
                rVar.f7356f = z6;
                rVar.f7357g = z7;
                rVar.h = z10;
                rVar.f7358i = z8;
                if (z11) {
                    rVar.f7355e = true;
                    if (rVar.f7359j != null) {
                        rVar.a();
                    }
                }
                rVar.f7354d = z12;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Y4.e, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z6 = this.f7388k;
        if (!z6) {
            return z6;
        }
        ((BaseInputConnection) ((u) this.f7379a.f4105p).f7377k.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i7, int i8) {
        boolean z6 = this.f7388k;
        if (z6) {
            a(new C0977s(i7, i8));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i7) {
        boolean z6 = this.f7388k;
        if (z6) {
            a(new C0978t(String.valueOf(charSequence), i7));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i7, int i8) {
        boolean z6 = this.f7388k;
        if (!z6) {
            return z6;
        }
        a(new C0979u(i7, i8));
        return true;
    }
}
