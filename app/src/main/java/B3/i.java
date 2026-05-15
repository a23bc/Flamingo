package B3;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Executor f841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Executor f842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public H3.a f843f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f844g;
    public boolean h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j f846j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashSet f847k;

    public i(Context context, String str) {
        this.f839b = context;
        this.f838a = str;
        j jVar = new j();
        jVar.f848a = new HashMap();
        this.f846j = jVar;
    }

    public final void a(C3.a... aVarArr) {
        if (this.f847k == null) {
            this.f847k = new HashSet();
        }
        for (C3.a aVar : aVarArr) {
            this.f847k.add(Integer.valueOf(aVar.f1203a));
            this.f847k.add(Integer.valueOf(aVar.f1204b));
        }
        j jVar = this.f846j;
        jVar.getClass();
        for (C3.a aVar2 : aVarArr) {
            int i7 = aVar2.f1203a;
            HashMap map = jVar.f848a;
            TreeMap treeMap = (TreeMap) map.get(Integer.valueOf(i7));
            if (treeMap == null) {
                treeMap = new TreeMap();
                map.put(Integer.valueOf(i7), treeMap);
            }
            int i8 = aVar2.f1204b;
            C3.a aVar3 = (C3.a) treeMap.get(Integer.valueOf(i8));
            if (aVar3 != null) {
                aVar3.toString();
                aVar2.toString();
            }
            treeMap.put(Integer.valueOf(i8), aVar2);
        }
    }
}
