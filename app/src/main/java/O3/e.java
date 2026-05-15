package O3;

import N3.p;
import N3.q;
import N3.u;
import V.o;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e extends I0.c {

    /* JADX INFO: renamed from: c */
    public final l f5619c;

    /* JADX INFO: renamed from: d */
    public final String f5620d;

    /* JADX INFO: renamed from: e */
    public final int f5621e;

    /* JADX INFO: renamed from: f */
    public final List f5622f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f5623g;
    public final ArrayList h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public boolean f5624i;

    /* JADX INFO: renamed from: j */
    public o f5625j;

    static {
        p.i("WorkContinuationImpl");
    }

    public e(l lVar, String str, int i7, List list) {
        this.f5619c = lVar;
        this.f5620d = str;
        this.f5621e = i7;
        this.f5622f = list;
        this.f5623g = new ArrayList(list.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            String string = ((q) list.get(i8)).f5145a.toString();
            this.f5623g.add(string);
            this.h.add(string);
        }
    }

    public static HashSet c0(e eVar) {
        HashSet hashSet = new HashSet();
        eVar.getClass();
        return hashSet;
    }

    public final u b0() {
        if (this.f5624i) {
            p pVarD = p.d();
            TextUtils.join(", ", this.f5623g);
            pVarD.j(new Throwable[0]);
        } else {
            X3.b bVar = new X3.b(this);
            this.f5619c.f5643f.Q(bVar);
            this.f5625j = bVar.f8272p;
        }
        return this.f5625j;
    }
}
