package W3;

import B3.o;
import N5.l;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import w.AbstractC1676i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends o {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(B3.k kVar, int i7) {
        super(kVar);
        this.f7788d = i7;
    }

    @Override // B3.o
    public final String b() {
        switch (this.f7788d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:302:0x0200 -> B:313:0x0218). Please report as a decompilation issue!!! */
    public final void d(I3.f fVar, Object obj) throws Throwable {
        int i7;
        int i8;
        Throwable th;
        String str;
        switch (this.f7788d) {
            case 0:
                a aVar = (a) obj;
                String str2 = aVar.f7786a;
                if (str2 == null) {
                    fVar.g(1);
                } else {
                    fVar.h(1, str2);
                }
                String str3 = aVar.f7787b;
                if (str3 == null) {
                    fVar.g(2);
                    return;
                } else {
                    fVar.h(2, str3);
                    return;
                }
            case 1:
                c cVar = (c) obj;
                String str4 = cVar.f7789a;
                if (str4 == null) {
                    fVar.g(1);
                } else {
                    fVar.h(1, str4);
                }
                Long l = cVar.f7790b;
                if (l == null) {
                    fVar.g(2);
                    return;
                } else {
                    fVar.d(l.longValue(), 2);
                    return;
                }
            case 2:
                String str5 = ((d) obj).f7791a;
                if (str5 == null) {
                    fVar.g(1);
                } else {
                    fVar.h(1, str5);
                }
                fVar.d(r0.f7792b, 2);
                return;
            case 3:
                f fVar2 = (f) obj;
                String str6 = fVar2.f7794a;
                if (str6 == null) {
                    fVar.g(1);
                } else {
                    fVar.h(1, str6);
                }
                String str7 = fVar2.f7795b;
                if (str7 == null) {
                    fVar.g(2);
                    return;
                } else {
                    fVar.h(2, str7);
                    return;
                }
            case 4:
                i iVar = (i) obj;
                String str8 = iVar.f7805a;
                int i9 = 1;
                if (str8 == null) {
                    fVar.g(1);
                } else {
                    fVar.h(1, str8);
                }
                fVar.d(l.S(iVar.f7806b), 2);
                String str9 = iVar.f7807c;
                if (str9 == null) {
                    fVar.g(3);
                } else {
                    fVar.h(3, str9);
                }
                String str10 = iVar.f7808d;
                if (str10 == null) {
                    fVar.g(4);
                } else {
                    fVar.h(4, str10);
                }
                byte[] bArrB = N3.h.b(iVar.f7809e);
                if (bArrB == null) {
                    fVar.g(5);
                } else {
                    fVar.c(5, bArrB);
                }
                byte[] bArrB2 = N3.h.b(iVar.f7810f);
                if (bArrB2 == null) {
                    fVar.g(6);
                } else {
                    fVar.c(6, bArrB2);
                }
                fVar.d(iVar.f7811g, 7);
                fVar.d(iVar.h, 8);
                fVar.d(iVar.f7812i, 9);
                fVar.d(iVar.f7814k, 10);
                int i10 = iVar.l;
                int iB = AbstractC1676i.b(i10);
                if (iB == 0) {
                    i7 = 0;
                } else {
                    if (iB != 1) {
                        StringBuilder sb = new StringBuilder("Could not convert ");
                        sb.append(i10 != 1 ? i10 != 2 ? "null" : "LINEAR" : "EXPONENTIAL");
                        sb.append(" to int");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    i7 = 1;
                }
                fVar.d(i7, 11);
                fVar.d(iVar.f7815m, 12);
                fVar.d(iVar.f7816n, 13);
                fVar.d(iVar.f7817o, 14);
                fVar.d(iVar.f7818p, 15);
                fVar.d(iVar.f7819q ? 1L : 0L, 16);
                int i11 = iVar.f7820r;
                int iB2 = AbstractC1676i.b(i11);
                if (iB2 == 0) {
                    i8 = 0;
                } else {
                    if (iB2 != 1) {
                        StringBuilder sb2 = new StringBuilder("Could not convert ");
                        sb2.append(i11 != 1 ? i11 != 2 ? "null" : "DROP_WORK_REQUEST" : "RUN_AS_NON_EXPEDITED_WORK_REQUEST");
                        sb2.append(" to int");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    i8 = 1;
                }
                fVar.d(i8, 17);
                N3.c cVar2 = iVar.f7813j;
                if (cVar2 == null) {
                    fVar.g(18);
                    fVar.g(19);
                    fVar.g(20);
                    fVar.g(21);
                    fVar.g(22);
                    fVar.g(23);
                    fVar.g(24);
                    fVar.g(25);
                    return;
                }
                int i12 = cVar2.f5118a;
                int iB3 = AbstractC1676i.b(i12);
                if (iB3 == 0) {
                    i9 = 0;
                } else if (iB3 != 1) {
                    if (iB3 == 2) {
                        i9 = 2;
                    } else if (iB3 == 3) {
                        i9 = 3;
                    } else if (iB3 == 4) {
                        i9 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || i12 != 6) {
                            StringBuilder sb3 = new StringBuilder("Could not convert ");
                            switch (i12) {
                                case 1:
                                    str = "NOT_REQUIRED";
                                    break;
                                case 2:
                                    str = "CONNECTED";
                                    break;
                                case 3:
                                    str = "UNMETERED";
                                    break;
                                case 4:
                                    str = "NOT_ROAMING";
                                    break;
                                case 5:
                                    str = "METERED";
                                    break;
                                case 6:
                                    str = "TEMPORARILY_UNMETERED";
                                    break;
                                default:
                                    str = "null";
                                    break;
                            }
                            sb3.append(str);
                            sb3.append(" to int");
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        i9 = 5;
                    }
                }
                fVar.d(i9, 18);
                fVar.d(cVar2.f5119b ? 1L : 0L, 19);
                fVar.d(cVar2.f5120c ? 1L : 0L, 20);
                fVar.d(cVar2.f5121d ? 1L : 0L, 21);
                fVar.d(cVar2.f5122e ? 1L : 0L, 22);
                fVar.d(cVar2.f5123f, 23);
                fVar.d(cVar2.f5124g, 24);
                N3.e eVar = cVar2.h;
                byte[] byteArray = null;
                objectOutputStream = null;
                ObjectOutputStream objectOutputStream = null;
                if (eVar.f5127a.size() != 0) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            try {
                                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                                HashSet<N3.d> hashSet = eVar.f5127a;
                                try {
                                    objectOutputStream2.writeInt(hashSet.size());
                                    for (N3.d dVar : hashSet) {
                                        objectOutputStream2.writeUTF(dVar.f5125a.toString());
                                        objectOutputStream2.writeBoolean(dVar.f5126b);
                                        break;
                                    }
                                    try {
                                        objectOutputStream2.close();
                                    } catch (IOException e7) {
                                        e7.printStackTrace();
                                    }
                                    byteArrayOutputStream.close();
                                } catch (IOException e8) {
                                    e = e8;
                                    objectOutputStream = objectOutputStream2;
                                    e.printStackTrace();
                                    if (objectOutputStream != null) {
                                        try {
                                            objectOutputStream.close();
                                        } catch (IOException e9) {
                                            e9.printStackTrace();
                                        }
                                    }
                                    byteArrayOutputStream.close();
                                } catch (Throwable th2) {
                                    th = th2;
                                    objectOutputStream = objectOutputStream2;
                                    if (objectOutputStream != null) {
                                        try {
                                            objectOutputStream.close();
                                        } catch (IOException e10) {
                                            e10.printStackTrace();
                                        }
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th;
                                    } catch (IOException e11) {
                                        e11.printStackTrace();
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (IOException e12) {
                            e = e12;
                        }
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                    byteArray = byteArrayOutputStream.toByteArray();
                }
                if (byteArray == null) {
                    fVar.g(25);
                    return;
                } else {
                    fVar.c(25, byteArray);
                    return;
                }
            default:
                k kVar = (k) obj;
                String str11 = kVar.f7829a;
                if (str11 == null) {
                    fVar.g(1);
                } else {
                    fVar.h(1, str11);
                }
                String str12 = kVar.f7830b;
                if (str12 == null) {
                    fVar.g(2);
                    return;
                } else {
                    fVar.h(2, str12);
                    return;
                }
        }
    }

    public final void e(Object obj) {
        I3.f fVarA = a();
        try {
            d(fVarA, obj);
            fVarA.f3487r.executeInsert();
        } finally {
            c(fVarA);
        }
    }
}
