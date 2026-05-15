package B3;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class m implements H3.c, Closeable {

    /* JADX INFO: renamed from: w */
    public static final TreeMap f859w = new TreeMap();

    /* JADX INFO: renamed from: o */
    public volatile String f860o;

    /* JADX INFO: renamed from: p */
    public final long[] f861p;

    /* JADX INFO: renamed from: q */
    public final double[] f862q;

    /* JADX INFO: renamed from: r */
    public final String[] f863r;

    /* JADX INFO: renamed from: s */
    public final byte[][] f864s;

    /* JADX INFO: renamed from: t */
    public final int[] f865t;

    /* JADX INFO: renamed from: u */
    public final int f866u;

    /* JADX INFO: renamed from: v */
    public int f867v;

    public m(int i7) {
        this.f866u = i7;
        int i8 = i7 + 1;
        this.f865t = new int[i8];
        this.f861p = new long[i8];
        this.f862q = new double[i8];
        this.f863r = new String[i8];
        this.f864s = new byte[i8][];
    }

    public static m b(int i7, String str) {
        TreeMap treeMap = f859w;
        synchronized (treeMap) {
            try {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i7));
                if (entryCeilingEntry == null) {
                    m mVar = new m(i7);
                    mVar.f860o = str;
                    mVar.f867v = i7;
                    return mVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                m mVar2 = (m) entryCeilingEntry.getValue();
                mVar2.f860o = str;
                mVar2.f867v = i7;
                return mVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // H3.c
    public final void c(I3.b bVar) {
        for (int i7 = 1; i7 <= this.f867v; i7++) {
            int i8 = this.f865t[i7];
            if (i8 == 1) {
                bVar.g(i7);
            } else if (i8 == 2) {
                bVar.d(this.f861p[i7], i7);
            } else if (i8 == 3) {
                ((SQLiteProgram) bVar.f3474p).bindDouble(i7, this.f862q[i7]);
            } else if (i8 == 4) {
                bVar.h(i7, this.f863r[i7]);
            } else if (i8 == 5) {
                bVar.c(i7, this.f864s[i7]);
            }
        }
    }

    @Override // H3.c
    public final String d() {
        return this.f860o;
    }

    public final void g(long j3, int i7) {
        this.f865t[i7] = 2;
        this.f861p[i7] = j3;
    }

    public final void h(int i7) {
        this.f865t[i7] = 1;
    }

    public final void i(int i7, String str) {
        this.f865t[i7] = 4;
        this.f863r[i7] = str;
    }

    public final void j() {
        TreeMap treeMap = f859w;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f866u), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i7 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i7;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
