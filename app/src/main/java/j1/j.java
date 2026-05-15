package j1;

import android.text.TextPaint;
import b1.C0630o;
import b1.q;
import java.util.ArrayList;
import m1.l;
import y0.AbstractC1983p;
import y0.C1962L;
import y0.InterfaceC1985r;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f13675a = new k(false);

    public static final void a(C0630o c0630o, InterfaceC1985r interfaceC1985r, AbstractC1983p abstractC1983p, float f7, C1962L c1962l, l lVar, A0.d dVar) {
        ArrayList arrayList = c0630o.h;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            q qVar = (q) arrayList.get(i7);
            qVar.f9996a.g(interfaceC1985r, abstractC1983p, f7, c1962l, lVar, dVar);
            interfaceC1985r.h(0.0f, qVar.f9996a.b());
        }
    }

    public static final void b(TextPaint textPaint, float f7) {
        if (Float.isNaN(f7)) {
            return;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f7 * 255));
    }
}
