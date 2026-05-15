package B3;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import s.C1429f;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f827j = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkDatabase_Impl f830c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile I3.f f833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f834g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f831d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f832e = false;
    public final C1429f h = new C1429f();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f835i = new c(0, this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f828a = new HashMap();

    public f(WorkDatabase_Impl workDatabase_Impl, HashMap map, HashMap map2, String... strArr) {
        this.f830c = workDatabase_Impl;
        this.f834g = new d(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f829b = new String[length];
        for (int i7 = 0; i7 < length; i7++) {
            String str = strArr[i7];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f828a.put(lowerCase, Integer.valueOf(i7));
            String str2 = (String) map.get(strArr[i7]);
            if (str2 != null) {
                this.f829b[i7] = str2.toLowerCase(locale);
            } else {
                this.f829b[i7] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f828a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap map3 = this.f828a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        I3.b bVar = this.f830c.f849a;
        if (bVar != null && ((SQLiteDatabase) bVar.f3474p).isOpen()) {
            if (!this.f832e) {
                this.f830c.f851c.x();
            }
            if (this.f832e) {
                return true;
            }
        }
        return false;
    }

    public final void b(I3.b bVar, int i7) {
        bVar.j(Z1.l.o(i7, "INSERT OR IGNORE INTO room_table_modification_log VALUES(", ", 0)"));
        String str = this.f829b[i7];
        StringBuilder sb = new StringBuilder();
        String[] strArr = f827j;
        for (int i8 = 0; i8 < 3; i8++) {
            String str2 = strArr[i8];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("`");
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i7);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.j(sb.toString());
        }
    }

    public final void c(I3.b bVar) {
        if (((SQLiteDatabase) bVar.f3474p).inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock lock = this.f830c.h.readLock();
                lock.lock();
                try {
                    int[] iArrA = this.f834g.a();
                    if (iArrA == null) {
                        lock.unlock();
                        return;
                    }
                    int length = iArrA.length;
                    bVar.b();
                    for (int i7 = 0; i7 < length; i7++) {
                        try {
                            int i8 = iArrA[i7];
                            if (i8 == 1) {
                                b(bVar, i7);
                            } else if (i8 == 2) {
                                String str = this.f829b[i7];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = f827j;
                                for (int i9 = 0; i9 < 3; i9++) {
                                    String str2 = strArr[i9];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    bVar.j(sb.toString());
                                }
                            }
                        } catch (Throwable th) {
                            bVar.i();
                            throw th;
                        }
                    }
                    bVar.q();
                    bVar.i();
                    d dVar = this.f834g;
                    synchronized (dVar) {
                        dVar.f826e = false;
                    }
                    lock.unlock();
                } catch (Throwable th2) {
                    lock.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException unused) {
                return;
            }
        }
    }
}
