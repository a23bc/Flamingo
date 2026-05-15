package c5;

import Z1.l;
import java.io.Serializable;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class c implements i, Serializable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i f10682o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f10683p;

    public c(g gVar, i iVar) {
        AbstractC1209k.f(iVar, "left");
        AbstractC1209k.f(gVar, "element");
        this.f10682o = iVar;
        this.f10683p = gVar;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            cVar.getClass();
            int i7 = 2;
            c cVar2 = cVar;
            int i8 = 2;
            while (true) {
                i iVar = cVar2.f10682o;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i8++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f10682o;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i7++;
            }
            if (i8 == i7) {
                c cVar4 = this;
                while (true) {
                    g gVar = cVar4.f10683p;
                    if (!AbstractC1209k.a(cVar.n(gVar.getKey()), gVar)) {
                        zA = false;
                        break;
                    }
                    i iVar3 = cVar4.f10682o;
                    if (!(iVar3 instanceof c)) {
                        AbstractC1209k.d(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        g gVar2 = (g) iVar3;
                        zA = AbstractC1209k.a(cVar.n(gVar2.getKey()), gVar2);
                        break;
                    }
                    cVar4 = (c) iVar3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // c5.i
    public final i h(i iVar) {
        AbstractC1209k.f(iVar, "context");
        return iVar == j.f10685o ? this : (i) iVar.y(this, b.f10680r);
    }

    public final int hashCode() {
        return this.f10683p.hashCode() + this.f10682o.hashCode();
    }

    @Override // c5.i
    public final g n(h hVar) {
        AbstractC1209k.f(hVar, "key");
        c cVar = this;
        while (true) {
            g gVarN = cVar.f10683p.n(hVar);
            if (gVarN != null) {
                return gVarN;
            }
            i iVar = cVar.f10682o;
            if (!(iVar instanceof c)) {
                return iVar.n(hVar);
            }
            cVar = (c) iVar;
        }
    }

    public final String toString() {
        return l.s(new StringBuilder("["), (String) y("", b.f10679q), ']');
    }

    @Override // c5.i
    public final i u(h hVar) {
        AbstractC1209k.f(hVar, "key");
        g gVar = this.f10683p;
        g gVarN = gVar.n(hVar);
        i iVar = this.f10682o;
        if (gVarN != null) {
            return iVar;
        }
        i iVarU = iVar.u(hVar);
        return iVarU == iVar ? this : iVarU == j.f10685o ? gVar : new c(gVar, iVarU);
    }

    @Override // c5.i
    public final Object y(Object obj, l5.e eVar) {
        return eVar.invoke(this.f10682o.y(obj, eVar), this.f10683p);
    }
}
