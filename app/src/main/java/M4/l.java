package M4;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractSet {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4800o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n f4801p;

    public /* synthetic */ l(n nVar, int i7) {
        this.f4800o = i7;
        this.f4801p = nVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f4800o) {
            case 0:
                this.f4801p.clear();
                break;
            default:
                this.f4801p.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        m mVarB;
        switch (this.f4800o) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                n nVar = this.f4801p;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                m mVar = null;
                if (key != null) {
                    try {
                        mVarB = nVar.b(key, false);
                    } catch (ClassCastException unused) {
                        mVarB = null;
                    }
                    break;
                } else {
                    mVarB = null;
                }
                if (mVarB != null && Objects.equals(mVarB.f4809v, entry.getValue())) {
                    mVar = mVarB;
                }
                return mVar != null;
            default:
                return this.f4801p.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f4800o) {
            case 0:
                return new k(this.f4801p, 0);
            default:
                return new k(this.f4801p, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        m mVarB;
        switch (this.f4800o) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    n nVar = this.f4801p;
                    Object key = entry.getKey();
                    m mVar = null;
                    if (key != null) {
                        try {
                            mVarB = nVar.b(key, false);
                        } catch (ClassCastException unused) {
                            mVarB = null;
                        }
                    } else {
                        mVarB = null;
                    }
                    if (mVarB != null && Objects.equals(mVarB.f4809v, entry.getValue())) {
                        mVar = mVarB;
                    }
                    if (mVar != null) {
                        nVar.d(mVar, true);
                        break;
                    }
                    break;
                }
                break;
            default:
                n nVar2 = this.f4801p;
                m mVarB2 = null;
                if (obj != null) {
                    try {
                        mVarB2 = nVar2.b(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (mVarB2 != null) {
                    nVar2.d(mVarB2, true);
                }
                if (mVarB2 != null) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f4800o) {
        }
        return this.f4801p.f4815r;
    }
}
