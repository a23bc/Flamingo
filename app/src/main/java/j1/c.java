package j1;

import L2.C0247a;
import android.text.Layout;
import android.text.TextPaint;
import b1.M;
import b1.s;
import b1.w;
import c1.C0716b;
import c1.C0719e;
import f0.Z0;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class c implements s {

    /* JADX INFO: renamed from: o */
    public final String f13648o;

    /* JADX INFO: renamed from: p */
    public final M f13649p;

    /* JADX INFO: renamed from: q */
    public final List f13650q;

    /* JADX INFO: renamed from: r */
    public final List f13651r;

    /* JADX INFO: renamed from: s */
    public final f1.d f13652s;

    /* JADX INFO: renamed from: t */
    public final n1.d f13653t;

    /* JADX INFO: renamed from: u */
    public final e f13654u;

    /* JADX INFO: renamed from: v */
    public final CharSequence f13655v;

    /* JADX INFO: renamed from: w */
    public final C0719e f13656w;

    /* JADX INFO: renamed from: x */
    public A0.b f13657x;

    /* JADX INFO: renamed from: y */
    public final boolean f13658y;

    /* JADX INFO: renamed from: z */
    public final int f13659z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:469:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:750:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:780:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:841:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:853:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:867:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:875:0x086d A[LOOP:6: B:874:0x086b->B:875:0x086d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:878:0x0880  */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(java.lang.String r46, b1.M r47, java.util.List r48, java.util.List r49, f1.d r50, n1.d r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.c.<init>(java.lang.String, b1.M, java.util.List, java.util.List, f1.d, n1.d):void");
    }

    @Override // b1.s
    public final float a() {
        float f7;
        C0719e c0719e = this.f13656w;
        if (!Float.isNaN(c0719e.f10630e)) {
            return c0719e.f10630e;
        }
        TextPaint textPaint = c0719e.f10627b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = c0719e.f10626a;
        lineInstance.setText(new C0716b(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new C1.b(16));
        int i7 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Y4.h(Integer.valueOf(i7), Integer.valueOf(next)));
            } else {
                Y4.h hVar = (Y4.h) priorityQueue.peek();
                if (hVar != null && ((Number) hVar.f8727p).intValue() - ((Number) hVar.f8726o).intValue() < next - i7) {
                    priorityQueue.poll();
                    priorityQueue.add(new Y4.h(Integer.valueOf(i7), Integer.valueOf(next)));
                }
            }
            i7 = next;
        }
        if (priorityQueue.isEmpty()) {
            f7 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Y4.h hVar2 = (Y4.h) it.next();
            float desiredWidth = Layout.getDesiredWidth(c0719e.b(), ((Number) hVar2.f8726o).intValue(), ((Number) hVar2.f8727p).intValue(), textPaint);
            while (it.hasNext()) {
                Y4.h hVar3 = (Y4.h) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(c0719e.b(), ((Number) hVar3.f8726o).intValue(), ((Number) hVar3.f8727p).intValue(), textPaint));
            }
            f7 = desiredWidth;
        }
        c0719e.f10630e = f7;
        return f7;
    }

    @Override // b1.s
    public final boolean b() {
        A0.b bVar = this.f13657x;
        if (bVar != null ? bVar.c0() : false) {
            return true;
        }
        if (!this.f13658y) {
            w wVar = this.f13649p.f9949c;
            C0247a c0247a = i.f13674a;
            C0247a c0247a2 = i.f13674a;
            Z0 z0J = (Z0) c0247a2.f4105p;
            if (z0J == null) {
                if (T1.j.d()) {
                    z0J = c0247a2.j();
                    c0247a2.f4105p = z0J;
                } else {
                    z0J = j.f13675a;
                }
            }
            if (((Boolean) z0J.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // b1.s
    public final float c() {
        return this.f13656w.c();
    }
}
