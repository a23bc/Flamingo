package w5;

import java.util.concurrent.CancellationException;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1789i f19565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1182c f19566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f19568e;

    public r(Object obj, InterfaceC1789i interfaceC1789i, InterfaceC1182c interfaceC1182c, Object obj2, Throwable th) {
        this.f19564a = obj;
        this.f19565b = interfaceC1789i;
        this.f19566c = interfaceC1182c;
        this.f19567d = obj2;
        this.f19568e = th;
    }

    public static r a(r rVar, InterfaceC1789i interfaceC1789i, CancellationException cancellationException, int i7) {
        Object obj = rVar.f19564a;
        if ((i7 & 2) != 0) {
            interfaceC1789i = rVar.f19565b;
        }
        InterfaceC1789i interfaceC1789i2 = interfaceC1789i;
        InterfaceC1182c interfaceC1182c = rVar.f19566c;
        Object obj2 = rVar.f19567d;
        Throwable th = cancellationException;
        if ((i7 & 16) != 0) {
            th = rVar.f19568e;
        }
        rVar.getClass();
        return new r(obj, interfaceC1789i2, interfaceC1182c, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return AbstractC1209k.a(this.f19564a, rVar.f19564a) && AbstractC1209k.a(this.f19565b, rVar.f19565b) && AbstractC1209k.a(this.f19566c, rVar.f19566c) && AbstractC1209k.a(this.f19567d, rVar.f19567d) && AbstractC1209k.a(this.f19568e, rVar.f19568e);
    }

    public final int hashCode() {
        Object obj = this.f19564a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC1789i interfaceC1789i = this.f19565b;
        int iHashCode2 = (iHashCode + (interfaceC1789i == null ? 0 : interfaceC1789i.hashCode())) * 31;
        InterfaceC1182c interfaceC1182c = this.f19566c;
        int iHashCode3 = (iHashCode2 + (interfaceC1182c == null ? 0 : interfaceC1182c.hashCode())) * 31;
        Object obj2 = this.f19567d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f19568e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f19564a + ", cancelHandler=" + this.f19565b + ", onCancellation=" + this.f19566c + ", idempotentResume=" + this.f19567d + ", cancelCause=" + this.f19568e + ')';
    }

    public /* synthetic */ r(Object obj, InterfaceC1789i interfaceC1789i, InterfaceC1182c interfaceC1182c, CancellationException cancellationException, int i7) {
        this(obj, (i7 & 2) != 0 ? null : interfaceC1789i, (i7 & 4) != 0 ? null : interfaceC1182c, (Object) null, (i7 & 16) != 0 ? null : cancellationException);
    }
}
