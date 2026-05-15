package Q3;

import N3.p;
import O3.l;
import W3.i;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements O3.a {

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ int f6111r = 0;

    /* JADX INFO: renamed from: o */
    public final Context f6112o;

    /* JADX INFO: renamed from: p */
    public final HashMap f6113p = new HashMap();

    /* JADX INFO: renamed from: q */
    public final Object f6114q = new Object();

    static {
        p.i("CommandHandler");
    }

    public b(Context context) {
        this.f6112o = context;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // O3.a
    public final void a(String str, boolean z6) {
        synchronized (this.f6114q) {
            try {
                O3.a aVar = (O3.a) this.f6113p.remove(str);
                if (aVar != null) {
                    aVar.a(str, z6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        boolean z6;
        synchronized (this.f6114q) {
            z6 = !this.f6113p.isEmpty();
        }
        return z6;
    }

    public final void e(Intent intent, int i7, h hVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            p pVarD = p.d();
            String.format("Handling constraints changed %s", intent);
            pVarD.b(new Throwable[0]);
            d dVar = new d(this.f6112o, i7, hVar);
            ArrayList<i> arrayListG = hVar.f6141s.f5642e.n().g();
            int i8 = c.f6115a;
            Iterator it = arrayListG.iterator();
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            while (it.hasNext()) {
                N3.c cVar = ((i) it.next()).f7813j;
                z6 |= cVar.f5121d;
                z7 |= cVar.f5119b;
                z8 |= cVar.f5122e;
                z9 |= cVar.f5118a != 1;
                if (z6 && z7 && z8 && z9) {
                    break;
                }
            }
            int i9 = ConstraintProxyUpdateReceiver.f9858a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = dVar.f6117a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z6).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z7).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z8).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z9);
            context.sendBroadcast(intent2);
            S3.c cVar2 = dVar.f6119c;
            cVar2.c(arrayListG);
            ArrayList arrayList = new ArrayList(arrayListG.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (i iVar : arrayListG) {
                String str = iVar.f7805a;
                if (jCurrentTimeMillis >= iVar.a() && (!iVar.b() || cVar2.a(str))) {
                    arrayList.add(iVar);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Intent intentB = b(context, ((i) it2.next()).f7805a);
                int i10 = d.f6116d;
                p.d().b(new Throwable[0]);
                hVar.f(new g(hVar, intentB, dVar.f6118b, 0));
            }
            cVar2.d();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            p pVarD2 = p.d();
            String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i7));
            pVarD2.b(new Throwable[0]);
            hVar.f6141s.n0();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            p.d().c(new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            p.d().b(new Throwable[0]);
            WorkDatabase workDatabase = hVar.f6141s.f5642e;
            workDatabase.c();
            try {
                i iVarJ = workDatabase.n().j(string);
                if (iVarJ == null) {
                    p.d().j(new Throwable[0]);
                    return;
                }
                if (iVarJ.f7806b.a()) {
                    p.d().j(new Throwable[0]);
                    return;
                }
                long jA = iVarJ.a();
                boolean zB = iVarJ.b();
                Context context2 = this.f6112o;
                l lVar = hVar.f6141s;
                if (zB) {
                    p.d().b(new Throwable[0]);
                    a.b(context2, lVar, string, jA);
                    Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                    hVar.f(new g(hVar, intent3, i7, 0));
                } else {
                    p.d().b(new Throwable[0]);
                    a.b(context2, lVar, string, jA);
                }
                workDatabase.h();
                return;
            } finally {
                workDatabase.f();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle extras2 = intent.getExtras();
            synchronized (this.f6114q) {
                try {
                    String string2 = extras2.getString("KEY_WORKSPEC_ID");
                    p.d().b(new Throwable[0]);
                    if (this.f6113p.containsKey(string2)) {
                        p.d().b(new Throwable[0]);
                    } else {
                        e eVar = new e(this.f6112o, i7, string2, hVar);
                        this.f6113p.put(string2, eVar);
                        eVar.e();
                    }
                } finally {
                }
            }
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
            p.d().b(new Throwable[0]);
            l lVar2 = hVar.f6141s;
            lVar2.f5643f.Q(new X3.h(lVar2, string3, false));
            int i11 = a.f6110a;
            A0.b bVarK = hVar.f6141s.f5642e.k();
            W3.d dVarX = bVarK.X(string3);
            if (dVarX != null) {
                a.a(this.f6112o, string3, dVarX.f7792b);
                p.d().b(new Throwable[0]);
                bVarK.k0(string3);
            }
            hVar.a(string3, false);
            return;
        }
        if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
            p pVarD3 = p.d();
            String.format("Ignoring intent %s", intent);
            pVarD3.j(new Throwable[0]);
            return;
        }
        Bundle extras3 = intent.getExtras();
        String string4 = extras3.getString("KEY_WORKSPEC_ID");
        boolean z10 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
        p pVarD4 = p.d();
        String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i7));
        pVarD4.b(new Throwable[0]);
        a(string4, z10);
    }
}
