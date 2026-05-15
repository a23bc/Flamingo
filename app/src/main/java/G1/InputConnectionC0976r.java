package g1;

import L2.C0247a;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import b1.L;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: g1.r */
/* JADX INFO: loaded from: classes.dex */
public final class InputConnectionC0976r implements InputConnection {

    /* JADX INFO: renamed from: a */
    public final C0247a f12371a;

    /* JADX INFO: renamed from: b */
    public final boolean f12372b;

    /* JADX INFO: renamed from: c */
    public int f12373c;

    /* JADX INFO: renamed from: d */
    public C0980v f12374d;

    /* JADX INFO: renamed from: e */
    public int f12375e;

    /* JADX INFO: renamed from: f */
    public boolean f12376f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f12377g = new ArrayList();
    public boolean h = true;

    public InputConnectionC0976r(C0980v c0980v, C0247a c0247a, boolean z6) {
        this.f12371a = c0247a;
        this.f12372b = z6;
        this.f12374d = c0980v;
    }

    public final void a(InterfaceC0965g interfaceC0965g) {
        this.f12373c++;
        try {
            this.f12377g.add(interfaceC0965g);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i7 = this.f12373c - 1;
        this.f12373c = i7;
        if (i7 == 0) {
            ArrayList arrayList = this.f12377g;
            if (!arrayList.isEmpty()) {
                ((C0983y) this.f12371a.f4105p).f12398e.b(Z4.n.L0(arrayList));
                arrayList.clear();
            }
        }
        return this.f12373c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z6 = this.h;
        if (!z6) {
            return z6;
        }
        this.f12373c++;
        return true;
    }

    public final void c(int i7) {
        sendKeyEvent(new KeyEvent(0, i7));
        sendKeyEvent(new KeyEvent(1, i7));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i7) {
        boolean z6 = this.h;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f12377g.clear();
        this.f12373c = 0;
        this.h = false;
        C0983y c0983y = (C0983y) this.f12371a.f4105p;
        int size = c0983y.f12401i.size();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList arrayList = c0983y.f12401i;
            if (AbstractC1209k.a(((WeakReference) arrayList.get(i7)).get(), this)) {
                arrayList.remove(i7);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z6 = this.h;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        boolean z6 = this.h;
        if (z6) {
            return false;
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z6 = this.h;
        return z6 ? this.f12372b : z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i7) {
        boolean z6 = this.h;
        if (z6) {
            a(new C0959a(String.valueOf(charSequence), i7));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        boolean z6 = this.h;
        if (!z6) {
            return z6;
        }
        a(new C0963e(i7, i8));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        boolean z6 = this.h;
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
        boolean z6 = this.h;
        if (!z6) {
            return z6;
        }
        a(new C0967i());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i7) {
        C0980v c0980v = this.f12374d;
        return TextUtils.getCapsMode(c0980v.f12384a.f9970p, L.f(c0980v.f12385b), i7);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        boolean z6 = (i7 & 1) != 0;
        this.f12376f = z6;
        if (z6) {
            this.f12375e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return I0.c.U(this.f12374d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i7) {
        if (L.c(this.f12374d.f12385b)) {
            return null;
        }
        return N5.d.H(this.f12374d).f9970p;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i7, int i8) {
        return N5.d.I(this.f12374d, i7).f9970p;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i7, int i8) {
        return N5.d.J(this.f12374d, i7).f9970p;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i7) {
        boolean z6 = this.h;
        if (z6) {
            z6 = false;
            switch (i7) {
                case R.id.selectAll:
                    a(new C0979u(0, this.f12374d.f12384a.f9970p.length()));
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
            boolean r0 = r3.h
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
            L2.a r1 = r3.f12371a
            java.lang.Object r1 = r1.f4105p
            g1.y r1 = (g1.C0983y) r1
            l5.c r1 = r1.f12399f
            g1.j r2 = new g1.j
            r2.<init>(r4)
            r1.b(r2)
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.InputConnectionC0976r.performEditorAction(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z6 = this.h;
        if (z6) {
            return true;
        }
        return z6;
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
        boolean z9 = this.h;
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
        C0961c c0961c = ((C0983y) this.f12371a.f4105p).l;
        synchronized (c0961c.f12336c) {
            try {
                c0961c.f12339f = z6;
                c0961c.f12340g = z7;
                c0961c.h = z10;
                c0961c.f12341i = z8;
                if (z11) {
                    c0961c.f12338e = true;
                    if (c0961c.f12342j != null) {
                        c0961c.a();
                    }
                }
                c0961c.f12337d = z12;
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [Y4.e, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z6 = this.h;
        if (!z6) {
            return z6;
        }
        ((BaseInputConnection) ((C0983y) this.f12371a.f4105p).f12402j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i7, int i8) {
        boolean z6 = this.h;
        if (z6) {
            a(new C0977s(i7, i8));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i7) {
        boolean z6 = this.h;
        if (z6) {
            a(new C0978t(String.valueOf(charSequence), i7));
        }
        return z6;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i7, int i8) {
        boolean z6 = this.h;
        if (!z6) {
            return z6;
        }
        a(new C0979u(i7, i8));
        return true;
    }
}
