package C1;

import I4.t;
import N2.z;
import N3.v;
import N3.w;
import a.AbstractC0509a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Handler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import t.C1450e;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Runnable {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f969o;

    /* JADX INFO: renamed from: p */
    public Object f970p;

    /* JADX INFO: renamed from: q */
    public Object f971q;

    /* JADX INFO: renamed from: r */
    public Object f972r;

    public /* synthetic */ p(int i7) {
        this.f969o = i7;
    }

    public ArrayList a() {
        W3.j jVarN = ((O3.l) this.f971q).f5642e.n();
        jVarN.getClass();
        B3.m mVarB = B3.m.b(1, "SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        String str = (String) this.f972r;
        if (str == null) {
            mVarB.h(1);
        } else {
            mVarB.i(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = jVarN.f7821a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            Cursor cursorD = android.support.v4.media.session.b.D(workDatabase_Impl, mVarB);
            try {
                int iZ = AbstractC0509a.z(cursorD, "id");
                int iZ2 = AbstractC0509a.z(cursorD, "state");
                int iZ3 = AbstractC0509a.z(cursorD, "output");
                int iZ4 = AbstractC0509a.z(cursorD, "run_attempt_count");
                C1450e c1450e = new C1450e(0);
                C1450e c1450e2 = new C1450e(0);
                while (cursorD.moveToNext()) {
                    if (!cursorD.isNull(iZ)) {
                        String string = cursorD.getString(iZ);
                        if (((ArrayList) c1450e.get(string)) == null) {
                            c1450e.put(string, new ArrayList());
                        }
                    }
                    if (!cursorD.isNull(iZ)) {
                        String string2 = cursorD.getString(iZ);
                        if (((ArrayList) c1450e2.get(string2)) == null) {
                            c1450e2.put(string2, new ArrayList());
                        }
                    }
                }
                cursorD.moveToPosition(-1);
                jVarN.b(c1450e);
                jVarN.a(c1450e2);
                ArrayList<W3.h> arrayList = new ArrayList(cursorD.getCount());
                while (cursorD.moveToNext()) {
                    ArrayList arrayList2 = !cursorD.isNull(iZ) ? (ArrayList) c1450e.get(cursorD.getString(iZ)) : null;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = cursorD.isNull(iZ) ? null : (ArrayList) c1450e2.get(cursorD.getString(iZ));
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    W3.h hVar = new W3.h();
                    hVar.f7798a = cursorD.getString(iZ);
                    hVar.f7799b = N5.l.H(cursorD.getInt(iZ2));
                    hVar.f7800c = N3.h.a(cursorD.getBlob(iZ3));
                    hVar.f7801d = cursorD.getInt(iZ4);
                    hVar.f7802e = arrayList2;
                    hVar.f7803f = arrayList3;
                    arrayList.add(hVar);
                }
                workDatabase_Impl.h();
                cursorD.close();
                mVarB.j();
                workDatabase_Impl.f();
                W3.i.f7804s.getClass();
                ArrayList arrayList4 = new ArrayList(arrayList.size());
                for (W3.h hVar2 : arrayList) {
                    ArrayList arrayList5 = hVar2.f7803f;
                    N3.h hVar3 = (arrayList5 == null || arrayList5.isEmpty()) ? N3.h.f5134b : (N3.h) hVar2.f7803f.get(0);
                    UUID uuidFromString = UUID.fromString(hVar2.f7798a);
                    v vVar = hVar2.f7799b;
                    N3.h hVar4 = hVar2.f7800c;
                    ArrayList arrayList6 = hVar2.f7802e;
                    int i7 = hVar2.f7801d;
                    w wVar = new w();
                    wVar.f5157a = uuidFromString;
                    wVar.f5158b = vVar;
                    wVar.f5159c = hVar4;
                    wVar.f5160d = new HashSet(arrayList6);
                    wVar.f5161e = hVar3;
                    wVar.f5162f = i7;
                    arrayList4.add(wVar);
                }
                return arrayList4;
            } catch (Throwable th) {
                cursorD.close();
                mVarB.j();
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase_Impl.f();
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        Object objCall;
        switch (this.f969o) {
            case 0:
                try {
                    objCall = ((g) this.f970p).call();
                    break;
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f972r).post(new t((h) this.f971q, 3, objCall));
                return;
            case 1:
                try {
                    zBooleanValue = ((Boolean) ((Y3.j) this.f972r).get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused2) {
                    zBooleanValue = true;
                }
                ((O3.b) this.f970p).a((String) this.f971q, zBooleanValue);
                return;
            case 2:
                Y3.j jVar = (Y3.j) this.f971q;
                O3.m mVar = (O3.m) this.f972r;
                try {
                    ((Y3.j) this.f970p).get();
                    N3.p pVarD = N3.p.d();
                    int i7 = O3.m.f5648G;
                    String str = mVar.f5658r.f7807c;
                    pVarD.b(new Throwable[0]);
                    Y3.j jVarF = mVar.f5659s.f();
                    mVar.f5653E = jVarF;
                    jVar.l(jVarF);
                    return;
                } catch (Throwable th) {
                    jVar.k(th);
                    return;
                }
            case 3:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f972r;
                Context context = (Context) this.f971q;
                Intent intent = (Intent) this.f970p;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    N3.p pVarD2 = N3.p.d();
                    int i8 = ConstraintProxyUpdateReceiver.f9858a;
                    pVarD2.b(new Throwable[0]);
                    X3.e.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    X3.e.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    X3.e.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    X3.e.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 4:
                W3.i iVarJ = ((WorkDatabase) this.f970p).n().j((String) this.f971q);
                if (iVarJ == null || !iVarJ.b()) {
                    return;
                }
                synchronized (((V3.a) this.f972r).f7431q) {
                    ((V3.a) this.f972r).f7434t.put((String) this.f971q, iVarJ);
                    ((V3.a) this.f972r).f7435u.add(iVarJ);
                    V3.a aVar = (V3.a) this.f972r;
                    aVar.f7436v.c(aVar.f7435u);
                    break;
                }
                return;
            case 5:
                ((O3.l) this.f970p).h.h((String) this.f971q, (z) this.f972r);
                return;
            default:
                Y3.j jVar2 = (Y3.j) this.f970p;
                try {
                    jVar2.j(a());
                    return;
                } catch (Throwable th2) {
                    jVar2.k(th2);
                    return;
                }
        }
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i7) {
        this.f969o = i7;
        this.f972r = obj;
        this.f970p = obj2;
        this.f971q = obj3;
    }

    public p(O3.l lVar, String str) {
        this.f969o = 6;
        this.f971q = lVar;
        this.f972r = str;
        this.f970p = new Y3.j();
    }

    public p(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
        this.f969o = 3;
        this.f970p = intent;
        this.f971q = context;
        this.f972r = pendingResult;
    }
}
