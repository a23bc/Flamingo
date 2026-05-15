package T3;

import N3.p;
import W3.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a */
    public final ArrayList f6938a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public Object f6939b;

    /* JADX INFO: renamed from: c */
    public final U3.d f6940c;

    /* JADX INFO: renamed from: d */
    public S3.c f6941d;

    public b(U3.d dVar) {
        this.f6940c = dVar;
    }

    public abstract boolean a(i iVar);

    public abstract boolean b(Object obj);

    public final void c(Collection collection) {
        this.f6938a.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (a(iVar)) {
                this.f6938a.add(iVar.f7805a);
            }
        }
        if (this.f6938a.isEmpty()) {
            this.f6940c.b(this);
        } else {
            U3.d dVar = this.f6940c;
            synchronized (dVar.f7033c) {
                try {
                    if (dVar.f7034d.add(this)) {
                        if (dVar.f7034d.size() == 1) {
                            dVar.f7035e = dVar.a();
                            p pVarD = p.d();
                            int i7 = U3.d.f7030f;
                            String.format("%s: initial state = %s", dVar.getClass().getSimpleName(), dVar.f7035e);
                            pVarD.b(new Throwable[0]);
                            dVar.d();
                        }
                        Object obj = dVar.f7035e;
                        this.f6939b = obj;
                        d(this.f6941d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f6941d, this.f6939b);
    }

    public final void d(S3.c cVar, Object obj) {
        if (this.f6938a.isEmpty() || cVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            cVar.b(this.f6938a);
            return;
        }
        ArrayList<String> arrayList = this.f6938a;
        synchronized (cVar.f6746c) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (String str : arrayList) {
                    if (cVar.a(str)) {
                        p pVarD = p.d();
                        int i7 = S3.c.f6743d;
                        pVarD.b(new Throwable[0]);
                        arrayList2.add(str);
                    }
                }
                S3.b bVar = cVar.f6744a;
                if (bVar != null) {
                    bVar.d(arrayList2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
