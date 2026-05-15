package z5;

import A5.AbstractC0026b;
import A5.AbstractC0027c;
import A5.AbstractC0028d;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m5.AbstractC1209k;
import w5.C1793k;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC0026b implements s, InterfaceC2110e, A5.r {

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f21268t = AtomicReferenceFieldUpdater.newUpdater(J.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: s */
    public int f21269s;

    public J(Object obj) {
        this._state$volatile = obj;
    }

    @Override // A5.r
    public final InterfaceC2110e a(c5.i iVar, int i7, y5.a aVar) {
        return (((i7 < 0 || i7 >= 2) && i7 != -2) || aVar != y5.a.f20529p) ? z.i(this, iVar, i7, aVar) : this;
    }

    /* JADX WARN: Path cross not found for [B:127:0x00f8, B:128:0x00f9], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0093 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:83:0x0039, B:97:0x007d, B:99:0x0085, B:102:0x008c, B:103:0x0090, B:105:0x0093, B:115:0x00b4, B:118:0x00c4, B:119:0x00de, B:125:0x00f0, B:122:0x00e7, B:124:0x00ed, B:107:0x0099, B:111:0x00a0, B:90:0x0053, B:93:0x005d, B:96:0x006e), top: B:132:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00c4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:83:0x0039, B:97:0x007d, B:99:0x0085, B:102:0x008c, B:103:0x0090, B:105:0x0093, B:115:0x00b4, B:118:0x00c4, B:119:0x00de, B:125:0x00f0, B:122:0x00e7, B:124:0x00ed, B:107:0x0099, B:111:0x00a0, B:90:0x0053, B:93:0x005d, B:96:0x006e), top: B:132:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0085 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:83:0x0039, B:97:0x007d, B:99:0x0085, B:102:0x008c, B:103:0x0090, B:105:0x0093, B:115:0x00b4, B:118:0x00c4, B:119:0x00de, B:125:0x00f0, B:122:0x00e7, B:124:0x00ed, B:107:0x0099, B:111:0x00a0, B:90:0x0053, B:93:0x005d, B:96:0x006e), top: B:132:0x0027 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x00c3 -> B:97:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // z5.InterfaceC2110e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(z5.InterfaceC2111f r17, c5.d r18) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.J.b(z5.f, c5.d):java.lang.Object");
    }

    @Override // A5.AbstractC0026b
    public final AbstractC0028d d() {
        return new K();
    }

    @Override // A5.AbstractC0026b
    public final AbstractC0028d[] e() {
        return new K[2];
    }

    @Override // z5.InterfaceC2111f
    public final Object f(Object obj, c5.d dVar) {
        i(obj);
        return Y4.o.f8736a;
    }

    @Override // z5.H
    public final Object getValue() {
        B5.u uVar = AbstractC0027c.f538b;
        Object obj = f21268t.get(this);
        if (obj == uVar) {
            return null;
        }
        return obj;
    }

    public final void i(Object obj) {
        if (obj == null) {
            obj = AbstractC0027c.f538b;
        }
        j(null, obj);
    }

    public final boolean j(Object obj, Object obj2) {
        int i7;
        AbstractC0028d[] abstractC0028dArr;
        B5.u uVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f21268t;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC1209k.a(obj3, obj)) {
                return false;
            }
            if (AbstractC1209k.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i8 = this.f21269s;
            if ((i8 & 1) != 0) {
                this.f21269s = i8 + 2;
                return true;
            }
            int i9 = i8 + 1;
            this.f21269s = i9;
            AbstractC0028d[] abstractC0028dArr2 = this.f533o;
            while (true) {
                K[] kArr = (K[]) abstractC0028dArr2;
                if (kArr != null) {
                    for (K k7 : kArr) {
                        if (k7 != null) {
                            AtomicReference atomicReference = k7.f21270a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (uVar = z.f21346c)) {
                                    B5.u uVar2 = z.f21345b;
                                    if (obj4 != uVar2) {
                                        while (!atomicReference.compareAndSet(obj4, uVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C1793k) obj4).resumeWith(Y4.o.f8736a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, uVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i7 = this.f21269s;
                    if (i7 == i9) {
                        this.f21269s = i9 + 1;
                        return true;
                    }
                    abstractC0028dArr = this.f533o;
                }
                abstractC0028dArr2 = abstractC0028dArr;
                i9 = i7;
            }
        }
    }
}
