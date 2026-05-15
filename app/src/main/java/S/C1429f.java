package s;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: s.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1429f implements Iterable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1426c f15816o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1426c f15817p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final WeakHashMap f15818q = new WeakHashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15819r = 0;

    public C1426c a(Object obj) {
        C1426c c1426c = this.f15816o;
        while (c1426c != null && !c1426c.f15809o.equals(obj)) {
            c1426c = c1426c.f15811q;
        }
        return c1426c;
    }

    public Object b(Object obj) {
        C1426c c1426cA = a(obj);
        if (c1426cA == null) {
            return null;
        }
        this.f15819r--;
        WeakHashMap weakHashMap = this.f15818q;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC1428e) it.next()).a(c1426cA);
            }
        }
        C1426c c1426c = c1426cA.f15812r;
        if (c1426c != null) {
            c1426c.f15811q = c1426cA.f15811q;
        } else {
            this.f15816o = c1426cA.f15811q;
        }
        C1426c c1426c2 = c1426cA.f15811q;
        if (c1426c2 != null) {
            c1426c2.f15812r = c1426c;
        } else {
            this.f15817p = c1426c;
        }
        c1426cA.f15811q = null;
        c1426cA.f15812r = null;
        return c1426cA.f15810p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((s.C1425b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof s.C1429f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            s.f r7 = (s.C1429f) r7
            int r1 = r6.f15819r
            int r3 = r7.f15819r
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            s.b r3 = (s.C1425b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            s.b r4 = (s.C1425b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            s.b r7 = (s.C1425b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C1429f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C1425b c1425b = (C1425b) it;
            if (!c1425b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c1425b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1425b c1425b = new C1425b(this.f15816o, this.f15817p, 0);
        this.f15818q.put(c1425b, Boolean.FALSE);
        return c1425b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1425b c1425b = (C1425b) it;
            if (!c1425b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c1425b.next()).toString());
            if (c1425b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
