package K4;

import H2.C0196m;
import android.net.Uri;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a */
    public final M4.g f4053a = M4.g.f4789q;

    /* JADX INFO: renamed from: b */
    public final int f4054b = 1;

    /* JADX INFO: renamed from: c */
    public final a f4055c = h.f4047o;

    /* JADX INFO: renamed from: d */
    public final HashMap f4056d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final ArrayList f4057e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f4058f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public final int f4059g = 2;
    public final int h = 2;

    /* JADX INFO: renamed from: i */
    public final boolean f4060i = true;

    /* JADX INFO: renamed from: j */
    public final boolean f4061j = true;

    /* JADX INFO: renamed from: k */
    public final s f4062k = w.f4068o;
    public final t l = w.f4069p;

    /* JADX INFO: renamed from: m */
    public final LinkedList f4063m = new LinkedList();

    public final C0196m a() {
        int i7;
        N4.p pVar;
        N4.p pVar2;
        ArrayList arrayList = this.f4057e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4058f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z6 = Q4.c.f6153a;
        N4.e eVar = N4.f.f5174b;
        int i8 = this.f4059g;
        if (i8 != 2 && (i7 = this.h) != 2) {
            N4.b bVar = new N4.b(eVar, i8, i7);
            N4.p pVar3 = N4.t.f5218a;
            N4.p pVar4 = new N4.p(Date.class, bVar, 0);
            if (z6) {
                Q4.b bVar2 = Q4.c.f6155c;
                bVar2.getClass();
                pVar = new N4.p(bVar2.f5175a, new N4.b(bVar2, i8, i7), 0);
                Q4.b bVar3 = Q4.c.f6154b;
                bVar3.getClass();
                pVar2 = new N4.p(bVar3.f5175a, new N4.b(bVar3, i8, i7), 0);
            } else {
                pVar = null;
                pVar2 = null;
            }
            arrayList3.add(pVar4);
            if (z6) {
                arrayList3.add(pVar);
                arrayList3.add(pVar2);
            }
        }
        a aVar = this.f4055c;
        HashMap map = new HashMap(this.f4056d);
        int i9 = this.f4054b;
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        return new C0196m(this.f4053a, aVar, map, this.f4060i, this.f4061j, i9, arrayList3, this.f4062k, this.l, new ArrayList(this.f4063m));
    }

    public final void b(N4.r rVar) {
        TypeToken<?> typeToken = TypeToken.get((Type) Uri.class);
        N4.p pVar = N4.t.f5218a;
        this.f4057e.add(new N4.p(typeToken, rVar, 2));
    }
}
