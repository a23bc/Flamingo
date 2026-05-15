package L2;

import A2.F;
import A2.W;
import D.A0;
import D2.B;
import E4.I;
import N2.C0293j;
import N2.G;
import Q0.AbstractC0347f;
import Q0.B0;
import Q0.K;
import a.AbstractC0509a;
import android.app.Notification;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.Surface;
import android.widget.EditText;
import android.widget.TextView;
import b1.M;
import com.tencent.mmkv.MMKV;
import d.C0746L;
import f0.AbstractC0918w;
import f0.C0879c;
import f0.C0894j0;
import f0.Z0;
import h4.C1003b;
import h4.C1004c;
import j5.AbstractC1109c;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import t2.C1480i;
import t2.N;
import w2.AbstractC1697a;
import w3.C1751t0;
import w3.InterfaceC1728h0;
import w3.InterfaceC1730i0;
import w5.AbstractC1767D;
import w5.EnumC1766C;
import w5.InterfaceC1765B;
import w5.w0;
import yos.music.player.R;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: renamed from: L2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0247a implements z, M4.o, InterfaceC1730i0 {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f4104o;

    /* JADX INFO: renamed from: p */
    public Object f4105p;

    public /* synthetic */ C0247a(int i7, Object obj) {
        this.f4104o = i7;
        this.f4105p = obj;
    }

    public static void g(I3.b bVar) {
        bVar.j("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.j("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        bVar.j("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        bVar.j("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        bVar.j("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        bVar.j("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        bVar.j("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.j("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        bVar.j("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.j("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.j("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        bVar.j("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.j("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        bVar.j("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.j("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static B3.l n(I3.b bVar) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new D3.a(1, 1, "work_spec_id", "TEXT", null, true));
        map.put("prerequisite_id", new D3.a(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new D3.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new D3.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new D3.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
        hashSet2.add(new D3.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
        D3.e eVar = new D3.e("Dependency", map, hashSet, hashSet2);
        D3.e eVarA = D3.e.a(bVar, "Dependency");
        if (!eVar.equals(eVarA)) {
            return new B3.l("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + eVarA, false);
        }
        HashMap map2 = new HashMap(25);
        map2.put("id", new D3.a(1, 1, "id", "TEXT", null, true));
        map2.put("state", new D3.a(0, 1, "state", "INTEGER", null, true));
        map2.put("worker_class_name", new D3.a(0, 1, "worker_class_name", "TEXT", null, true));
        map2.put("input_merger_class_name", new D3.a(0, 1, "input_merger_class_name", "TEXT", null, false));
        map2.put("input", new D3.a(0, 1, "input", "BLOB", null, true));
        map2.put("output", new D3.a(0, 1, "output", "BLOB", null, true));
        map2.put("initial_delay", new D3.a(0, 1, "initial_delay", "INTEGER", null, true));
        map2.put("interval_duration", new D3.a(0, 1, "interval_duration", "INTEGER", null, true));
        map2.put("flex_duration", new D3.a(0, 1, "flex_duration", "INTEGER", null, true));
        map2.put("run_attempt_count", new D3.a(0, 1, "run_attempt_count", "INTEGER", null, true));
        map2.put("backoff_policy", new D3.a(0, 1, "backoff_policy", "INTEGER", null, true));
        map2.put("backoff_delay_duration", new D3.a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        map2.put("period_start_time", new D3.a(0, 1, "period_start_time", "INTEGER", null, true));
        map2.put("minimum_retention_duration", new D3.a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        map2.put("schedule_requested_at", new D3.a(0, 1, "schedule_requested_at", "INTEGER", null, true));
        map2.put("run_in_foreground", new D3.a(0, 1, "run_in_foreground", "INTEGER", null, true));
        map2.put("out_of_quota_policy", new D3.a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        map2.put("required_network_type", new D3.a(0, 1, "required_network_type", "INTEGER", null, false));
        map2.put("requires_charging", new D3.a(0, 1, "requires_charging", "INTEGER", null, true));
        map2.put("requires_device_idle", new D3.a(0, 1, "requires_device_idle", "INTEGER", null, true));
        map2.put("requires_battery_not_low", new D3.a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        map2.put("requires_storage_not_low", new D3.a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        map2.put("trigger_content_update_delay", new D3.a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        map2.put("trigger_max_content_delay", new D3.a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        map2.put("content_uri_triggers", new D3.a(0, 1, "content_uri_triggers", "BLOB", null, false));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new D3.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
        hashSet4.add(new D3.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
        D3.e eVar2 = new D3.e("WorkSpec", map2, hashSet3, hashSet4);
        D3.e eVarA2 = D3.e.a(bVar, "WorkSpec");
        if (!eVar2.equals(eVarA2)) {
            return new B3.l("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + eVarA2, false);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new D3.a(1, 1, "tag", "TEXT", null, true));
        map3.put("work_spec_id", new D3.a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new D3.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new D3.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
        D3.e eVar3 = new D3.e("WorkTag", map3, hashSet5, hashSet6);
        D3.e eVarA3 = D3.e.a(bVar, "WorkTag");
        if (!eVar3.equals(eVarA3)) {
            return new B3.l("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + eVarA3, false);
        }
        HashMap map4 = new HashMap(2);
        map4.put("work_spec_id", new D3.a(1, 1, "work_spec_id", "TEXT", null, true));
        map4.put("system_id", new D3.a(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new D3.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        D3.e eVar4 = new D3.e("SystemIdInfo", map4, hashSet7, new HashSet(0));
        D3.e eVarA4 = D3.e.a(bVar, "SystemIdInfo");
        if (!eVar4.equals(eVarA4)) {
            return new B3.l("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + eVarA4, false);
        }
        HashMap map5 = new HashMap(2);
        map5.put("name", new D3.a(1, 1, "name", "TEXT", null, true));
        map5.put("work_spec_id", new D3.a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new D3.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new D3.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
        D3.e eVar5 = new D3.e("WorkName", map5, hashSet8, hashSet9);
        D3.e eVarA5 = D3.e.a(bVar, "WorkName");
        if (!eVar5.equals(eVarA5)) {
            return new B3.l("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + eVarA5, false);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new D3.a(1, 1, "work_spec_id", "TEXT", null, true));
        map6.put("progress", new D3.a(0, 1, "progress", "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new D3.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        D3.e eVar6 = new D3.e("WorkProgress", map6, hashSet10, new HashSet(0));
        D3.e eVarA6 = D3.e.a(bVar, "WorkProgress");
        if (!eVar6.equals(eVarA6)) {
            return new B3.l("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + eVarA6, false);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new D3.a(1, 1, "key", "TEXT", null, true));
        map7.put("long_value", new D3.a(0, 1, "long_value", "INTEGER", null, false));
        D3.e eVar7 = new D3.e("Preference", map7, new HashSet(0), new HashSet(0));
        D3.e eVarA7 = D3.e.a(bVar, "Preference");
        if (eVar7.equals(eVarA7)) {
            return new B3.l(null, true);
        }
        return new B3.l("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + eVarA7, false);
    }

    @Override // M4.o
    public Object F() {
        switch (this.f4104o) {
            case 3:
                Class cls = (Class) this.f4105p;
                try {
                    return M4.t.f4825a.a(cls);
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e7);
                }
            default:
                Constructor constructor = (Constructor) this.f4105p;
                try {
                    return constructor.newInstance(new Object[0]);
                } catch (IllegalAccessException e8) {
                    AbstractC0509a abstractC0509a = P4.c.f5763a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e8);
                } catch (InstantiationException e9) {
                    throw new RuntimeException("Failed to invoke constructor '" + P4.c.b(constructor) + "' with no args", e9);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException("Failed to invoke constructor '" + P4.c.b(constructor) + "' with no args", e10.getCause());
                }
        }
    }

    @Override // w3.InterfaceC1730i0
    public C1.k a(C1751t0 c1751t0, I i7, C1.k kVar, InterfaceC1728h0 interfaceC1728h0) {
        AbstractC1209k.f(c1751t0, "mediaSession");
        AbstractC1209k.f(i7, "customLayout");
        AbstractC1209k.f(kVar, "actionFactory");
        int i8 = YosPlaybackService.f20580B;
        String str = android.support.v4.media.session.b.f8937b;
        C1.k kVarA = ((c6.b) this.f4105p).a(c1751t0, i7, kVar, new c6.d((F) interfaceC1728h0, str, this, 0));
        if (str != null || M3.a.f4763b) {
            boolean z6 = str != null;
            boolean z7 = M3.a.f4763b;
            Notification notification = (Notification) kVarA.f960p;
            if (z6) {
                notification.flags |= 16777216;
            }
            if (z7) {
                notification.flags |= 33554432;
            }
        }
        return kVarA;
    }

    @Override // w3.InterfaceC1730i0
    public void b(C1751t0 c1751t0, String str, Bundle bundle) {
        AbstractC1209k.f(bundle, "extras");
        ((c6.b) this.f4105p).getClass();
    }

    public void c(K k7) {
        if (!k7.I()) {
            N0.a.b("DepthSortedSet.add called on an unattached node");
        }
        ((B0) this.f4105p).add(k7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(int i7, int i8, C0293j c0293j) throws N {
        int i9;
        int i10;
        int i11;
        long j3;
        int i12;
        int i13;
        int i14;
        int i15;
        f3.d dVar = (f3.d) this.f4105p;
        SparseArray sparseArray = dVar.f12139c;
        int i16 = 0;
        int i17 = 1;
        if (i7 != 161 && i7 != 163) {
            if (i7 == 165) {
                if (dVar.f12120I != 2) {
                    return;
                }
                f3.c cVar = (f3.c) sparseArray.get(dVar.f12126O);
                if (dVar.f12129R != 4 || !"V_VP9".equals(cVar.f12083b)) {
                    c0293j.g(i8);
                    return;
                }
                w2.m mVar = dVar.f12152p;
                mVar.D(i8);
                c0293j.b(mVar.f18867a, 0, i8, false);
                return;
            }
            if (i7 == 16877) {
                dVar.h(i7);
                f3.c cVar2 = dVar.f12159w;
                int i18 = cVar2.f12088g;
                if (i18 != 1685485123 && i18 != 1685480259) {
                    c0293j.g(i8);
                    return;
                }
                byte[] bArr = new byte[i8];
                cVar2.f12071O = bArr;
                c0293j.b(bArr, 0, i8, false);
                return;
            }
            if (i7 == 16981) {
                dVar.h(i7);
                byte[] bArr2 = new byte[i8];
                dVar.f12159w.f12089i = bArr2;
                c0293j.b(bArr2, 0, i8, false);
                return;
            }
            if (i7 == 18402) {
                byte[] bArr3 = new byte[i8];
                c0293j.b(bArr3, 0, i8, false);
                dVar.h(i7);
                dVar.f12159w.f12090j = new G(1, 0, 0, bArr3);
                return;
            }
            if (i7 == 21419) {
                w2.m mVar2 = dVar.f12148k;
                Arrays.fill(mVar2.f18867a, (byte) 0);
                c0293j.b(mVar2.f18867a, 4 - i8, i8, false);
                mVar2.G(0);
                dVar.f12161y = (int) mVar2.w();
                return;
            }
            if (i7 == 25506) {
                dVar.h(i7);
                byte[] bArr4 = new byte[i8];
                dVar.f12159w.f12091k = bArr4;
                c0293j.b(bArr4, 0, i8, false);
                return;
            }
            if (i7 != 30322) {
                throw N.a(null, "Unexpected id: " + i7);
            }
            dVar.h(i7);
            byte[] bArr5 = new byte[i8];
            dVar.f12159w.f12102w = bArr5;
            c0293j.b(bArr5, 0, i8, false);
            return;
        }
        int i19 = dVar.f12120I;
        w2.m mVar3 = dVar.f12146i;
        if (i19 == 0) {
            f3.e eVar = dVar.f12138b;
            dVar.f12126O = (int) eVar.c(c0293j, false, true, 8);
            dVar.f12127P = eVar.f12166c;
            dVar.f12122K = -9223372036854775807L;
            dVar.f12120I = 1;
            mVar3.D(0);
        }
        f3.c cVar3 = (f3.c) sparseArray.get(dVar.f12126O);
        if (cVar3 == null) {
            c0293j.g(i8 - dVar.f12127P);
            dVar.f12120I = 0;
            return;
        }
        cVar3.f12081Y.getClass();
        if (dVar.f12120I == 1) {
            dVar.k(c0293j, 3);
            int i20 = (mVar3.f18867a[2] & 6) >> 1;
            int i21 = 255;
            if (i20 == 0) {
                dVar.f12124M = 1;
                int[] iArr = dVar.f12125N;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.f12125N = iArr;
                iArr[0] = (i8 - dVar.f12127P) - 3;
            } else {
                dVar.k(c0293j, 4);
                int i22 = (mVar3.f18867a[3] & 255) + 1;
                dVar.f12124M = i22;
                int[] iArr2 = dVar.f12125N;
                if (iArr2 == null) {
                    iArr2 = new int[i22];
                } else if (iArr2.length < i22) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i22)];
                }
                dVar.f12125N = iArr2;
                if (i20 == 2) {
                    int i23 = (i8 - dVar.f12127P) - 4;
                    int i24 = dVar.f12124M;
                    Arrays.fill(iArr2, 0, i24, i23 / i24);
                } else {
                    if (i20 != 1) {
                        if (i20 != 3) {
                            throw N.a(null, "Unexpected lacing value: " + i20);
                        }
                        int i25 = 0;
                        int i26 = 0;
                        int i27 = 4;
                        while (true) {
                            int i28 = dVar.f12124M - i17;
                            if (i25 >= i28) {
                                i10 = i16;
                                i9 = i17;
                                dVar.f12125N[i28] = ((i8 - dVar.f12127P) - i27) - i26;
                                break;
                            }
                            dVar.f12125N[i25] = i16;
                            int i29 = i27 + 1;
                            dVar.k(c0293j, i29);
                            if (mVar3.f18867a[i27] == 0) {
                                throw N.a(null, "No valid varint length mask found");
                            }
                            int i30 = i17;
                            int i31 = i16;
                            while (true) {
                                if (i31 >= 8) {
                                    i11 = i16;
                                    j3 = 0;
                                    i12 = i29;
                                    break;
                                }
                                int i32 = i30 << (7 - i31);
                                i11 = i16;
                                if ((mVar3.f18867a[i27] & i32) != 0) {
                                    i12 = i29 + i31;
                                    dVar.k(c0293j, i12);
                                    j3 = mVar3.f18867a[i27] & i21 & (~i32);
                                    while (i29 < i12) {
                                        j3 = (j3 << 8) | ((long) (mVar3.f18867a[i29] & i21));
                                        i29++;
                                        i21 = 255;
                                    }
                                    if (i25 > 0) {
                                        j3 -= (1 << ((i31 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i31++;
                                    i16 = i11;
                                    i21 = 255;
                                }
                            }
                            if (j3 < -2147483648L || j3 > 2147483647L) {
                                break;
                            }
                            int i33 = (int) j3;
                            int[] iArr3 = dVar.f12125N;
                            if (i25 != 0) {
                                i33 += iArr3[i25 - 1];
                            }
                            iArr3[i25] = i33;
                            i26 += i33;
                            i25++;
                            i27 = i12;
                            i17 = i30;
                            i16 = i11;
                            i21 = 255;
                        }
                        throw N.a(null, "EBML lacing sample size out of range.");
                    }
                    int i34 = 0;
                    int i35 = 0;
                    int i36 = 4;
                    while (true) {
                        i13 = dVar.f12124M - 1;
                        if (i34 >= i13) {
                            break;
                        }
                        dVar.f12125N[i34] = 0;
                        while (true) {
                            i14 = i36 + 1;
                            dVar.k(c0293j, i14);
                            int i37 = mVar3.f18867a[i36] & 255;
                            int[] iArr4 = dVar.f12125N;
                            i15 = iArr4[i34] + i37;
                            iArr4[i34] = i15;
                            if (i37 != 255) {
                                break;
                            } else {
                                i36 = i14;
                            }
                        }
                        i35 += i15;
                        i34++;
                        i36 = i14;
                    }
                    dVar.f12125N[i13] = ((i8 - dVar.f12127P) - i36) - i35;
                }
            }
            i10 = 0;
            i9 = 1;
            byte[] bArr6 = mVar3.f18867a;
            dVar.f12121J = dVar.n((bArr6[i9] & 255) | (bArr6[i10] << 8)) + dVar.f12115D;
            dVar.f12128Q = (cVar3.f12085d == 2 || (i7 == 163 && (mVar3.f18867a[2] & 128) == 128)) ? i9 : i10;
            dVar.f12120I = 2;
            dVar.f12123L = i10;
        } else {
            i9 = 1;
        }
        if (i7 == 163) {
            while (true) {
                int i38 = dVar.f12123L;
                if (i38 >= dVar.f12124M) {
                    dVar.f12120I = 0;
                    return;
                } else {
                    dVar.i(cVar3, dVar.f12121J + ((long) ((dVar.f12123L * cVar3.f12086e) / 1000)), dVar.f12128Q, dVar.o(c0293j, cVar3, dVar.f12125N[i38], false), 0);
                    dVar.f12123L++;
                }
            }
        } else {
            while (true) {
                int i39 = dVar.f12123L;
                if (i39 >= dVar.f12124M) {
                    return;
                }
                int[] iArr5 = dVar.f12125N;
                boolean z6 = i9;
                iArr5[i39] = dVar.o(c0293j, cVar3, iArr5[i39], z6);
                dVar.f12123L += z6 ? 1 : 0;
            }
        }
    }

    public h4.h e() {
        C1004c c1004cD;
        B b7 = (B) this.f4105p;
        h4.f fVar = (h4.f) b7.f1461r;
        synchronized (fVar) {
            b7.b(true);
            c1004cD = fVar.d(((C1003b) b7.f1459p).f12710a);
        }
        if (c1004cD != null) {
            return new h4.h(c1004cD);
        }
        return null;
    }

    public boolean f(String str) {
        return ((MMKV) this.f4105p).contains(str);
    }

    public void h() {
        ((AbstractC0918w) this.f4105p).getClass();
    }

    @Override // L2.z
    public void i() {
        m mVar = (m) this.f4105p;
        AbstractC1697a.j(mVar.f4161g1);
        Surface surface = mVar.f4161g1;
        V.o oVar = mVar.f4150V0;
        Handler handler = (Handler) oVar.f7342p;
        if (handler != null) {
            handler.post(new x(oVar, surface, SystemClock.elapsedRealtime()));
        }
        mVar.f4164j1 = true;
    }

    public Z0 j() {
        T1.j jVarA = T1.j.a();
        if (jVarA.c() == 1) {
            return new j1.k(true);
        }
        C0894j0 c0894j0T = C0879c.t(Boolean.FALSE);
        jVarA.h(new j1.g(c0894j0T, this));
        return c0894j0T;
    }

    public void k(long j3, int i7) throws N {
        f3.d dVar = (f3.d) this.f4105p;
        dVar.getClass();
        if (i7 == 20529) {
            if (j3 == 0) {
                return;
            }
            throw N.a(null, "ContentEncodingOrder " + j3 + " not supported");
        }
        if (i7 == 20530) {
            if (j3 == 1) {
                return;
            }
            throw N.a(null, "ContentEncodingScope " + j3 + " not supported");
        }
        switch (i7) {
            case 131:
                dVar.h(i7);
                dVar.f12159w.f12085d = (int) j3;
                return;
            case 136:
                dVar.h(i7);
                dVar.f12159w.f12079W = j3 == 1;
                return;
            case 155:
                dVar.f12122K = dVar.n(j3);
                return;
            case 159:
                dVar.h(i7);
                dVar.f12159w.f12072P = (int) j3;
                return;
            case 176:
                dVar.h(i7);
                dVar.f12159w.f12092m = (int) j3;
                return;
            case 179:
                dVar.d(i7);
                dVar.f12116E.a(dVar.n(j3));
                return;
            case 186:
                dVar.h(i7);
                dVar.f12159w.f12093n = (int) j3;
                return;
            case 215:
                dVar.h(i7);
                dVar.f12159w.f12084c = (int) j3;
                return;
            case 231:
                dVar.f12115D = dVar.n(j3);
                return;
            case 238:
                dVar.f12129R = (int) j3;
                return;
            case 241:
                if (dVar.f12118G) {
                    return;
                }
                dVar.d(i7);
                dVar.f12117F.a(j3);
                dVar.f12118G = true;
                return;
            case 251:
                dVar.f12130S = true;
                return;
            case 16871:
                dVar.h(i7);
                dVar.f12159w.f12088g = (int) j3;
                return;
            case 16980:
                if (j3 == 3) {
                    return;
                }
                throw N.a(null, "ContentCompAlgo " + j3 + " not supported");
            case 17029:
                if (j3 < 1 || j3 > 2) {
                    throw N.a(null, "DocTypeReadVersion " + j3 + " not supported");
                }
                return;
            case 17143:
                if (j3 == 1) {
                    return;
                }
                throw N.a(null, "EBMLReadVersion " + j3 + " not supported");
            case 18401:
                if (j3 == 5) {
                    return;
                }
                throw N.a(null, "ContentEncAlgo " + j3 + " not supported");
            case 18408:
                if (j3 == 1) {
                    return;
                }
                throw N.a(null, "AESSettingsCipherMode " + j3 + " not supported");
            case 21420:
                dVar.f12162z = j3 + dVar.f12155s;
                return;
            case 21432:
                int i8 = (int) j3;
                dVar.h(i7);
                if (i8 == 0) {
                    dVar.f12159w.f12103x = 0;
                    return;
                }
                if (i8 == 1) {
                    dVar.f12159w.f12103x = 2;
                    return;
                } else if (i8 == 3) {
                    dVar.f12159w.f12103x = 1;
                    return;
                } else {
                    if (i8 != 15) {
                        return;
                    }
                    dVar.f12159w.f12103x = 3;
                    return;
                }
            case 21680:
                dVar.h(i7);
                dVar.f12159w.f12095p = (int) j3;
                return;
            case 21682:
                dVar.h(i7);
                dVar.f12159w.f12097r = (int) j3;
                return;
            case 21690:
                dVar.h(i7);
                dVar.f12159w.f12096q = (int) j3;
                return;
            case 21930:
                dVar.h(i7);
                dVar.f12159w.f12078V = j3 == 1;
                return;
            case 21938:
                dVar.h(i7);
                f3.c cVar = dVar.f12159w;
                cVar.f12104y = true;
                cVar.f12094o = (int) j3;
                return;
            case 21998:
                dVar.h(i7);
                dVar.f12159w.f12087f = (int) j3;
                return;
            case 22186:
                dVar.h(i7);
                dVar.f12159w.f12075S = j3;
                return;
            case 22203:
                dVar.h(i7);
                dVar.f12159w.f12076T = j3;
                return;
            case 25188:
                dVar.h(i7);
                dVar.f12159w.f12073Q = (int) j3;
                return;
            case 30114:
                dVar.f12131T = j3;
                return;
            case 30321:
                dVar.h(i7);
                int i9 = (int) j3;
                if (i9 == 0) {
                    dVar.f12159w.f12098s = 0;
                    return;
                }
                if (i9 == 1) {
                    dVar.f12159w.f12098s = 1;
                    return;
                } else if (i9 == 2) {
                    dVar.f12159w.f12098s = 2;
                    return;
                } else {
                    if (i9 != 3) {
                        return;
                    }
                    dVar.f12159w.f12098s = 3;
                    return;
                }
            case 2352003:
                dVar.h(i7);
                dVar.f12159w.f12086e = (int) j3;
                return;
            case 2807729:
                dVar.f12156t = j3;
                return;
            default:
                switch (i7) {
                    case 21945:
                        dVar.h(i7);
                        int i10 = (int) j3;
                        if (i10 == 1) {
                            dVar.f12159w.f12058B = 2;
                            return;
                        } else {
                            if (i10 != 2) {
                                return;
                            }
                            dVar.f12159w.f12058B = 1;
                            return;
                        }
                    case 21946:
                        dVar.h(i7);
                        int iG = C1480i.g((int) j3);
                        if (iG != -1) {
                            dVar.f12159w.f12057A = iG;
                            return;
                        }
                        return;
                    case 21947:
                        dVar.h(i7);
                        dVar.f12159w.f12104y = true;
                        int iF = C1480i.f((int) j3);
                        if (iF != -1) {
                            dVar.f12159w.f12105z = iF;
                            return;
                        }
                        return;
                    case 21948:
                        dVar.h(i7);
                        dVar.f12159w.f12059C = (int) j3;
                        return;
                    case 21949:
                        dVar.h(i7);
                        dVar.f12159w.f12060D = (int) j3;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // L2.z
    public void l() {
        ((m) this.f4105p).H0(0, 1);
    }

    public void m() {
        Y1.q qVar = ((Y1.g) this.f4105p).f8599q;
        if (qVar.f8639r == null) {
            return;
        }
        qVar.f8646y = false;
        qVar.f8647z = false;
        qVar.f8622E.getClass();
        Iterator it = qVar.f8626c.U().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
    }

    public Object o(String str, Serializable serializable) {
        boolean z6 = serializable instanceof Long;
        MMKV mmkv = (MMKV) this.f4105p;
        if (z6) {
            return Long.valueOf(mmkv.e(str, ((Number) serializable).longValue()));
        }
        if (serializable instanceof Integer) {
            return Integer.valueOf(mmkv.d(((Number) serializable).intValue(), str));
        }
        if (serializable instanceof String) {
            String strG = mmkv.g(str, (String) serializable);
            AbstractC1209k.c(strG);
            return strG;
        }
        if (serializable instanceof Boolean) {
            return Boolean.valueOf(mmkv.a(str, ((Boolean) serializable).booleanValue()));
        }
        if (serializable instanceof Float) {
            return Float.valueOf(mmkv.c(str, ((Number) serializable).floatValue()));
        }
        if (serializable instanceof Double) {
            return Double.valueOf(mmkv.b(str, ((Number) serializable).doubleValue()));
        }
        throw new IllegalArgumentException("YosDataSaver: Cannot read " + serializable + " (" + serializable.getClass() + ')');
    }

    public boolean p(K k7) {
        if (!k7.I()) {
            N0.a.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((B0) this.f4105p).remove(k7);
    }

    public void q(Object obj, String str) {
        MMKV mmkv = (MMKV) this.f4105p;
        if (obj == null) {
            mmkv.q(str);
            return;
        }
        if (obj instanceof Long) {
            mmkv.l(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            mmkv.i(((Number) obj).intValue(), str);
            return;
        }
        if (obj instanceof String) {
            mmkv.m(str, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            mmkv.n(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Float) {
            mmkv.k(str, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            mmkv.j(str, ((Number) obj).doubleValue());
            return;
        }
        throw new IllegalArgumentException("YosDataSaver: Cannot save " + obj + " (" + obj.getClass() + ')');
    }

    public void r() {
        T.f fVar;
        S.h hVar = (S.h) this.f4105p;
        if (hVar == null) {
            C.b.d("ToolbarRequester is not initialized.");
            throw new W();
        }
        if (hVar.f15636B) {
            w0 w0Var = hVar.f6720I;
            if ((w0Var == null || !w0Var.b()) && (fVar = (T.f) AbstractC0347f.i(hVar, T.g.f6846b)) != null) {
                InterfaceC1765B interfaceC1765BN0 = hVar.n0();
                EnumC1766C enumC1766C = EnumC1766C.f19467o;
                hVar.f6720I = AbstractC1767D.t(interfaceC1765BN0, null, new S.g(hVar, fVar, null), 1);
            }
        }
    }

    public void s(int i7, long j3, long j7) throws N {
        f3.d dVar = (f3.d) this.f4105p;
        AbstractC1697a.j(dVar.f12142d0);
        if (i7 == 160) {
            dVar.f12130S = false;
            dVar.f12131T = 0L;
            return;
        }
        if (i7 != 174) {
            if (i7 == 187) {
                dVar.f12118G = false;
                return;
            }
            if (i7 == 19899) {
                dVar.f12161y = -1;
                dVar.f12162z = -1L;
                return;
            }
            if (i7 == 20533) {
                dVar.h(i7);
                dVar.f12159w.h = true;
                return;
            }
            if (i7 == 21968) {
                dVar.h(i7);
                dVar.f12159w.f12104y = true;
                return;
            }
            if (i7 == 408125543) {
                long j8 = dVar.f12155s;
                if (j8 != -1 && j8 != j3) {
                    throw N.a(null, "Multiple Segment elements not supported");
                }
                dVar.f12155s = j3;
                dVar.f12154r = j7;
                return;
            }
            if (i7 == 475249515) {
                dVar.f12116E = new L0.b(1);
                dVar.f12117F = new L0.b(1);
                return;
            } else {
                if (i7 == 524531317 && !dVar.f12160x) {
                    if (dVar.f12141d && dVar.f12113B != -1) {
                        dVar.f12112A = true;
                        return;
                    } else {
                        dVar.f12142d0.H(new N2.r(dVar.f12158v));
                        dVar.f12160x = true;
                        return;
                    }
                }
                return;
            }
        }
        f3.c cVar = new f3.c();
        cVar.f12092m = -1;
        cVar.f12093n = -1;
        cVar.f12094o = -1;
        cVar.f12095p = -1;
        cVar.f12096q = -1;
        cVar.f12097r = 0;
        cVar.f12098s = -1;
        cVar.f12099t = 0.0f;
        cVar.f12100u = 0.0f;
        cVar.f12101v = 0.0f;
        cVar.f12102w = null;
        cVar.f12103x = -1;
        cVar.f12104y = false;
        cVar.f12105z = -1;
        cVar.f12057A = -1;
        cVar.f12058B = -1;
        cVar.f12059C = 1000;
        cVar.f12060D = 200;
        cVar.f12061E = -1.0f;
        cVar.f12062F = -1.0f;
        cVar.f12063G = -1.0f;
        cVar.f12064H = -1.0f;
        cVar.f12065I = -1.0f;
        cVar.f12066J = -1.0f;
        cVar.f12067K = -1.0f;
        cVar.f12068L = -1.0f;
        cVar.f12069M = -1.0f;
        cVar.f12070N = -1.0f;
        cVar.f12072P = 1;
        cVar.f12073Q = -1;
        cVar.f12074R = 8000;
        cVar.f12075S = 0L;
        cVar.f12076T = 0L;
        cVar.f12079W = true;
        cVar.f12080X = "eng";
        dVar.f12159w = cVar;
    }

    public String toString() {
        switch (this.f4104o) {
            case 8:
                return ((B0) this.f4105p).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0247a(int i7, boolean z6) {
        this.f4104o = i7;
    }

    public C0247a(X5.a aVar) {
        String str;
        this.f4104o = 16;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            str = "yos_data_normal";
        } else if (iOrdinal == 1) {
            str = "yos_data_song_list";
        } else if (iOrdinal == 2) {
            str = "yos_data_settings";
        } else {
            if (iOrdinal != 3) {
                throw new W();
            }
            str = "yos_data_play_list";
        }
        this.f4105p = MMKV.p(str);
    }

    public C0247a(int i7) {
        C0746L c0746l;
        this.f4104o = i7;
        switch (i7) {
            case 8:
                this.f4105p = new B0(AbstractC0347f.f5986a);
                break;
            case 14:
                this.f4105p = C0879c.t(Boolean.FALSE);
                break;
            case 15:
                new M(0L, AbstractC1109c.u(34), null, 0L, 0, AbstractC1109c.u(41), null, 0, 16646141);
                new M(0L, AbstractC1109c.u(28), null, 0L, 0, AbstractC1109c.u(34), null, 0, 16646141);
                new M(0L, AbstractC1109c.u(22), null, 0L, 0, AbstractC1109c.u(28), null, 0, 16646141);
                new M(0L, AbstractC1109c.u(20), null, 0L, 0, AbstractC1109c.u(25), null, 0, 16646141);
                new M(0L, AbstractC1109c.u(17), f1.k.f12004v, 0L, 0, AbstractC1109c.u(22), null, 0, 16646137);
                M m7 = new M(0L, AbstractC1109c.u(17), null, 0L, 0, AbstractC1109c.u(22), null, 0, 16646141);
                new M(0L, AbstractC1109c.u(16), null, 0L, 0, AbstractC1109c.u(21), null, 0, 16646141);
                new M(0L, AbstractC1109c.u(15), null, 0L, 0, AbstractC1109c.u(20), null, 0, 16646141);
                new M(0L, AbstractC1109c.u(13), null, 0L, 0, AbstractC1109c.u(18), null, 0, 16646141);
                new M(0L, AbstractC1109c.u(12), null, 0L, 0, AbstractC1109c.u(16), null, 0, 16646141);
                new M(0L, AbstractC1109c.u(11), null, 0L, 0, AbstractC1109c.u(13), null, 0, 16646141);
                this.f4105p = m7;
                break;
            case 17:
                this.f4105p = new Region();
                break;
            case 24:
                if (Build.VERSION.SDK_INT >= 28) {
                    c0746l = new C0746L(4);
                } else {
                    c0746l = new C0746L(5);
                }
                this.f4105p = c0746l;
                break;
            default:
                this.f4105p = AbstractC1267a.r(Looper.getMainLooper());
                break;
        }
    }

    public C0247a(YosPlaybackService yosPlaybackService, A0 a0) {
        this.f4104o = 19;
        c6.b bVar = new c6.b(yosPlaybackService, a0);
        bVar.f16201q = R.drawable.flamingo_ticker_icon;
        this.f4105p = bVar;
    }

    public C0247a(TextView textView) {
        this.f4104o = 13;
        this.f4105p = new V1.h(textView);
    }

    public C0247a(EditText editText) {
        this.f4104o = 12;
        V1.a aVar = new V1.a();
        aVar.f7389o = editText;
        V1.j jVar = new V1.j(editText);
        aVar.f7390p = jVar;
        editText.addTextChangedListener(jVar);
        if (V1.b.f7392b == null) {
            synchronized (V1.b.f7391a) {
                try {
                    if (V1.b.f7392b == null) {
                        V1.b bVar = new V1.b();
                        try {
                            V1.b.f7393c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, V1.b.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        V1.b.f7392b = bVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(V1.b.f7392b);
        this.f4105p = aVar;
    }
}
