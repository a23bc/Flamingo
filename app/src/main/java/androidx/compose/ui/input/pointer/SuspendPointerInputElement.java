package androidx.compose.ui.input.pointer;

import K0.N;
import Q0.AbstractC0344d0;
import java.util.Arrays;
import m5.AbstractC1209k;
import r0.AbstractC1397o;

/* JADX INFO: loaded from: classes.dex */
public final class SuspendPointerInputElement extends AbstractC0344d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f9311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointerInputEventHandler f9312d;

    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i7) {
        obj = (i7 & 1) != 0 ? null : obj;
        obj2 = (i7 & 2) != 0 ? null : obj2;
        objArr = (i7 & 4) != 0 ? null : objArr;
        this.f9309a = obj;
        this.f9310b = obj2;
        this.f9311c = objArr;
        this.f9312d = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!AbstractC1209k.a(this.f9309a, suspendPointerInputElement.f9309a) || !AbstractC1209k.a(this.f9310b, suspendPointerInputElement.f9310b)) {
            return false;
        }
        Object[] objArr = this.f9311c;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f9311c;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f9311c != null) {
            return false;
        }
        return this.f9312d == suspendPointerInputElement.f9312d;
    }

    public final int hashCode() {
        Object obj = this.f9309a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f9310b;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f9311c;
        return this.f9312d.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // Q0.AbstractC0344d0
    public final AbstractC1397o k() {
        return new N(this.f9309a, this.f9310b, this.f9311c, this.f9312d);
    }

    @Override // Q0.AbstractC0344d0
    public final void m(AbstractC1397o abstractC1397o) {
        N n7 = (N) abstractC1397o;
        Object obj = n7.f3849C;
        Object obj2 = this.f9309a;
        boolean z6 = !AbstractC1209k.a(obj, obj2);
        n7.f3849C = obj2;
        Object obj3 = n7.f3850D;
        Object obj4 = this.f9310b;
        if (!AbstractC1209k.a(obj3, obj4)) {
            z6 = true;
        }
        n7.f3850D = obj4;
        Object[] objArr = n7.f3851E;
        Object[] objArr2 = this.f9311c;
        if (objArr != null && objArr2 == null) {
            z6 = true;
        }
        if (objArr == null && objArr2 != null) {
            z6 = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z6 = true;
        }
        n7.f3851E = objArr2;
        Class<?> cls = n7.f3852F.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f9312d;
        if (cls == pointerInputEventHandler.getClass() ? z6 : true) {
            n7.D0();
        }
        n7.f3852F = pointerInputEventHandler;
    }
}
