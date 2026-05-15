package W3;

import B3.m;
import N3.v;
import N5.l;
import a.AbstractC0509a;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import o5.AbstractC1267a;
import t.C1446a;
import t.C1447b;
import t.C1450e;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a */
    public final WorkDatabase_Impl f7821a;

    /* JADX INFO: renamed from: b */
    public final b f7822b;

    /* JADX INFO: renamed from: c */
    public final e f7823c;

    /* JADX INFO: renamed from: d */
    public final e f7824d;

    /* JADX INFO: renamed from: e */
    public final e f7825e;

    /* JADX INFO: renamed from: f */
    public final e f7826f;

    /* JADX INFO: renamed from: g */
    public final e f7827g;
    public final e h;

    /* JADX INFO: renamed from: i */
    public final e f7828i;

    public j(WorkDatabase_Impl workDatabase_Impl) {
        this.f7821a = workDatabase_Impl;
        this.f7822b = new b(workDatabase_Impl, 4);
        this.f7823c = new e(workDatabase_Impl, 3);
        this.f7824d = new e(workDatabase_Impl, 4);
        this.f7825e = new e(workDatabase_Impl, 5);
        this.f7826f = new e(workDatabase_Impl, 6);
        this.f7827g = new e(workDatabase_Impl, 7);
        this.h = new e(workDatabase_Impl, 8);
        this.f7828i = new e(workDatabase_Impl, 9);
        new AtomicBoolean(false);
    }

    public final void a(C1450e c1450e) {
        ArrayList arrayList;
        C1447b c1447b = (C1447b) c1450e.keySet();
        C1450e c1450e2 = c1447b.f16056o;
        if (c1450e2.isEmpty()) {
            return;
        }
        if (c1450e.f16036q > 999) {
            C1450e c1450e3 = new C1450e(999);
            int i7 = c1450e.f16036q;
            int i8 = 0;
            int i9 = 0;
            while (i8 < i7) {
                c1450e3.put((String) c1450e.f(i8), (ArrayList) c1450e.i(i8));
                i8++;
                i9++;
                if (i9 == 999) {
                    a(c1450e3);
                    c1450e3 = new C1450e(999);
                    i9 = 0;
                }
            }
            if (i9 > 0) {
                a(c1450e3);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int i10 = c1450e2.f16036q;
        AbstractC1267a.k(i10, sb);
        sb.append(")");
        m mVarB = m.b(i10, sb.toString());
        Iterator it = c1447b.iterator();
        int i11 = 1;
        while (true) {
            C1446a c1446a = (C1446a) it;
            if (!c1446a.hasNext()) {
                break;
            }
            String str = (String) c1446a.next();
            if (str == null) {
                mVarB.h(i11);
            } else {
                mVarB.i(i11, str);
            }
            i11++;
        }
        Cursor cursorG = this.f7821a.g(mVarB);
        try {
            int columnIndex = cursorG.getColumnIndex("work_spec_id");
            if (columnIndex < 0) {
                columnIndex = cursorG.getColumnIndex("`work_spec_id`");
            }
            if (columnIndex == -1) {
                return;
            }
            while (cursorG.moveToNext()) {
                if (!cursorG.isNull(columnIndex) && (arrayList = (ArrayList) c1450e.get(cursorG.getString(columnIndex))) != null) {
                    arrayList.add(N3.h.a(cursorG.getBlob(0)));
                }
            }
        } finally {
            cursorG.close();
        }
    }

    public final void b(C1450e c1450e) {
        ArrayList arrayList;
        C1447b c1447b = (C1447b) c1450e.keySet();
        C1450e c1450e2 = c1447b.f16056o;
        if (c1450e2.isEmpty()) {
            return;
        }
        if (c1450e.f16036q > 999) {
            C1450e c1450e3 = new C1450e(999);
            int i7 = c1450e.f16036q;
            int i8 = 0;
            int i9 = 0;
            while (i8 < i7) {
                c1450e3.put((String) c1450e.f(i8), (ArrayList) c1450e.i(i8));
                i8++;
                i9++;
                if (i9 == 999) {
                    b(c1450e3);
                    c1450e3 = new C1450e(999);
                    i9 = 0;
                }
            }
            if (i9 > 0) {
                b(c1450e3);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int i10 = c1450e2.f16036q;
        AbstractC1267a.k(i10, sb);
        sb.append(")");
        m mVarB = m.b(i10, sb.toString());
        Iterator it = c1447b.iterator();
        int i11 = 1;
        while (true) {
            C1446a c1446a = (C1446a) it;
            if (!c1446a.hasNext()) {
                break;
            }
            String str = (String) c1446a.next();
            if (str == null) {
                mVarB.h(i11);
            } else {
                mVarB.i(i11, str);
            }
            i11++;
        }
        Cursor cursorG = this.f7821a.g(mVarB);
        try {
            int columnIndex = cursorG.getColumnIndex("work_spec_id");
            if (columnIndex < 0) {
                columnIndex = cursorG.getColumnIndex("`work_spec_id`");
            }
            if (columnIndex == -1) {
                return;
            }
            while (cursorG.moveToNext()) {
                if (!cursorG.isNull(columnIndex) && (arrayList = (ArrayList) c1450e.get(cursorG.getString(columnIndex))) != null) {
                    arrayList.add(cursorG.getString(0));
                }
            }
        } finally {
            cursorG.close();
        }
    }

    public final void c(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f7821a;
        workDatabase_Impl.b();
        e eVar = this.f7823c;
        I3.f fVarA = eVar.a();
        if (str == null) {
            fVarA.g(1);
        } else {
            fVarA.h(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.r();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public final ArrayList d() throws Throwable {
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
        int iZ12;
        int iZ13;
        m mVarB = m.b(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        mVarB.g(200, 1);
        WorkDatabase_Impl workDatabase_Impl = this.f7821a;
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
            iZ12 = AbstractC0509a.z(cursorG, "input_merger_class_name");
            iZ13 = AbstractC0509a.z(cursorG, "input");
            mVar = mVarB;
        } catch (Throwable th) {
            th = th;
            mVar = mVarB;
        }
        try {
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
            int i7 = iZ14;
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                String string = cursorG.getString(iZ9);
                int i8 = iZ9;
                String string2 = cursorG.getString(iZ11);
                int i9 = iZ11;
                N3.c cVar = new N3.c();
                int i10 = iZ;
                cVar.f5118a = l.F(cursorG.getInt(iZ));
                cVar.f5119b = cursorG.getInt(iZ2) != 0;
                cVar.f5120c = cursorG.getInt(iZ3) != 0;
                cVar.f5121d = cursorG.getInt(iZ4) != 0;
                cVar.f5122e = cursorG.getInt(iZ5) != 0;
                int i11 = iZ2;
                int i12 = iZ3;
                cVar.f5123f = cursorG.getLong(iZ6);
                cVar.f5124g = cursorG.getLong(iZ7);
                cVar.h = l.n(cursorG.getBlob(iZ8));
                i iVar = new i(string, string2);
                iVar.f7806b = l.H(cursorG.getInt(iZ10));
                iVar.f7808d = cursorG.getString(iZ12);
                iVar.f7809e = N3.h.a(cursorG.getBlob(iZ13));
                int i13 = i7;
                iVar.f7810f = N3.h.a(cursorG.getBlob(i13));
                int i14 = iZ13;
                int i15 = iZ15;
                iVar.f7811g = cursorG.getLong(i15);
                i7 = i13;
                int i16 = iZ16;
                iVar.h = cursorG.getLong(i16);
                int i17 = iZ4;
                int i18 = iZ17;
                iVar.f7812i = cursorG.getLong(i18);
                int i19 = iZ18;
                iVar.f7814k = cursorG.getInt(i19);
                int i20 = iZ19;
                iVar.l = l.E(cursorG.getInt(i20));
                iZ17 = i18;
                int i21 = iZ20;
                iVar.f7815m = cursorG.getLong(i21);
                int i22 = iZ21;
                iVar.f7816n = cursorG.getLong(i22);
                iZ21 = i22;
                int i23 = iZ22;
                iVar.f7817o = cursorG.getLong(i23);
                int i24 = iZ23;
                iVar.f7818p = cursorG.getLong(i24);
                int i25 = iZ24;
                iVar.f7819q = cursorG.getInt(i25) != 0;
                int i26 = iZ25;
                iVar.f7820r = l.G(cursorG.getInt(i26));
                iVar.f7813j = cVar;
                arrayList.add(iVar);
                iZ20 = i21;
                iZ4 = i17;
                iZ19 = i20;
                iZ25 = i26;
                iZ2 = i11;
                iZ15 = i15;
                iZ16 = i16;
                iZ18 = i19;
                iZ23 = i24;
                iZ11 = i9;
                iZ = i10;
                iZ24 = i25;
                iZ22 = i23;
                iZ13 = i14;
                iZ9 = i8;
                iZ3 = i12;
            }
            cursorG.close();
            mVar.j();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorG.close();
            mVar.j();
            throw th;
        }
    }

    public final ArrayList e(int i7) throws Throwable {
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
        int iZ12;
        int iZ13;
        m mVarB = m.b(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        mVarB.g(i7, 1);
        WorkDatabase_Impl workDatabase_Impl = this.f7821a;
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
            iZ12 = AbstractC0509a.z(cursorG, "input_merger_class_name");
            iZ13 = AbstractC0509a.z(cursorG, "input");
            mVar = mVarB;
        } catch (Throwable th) {
            th = th;
            mVar = mVarB;
        }
        try {
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
                N3.c cVar = new N3.c();
                int i11 = iZ;
                cVar.f5118a = l.F(cursorG.getInt(iZ));
                cVar.f5119b = cursorG.getInt(iZ2) != 0;
                cVar.f5120c = cursorG.getInt(iZ3) != 0;
                cVar.f5121d = cursorG.getInt(iZ4) != 0;
                cVar.f5122e = cursorG.getInt(iZ5) != 0;
                int i12 = iZ2;
                int i13 = iZ3;
                cVar.f5123f = cursorG.getLong(iZ6);
                cVar.f5124g = cursorG.getLong(iZ7);
                cVar.h = l.n(cursorG.getBlob(iZ8));
                i iVar = new i(string, string2);
                iVar.f7806b = l.H(cursorG.getInt(iZ10));
                iVar.f7808d = cursorG.getString(iZ12);
                iVar.f7809e = N3.h.a(cursorG.getBlob(iZ13));
                int i14 = i8;
                iVar.f7810f = N3.h.a(cursorG.getBlob(i14));
                int i15 = iZ15;
                int i16 = iZ13;
                iVar.f7811g = cursorG.getLong(i15);
                i8 = i14;
                int i17 = iZ16;
                iVar.h = cursorG.getLong(i17);
                int i18 = iZ4;
                int i19 = iZ17;
                iVar.f7812i = cursorG.getLong(i19);
                int i20 = iZ18;
                iVar.f7814k = cursorG.getInt(i20);
                int i21 = iZ19;
                iVar.l = l.E(cursorG.getInt(i21));
                iZ17 = i19;
                int i22 = iZ20;
                iVar.f7815m = cursorG.getLong(i22);
                int i23 = iZ21;
                iVar.f7816n = cursorG.getLong(i23);
                iZ21 = i23;
                int i24 = iZ22;
                iVar.f7817o = cursorG.getLong(i24);
                int i25 = iZ23;
                iVar.f7818p = cursorG.getLong(i25);
                int i26 = iZ24;
                iVar.f7819q = cursorG.getInt(i26) != 0;
                int i27 = iZ25;
                iVar.f7820r = l.G(cursorG.getInt(i27));
                iVar.f7813j = cVar;
                arrayList.add(iVar);
                iZ20 = i22;
                iZ4 = i18;
                iZ19 = i21;
                iZ25 = i27;
                iZ2 = i12;
                iZ23 = i25;
                iZ9 = i9;
                iZ11 = i10;
                iZ = i11;
                iZ24 = i26;
                iZ13 = i16;
                iZ15 = i15;
                iZ16 = i17;
                iZ18 = i20;
                iZ22 = i24;
                iZ3 = i13;
            }
            cursorG.close();
            mVar.j();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorG.close();
            mVar.j();
            throw th;
        }
    }

    public final ArrayList f() throws Throwable {
        m mVar;
        m mVarB = m.b(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = this.f7821a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(mVarB);
        try {
            int iZ = AbstractC0509a.z(cursorG, "required_network_type");
            int iZ2 = AbstractC0509a.z(cursorG, "requires_charging");
            int iZ3 = AbstractC0509a.z(cursorG, "requires_device_idle");
            int iZ4 = AbstractC0509a.z(cursorG, "requires_battery_not_low");
            int iZ5 = AbstractC0509a.z(cursorG, "requires_storage_not_low");
            int iZ6 = AbstractC0509a.z(cursorG, "trigger_content_update_delay");
            int iZ7 = AbstractC0509a.z(cursorG, "trigger_max_content_delay");
            int iZ8 = AbstractC0509a.z(cursorG, "content_uri_triggers");
            int iZ9 = AbstractC0509a.z(cursorG, "id");
            int iZ10 = AbstractC0509a.z(cursorG, "state");
            int iZ11 = AbstractC0509a.z(cursorG, "worker_class_name");
            int iZ12 = AbstractC0509a.z(cursorG, "input_merger_class_name");
            int iZ13 = AbstractC0509a.z(cursorG, "input");
            mVar = mVarB;
            try {
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
                int i7 = iZ14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iZ9);
                    int i8 = iZ9;
                    String string2 = cursorG.getString(iZ11);
                    int i9 = iZ11;
                    N3.c cVar = new N3.c();
                    int i10 = iZ;
                    cVar.f5118a = l.F(cursorG.getInt(iZ));
                    cVar.f5119b = cursorG.getInt(iZ2) != 0;
                    cVar.f5120c = cursorG.getInt(iZ3) != 0;
                    cVar.f5121d = cursorG.getInt(iZ4) != 0;
                    cVar.f5122e = cursorG.getInt(iZ5) != 0;
                    int i11 = iZ2;
                    int i12 = iZ3;
                    cVar.f5123f = cursorG.getLong(iZ6);
                    cVar.f5124g = cursorG.getLong(iZ7);
                    cVar.h = l.n(cursorG.getBlob(iZ8));
                    i iVar = new i(string, string2);
                    iVar.f7806b = l.H(cursorG.getInt(iZ10));
                    iVar.f7808d = cursorG.getString(iZ12);
                    iVar.f7809e = N3.h.a(cursorG.getBlob(iZ13));
                    int i13 = i7;
                    iVar.f7810f = N3.h.a(cursorG.getBlob(i13));
                    int i14 = iZ13;
                    int i15 = iZ15;
                    iVar.f7811g = cursorG.getLong(i15);
                    i7 = i13;
                    int i16 = iZ16;
                    iVar.h = cursorG.getLong(i16);
                    int i17 = iZ4;
                    int i18 = iZ17;
                    iVar.f7812i = cursorG.getLong(i18);
                    int i19 = iZ18;
                    iVar.f7814k = cursorG.getInt(i19);
                    int i20 = iZ19;
                    iVar.l = l.E(cursorG.getInt(i20));
                    iZ17 = i18;
                    int i21 = iZ20;
                    iVar.f7815m = cursorG.getLong(i21);
                    int i22 = iZ21;
                    iVar.f7816n = cursorG.getLong(i22);
                    iZ21 = i22;
                    int i23 = iZ22;
                    iVar.f7817o = cursorG.getLong(i23);
                    int i24 = iZ23;
                    iVar.f7818p = cursorG.getLong(i24);
                    int i25 = iZ24;
                    iVar.f7819q = cursorG.getInt(i25) != 0;
                    int i26 = iZ25;
                    iVar.f7820r = l.G(cursorG.getInt(i26));
                    iVar.f7813j = cVar;
                    arrayList.add(iVar);
                    iZ20 = i21;
                    iZ4 = i17;
                    iZ19 = i20;
                    iZ25 = i26;
                    iZ2 = i11;
                    iZ15 = i15;
                    iZ16 = i16;
                    iZ18 = i19;
                    iZ23 = i24;
                    iZ11 = i9;
                    iZ = i10;
                    iZ24 = i25;
                    iZ22 = i23;
                    iZ13 = i14;
                    iZ9 = i8;
                    iZ3 = i12;
                }
                cursorG.close();
                mVar.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                mVar.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = mVarB;
        }
    }

    public final ArrayList g() {
        m mVar;
        m mVarB = m.b(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = this.f7821a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(mVarB);
        try {
            int iZ = AbstractC0509a.z(cursorG, "required_network_type");
            int iZ2 = AbstractC0509a.z(cursorG, "requires_charging");
            int iZ3 = AbstractC0509a.z(cursorG, "requires_device_idle");
            int iZ4 = AbstractC0509a.z(cursorG, "requires_battery_not_low");
            int iZ5 = AbstractC0509a.z(cursorG, "requires_storage_not_low");
            int iZ6 = AbstractC0509a.z(cursorG, "trigger_content_update_delay");
            int iZ7 = AbstractC0509a.z(cursorG, "trigger_max_content_delay");
            int iZ8 = AbstractC0509a.z(cursorG, "content_uri_triggers");
            int iZ9 = AbstractC0509a.z(cursorG, "id");
            int iZ10 = AbstractC0509a.z(cursorG, "state");
            int iZ11 = AbstractC0509a.z(cursorG, "worker_class_name");
            int iZ12 = AbstractC0509a.z(cursorG, "input_merger_class_name");
            int iZ13 = AbstractC0509a.z(cursorG, "input");
            mVar = mVarB;
            try {
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
                int i7 = iZ14;
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    String string = cursorG.getString(iZ9);
                    int i8 = iZ9;
                    String string2 = cursorG.getString(iZ11);
                    int i9 = iZ11;
                    N3.c cVar = new N3.c();
                    int i10 = iZ;
                    cVar.f5118a = l.F(cursorG.getInt(iZ));
                    cVar.f5119b = cursorG.getInt(iZ2) != 0;
                    cVar.f5120c = cursorG.getInt(iZ3) != 0;
                    cVar.f5121d = cursorG.getInt(iZ4) != 0;
                    cVar.f5122e = cursorG.getInt(iZ5) != 0;
                    int i11 = iZ2;
                    int i12 = iZ3;
                    cVar.f5123f = cursorG.getLong(iZ6);
                    cVar.f5124g = cursorG.getLong(iZ7);
                    cVar.h = l.n(cursorG.getBlob(iZ8));
                    i iVar = new i(string, string2);
                    iVar.f7806b = l.H(cursorG.getInt(iZ10));
                    iVar.f7808d = cursorG.getString(iZ12);
                    iVar.f7809e = N3.h.a(cursorG.getBlob(iZ13));
                    int i13 = i7;
                    iVar.f7810f = N3.h.a(cursorG.getBlob(i13));
                    int i14 = iZ13;
                    int i15 = iZ15;
                    iVar.f7811g = cursorG.getLong(i15);
                    i7 = i13;
                    int i16 = iZ16;
                    iVar.h = cursorG.getLong(i16);
                    int i17 = iZ4;
                    int i18 = iZ17;
                    iVar.f7812i = cursorG.getLong(i18);
                    int i19 = iZ18;
                    iVar.f7814k = cursorG.getInt(i19);
                    int i20 = iZ19;
                    iVar.l = l.E(cursorG.getInt(i20));
                    iZ17 = i18;
                    int i21 = iZ20;
                    iVar.f7815m = cursorG.getLong(i21);
                    int i22 = iZ21;
                    iVar.f7816n = cursorG.getLong(i22);
                    iZ21 = i22;
                    int i23 = iZ22;
                    iVar.f7817o = cursorG.getLong(i23);
                    int i24 = iZ23;
                    iVar.f7818p = cursorG.getLong(i24);
                    int i25 = iZ24;
                    iVar.f7819q = cursorG.getInt(i25) != 0;
                    int i26 = iZ25;
                    iVar.f7820r = l.G(cursorG.getInt(i26));
                    iVar.f7813j = cVar;
                    arrayList.add(iVar);
                    iZ20 = i21;
                    iZ4 = i17;
                    iZ19 = i20;
                    iZ25 = i26;
                    iZ2 = i11;
                    iZ15 = i15;
                    iZ16 = i16;
                    iZ18 = i19;
                    iZ23 = i24;
                    iZ11 = i9;
                    iZ = i10;
                    iZ24 = i25;
                    iZ22 = i23;
                    iZ13 = i14;
                    iZ9 = i8;
                    iZ3 = i12;
                }
                cursorG.close();
                mVar.j();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                mVar.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = mVarB;
        }
    }

    public final v h(String str) {
        m mVarB = m.b(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            mVarB.h(1);
        } else {
            mVarB.i(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f7821a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(mVarB);
        try {
            return cursorG.moveToFirst() ? l.H(cursorG.getInt(0)) : null;
        } finally {
            cursorG.close();
            mVarB.j();
        }
    }

    public final ArrayList i(String str) {
        m mVarB = m.b(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            mVarB.h(1);
        } else {
            mVarB.i(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f7821a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(mVarB);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            return arrayList;
        } finally {
            cursorG.close();
            mVarB.j();
        }
    }

    public final i j(String str) {
        m mVar;
        i iVar;
        m mVarB = m.b(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str == null) {
            mVarB.h(1);
        } else {
            mVarB.i(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f7821a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(mVarB);
        try {
            int iZ = AbstractC0509a.z(cursorG, "required_network_type");
            int iZ2 = AbstractC0509a.z(cursorG, "requires_charging");
            int iZ3 = AbstractC0509a.z(cursorG, "requires_device_idle");
            int iZ4 = AbstractC0509a.z(cursorG, "requires_battery_not_low");
            int iZ5 = AbstractC0509a.z(cursorG, "requires_storage_not_low");
            int iZ6 = AbstractC0509a.z(cursorG, "trigger_content_update_delay");
            int iZ7 = AbstractC0509a.z(cursorG, "trigger_max_content_delay");
            int iZ8 = AbstractC0509a.z(cursorG, "content_uri_triggers");
            int iZ9 = AbstractC0509a.z(cursorG, "id");
            int iZ10 = AbstractC0509a.z(cursorG, "state");
            int iZ11 = AbstractC0509a.z(cursorG, "worker_class_name");
            int iZ12 = AbstractC0509a.z(cursorG, "input_merger_class_name");
            int iZ13 = AbstractC0509a.z(cursorG, "input");
            mVar = mVarB;
            try {
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
                if (cursorG.moveToFirst()) {
                    String string = cursorG.getString(iZ9);
                    String string2 = cursorG.getString(iZ11);
                    N3.c cVar = new N3.c();
                    cVar.f5118a = l.F(cursorG.getInt(iZ));
                    cVar.f5119b = cursorG.getInt(iZ2) != 0;
                    cVar.f5120c = cursorG.getInt(iZ3) != 0;
                    cVar.f5121d = cursorG.getInt(iZ4) != 0;
                    cVar.f5122e = cursorG.getInt(iZ5) != 0;
                    cVar.f5123f = cursorG.getLong(iZ6);
                    cVar.f5124g = cursorG.getLong(iZ7);
                    cVar.h = l.n(cursorG.getBlob(iZ8));
                    iVar = new i(string, string2);
                    iVar.f7806b = l.H(cursorG.getInt(iZ10));
                    iVar.f7808d = cursorG.getString(iZ12);
                    iVar.f7809e = N3.h.a(cursorG.getBlob(iZ13));
                    iVar.f7810f = N3.h.a(cursorG.getBlob(iZ14));
                    iVar.f7811g = cursorG.getLong(iZ15);
                    iVar.h = cursorG.getLong(iZ16);
                    iVar.f7812i = cursorG.getLong(iZ17);
                    iVar.f7814k = cursorG.getInt(iZ18);
                    iVar.l = l.E(cursorG.getInt(iZ19));
                    iVar.f7815m = cursorG.getLong(iZ20);
                    iVar.f7816n = cursorG.getLong(iZ21);
                    iVar.f7817o = cursorG.getLong(iZ22);
                    iVar.f7818p = cursorG.getLong(iZ23);
                    iVar.f7819q = cursorG.getInt(iZ24) != 0;
                    iVar.f7820r = l.G(cursorG.getInt(iZ25));
                    iVar.f7813j = cVar;
                } else {
                    iVar = null;
                }
                cursorG.close();
                mVar.j();
                return iVar;
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                mVar.j();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = mVarB;
        }
    }

    public final ArrayList k(String str) {
        m mVarB = m.b(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            mVarB.h(1);
        } else {
            mVarB.i(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = this.f7821a;
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(mVarB);
        try {
            int iZ = AbstractC0509a.z(cursorG, "id");
            int iZ2 = AbstractC0509a.z(cursorG, "state");
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                g gVar = new g();
                gVar.f7796a = cursorG.getString(iZ);
                gVar.f7797b = l.H(cursorG.getInt(iZ2));
                arrayList.add(gVar);
            }
            return arrayList;
        } finally {
            cursorG.close();
            mVarB.j();
        }
    }

    public final void l(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f7821a;
        workDatabase_Impl.b();
        e eVar = this.f7826f;
        I3.f fVarA = eVar.a();
        if (str == null) {
            fVarA.g(1);
        } else {
            fVarA.h(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.f3487r.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public final void m(String str, long j3) {
        WorkDatabase_Impl workDatabase_Impl = this.f7821a;
        workDatabase_Impl.b();
        e eVar = this.h;
        I3.f fVarA = eVar.a();
        fVarA.d(j3, 1);
        if (str == null) {
            fVarA.g(2);
        } else {
            fVarA.h(2, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.f3487r.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public final void n(String str) {
        WorkDatabase_Impl workDatabase_Impl = this.f7821a;
        workDatabase_Impl.b();
        e eVar = this.f7827g;
        I3.f fVarA = eVar.a();
        if (str == null) {
            fVarA.g(1);
        } else {
            fVarA.h(1, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.f3487r.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public final void o(String str, N3.h hVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = this.f7821a;
        workDatabase_Impl.b();
        e eVar = this.f7824d;
        I3.f fVarA = eVar.a();
        byte[] bArrB = N3.h.b(hVar);
        if (bArrB == null) {
            fVarA.g(1);
        } else {
            fVarA.c(1, bArrB);
        }
        if (str == null) {
            fVarA.g(2);
        } else {
            fVarA.h(2, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.r();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public final void p(String str, long j3) {
        WorkDatabase_Impl workDatabase_Impl = this.f7821a;
        workDatabase_Impl.b();
        e eVar = this.f7825e;
        I3.f fVarA = eVar.a();
        fVarA.d(j3, 1);
        if (str == null) {
            fVarA.g(2);
        } else {
            fVarA.h(2, str);
        }
        workDatabase_Impl.c();
        try {
            fVarA.r();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
            eVar.c(fVarA);
        }
    }

    public final void q(v vVar, String... strArr) {
        WorkDatabase_Impl workDatabase_Impl = this.f7821a;
        workDatabase_Impl.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=? WHERE id IN (");
        AbstractC1267a.k(strArr.length, sb);
        sb.append(")");
        String string = sb.toString();
        workDatabase_Impl.a();
        workDatabase_Impl.b();
        SQLiteStatement sQLiteStatementCompileStatement = ((SQLiteDatabase) workDatabase_Impl.f851c.x().f3474p).compileStatement(string);
        sQLiteStatementCompileStatement.bindLong(1, l.S(vVar));
        int i7 = 2;
        for (String str : strArr) {
            if (str == null) {
                sQLiteStatementCompileStatement.bindNull(i7);
            } else {
                sQLiteStatementCompileStatement.bindString(i7, str);
            }
            i7++;
        }
        workDatabase_Impl.c();
        try {
            sQLiteStatementCompileStatement.executeUpdateDelete();
            workDatabase_Impl.h();
        } finally {
            workDatabase_Impl.f();
        }
    }
}
