package M4;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: w */
    public static final j f4811w = new j(0);

    /* JADX INFO: renamed from: o */
    public final Comparator f4812o;

    /* JADX INFO: renamed from: p */
    public final boolean f4813p;

    /* JADX INFO: renamed from: q */
    public m f4814q;

    /* JADX INFO: renamed from: r */
    public int f4815r;

    /* JADX INFO: renamed from: s */
    public int f4816s;

    /* JADX INFO: renamed from: t */
    public final m f4817t;

    /* JADX INFO: renamed from: u */
    public l f4818u;

    /* JADX INFO: renamed from: v */
    public l f4819v;

    public n(boolean z6) {
        j jVar = f4811w;
        this.f4815r = 0;
        this.f4816s = 0;
        this.f4812o = jVar;
        this.f4813p = z6;
        this.f4817t = new m(z6);
    }

    public final m b(Object obj, boolean z6) {
        int iCompareTo;
        m mVar;
        m mVar2 = this.f4814q;
        j jVar = f4811w;
        Comparator comparator = this.f4812o;
        if (mVar2 != null) {
            Comparable comparable = comparator == jVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = mVar2.f4807t;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return mVar2;
                }
                m mVar3 = iCompareTo < 0 ? mVar2.f4803p : mVar2.f4804q;
                if (mVar3 == null) {
                    break;
                }
                mVar2 = mVar3;
            }
        } else {
            iCompareTo = 0;
        }
        m mVar4 = mVar2;
        if (!z6) {
            return null;
        }
        m mVar5 = this.f4817t;
        if (mVar4 != null) {
            mVar = new m(this.f4813p, mVar4, obj, mVar5, mVar5.f4806s);
            if (iCompareTo < 0) {
                mVar4.f4803p = mVar;
            } else {
                mVar4.f4804q = mVar;
            }
            c(mVar4, true);
        } else {
            if (comparator == jVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            mVar = new m(this.f4813p, mVar4, obj, mVar5, mVar5.f4806s);
            this.f4814q = mVar;
        }
        this.f4815r++;
        this.f4816s++;
        return mVar;
    }

    public final void c(m mVar, boolean z6) {
        while (mVar != null) {
            m mVar2 = mVar.f4803p;
            m mVar3 = mVar.f4804q;
            int i7 = mVar2 != null ? mVar2.f4810w : 0;
            int i8 = mVar3 != null ? mVar3.f4810w : 0;
            int i9 = i7 - i8;
            if (i9 == -2) {
                m mVar4 = mVar3.f4803p;
                m mVar5 = mVar3.f4804q;
                int i10 = (mVar4 != null ? mVar4.f4810w : 0) - (mVar5 != null ? mVar5.f4810w : 0);
                if (i10 == -1 || (i10 == 0 && !z6)) {
                    f(mVar);
                } else {
                    g(mVar3);
                    f(mVar);
                }
                if (z6) {
                    return;
                }
            } else if (i9 == 2) {
                m mVar6 = mVar2.f4803p;
                m mVar7 = mVar2.f4804q;
                int i11 = (mVar6 != null ? mVar6.f4810w : 0) - (mVar7 != null ? mVar7.f4810w : 0);
                if (i11 == 1 || (i11 == 0 && !z6)) {
                    g(mVar);
                } else {
                    f(mVar2);
                    g(mVar);
                }
                if (z6) {
                    return;
                }
            } else if (i9 == 0) {
                mVar.f4810w = i7 + 1;
                if (z6) {
                    return;
                }
            } else {
                mVar.f4810w = Math.max(i7, i8) + 1;
                if (!z6) {
                    return;
                }
            }
            mVar = mVar.f4802o;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f4814q = null;
        this.f4815r = 0;
        this.f4816s++;
        m mVar = this.f4817t;
        mVar.f4806s = mVar;
        mVar.f4805r = mVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        m mVarB = null;
        if (obj != null) {
            try {
                mVarB = b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return mVarB != null;
    }

    public final void d(m mVar, boolean z6) {
        m mVar2;
        m mVar3;
        int i7;
        if (z6) {
            m mVar4 = mVar.f4806s;
            mVar4.f4805r = mVar.f4805r;
            mVar.f4805r.f4806s = mVar4;
        }
        m mVar5 = mVar.f4803p;
        m mVar6 = mVar.f4804q;
        m mVar7 = mVar.f4802o;
        int i8 = 0;
        if (mVar5 == null || mVar6 == null) {
            if (mVar5 != null) {
                e(mVar, mVar5);
                mVar.f4803p = null;
            } else if (mVar6 != null) {
                e(mVar, mVar6);
                mVar.f4804q = null;
            } else {
                e(mVar, null);
            }
            c(mVar7, false);
            this.f4815r--;
            this.f4816s++;
            return;
        }
        if (mVar5.f4810w > mVar6.f4810w) {
            m mVar8 = mVar5.f4804q;
            while (true) {
                m mVar9 = mVar8;
                mVar3 = mVar5;
                mVar5 = mVar9;
                if (mVar5 == null) {
                    break;
                } else {
                    mVar8 = mVar5.f4804q;
                }
            }
        } else {
            m mVar10 = mVar6.f4803p;
            while (true) {
                mVar2 = mVar6;
                mVar6 = mVar10;
                if (mVar6 == null) {
                    break;
                } else {
                    mVar10 = mVar6.f4803p;
                }
            }
            mVar3 = mVar2;
        }
        d(mVar3, false);
        m mVar11 = mVar.f4803p;
        if (mVar11 != null) {
            i7 = mVar11.f4810w;
            mVar3.f4803p = mVar11;
            mVar11.f4802o = mVar3;
            mVar.f4803p = null;
        } else {
            i7 = 0;
        }
        m mVar12 = mVar.f4804q;
        if (mVar12 != null) {
            i8 = mVar12.f4810w;
            mVar3.f4804q = mVar12;
            mVar12.f4802o = mVar3;
            mVar.f4804q = null;
        }
        mVar3.f4810w = Math.max(i7, i8) + 1;
        e(mVar, mVar3);
    }

    public final void e(m mVar, m mVar2) {
        m mVar3 = mVar.f4802o;
        mVar.f4802o = null;
        if (mVar2 != null) {
            mVar2.f4802o = mVar3;
        }
        if (mVar3 == null) {
            this.f4814q = mVar2;
        } else if (mVar3.f4803p == mVar) {
            mVar3.f4803p = mVar2;
        } else {
            mVar3.f4804q = mVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        l lVar = this.f4818u;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 0);
        this.f4818u = lVar2;
        return lVar2;
    }

    public final void f(m mVar) {
        m mVar2 = mVar.f4803p;
        m mVar3 = mVar.f4804q;
        m mVar4 = mVar3.f4803p;
        m mVar5 = mVar3.f4804q;
        mVar.f4804q = mVar4;
        if (mVar4 != null) {
            mVar4.f4802o = mVar;
        }
        e(mVar, mVar3);
        mVar3.f4803p = mVar;
        mVar.f4802o = mVar3;
        int iMax = Math.max(mVar2 != null ? mVar2.f4810w : 0, mVar4 != null ? mVar4.f4810w : 0) + 1;
        mVar.f4810w = iMax;
        mVar3.f4810w = Math.max(iMax, mVar5 != null ? mVar5.f4810w : 0) + 1;
    }

    public final void g(m mVar) {
        m mVar2 = mVar.f4803p;
        m mVar3 = mVar.f4804q;
        m mVar4 = mVar2.f4803p;
        m mVar5 = mVar2.f4804q;
        mVar.f4803p = mVar5;
        if (mVar5 != null) {
            mVar5.f4802o = mVar;
        }
        e(mVar, mVar2);
        mVar2.f4804q = mVar;
        mVar.f4802o = mVar2;
        int iMax = Math.max(mVar3 != null ? mVar3.f4810w : 0, mVar5 != null ? mVar5.f4810w : 0) + 1;
        mVar.f4810w = iMax;
        mVar2.f4810w = Math.max(iMax, mVar4 != null ? mVar4.f4810w : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        m mVarB;
        if (obj != null) {
            try {
                mVarB = b(obj, false);
            } catch (ClassCastException unused) {
                mVarB = null;
            }
        } else {
            mVarB = null;
        }
        if (mVarB != null) {
            return mVarB.f4809v;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        l lVar = this.f4819v;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 1);
        this.f4819v = lVar2;
        return lVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f4813p) {
            throw new NullPointerException("value == null");
        }
        m mVarB = b(obj, true);
        Object obj3 = mVarB.f4809v;
        mVarB.f4809v = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m mVarB;
        if (obj != null) {
            try {
                mVarB = b(obj, false);
            } catch (ClassCastException unused) {
                mVarB = null;
            }
        } else {
            mVarB = null;
        }
        if (mVarB != null) {
            d(mVarB, true);
        }
        if (mVarB != null) {
            return mVarB.f4809v;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f4815r;
    }
}
