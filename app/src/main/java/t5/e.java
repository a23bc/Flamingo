package T5;

import E0.K;
import N2.z;
import S5.C;
import S5.E;
import S5.l;
import S5.q;
import S5.r;
import S5.u;
import Y4.m;
import Z4.n;
import Z4.p;
import Z4.t;
import a.AbstractC0509a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import m5.AbstractC1209k;
import u5.AbstractC1545g;

/* JADX INFO: loaded from: classes.dex */
public final class e extends l {

    /* JADX INFO: renamed from: e */
    public static final u f6995e;

    /* JADX INFO: renamed from: b */
    public final ClassLoader f6996b;

    /* JADX INFO: renamed from: c */
    public final l f6997c;

    /* JADX INFO: renamed from: d */
    public final m f6998d;

    static {
        String str = u.f6810p;
        f6995e = z.n("/");
    }

    public e(ClassLoader classLoader) {
        r rVar = l.f6793a;
        AbstractC1209k.f(rVar, "systemFileSystem");
        this.f6996b = classLoader;
        this.f6997c = rVar;
        this.f6998d = AbstractC0509a.O(new K(12, this));
    }

    @Override // S5.l
    public final void a(u uVar) throws IOException {
        AbstractC1209k.f(uVar, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // S5.l
    public final List d(u uVar) throws FileNotFoundException {
        AbstractC1209k.f(uVar, "dir");
        u uVar2 = f6995e;
        uVar2.getClass();
        String strP = c.b(uVar2, uVar, true).c(uVar2).f6811o.p();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z6 = false;
        for (Y4.h hVar : (List) this.f6998d.getValue()) {
            l lVar = (l) hVar.f8726o;
            u uVar3 = (u) hVar.f8727p;
            try {
                List listD = lVar.d(uVar3.d(strP));
                ArrayList<u> arrayList = new ArrayList();
                for (Object obj : listD) {
                    if (z.b((u) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(p.j0(arrayList));
                for (u uVar4 : arrayList) {
                    AbstractC1209k.f(uVar4, "<this>");
                    String strReplace = AbstractC1545g.f0(uVar4.f6811o.p(), uVar3.f6811o.p()).replace('\\', '/');
                    AbstractC1209k.e(strReplace, "replace(...)");
                    arrayList2.add(uVar2.d(strReplace));
                }
                t.l0(linkedHashSet, arrayList2);
                z6 = true;
            } catch (IOException unused) {
            }
        }
        if (z6) {
            return n.K0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + uVar);
    }

    @Override // S5.l
    public final B3.a f(u uVar) {
        AbstractC1209k.f(uVar, "path");
        if (!z.b(uVar)) {
            return null;
        }
        u uVar2 = f6995e;
        uVar2.getClass();
        String strP = c.b(uVar2, uVar, true).c(uVar2).f6811o.p();
        for (Y4.h hVar : (List) this.f6998d.getValue()) {
            B3.a aVarF = ((l) hVar.f8726o).f(((u) hVar.f8727p).d(strP));
            if (aVarF != null) {
                return aVarF;
            }
        }
        return null;
    }

    @Override // S5.l
    public final q g(u uVar) throws FileNotFoundException {
        if (!z.b(uVar)) {
            throw new FileNotFoundException("file not found: " + uVar);
        }
        u uVar2 = f6995e;
        uVar2.getClass();
        String strP = c.b(uVar2, uVar, true).c(uVar2).f6811o.p();
        for (Y4.h hVar : (List) this.f6998d.getValue()) {
            try {
                return ((l) hVar.f8726o).g(((u) hVar.f8727p).d(strP));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + uVar);
    }

    @Override // S5.l
    public final C h(u uVar) throws IOException {
        AbstractC1209k.f(uVar, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // S5.l
    public final E i(u uVar) throws FileNotFoundException {
        AbstractC1209k.f(uVar, "file");
        if (!z.b(uVar)) {
            throw new FileNotFoundException("file not found: " + uVar);
        }
        u uVar2 = f6995e;
        uVar2.getClass();
        InputStream resourceAsStream = this.f6996b.getResourceAsStream(c.b(uVar2, uVar, false).c(uVar2).f6811o.p());
        if (resourceAsStream != null) {
            return M3.a.g0(resourceAsStream);
        }
        throw new FileNotFoundException("file not found: " + uVar);
    }
}
