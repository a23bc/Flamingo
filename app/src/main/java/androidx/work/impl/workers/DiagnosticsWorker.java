package androidx.work.impl.workers;

import A0.b;
import B3.m;
import N3.c;
import N3.h;
import N3.n;
import N3.p;
import O3.l;
import V1.a;
import W3.d;
import W3.i;
import W3.j;
import a.AbstractC0509a;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    static {
        p.i("DiagnosticsWrkr");
    }

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String i(a aVar, a aVar2, b bVar, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            d dVarX = bVar.X(iVar.f7805a);
            Integer numValueOf = dVarX != null ? Integer.valueOf(dVarX.f7792b) : null;
            String str = iVar.f7805a;
            aVar.getClass();
            m mVarB = m.b(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                mVarB.h(1);
            } else {
                mVarB.i(1, str);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) aVar.f7389o;
            workDatabase_Impl.b();
            Cursor cursorG = workDatabase_Impl.g(mVarB);
            try {
                ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    arrayList2.add(cursorG.getString(0));
                }
                cursorG.close();
                mVarB.j();
                ArrayList arrayListE = aVar2.E(iVar.f7805a);
                String strJoin = TextUtils.join(",", arrayList2);
                String strJoin2 = TextUtils.join(",", arrayListE);
                sb.append("\n" + iVar.f7805a + "\t " + iVar.f7807c + "\t " + numValueOf + "\t " + iVar.f7806b.name() + "\t " + strJoin + "\t " + strJoin2 + "\t");
            } catch (Throwable th) {
                cursorG.close();
                mVarB.j();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final n h() throws Throwable {
        m mVar;
        int iZ;
        int iZ2;
        int iZ3;
        int iZ4;
        int iZ5;
        int iZ6;
        int iZ7;
        int iZ8;
        int iZ9;
        int iZ10;
        int iZ11;
        b bVar;
        a aVar;
        a aVar2;
        int i7;
        WorkDatabase workDatabase = l.l0(this.f9837o).f5642e;
        j jVarN = workDatabase.n();
        a aVarL = workDatabase.l();
        a aVarO = workDatabase.o();
        b bVarK = workDatabase.k();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        jVarN.getClass();
        m mVarB = m.b(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        mVarB.g(jCurrentTimeMillis, 1);
        WorkDatabase_Impl workDatabase_Impl = jVarN.f7821a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(mVarB);
        try {
            iZ = AbstractC0509a.z(cursorG, "required_network_type");
            iZ2 = AbstractC0509a.z(cursorG, "requires_charging");
            iZ3 = AbstractC0509a.z(cursorG, "requires_device_idle");
            iZ4 = AbstractC0509a.z(cursorG, "requires_battery_not_low");
            iZ5 = AbstractC0509a.z(cursorG, "requires_storage_not_low");
            iZ6 = AbstractC0509a.z(cursorG, "trigger_content_update_delay");
            iZ7 = AbstractC0509a.z(cursorG, "trigger_max_content_delay");
            iZ8 = AbstractC0509a.z(cursorG, "content_uri_triggers");
            iZ9 = AbstractC0509a.z(cursorG, "id");
            iZ10 = AbstractC0509a.z(cursorG, "state");
            iZ11 = AbstractC0509a.z(cursorG, "worker_class_name");
            mVar = mVarB;
        } catch (Throwable th) {
            th = th;
            mVar = mVarB;
        }
        try {
            int iZ12 = AbstractC0509a.z(cursorG, "input_merger_class_name");
            int iZ13 = AbstractC0509a.z(cursorG, "input");
            int iZ14 = AbstractC0509a.z(cursorG, "output");
            int iZ15 = AbstractC0509a.z(cursorG, "initial_delay");
            int iZ16 = AbstractC0509a.z(cursorG, "interval_duration");
            int iZ17 = AbstractC0509a.z(cursorG, "flex_duration");
            int iZ18 = AbstractC0509a.z(cursorG, "run_attempt_count");
            int iZ19 = AbstractC0509a.z(cursorG, "backoff_policy");
            int iZ20 = AbstractC0509a.z(cursorG, "backoff_delay_duration");
            int iZ21 = AbstractC0509a.z(cursorG, "period_start_time");
            int iZ22 = AbstractC0509a.z(cursorG, "minimum_retention_duration");
            int iZ23 = AbstractC0509a.z(cursorG, "schedule_requested_at");
            int iZ24 = AbstractC0509a.z(cursorG, "run_in_foreground");
            int iZ25 = AbstractC0509a.z(cursorG, "out_of_quota_policy");
            int i8 = iZ14;
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                String string = cursorG.getString(iZ9);
                int i9 = iZ9;
                String string2 = cursorG.getString(iZ11);
                int i10 = iZ11;
                c cVar = new c();
                int i11 = iZ;
                cVar.f5118a = N5.l.F(cursorG.getInt(iZ));
                cVar.f5119b = cursorG.getInt(iZ2) != 0;
                cVar.f5120c = cursorG.getInt(iZ3) != 0;
                cVar.f5121d = cursorG.getInt(iZ4) != 0;
                cVar.f5122e = cursorG.getInt(iZ5) != 0;
                int i12 = iZ2;
                int i13 = iZ3;
                cVar.f5123f = cursorG.getLong(iZ6);
                cVar.f5124g = cursorG.getLong(iZ7);
                cVar.h = N5.l.n(cursorG.getBlob(iZ8));
                i iVar = new i(string, string2);
                iVar.f7806b = N5.l.H(cursorG.getInt(iZ10));
                iVar.f7808d = cursorG.getString(iZ12);
                iVar.f7809e = h.a(cursorG.getBlob(iZ13));
                int i14 = i8;
                iVar.f7810f = h.a(cursorG.getBlob(i14));
                int i15 = iZ10;
                int i16 = iZ15;
                int i17 = iZ13;
                iVar.f7811g = cursorG.getLong(i16);
                int i18 = iZ12;
                int i19 = iZ16;
                iVar.h = cursorG.getLong(i19);
                int i20 = iZ17;
                iVar.f7812i = cursorG.getLong(i20);
                int i21 = iZ18;
                iVar.f7814k = cursorG.getInt(i21);
                int i22 = iZ19;
                iVar.l = N5.l.E(cursorG.getInt(i22));
                int i23 = iZ20;
                iVar.f7815m = cursorG.getLong(i23);
                int i24 = iZ21;
                iVar.f7816n = cursorG.getLong(i24);
                int i25 = iZ22;
                iVar.f7817o = cursorG.getLong(i25);
                int i26 = iZ23;
                iVar.f7818p = cursorG.getLong(i26);
                int i27 = iZ24;
                iVar.f7819q = cursorG.getInt(i27) != 0;
                int i28 = iZ25;
                iVar.f7820r = N5.l.G(cursorG.getInt(i28));
                iVar.f7813j = cVar;
                arrayList.add(iVar);
                iZ22 = i25;
                iZ12 = i18;
                iZ17 = i20;
                iZ18 = i21;
                iZ19 = i22;
                i8 = i14;
                iZ13 = i17;
                iZ2 = i12;
                iZ16 = i19;
                iZ20 = i23;
                iZ21 = i24;
                iZ24 = i27;
                iZ11 = i10;
                iZ25 = i28;
                iZ23 = i26;
                iZ15 = i16;
                iZ10 = i15;
                iZ9 = i9;
                iZ3 = i13;
                iZ = i11;
            }
            cursorG.close();
            mVar.j();
            ArrayList arrayListF = jVarN.f();
            ArrayList arrayListD = jVarN.d();
            if (arrayList.isEmpty()) {
                bVar = bVarK;
                aVar = aVarL;
                aVar2 = aVarO;
                i7 = 0;
            } else {
                i7 = 0;
                p.d().h(new Throwable[0]);
                p pVarD = p.d();
                bVar = bVarK;
                aVar = aVarL;
                aVar2 = aVarO;
                i(aVar, aVar2, bVar, arrayList);
                pVarD.h(new Throwable[0]);
            }
            if (!arrayListF.isEmpty()) {
                p.d().h(new Throwable[i7]);
                p pVarD2 = p.d();
                i(aVar, aVar2, bVar, arrayListF);
                pVarD2.h(new Throwable[i7]);
            }
            if (!arrayListD.isEmpty()) {
                p.d().h(new Throwable[i7]);
                p pVarD3 = p.d();
                i(aVar, aVar2, bVar, arrayListD);
                pVarD3.h(new Throwable[i7]);
            }
            return new n(h.f5134b);
        } catch (Throwable th2) {
            th = th2;
            cursorG.close();
            mVar.j();
            throw th;
        }
    }
}
