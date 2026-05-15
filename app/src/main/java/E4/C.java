package E4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a */
    public Object[] f1858a;

    /* JADX INFO: renamed from: b */
    public int f1859b;

    /* JADX INFO: renamed from: c */
    public boolean f1860c;

    public C(int i7) {
        AbstractC0119q.d(i7, "initialCapacity");
        this.f1858a = new Object[i7];
        this.f1859b = 0;
    }

    public static int d(int i7, int i8) {
        if (i8 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i7 + (i7 >> 1) + 1;
        if (iHighestOneBit < i8) {
            iHighestOneBit = Integer.highestOneBit(i8 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(this.f1859b + 1);
        Object[] objArr = this.f1858a;
        int i7 = this.f1859b;
        this.f1859b = i7 + 1;
        objArr[i7] = obj;
    }

    public abstract C b(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(List list) {
        if (list instanceof Collection) {
            e(list.size() + this.f1859b);
            if (list instanceof D) {
                this.f1859b = ((D) list).b(this.f1859b, this.f1858a);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public final void e(int i7) {
        Object[] objArr = this.f1858a;
        if (objArr.length < i7) {
            this.f1858a = Arrays.copyOf(objArr, d(objArr.length, i7));
            this.f1860c = false;
        } else if (this.f1860c) {
            this.f1858a = (Object[]) objArr.clone();
            this.f1860c = false;
        }
    }
}
