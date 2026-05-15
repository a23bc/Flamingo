package R0;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import t.AbstractC1457l;

/* JADX INFO: loaded from: classes.dex */
public final class I implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f6312a = new I();

    public final boolean onClearTranslation(View view) {
        InterfaceC1180a interfaceC1180a;
        AbstractC1209k.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        t0.c contentCaptureManager$ui_release = ((C0415x) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f16149t = t0.a.f16134o;
        AbstractC1457l abstractC1457lF = contentCaptureManager$ui_release.f();
        Object[] objArr = abstractC1457lF.f16085c;
        long[] jArr = abstractC1457lF.f16083a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j3 = jArr[i7];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j3) < 128) {
                        Y0.j jVar = ((Y0.p) objArr[(i7 << 3) + i9]).f8488a.f8484d;
                        Y0.w wVar = Y0.t.f8517C;
                        t.J j7 = jVar.f8473o;
                        Object objG = j7.g(wVar);
                        if (objG == null) {
                            objG = null;
                        }
                        if (objG != null) {
                            Object objG2 = j7.g(Y0.i.f8459m);
                            Y0.a aVar = (Y0.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (interfaceC1180a = (InterfaceC1180a) aVar.f8431b) != null) {
                            }
                        }
                    }
                    j3 >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }

    public final boolean onHideTranslation(View view) {
        InterfaceC1182c interfaceC1182c;
        AbstractC1209k.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        t0.c contentCaptureManager$ui_release = ((C0415x) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f16149t = t0.a.f16134o;
        AbstractC1457l abstractC1457lF = contentCaptureManager$ui_release.f();
        Object[] objArr = abstractC1457lF.f16085c;
        long[] jArr = abstractC1457lF.f16083a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j3 = jArr[i7];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j3) < 128) {
                        Y0.j jVar = ((Y0.p) objArr[(i7 << 3) + i9]).f8488a.f8484d;
                        Y0.w wVar = Y0.t.f8517C;
                        t.J j7 = jVar.f8473o;
                        Object objG = j7.g(wVar);
                        if (objG == null) {
                            objG = null;
                        }
                        if (AbstractC1209k.a(objG, Boolean.TRUE)) {
                            Object objG2 = j7.g(Y0.i.l);
                            Y0.a aVar = (Y0.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (interfaceC1182c = (InterfaceC1182c) aVar.f8431b) != null) {
                            }
                        }
                    }
                    j3 >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }

    public final boolean onShowTranslation(View view) {
        InterfaceC1182c interfaceC1182c;
        AbstractC1209k.d(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        t0.c contentCaptureManager$ui_release = ((C0415x) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f16149t = t0.a.f16135p;
        AbstractC1457l abstractC1457lF = contentCaptureManager$ui_release.f();
        Object[] objArr = abstractC1457lF.f16085c;
        long[] jArr = abstractC1457lF.f16083a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j3 = jArr[i7];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j3) < 128) {
                        Y0.j jVar = ((Y0.p) objArr[(i7 << 3) + i9]).f8488a.f8484d;
                        Y0.w wVar = Y0.t.f8517C;
                        t.J j7 = jVar.f8473o;
                        Object objG = j7.g(wVar);
                        if (objG == null) {
                            objG = null;
                        }
                        if (AbstractC1209k.a(objG, Boolean.FALSE)) {
                            Object objG2 = j7.g(Y0.i.l);
                            Y0.a aVar = (Y0.a) (objG2 != null ? objG2 : null);
                            if (aVar != null && (interfaceC1182c = (InterfaceC1182c) aVar.f8431b) != null) {
                            }
                        }
                    }
                    j3 >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
